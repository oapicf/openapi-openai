/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * The definition of the function that was called.
 */
export interface RunStepDetailsToolCallsFunctionObjectFunction { 
    /**
     * The name of the function.
     */
    name: string;
    /**
     * The arguments passed to the function.
     */
    arguments: string;
    /**
     * The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
     */
    output: string | null;
}

