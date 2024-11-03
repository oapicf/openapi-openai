/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RunStepDeltaObjectDeltaStepDetails } from '../models/RunStepDeltaObjectDeltaStepDetails';
import { HttpFile } from '../http/http';

/**
* The delta containing the fields that have changed on the run step.
*/
export class RunStepDeltaObjectDelta {
    'stepDetails'?: RunStepDeltaObjectDeltaStepDetails;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "stepDetails",
            "baseName": "step_details",
            "type": "RunStepDeltaObjectDeltaStepDetails",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RunStepDeltaObjectDelta.attributeTypeMap;
    }

    public constructor() {
    }
}
