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

import * as models from './models';

/**
 * References an image [File](/docs/api-reference/files) in the content of a message.
 */
export interface MessageContentImageFileObject {
    /**
     * Always `image_file`.
     */
    type: MessageContentImageFileObject.TypeEnum;

    image_file: models.MessageContentImageFileObjectImageFile;

}
export namespace MessageContentImageFileObject {
    export enum TypeEnum {
        ImageFile = <any> 'image_file'
    }
}
