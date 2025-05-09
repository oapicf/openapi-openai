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

import { HttpFile } from '../http/http';

/**
* The definition of the function that was called.
*/
export class RunStepDeltaStepDetailsToolCallsFunctionObjectFunction {
    /**
    * The name of the function.
    */
    'name'?: string;
    /**
    * The arguments passed to the function.
    */
    'arguments'?: string;
    /**
    * The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
    */
    'output'?: string | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "arguments",
            "baseName": "arguments",
            "type": "string",
            "format": ""
        },
        {
            "name": "output",
            "baseName": "output",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.attributeTypeMap;
    }

    public constructor() {
    }
}
