/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { AssistantFileObject } from './assistantFileObject';


export interface ListAssistantFilesResponse { 
    object: string;
    data: Array<AssistantFileObject>;
    first_id: string;
    last_id: string;
    has_more: boolean;
}

