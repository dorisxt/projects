/*
 * Project Name: yemao
 * File Name: EnumConverter.java
 * Class Name: EnumConverter
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
package com.huanxiao.yemao.base.converter;

import org.apache.commons.beanutils.converters.AbstractConverter;

/**
 * 
 * @author huanxiao Team
 * @version 1.0_beta
 */
public class EnumConverter extends AbstractConverter {

	private final Class<?>	enumClass;

	/**
	 * @param enumClass
	 */
	public EnumConverter(Class<?> enumClass) {
		this(enumClass, null);
	}

	/**
	 * @param enumClass
	 * @param defaultValue
	 */
	public EnumConverter(Class<?> enumClass, Object defaultValue) {
		super(defaultValue);
		this.enumClass = enumClass;
	}

	/**
	 * 
	 * @return
	 */
	@Override
	protected Class<?> getDefaultType() {
		return this.enumClass;
	}

	/**
	 * 
	 * @param type
	 * @param value
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected Object convertToType(Class type, Object value) {
		String stringValue = value.toString().trim();
		return Enum.valueOf(type, stringValue);
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	protected String convertToString(Object value) {
		return value.toString();
	}

}
