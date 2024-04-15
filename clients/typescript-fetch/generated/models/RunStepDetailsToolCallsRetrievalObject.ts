/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface RunStepDetailsToolCallsRetrievalObject
 */
export interface RunStepDetailsToolCallsRetrievalObject {
    /**
     * The ID of the tool call object.
     * @type {string}
     * @memberof RunStepDetailsToolCallsRetrievalObject
     */
    id: string;
    /**
     * The type of tool call. This is always going to be `retrieval` for this type of tool call.
     * @type {string}
     * @memberof RunStepDetailsToolCallsRetrievalObject
     */
    type: RunStepDetailsToolCallsRetrievalObjectTypeEnum;
    /**
     * For now, this is always going to be an empty object.
     * @type {object}
     * @memberof RunStepDetailsToolCallsRetrievalObject
     */
    retrieval: object;
}


/**
 * @export
 */
export const RunStepDetailsToolCallsRetrievalObjectTypeEnum = {
    Retrieval: 'retrieval'
} as const;
export type RunStepDetailsToolCallsRetrievalObjectTypeEnum = typeof RunStepDetailsToolCallsRetrievalObjectTypeEnum[keyof typeof RunStepDetailsToolCallsRetrievalObjectTypeEnum];


/**
 * Check if a given object implements the RunStepDetailsToolCallsRetrievalObject interface.
 */
export function instanceOfRunStepDetailsToolCallsRetrievalObject(value: object): boolean {
    if (!('id' in value)) return false;
    if (!('type' in value)) return false;
    if (!('retrieval' in value)) return false;
    return true;
}

export function RunStepDetailsToolCallsRetrievalObjectFromJSON(json: any): RunStepDetailsToolCallsRetrievalObject {
    return RunStepDetailsToolCallsRetrievalObjectFromJSONTyped(json, false);
}

export function RunStepDetailsToolCallsRetrievalObjectFromJSONTyped(json: any, ignoreDiscriminator: boolean): RunStepDetailsToolCallsRetrievalObject {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
        'type': json['type'],
        'retrieval': json['retrieval'],
    };
}

export function RunStepDetailsToolCallsRetrievalObjectToJSON(value?: RunStepDetailsToolCallsRetrievalObject | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'type': value['type'],
        'retrieval': value['retrieval'],
    };
}
