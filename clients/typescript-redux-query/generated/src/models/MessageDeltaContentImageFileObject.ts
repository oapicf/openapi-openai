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

import { exists, mapValues } from '../runtime';
import {
    MessageDeltaContentImageFileObjectImageFile,
    MessageDeltaContentImageFileObjectImageFileFromJSON,
    MessageDeltaContentImageFileObjectImageFileToJSON,
} from './';

/**
 * References an image [File](/docs/api-reference/files) in the content of a message.
 * @export
 * @interface MessageDeltaContentImageFileObject
 */
export interface MessageDeltaContentImageFileObject  {
    /**
     * The index of the content part in the message.
     * @type {number}
     * @memberof MessageDeltaContentImageFileObject
     */
    index: number;
    /**
     * Always `image_file`.
     * @type {string}
     * @memberof MessageDeltaContentImageFileObject
     */
    type: MessageDeltaContentImageFileObjectTypeEnum;
    /**
     * 
     * @type {MessageDeltaContentImageFileObjectImageFile}
     * @memberof MessageDeltaContentImageFileObject
     */
    imageFile?: MessageDeltaContentImageFileObjectImageFile;
}

export function MessageDeltaContentImageFileObjectFromJSON(json: any): MessageDeltaContentImageFileObject {
    return {
        'index': json['index'],
        'type': json['type'],
        'imageFile': !exists(json, 'image_file') ? undefined : MessageDeltaContentImageFileObjectImageFileFromJSON(json['image_file']),
    };
}

export function MessageDeltaContentImageFileObjectToJSON(value?: MessageDeltaContentImageFileObject): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'index': value.index,
        'type': value.type,
        'image_file': MessageDeltaContentImageFileObjectImageFileToJSON(value.imageFile),
    };
}

/**
* @export
* @enum {string}
*/
export enum MessageDeltaContentImageFileObjectTypeEnum {
    ImageFile = 'image_file'
}


