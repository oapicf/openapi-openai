/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export interface DeleteAssistantResponse { 
    id: string;
    deleted: boolean;
    object: DeleteAssistantResponse.ObjectEnum;
}
export namespace DeleteAssistantResponse {
    export type ObjectEnum = 'assistant.deleted';
    export const ObjectEnum = {
        AssistantDeleted: 'assistant.deleted' as ObjectEnum
    };
}


