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
import { CreateCompletionResponseChoicesInner } from './createCompletionResponseChoicesInner';
import { CreateCompletionResponseUsage } from './createCompletionResponseUsage';


export interface CreateCompletionResponse { 
    id: string;
    object: string;
    created: number;
    model: string;
    choices: Array<CreateCompletionResponseChoicesInner>;
    usage?: CreateCompletionResponseUsage;
}
