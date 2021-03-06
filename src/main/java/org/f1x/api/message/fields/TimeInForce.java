/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.f1x.api.message.fields;

// Generated by org.f1x.tools.DictionaryGenerator from QuickFIX dictionary
public enum TimeInForce implements org.f1x.api.message.types.ByteEnum {
	DAY((byte)'0'),
	GOOD_TILL_CANCEL((byte)'1'),
	AT_THE_OPENING((byte)'2'),
	IMMEDIATE_OR_CANCEL((byte)'3'),
	FILL_OR_KILL((byte)'4'),
	GOOD_TILL_CROSSING((byte)'5'),
	GOOD_TILL_DATE((byte)'6'),
	AT_THE_CLOSE((byte)'7');

	private final byte code;

	TimeInForce (byte code) {
		this.code  = code;
	}

	public byte getCode() { return code; }

	public static TimeInForce parse(String s) {
		switch(s) {
			case "0" : return DAY;
			case "1" : return GOOD_TILL_CANCEL;
			case "2" : return AT_THE_OPENING;
			case "3" : return IMMEDIATE_OR_CANCEL;
			case "4" : return FILL_OR_KILL;
			case "5" : return GOOD_TILL_CROSSING;
			case "6" : return GOOD_TILL_DATE;
			case "7" : return AT_THE_CLOSE;
		}
		return null;
	}

}