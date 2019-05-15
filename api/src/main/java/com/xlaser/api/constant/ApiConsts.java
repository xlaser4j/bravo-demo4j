package com.xlaser.api.constant;

/**
 * <p>
 * yapi常量池
 * </p>
 *
 * @package: com.xlaser.yapi.constant
 * @author: Elijah.D
 * @time: CreateAt 2018/10/26 && 14:28
 * @description: yapi常量池
 * @copyright: Copyright © 2018 xlaser
 * @version: V1.0
 * @modified: Elijah.D
 */
public class ApiConsts {
	/**
	 * The constant RESPONSE_OBJECT_START.
	 */
	public static final String RESPONSE_OBJECT_START = "{\"$schema\": \"http://json-schema.org/draft-04/schema#\", \"type\": \"object\", \"properties\": {\"code\": {\"type\": \"number\"}, \"message\": {\"type\": \"string\"}, \"data\": {\"type\": \"object\", \"properties\": {";

	/**
	 * The constant RESPONSE_OBJECT_END.
	 */
	public static final String RESPONSE_OBJECT_END = "},\"required\": []}}, \"required\": [\"code\", \"message\", \"data\"]}";

	/**
	 * The constant RESPONSE_ARRAY_START.
	 */
	public static final String RESPONSE_ARRAY_START = "{\"$schema\": \"http://json-schema.org/draft-04/schema#\", \"type\": \"object\", \"properties\": {\"code\": {\"type\": \"number\"}, \"message\": {\"type\": \"string\"}, \"data\": {\"type\": \"array\", \"items\": {\"type\": \"object\", \"properties\": {";

	/**
	 * The constant RESPONSE_ARRAY_END.
	 */
	public static final String RESPONSE_ARRAY_END = "},\"required\": []}}}, \"required\": [\"code\", \"message\", \"data\"]}";

	/**
	 * The constant TYPE.
	 */
	public static final String TYPE = "\"type\":";

	/**
	 * The constant DESCRIPTION.
	 */
	public static final String DESCRIPTION = "\"description\":";

	/**
	 * The constant NUMBER.
	 */
	public static final String NUMBER = "\"number\",";

	/**
	 * The constant STRING.
	 */
	public static final String STRING = "\"string\",";

	/**
	 * The constant SERIAL_UID.
	 */
	public static final String SERIAL_UID = "serialVersionUID";

	/**
	 * The constant ARRAY.
	 */
	public static final String ARRAY = "\"array\",\"items\": {\"type\": \"string\"},";

	private ApiConsts() {
	}

	/**
	 * The enum Response type.
	 */
	public enum ResponseType {
		/**
		 * ARRAY response type.
		 */
		ARRAY(2),

		/**
		 * OBJECT response type.
		 */
		OBJECT(1);

		private final Integer value;

		ResponseType(int value) {
			this.value = value;
		}

		/**
		 * Gets value.
		 *
		 * @return the value
		 */
		public int getValue() {
			return value;
		}
	}
}
