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
 * @interface RunStepDeltaStepDetailsToolCallsRetrievalObject
 */
export interface RunStepDeltaStepDetailsToolCallsRetrievalObject {
    /**
     * The index of the tool call in the tool calls array.
     * @type {number}
     * @memberof RunStepDeltaStepDetailsToolCallsRetrievalObject
     */
    index: number;
    /**
     * The ID of the tool call object.
     * @type {string}
     * @memberof RunStepDeltaStepDetailsToolCallsRetrievalObject
     */
    id?: string;
    /**
     * The type of tool call. This is always going to be `retrieval` for this type of tool call.
     * @type {string}
     * @memberof RunStepDeltaStepDetailsToolCallsRetrievalObject
     */
    type: RunStepDeltaStepDetailsToolCallsRetrievalObjectTypeEnum;
    /**
     * For now, this is always going to be an empty object.
     * @type {object}
     * @memberof RunStepDeltaStepDetailsToolCallsRetrievalObject
     */
    retrieval?: object;
}


/**
 * @export
 */
export const RunStepDeltaStepDetailsToolCallsRetrievalObjectTypeEnum = {
    Retrieval: 'retrieval'
} as const;
export type RunStepDeltaStepDetailsToolCallsRetrievalObjectTypeEnum = typeof RunStepDeltaStepDetailsToolCallsRetrievalObjectTypeEnum[keyof typeof RunStepDeltaStepDetailsToolCallsRetrievalObjectTypeEnum];


/**
 * Check if a given object implements the RunStepDeltaStepDetailsToolCallsRetrievalObject interface.
 */
export function instanceOfRunStepDeltaStepDetailsToolCallsRetrievalObject(value: object): boolean {
    if (!('index' in value)) return false;
    if (!('type' in value)) return false;
    return true;
}

export function RunStepDeltaStepDetailsToolCallsRetrievalObjectFromJSON(json: any): RunStepDeltaStepDetailsToolCallsRetrievalObject {
    return RunStepDeltaStepDetailsToolCallsRetrievalObjectFromJSONTyped(json, false);
}

export function RunStepDeltaStepDetailsToolCallsRetrievalObjectFromJSONTyped(json: any, ignoreDiscriminator: boolean): RunStepDeltaStepDetailsToolCallsRetrievalObject {
    if (json == null) {
        return json;
    }
    return {
        
        'index': json['index'],
        'id': json['id'] == null ? undefined : json['id'],
        'type': json['type'],
        'retrieval': json['retrieval'] == null ? undefined : json['retrieval'],
    };
}

export function RunStepDeltaStepDetailsToolCallsRetrievalObjectToJSON(value?: RunStepDeltaStepDetailsToolCallsRetrievalObject | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'index': value['index'],
        'id': value['id'],
        'type': value['type'],
        'retrieval': value['retrieval'],
    };
}

