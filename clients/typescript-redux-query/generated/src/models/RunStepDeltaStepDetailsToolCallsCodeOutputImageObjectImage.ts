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
 * @interface RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
 */
export interface RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage  {
    /**
     * The [file](/docs/api-reference/files) ID of the image.
     * @type {string}
     * @memberof RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
     */
    fileId?: string;
}

export function RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImageFromJSON(json: any): RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage {
    return {
        'fileId': !exists(json, 'file_id') ? undefined : json['file_id'],
    };
}

export function RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImageToJSON(value?: RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'file_id': value.fileId,
    };
}

