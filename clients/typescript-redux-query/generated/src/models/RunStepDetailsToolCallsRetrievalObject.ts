// tslint:disable
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

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface RunStepDetailsToolCallsRetrievalObject
 */
export interface RunStepDetailsToolCallsRetrievalObject  {
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

export function RunStepDetailsToolCallsRetrievalObjectFromJSON(json: any): RunStepDetailsToolCallsRetrievalObject {
    return {
        'id': json['id'],
        'type': json['type'],
        'retrieval': json['retrieval'],
    };
}

export function RunStepDetailsToolCallsRetrievalObjectToJSON(value?: RunStepDetailsToolCallsRetrievalObject): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'id': value.id,
        'type': value.type,
        'retrieval': value.retrieval,
    };
}

/**
* @export
* @enum {string}
*/
export enum RunStepDetailsToolCallsRetrievalObjectTypeEnum {
    Retrieval = 'retrieval'
}

