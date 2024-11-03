/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export interface DeleteThreadResponse { 
    id: string;
    deleted: boolean;
    object: DeleteThreadResponse.ObjectEnum;
}
export namespace DeleteThreadResponse {
    export type ObjectEnum = 'thread.deleted';
    export const ObjectEnum = {
        ThreadDeleted: 'thread.deleted' as ObjectEnum
    };
}


