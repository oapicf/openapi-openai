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
 * For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.
 * @export
 * @interface FineTuningJobError
 */
export interface FineTuningJobError {
    /**
     * A machine-readable error code.
     * @type {string}
     * @memberof FineTuningJobError
     */
    code: string;
    /**
     * A human-readable error message.
     * @type {string}
     * @memberof FineTuningJobError
     */
    message: string;
    /**
     * The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.
     * @type {string}
     * @memberof FineTuningJobError
     */
    param: string | null;
}

/**
 * Check if a given object implements the FineTuningJobError interface.
 */
export function instanceOfFineTuningJobError(value: object): value is FineTuningJobError {
    if (!('code' in value) || value['code'] === undefined) return false;
    if (!('message' in value) || value['message'] === undefined) return false;
    if (!('param' in value) || value['param'] === undefined) return false;
    return true;
}

export function FineTuningJobErrorFromJSON(json: any): FineTuningJobError {
    return FineTuningJobErrorFromJSONTyped(json, false);
}

export function FineTuningJobErrorFromJSONTyped(json: any, ignoreDiscriminator: boolean): FineTuningJobError {
    if (json == null) {
        return json;
    }
    return {
        
        'code': json['code'],
        'message': json['message'],
        'param': json['param'],
    };
}

  export function FineTuningJobErrorToJSON(json: any): FineTuningJobError {
      return FineTuningJobErrorToJSONTyped(json, false);
  }

  export function FineTuningJobErrorToJSONTyped(value?: FineTuningJobError | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'code': value['code'],
        'message': value['message'],
        'param': value['param'],
    };
}

