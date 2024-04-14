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

import { RequestFile } from './models';
import { RunStepDeltaObjectDeltaStepDetails } from './runStepDeltaObjectDeltaStepDetails';

/**
* The delta containing the fields that have changed on the run step.
*/
export class RunStepDeltaObjectDelta {
    'stepDetails'?: RunStepDeltaObjectDeltaStepDetails;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "stepDetails",
            "baseName": "step_details",
            "type": "RunStepDeltaObjectDeltaStepDetails"
        }    ];

    static getAttributeTypeMap() {
        return RunStepDeltaObjectDelta.attributeTypeMap;
    }
}

