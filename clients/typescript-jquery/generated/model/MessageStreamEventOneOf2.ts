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

import * as models from './models';

/**
 * Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
 */
export interface MessageStreamEventOneOf2 {
    event: MessageStreamEventOneOf2.EventEnum;

    data: models.MessageDeltaObject;

}
export namespace MessageStreamEventOneOf2 {
    export enum EventEnum {
        ThreadMessageDelta = <any> 'thread.message.delta'
    }
}
