/**
 * OpenAI API
 *
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


