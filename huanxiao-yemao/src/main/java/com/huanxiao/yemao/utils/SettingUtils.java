/*
 * Project Name: xinyunlian-ecom
 * File Name: SettingUtils.java
 * Class Name: SettingUtils
 *
 * Copyright 2014 Hengtian Software Inc
 *
 * Licensed under the Hengtiansoft
 *
 * http://www.hengtiansoft.com
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.huanxiao.yemao.utils;

import java.math.BigDecimal;

/**
 * 设置
 * 
 * @author Hengtiansoft Team
 * @version 2.0_beta
 */
public class SettingUtils {

	private static Setting	setting	= new Setting();

	/**
	 * @return the setting
	 */
	public static Setting getSetting() {
		return setting;
	}

	/**
	 * @param setting
	 *            the setting to set
	 */
	public static void setSetting(Setting setting) {
		SettingUtils.setting = setting;
	}

	/**
	 * @param amount
	 * @return
	 */
	public static BigDecimal makeScale(BigDecimal amount) {
		if (amount == null) {
			return null;
		}
		return amount.setScale(setting.getPriceScale(), setting.getPriceRoundType());
	}

	/**
	 * @return the currencySign
	 */
	public static String getCurrencySign() {
		return setting.getCurrencySign();
	}

	/**
	 * @return the currencyUnit
	 */
	public static String getCurrencyUnit() {
		return setting.getCurrencyUnit();
	}
}
