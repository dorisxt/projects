/*
 * Project Name: xyl_core
 * File Name: FlashMessageDirective.java
 * Class Name: FlashMessageDirective
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
package com.huanxiao.yemao.template.directive;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import com.huanxiao.yemao.base.bean.Message;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

/**
 * 
 * @author huanxiao Team
 * @version 1.0_beta
 */
// @Component("flashMessageDirective")
public class FlashMessageDirective extends BaseDirective {

	public static final String	FLASH_MESSAGE_ATTRIBUTE_NAME	= FlashMessageDirective.class.getName() + ".FLASH_MESSAGE";

	private static final String	VARIABLE_NAME					= "flashMessage";

	@SuppressWarnings("rawtypes")
	public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body) throws TemplateException,
			IOException {
		RequestAttributes requestAttributes = RequestContextHolder.currentRequestAttributes();
		if (requestAttributes != null) {
			Message message = (Message) requestAttributes.getAttribute(FLASH_MESSAGE_ATTRIBUTE_NAME, RequestAttributes.SCOPE_REQUEST);
			if (body != null) {
				setLocalVariable(VARIABLE_NAME, message, env, body);
			} else {
				if (message != null) {
					Writer out = env.getOut();
					out.write("data-msg-type=\"" + message.getType() + "\" data-msg-content=\"" + message.getContent() + "\"");
				}
			}
		}
	}

}
