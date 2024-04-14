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


export interface DeleteMessageResponse { 
    id: string;
    deleted: boolean;
    object: DeleteMessageResponse.ObjectEnum;
}
export namespace DeleteMessageResponse {
    export type ObjectEnum = 'thread.message.deleted';
    export const ObjectEnum = {
        ThreadMessageDeleted: 'thread.message.deleted' as ObjectEnum
    };
}


