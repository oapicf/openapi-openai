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

import { CreateFineTuningJobRequestHyperparameters } from '../models/CreateFineTuningJobRequestHyperparameters';
import { CreateFineTuningJobRequestIntegrationsInner } from '../models/CreateFineTuningJobRequestIntegrationsInner';
import { CreateFineTuningJobRequestModel } from '../models/CreateFineTuningJobRequestModel';
import { HttpFile } from '../http/http';

export class CreateFineTuningJobRequest {
    'model': CreateFineTuningJobRequestModel;
    /**
    * The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
    */
    'trainingFile': string;
    'hyperparameters'?: CreateFineTuningJobRequestHyperparameters;
    /**
    * A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`. 
    */
    'suffix'?: string | null;
    /**
    * The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
    */
    'validationFile'?: string | null;
    /**
    * A list of integrations to enable for your fine-tuning job.
    */
    'integrations'?: Array<CreateFineTuningJobRequestIntegrationsInner> | null;
    /**
    * The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
    */
    'seed'?: number | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "model",
            "baseName": "model",
            "type": "CreateFineTuningJobRequestModel",
            "format": ""
        },
        {
            "name": "trainingFile",
            "baseName": "training_file",
            "type": "string",
            "format": ""
        },
        {
            "name": "hyperparameters",
            "baseName": "hyperparameters",
            "type": "CreateFineTuningJobRequestHyperparameters",
            "format": ""
        },
        {
            "name": "suffix",
            "baseName": "suffix",
            "type": "string",
            "format": ""
        },
        {
            "name": "validationFile",
            "baseName": "validation_file",
            "type": "string",
            "format": ""
        },
        {
            "name": "integrations",
            "baseName": "integrations",
            "type": "Array<CreateFineTuningJobRequestIntegrationsInner>",
            "format": ""
        },
        {
            "name": "seed",
            "baseName": "seed",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CreateFineTuningJobRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

