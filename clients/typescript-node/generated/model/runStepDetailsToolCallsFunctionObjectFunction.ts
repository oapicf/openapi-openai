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

/**
* The definition of the function that was called.
*/
export class RunStepDetailsToolCallsFunctionObjectFunction {
    /**
    * The name of the function.
    */
    'name': string;
    /**
    * The arguments passed to the function.
    */
    'arguments': string;
    /**
    * The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
    */
    'output': string | null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "arguments",
            "baseName": "arguments",
            "type": "string"
        },
        {
            "name": "output",
            "baseName": "output",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return RunStepDetailsToolCallsFunctionObjectFunction.attributeTypeMap;
    }
}

