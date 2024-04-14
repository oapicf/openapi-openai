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
import { MessageDeltaContentImageFileObjectImageFile } from './messageDeltaContentImageFileObjectImageFile';


/**
 * References an image [File](/docs/api-reference/files) in the content of a message.
 */
export interface MessageDeltaContentImageFileObject { 
    /**
     * The index of the content part in the message.
     */
    index: number;
    /**
     * Always `image_file`.
     */
    type: MessageDeltaContentImageFileObject.TypeEnum;
    image_file?: MessageDeltaContentImageFileObjectImageFile;
}
export namespace MessageDeltaContentImageFileObject {
    export type TypeEnum = 'image_file';
    export const TypeEnum = {
        ImageFile: 'image_file' as TypeEnum
    };
}


