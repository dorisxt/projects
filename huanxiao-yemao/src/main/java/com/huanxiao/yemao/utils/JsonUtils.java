/*
 * Project Name: yemao-ecom
 * File Name: JsonUtils.java
 * Class Name: JsonUtils
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

import java.io.IOException;
import java.io.Writer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Utils - JSON
 * 
 * @author huanxiao Team
 * @version 1.0_beta
 */
public final class JsonUtils {

	private static final Logger	logger	= LoggerFactory.getLogger(JsonUtils.class);

	/** ObjectMapper */
	private static ObjectMapper	mapper	= new ObjectMapper();

	/**
	 * 不可实例化
	 */
	private JsonUtils() {
	}

	/**
	 * 将对象转换为JSON字符串
	 * 
	 * @param value
	 *            对象
	 * @return JSOn字符串
	 */
	public static String toJson(Object value) {
		try {
			return mapper.writeValueAsString(value);
		} catch (Exception e) {
			logger.warn("Generate JSON String Error: " + value, e);
		}
		return null;
	}

	/**
	 * 将JSON字符串转换为对象
	 * 
	 * @param json
	 *            JSON字符串
	 * @param valueType
	 *            对象类型
	 * @return 对象
	 */
	public static <T> T toObject(String json, Class<T> valueType) {
		Assert.hasText(json);
		Assert.notNull(valueType);
		try {
			return mapper.readValue(json, valueType);
		} catch (Exception e) {
			logger.warn("Parse JSON String Error: " + json, e);
		}
		return null;
	}

	/**
	 * 
	 * @param json
	 * @param valueType
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public static <T> T toObjectWithException(String json, Class<T> valueType) throws JsonParseException, JsonMappingException, IOException {
		Assert.hasText(json);
		Assert.notNull(valueType);
		return mapper.readValue(json, valueType);
	}

	/**
	 * 将JSON字符串转换为对象
	 * 
	 * @param json
	 *            JSON字符串
	 * @param typeReference
	 *            对象类型
	 * @return 对象
	 */
	public static <T> T toObject(String json, TypeReference<?> typeReference) {
		Assert.hasText(json);
		Assert.notNull(typeReference);
		try {
			return mapper.readValue(json, typeReference);
		} catch (Exception e) {
			logger.warn("Parse JSON String Error: " + json, e);
		}
		return null;
	}

	/**
	 * 将JSON字符串转换为对象
	 * 
	 * @param json
	 *            JSON字符串
	 * @param javaType
	 *            对象类型
	 * @return 对象
	 */
	public static <T> T toObject(String json, JavaType javaType) {
		Assert.hasText(json);
		Assert.notNull(javaType);
		try {
			return mapper.readValue(json, javaType);
		} catch (Exception e) {
			logger.warn("Parse JSON String Error: " + json, e);
		}
		return null;
	}

	/**
	 * 将对象转换为JSON流
	 * 
	 * @param writer
	 *            writer
	 * @param value
	 *            对象
	 */
	public static void writeValue(Writer writer, Object value) {
		try {
			mapper.writeValue(writer, value);
		} catch (IOException e) {
			logger.warn("Generate JSON String Error: " + value, e);
		}
	}

}
