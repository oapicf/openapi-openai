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
import type { SubmitToolOutputsRunRequestToolOutputsInner } from './SubmitToolOutputsRunRequestToolOutputsInner';
import {
    SubmitToolOutputsRunRequestToolOutputsInnerFromJSON,
    SubmitToolOutputsRunRequestToolOutputsInnerFromJSONTyped,
    SubmitToolOutputsRunRequestToolOutputsInnerToJSON,
} from './SubmitToolOutputsRunRequestToolOutputsInner';

/**
 * 
 * @export
 * @interface SubmitToolOutputsRunRequest
 */
export interface SubmitToolOutputsRunRequest {
    /**
     * A list of tools for which the outputs are being submitted.
     * @type {Array<SubmitToolOutputsRunRequestToolOutputsInner>}
     * @memberof SubmitToolOutputsRunRequest
     */
    toolOutputs: Array<SubmitToolOutputsRunRequestToolOutputsInner>;
    /**
     * If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message.
     * 
     * @type {boolean}
     * @memberof SubmitToolOutputsRunRequest
     */
    stream?: boolean;
}

/**
 * Check if a given object implements the SubmitToolOutputsRunRequest interface.
 */
export function instanceOfSubmitToolOutputsRunRequest(value: object): boolean {
    if (!('toolOutputs' in value)) return false;
    return true;
}

export function SubmitToolOutputsRunRequestFromJSON(json: any): SubmitToolOutputsRunRequest {
    return SubmitToolOutputsRunRequestFromJSONTyped(json, false);
}

export function SubmitToolOutputsRunRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): SubmitToolOutputsRunRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'toolOutputs': ((json['tool_outputs'] as Array<any>).map(SubmitToolOutputsRunRequestToolOutputsInnerFromJSON)),
        'stream': json['stream'] == null ? undefined : json['stream'],
    };
}

export function SubmitToolOutputsRunRequestToJSON(value?: SubmitToolOutputsRunRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'tool_outputs': ((value['toolOutputs'] as Array<any>).map(SubmitToolOutputsRunRequestToolOutputsInnerToJSON)),
        'stream': value['stream'],
    };
}
