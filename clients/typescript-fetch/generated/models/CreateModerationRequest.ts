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
import type { CreateModerationRequestInput } from './CreateModerationRequestInput';
import {
    CreateModerationRequestInputFromJSON,
    CreateModerationRequestInputFromJSONTyped,
    CreateModerationRequestInputToJSON,
} from './CreateModerationRequestInput';
import type { CreateModerationRequestModel } from './CreateModerationRequestModel';
import {
    CreateModerationRequestModelFromJSON,
    CreateModerationRequestModelFromJSONTyped,
    CreateModerationRequestModelToJSON,
} from './CreateModerationRequestModel';

/**
 * 
 * @export
 * @interface CreateModerationRequest
 */
export interface CreateModerationRequest {
    /**
     * 
     * @type {CreateModerationRequestInput}
     * @memberof CreateModerationRequest
     */
    input: CreateModerationRequestInput;
    /**
     * 
     * @type {CreateModerationRequestModel}
     * @memberof CreateModerationRequest
     */
    model?: CreateModerationRequestModel;
}

/**
 * Check if a given object implements the CreateModerationRequest interface.
 */
export function instanceOfCreateModerationRequest(value: object): boolean {
    if (!('input' in value)) return false;
    return true;
}

export function CreateModerationRequestFromJSON(json: any): CreateModerationRequest {
    return CreateModerationRequestFromJSONTyped(json, false);
}

export function CreateModerationRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateModerationRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'input': CreateModerationRequestInputFromJSON(json['input']),
        'model': json['model'] == null ? undefined : CreateModerationRequestModelFromJSON(json['model']),
    };
}

export function CreateModerationRequestToJSON(value?: CreateModerationRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'input': CreateModerationRequestInputToJSON(value['input']),
        'model': CreateModerationRequestModelToJSON(value['model']),
    };
}
