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
 * @interface AssistantToolsRetrieval
 */
export interface AssistantToolsRetrieval {
    /**
     * The type of tool being defined: `retrieval`
     * @type {string}
     * @memberof AssistantToolsRetrieval
     */
    type: AssistantToolsRetrievalTypeEnum;
}


/**
 * @export
 */
export const AssistantToolsRetrievalTypeEnum = {
    Retrieval: 'retrieval'
} as const;
export type AssistantToolsRetrievalTypeEnum = typeof AssistantToolsRetrievalTypeEnum[keyof typeof AssistantToolsRetrievalTypeEnum];


/**
 * Check if a given object implements the AssistantToolsRetrieval interface.
 */
export function instanceOfAssistantToolsRetrieval(value: object): value is AssistantToolsRetrieval {
    if (!('type' in value) || value['type'] === undefined) return false;
    return true;
}

export function AssistantToolsRetrievalFromJSON(json: any): AssistantToolsRetrieval {
    return AssistantToolsRetrievalFromJSONTyped(json, false);
}

export function AssistantToolsRetrievalFromJSONTyped(json: any, ignoreDiscriminator: boolean): AssistantToolsRetrieval {
    if (json == null) {
        return json;
    }
    return {
        
        'type': json['type'],
    };
}

  export function AssistantToolsRetrievalToJSON(json: any): AssistantToolsRetrieval {
      return AssistantToolsRetrievalToJSONTyped(json, false);
  }

  export function AssistantToolsRetrievalToJSONTyped(value?: AssistantToolsRetrieval | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'type': value['type'],
    };
}

