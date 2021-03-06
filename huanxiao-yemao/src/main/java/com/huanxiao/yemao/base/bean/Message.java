/*
 * Project Name: xyl_core
 * File Name: Message.java
 * Class Name: Message
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
package com.huanxiao.yemao.base.bean;

import java.io.Serializable;

import com.huanxiao.yemao.utils.SpringUtils;

/**
 * Message
 * 
 * @author huanxiao Team
 * @version 1.0_beta
 */
public class Message implements Serializable {

	private static final long	serialVersionUID	= -7932537842656418088L;

	/**
	 * Type
	 */
	public enum Type {
		/** success */
		success,
		/** warn */
		warn,
		/** error */
		error
	}

	private Type	type;

	private String	content;

	/**
	 * 
	 */
	public Message() {

	}

	/**
	 * 
	 * 
	 * @param type
	 * @param content
	 */
	public Message(Type type, String content) {
		this.type = type;
		this.content = content;
	}

	/**
	 * @param type
	 * @param content
	 * @param args
	 */
	public Message(Type type, String content, Object... args) {
		this.type = type;
		this.content = SpringUtils.getMessage(content, args);
	}

	/**
	 * 
	 * @param content
	 * @param args
	 * @return
	 */
	public static Message success(String content, Object... args) {
		return new Message(Type.success, content, args);
	}

	/**
	 * 
	 * @param content
	 * @param args
	 * @return
	 */
	public static Message warn(String content, Object... args) {
		return new Message(Type.warn, content, args);
	}

	/**
	 * 
	 * @param content
	 * @param args
	 * @return
	 */
	public static Message error(String content, Object... args) {
		return new Message(Type.error, content, args);
	}

	/**
	 * 
	 * @return
	 */
	public Type getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * 
	 * @return
	 */
	public String getContent() {
		return content;
	}

	/**
	 * 
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return SpringUtils.getMessage(content);
	}

}
