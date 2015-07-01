/*
 * Project Name: yemao-ecom
 * File Name: SystemUtils.java
 * Class Name: SystemUtils
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

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Utils - System
 * 
 * @author huanxiao Team
 * @version 2.0_beta
 */
public final class SystemUtils {

	private static final Logger	logger	= LoggerFactory.getLogger(SystemUtils.class);

	/**
	 * 不可实例化
	 */
	private SystemUtils() {
	}

	public static String getLocalAddress() {
		try {
			return InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			logger.warn("UnknownHostException when get local address");
		}
		return "";
	}
}
