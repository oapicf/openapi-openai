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
* The type of integration to enable. Currently, only \"wandb\" (Weights and Biases) is supported. 
*/
/**
 * @type CreateFineTuningJobRequestIntegrationsInnerType
 * Type
 * @export
 */
export type CreateFineTuningJobRequestIntegrationsInnerType = string;

/**
* @type CreateFineTuningJobRequestIntegrationsInnerTypeClass
    * The type of integration to enable. Currently, only \"wandb\" (Weights and Biases) is supported. 
* @export
*/
export class CreateFineTuningJobRequestIntegrationsInnerTypeClass {
    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;
}
