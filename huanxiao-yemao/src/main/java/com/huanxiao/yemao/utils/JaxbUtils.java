/*
 * Project Name: yemao-ecom
 * File Name: JaxbUtils.java
 * Class Name: JaxbUtils
 *
 * Copyright 2014 huanxiao Software Inc
 *
 * Licensed under the huanxiao
 *
 * http://www.huanxiao.com
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.huanxiao.yemao.utils;

import java.io.StringReader;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yupengshen
 *
 */
public class JaxbUtils {

	private static final Logger							LOGGER	= LoggerFactory.getLogger(StringUtils.class);

	private static ConcurrentMap<Class<?>, JAXBContext>	jaxbMap	= new ConcurrentHashMap<Class<?>, JAXBContext>();

	/**
	 * @param xml
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T fromXml(String xml, Class<T> clazz) {
		try {
			StringReader reader = new StringReader(xml);
			return (T) createUnmarshaller(clazz).unmarshal(reader);
		} catch (JAXBException e) {
			LOGGER.error("Error Occured When Parsing To Object.", e);
			throw new RuntimeException(e);
		}
	}

	/**
	 * @param clazz
	 * @param encoding
	 * @return
	 */
	public static Marshaller createMarshaller(Class<?> clazz, String encoding) {
		try {
			JAXBContext jaxbContext = getJaxbContext(clazz);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			if (StringUtils.isNotBlank(encoding)) {
				marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);
			}
			return marshaller;
		} catch (JAXBException e) {
			LOGGER.error("Error Occured When Creating Marshaller.", e);
			throw new RuntimeException(e);
		}
	}

	/**
	 * @param clazz
	 * @return
	 */
	public static Unmarshaller createUnmarshaller(Class<?> clazz) {
		try {
			JAXBContext jaxbContext = getJaxbContext(clazz);
			return jaxbContext.createUnmarshaller();
		} catch (JAXBException e) {
			LOGGER.error("Error Occured When Creating Unmarshaller.", e);
			throw new RuntimeException(e);
		}
	}

	/**
	 * @param clazz
	 * @return
	 */
	private static JAXBContext getJaxbContext(Class<?> clazz) {
		JAXBContext jaxbContext = jaxbMap.get(clazz);
		if (jaxbContext == null) {
			try {
				jaxbContext = JAXBContext.newInstance(clazz);
				jaxbMap.putIfAbsent(clazz, jaxbContext);
			} catch (JAXBException ex) {
				throw new RuntimeException("Can't init JAXBContext.", ex);
			}
		}
		return jaxbContext;
	}

}
