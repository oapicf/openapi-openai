/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { MessageStreamEventOneOf2 } from './messageStreamEventOneOf2';
import { MessageStreamEventOneOf3 } from './messageStreamEventOneOf3';
import { MessageStreamEventOneOf4 } from './messageStreamEventOneOf4';
import { MessageStreamEventOneOf } from './messageStreamEventOneOf';
import { MessageObject } from './messageObject';
import { MessageStreamEventOneOf1 } from './messageStreamEventOneOf1';


/**
 * @type MessageStreamEvent
 * @export
 */
export type MessageStreamEvent = MessageStreamEventOneOf | MessageStreamEventOneOf1 | MessageStreamEventOneOf2 | MessageStreamEventOneOf3 | MessageStreamEventOneOf4;

