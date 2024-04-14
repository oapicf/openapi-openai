/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { CreateEmbeddingRequestInput } from '../models/CreateEmbeddingRequestInput';
import { CreateEmbeddingRequestModel } from '../models/CreateEmbeddingRequestModel';
import { HttpFile } from '../http/http';

export class CreateEmbeddingRequest {
    'input': CreateEmbeddingRequestInput;
    'model': CreateEmbeddingRequestModel;
    /**
    * The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
    */
    'encodingFormat'?: CreateEmbeddingRequestEncodingFormatEnum;
    /**
    * The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
    */
    'dimensions'?: number;
    /**
    * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    */
    'user'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "input",
            "baseName": "input",
            "type": "CreateEmbeddingRequestInput",
            "format": ""
        },
        {
            "name": "model",
            "baseName": "model",
            "type": "CreateEmbeddingRequestModel",
            "format": ""
        },
        {
            "name": "encodingFormat",
            "baseName": "encoding_format",
            "type": "CreateEmbeddingRequestEncodingFormatEnum",
            "format": ""
        },
        {
            "name": "dimensions",
            "baseName": "dimensions",
            "type": "number",
            "format": ""
        },
        {
            "name": "user",
            "baseName": "user",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CreateEmbeddingRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export enum CreateEmbeddingRequestEncodingFormatEnum {
    Float = 'float',
    Base64 = 'base64'
}

