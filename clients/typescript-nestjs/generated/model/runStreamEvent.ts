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
import { RunObject } from './runObject';
import { RunStreamEventOneOf7 } from './runStreamEventOneOf7';
import { RunStreamEventOneOf6 } from './runStreamEventOneOf6';
import { RunStreamEventOneOf8 } from './runStreamEventOneOf8';
import { RunStreamEventOneOf3 } from './runStreamEventOneOf3';
import { RunStreamEventOneOf2 } from './runStreamEventOneOf2';
import { RunStreamEventOneOf5 } from './runStreamEventOneOf5';
import { RunStreamEventOneOf4 } from './runStreamEventOneOf4';
import { RunStreamEventOneOf } from './runStreamEventOneOf';
import { RunStreamEventOneOf1 } from './runStreamEventOneOf1';


/**
 * @type RunStreamEvent
 * @export
 */
export type RunStreamEvent = RunStreamEventOneOf | RunStreamEventOneOf1 | RunStreamEventOneOf2 | RunStreamEventOneOf3 | RunStreamEventOneOf4 | RunStreamEventOneOf5 | RunStreamEventOneOf6 | RunStreamEventOneOf7 | RunStreamEventOneOf8;

