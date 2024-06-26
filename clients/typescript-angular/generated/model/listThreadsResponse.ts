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
import { ThreadObject } from './threadObject';


export interface ListThreadsResponse { 
    object: string;
    data: Array<ThreadObject>;
    first_id: string;
    last_id: string;
    has_more: boolean;
}

