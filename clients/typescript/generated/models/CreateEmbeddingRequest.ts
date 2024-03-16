/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
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
    'model': CreateEmbeddingRequestModel;
    'input': CreateEmbeddingRequestInput;
    /**
    * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    */
    'user'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "model",
            "baseName": "model",
            "type": "CreateEmbeddingRequestModel",
            "format": ""
        },
        {
            "name": "input",
            "baseName": "input",
            "type": "CreateEmbeddingRequestInput",
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

