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

import { CreateTranslationResponseJson } from '../models/CreateTranslationResponseJson';
import { CreateTranslationResponseVerboseJson } from '../models/CreateTranslationResponseVerboseJson';
import { HttpFile } from '../http/http';

/**
 * @type CreateTranslation200Response
 * Type
 * @export
 */
export type CreateTranslation200Response = CreateTranslationResponseJson | CreateTranslationResponseVerboseJson;

/**
* @type CreateTranslation200ResponseClass
* @export
*/
export class CreateTranslation200ResponseClass {
    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;
}

