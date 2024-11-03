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
import { AssistantObject } from './assistantObject';


export interface ListAssistantsResponse { 
    object: string;
    data: Array<AssistantObject>;
    first_id: string;
    last_id: string;
    has_more: boolean;
}
