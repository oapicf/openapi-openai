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

import { RunStepStreamEventOneOf } from '../models/RunStepStreamEventOneOf';
import { RunStepStreamEventOneOf1 } from '../models/RunStepStreamEventOneOf1';
import { RunStepStreamEventOneOf2 } from '../models/RunStepStreamEventOneOf2';
import { RunStepStreamEventOneOf3 } from '../models/RunStepStreamEventOneOf3';
import { RunStepStreamEventOneOf4 } from '../models/RunStepStreamEventOneOf4';
import { RunStepStreamEventOneOf5 } from '../models/RunStepStreamEventOneOf5';
import { RunStepStreamEventOneOf6 } from '../models/RunStepStreamEventOneOf6';
import { HttpFile } from '../http/http';

/**
 * @type RunStepStreamEvent
 * Type
 * @export
 */
export type RunStepStreamEvent = RunStepStreamEventOneOf | RunStepStreamEventOneOf1 | RunStepStreamEventOneOf2 | RunStepStreamEventOneOf3 | RunStepStreamEventOneOf4 | RunStepStreamEventOneOf5 | RunStepStreamEventOneOf6;

/**
* @type RunStepStreamEventClass
* @export
*/
export class RunStepStreamEventClass {
    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;
}






