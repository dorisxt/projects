/*
 * Project Name: yemao-ecom
 * File Name: StringUtils.java
 * Class Name: StringUtils
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

/**
 * Utils - StringEscapeUtils
 * 
 * @author yupengshen
 * @version 2.0_beta
 */
public final class StringUtils {

	// private static final Logger logger = LoggerFactory.getLogger(StringEscapeUtils.class);

	private static String	DB_ESCAPSE		= "[%_]";

	private static String	DB_ESCAPSE_CODE	= "\\\\$0";

	/**
	 * 不可实例化
	 */
	private StringUtils() {
	}

	/**
	 * <p>
	 * 判断字符串是否为空白字符串，空("")或者null.
	 * </p>
	 *
	 *
	 * @param value
	 * @return
	 */
	public static boolean isBlank(String value) {
		return org.apache.commons.lang3.StringUtils.isBlank(value);
	}

	/**
	 * <p>
	 * 判断字符串是否为空白字符串，空("")或者null.
	 * </p>
	 *
	 * @param value
	 * @return
	 */
	public static boolean isNotBlank(String value) {
		return !StringUtils.isBlank(value);
	}

	/**
	 * <p>
	 * 判断字符串是否为空("")或者null.
	 * </p>
	 *
	 * @param value
	 * @return
	 */
	public static boolean isEmpty(String value) {
		return org.apache.commons.lang3.StringUtils.isEmpty(value);
	}

	/**
	 * <p>
	 * 判断字符串是否为空("")或者null.
	 * </p>
	 *
	 * @param value
	 * @return
	 */
	public static boolean isNotEmpty(String value) {
		return !StringUtils.isEmpty(value);
	}

	/**
	 * <p>
	 * 移除开头和结尾的空白字符(char<=32)
	 * </p>
	 *
	 * @param value
	 * @return
	 */
	public static String trim(String value) {
		return org.apache.commons.lang3.StringUtils.trim(value);
	}

	/**
	 * <p>
	 * 将字符串中针对LIKE表达式的预留SQL字符进行转义
	 * </p>
	 * 
	 * @param value
	 * @return
	 */
	public static String escapseSql(String value) {
		return StringUtils.isEmpty(value) ? value : value.replaceAll(DB_ESCAPSE, DB_ESCAPSE_CODE);
	}

	/**
	 * <p>
	 * 将字符串中的预留HTML字符转换为HTML实体
	 * </p>
	 * 
	 * @param value
	 * @return
	 */
	public static String escapseHtml(String value) {
		return org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(value);
	}

}
