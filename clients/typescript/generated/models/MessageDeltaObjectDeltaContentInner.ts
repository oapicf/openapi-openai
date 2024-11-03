/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { MessageDeltaContentImageFileObject } from '../models/MessageDeltaContentImageFileObject';
import { MessageDeltaContentTextObject } from '../models/MessageDeltaContentTextObject';
import { HttpFile } from '../http/http';

/**
 * @type MessageDeltaObjectDeltaContentInner
 * Type
 * @export
 */
export type MessageDeltaObjectDeltaContentInner = MessageDeltaContentImageFileObject | MessageDeltaContentTextObject;

/**
* @type MessageDeltaObjectDeltaContentInnerClass
* @export
*/
export class MessageDeltaObjectDeltaContentInnerClass {
    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;
}

