/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export interface RunStepDetailsToolCallsRetrievalObject { 
    /**
     * The ID of the tool call object.
     */
    id: string;
    /**
     * The type of tool call. This is always going to be `retrieval` for this type of tool call.
     */
    type: RunStepDetailsToolCallsRetrievalObject.TypeEnum;
    /**
     * For now, this is always going to be an empty object.
     */
    retrieval: object;
}
export namespace RunStepDetailsToolCallsRetrievalObject {
    export type TypeEnum = 'retrieval';
    export const TypeEnum = {
        Retrieval: 'retrieval' as TypeEnum
    };
}


