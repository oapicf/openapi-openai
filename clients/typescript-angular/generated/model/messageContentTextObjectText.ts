/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { MessageContentTextObjectTextAnnotationsInner } from './messageContentTextObjectTextAnnotationsInner';


export interface MessageContentTextObjectText { 
    /**
     * The data that makes up the text.
     */
    value: string;
    annotations: Array<MessageContentTextObjectTextAnnotationsInner>;
}

