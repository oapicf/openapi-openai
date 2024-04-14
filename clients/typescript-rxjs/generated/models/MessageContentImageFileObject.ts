// tslint:disable
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

import type {
    MessageContentImageFileObjectImageFile,
} from './';

/**
 * References an image [File](/docs/api-reference/files) in the content of a message.
 * @export
 * @interface MessageContentImageFileObject
 */
export interface MessageContentImageFileObject {
    /**
     * Always `image_file`.
     * @type {string}
     * @memberof MessageContentImageFileObject
     */
    type: MessageContentImageFileObjectTypeEnum;
    /**
     * @type {MessageContentImageFileObjectImageFile}
     * @memberof MessageContentImageFileObject
     */
    image_file: MessageContentImageFileObjectImageFile;
}

/**
 * @export
 * @enum {string}
 */
export enum MessageContentImageFileObjectTypeEnum {
    ImageFile = 'image_file'
}

