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

import { RequestFile } from './models';
import { MessageDeltaContentImageFileObjectImageFile } from './messageDeltaContentImageFileObjectImageFile';

/**
* References an image [File](/docs/api-reference/files) in the content of a message.
*/
export class MessageDeltaContentImageFileObject {
    /**
    * The index of the content part in the message.
    */
    'index': number;
    /**
    * Always `image_file`.
    */
    'type': MessageDeltaContentImageFileObject.TypeEnum;
    'imageFile'?: MessageDeltaContentImageFileObjectImageFile;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "index",
            "baseName": "index",
            "type": "number"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "MessageDeltaContentImageFileObject.TypeEnum"
        },
        {
            "name": "imageFile",
            "baseName": "image_file",
            "type": "MessageDeltaContentImageFileObjectImageFile"
        }    ];

    static getAttributeTypeMap() {
        return MessageDeltaContentImageFileObject.attributeTypeMap;
    }
}

export namespace MessageDeltaContentImageFileObject {
    export enum TypeEnum {
        ImageFile = <any> 'image_file'
    }
}
