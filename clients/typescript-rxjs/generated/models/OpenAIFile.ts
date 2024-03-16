// tslint:disable
/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
 * @export
 * @interface OpenAIFile
 */
export interface OpenAIFile {
    /**
     * @type {string}
     * @memberof OpenAIFile
     */
    id: string;
    /**
     * @type {string}
     * @memberof OpenAIFile
     */
    object: string;
    /**
     * @type {number}
     * @memberof OpenAIFile
     */
    bytes: number;
    /**
     * @type {number}
     * @memberof OpenAIFile
     */
    created_at: number;
    /**
     * @type {string}
     * @memberof OpenAIFile
     */
    filename: string;
    /**
     * @type {string}
     * @memberof OpenAIFile
     */
    purpose: string;
    /**
     * @type {string}
     * @memberof OpenAIFile
     */
    status?: string;
    /**
     * @type {object}
     * @memberof OpenAIFile
     */
    status_details?: object | null;
}