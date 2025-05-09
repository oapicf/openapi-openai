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
import type { OpenAIFile } from './OpenAIFile';
import {
    OpenAIFileFromJSON,
    OpenAIFileFromJSONTyped,
    OpenAIFileToJSON,
    OpenAIFileToJSONTyped,
} from './OpenAIFile';

/**
 * 
 * @export
 * @interface ListFilesResponse
 */
export interface ListFilesResponse {
    /**
     * 
     * @type {Array<OpenAIFile>}
     * @memberof ListFilesResponse
     */
    data: Array<OpenAIFile>;
    /**
     * 
     * @type {string}
     * @memberof ListFilesResponse
     */
    object: ListFilesResponseObjectEnum;
}


/**
 * @export
 */
export const ListFilesResponseObjectEnum = {
    List: 'list'
} as const;
export type ListFilesResponseObjectEnum = typeof ListFilesResponseObjectEnum[keyof typeof ListFilesResponseObjectEnum];


/**
 * Check if a given object implements the ListFilesResponse interface.
 */
export function instanceOfListFilesResponse(value: object): value is ListFilesResponse {
    if (!('data' in value) || value['data'] === undefined) return false;
    if (!('object' in value) || value['object'] === undefined) return false;
    return true;
}

export function ListFilesResponseFromJSON(json: any): ListFilesResponse {
    return ListFilesResponseFromJSONTyped(json, false);
}

export function ListFilesResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ListFilesResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'data': ((json['data'] as Array<any>).map(OpenAIFileFromJSON)),
        'object': json['object'],
    };
}

  export function ListFilesResponseToJSON(json: any): ListFilesResponse {
      return ListFilesResponseToJSONTyped(json, false);
  }

  export function ListFilesResponseToJSONTyped(value?: ListFilesResponse | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'data': ((value['data'] as Array<any>).map(OpenAIFileToJSON)),
        'object': value['object'],
    };
}

