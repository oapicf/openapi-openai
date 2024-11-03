/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { MessageContentImageFileObjectImageFile } from './messageContentImageFileObjectImageFile';


/**
 * References an image [File](/docs/api-reference/files) in the content of a message.
 */
export interface MessageContentImageFileObject { 
    /**
     * Always `image_file`.
     */
    type: MessageContentImageFileObject.TypeEnum;
    image_file: MessageContentImageFileObjectImageFile;
}
export namespace MessageContentImageFileObject {
    export type TypeEnum = 'image_file';
    export const TypeEnum = {
        ImageFile: 'image_file' as TypeEnum
    };
}


