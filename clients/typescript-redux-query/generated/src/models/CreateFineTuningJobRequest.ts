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
    CreateFineTuningJobRequestHyperparameters,
    CreateFineTuningJobRequestHyperparametersFromJSON,
    CreateFineTuningJobRequestHyperparametersToJSON,
    CreateFineTuningJobRequestIntegrationsInner,
    CreateFineTuningJobRequestIntegrationsInnerFromJSON,
    CreateFineTuningJobRequestIntegrationsInnerToJSON,
    CreateFineTuningJobRequestModel,
    CreateFineTuningJobRequestModelFromJSON,
    CreateFineTuningJobRequestModelToJSON,
} from './';

/**
 * 
 * @export
 * @interface CreateFineTuningJobRequest
 */
export interface CreateFineTuningJobRequest  {
    /**
     * 
     * @type {CreateFineTuningJobRequestModel}
     * @memberof CreateFineTuningJobRequest
     */
    model: CreateFineTuningJobRequestModel;
    /**
     * The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
     * @type {string}
     * @memberof CreateFineTuningJobRequest
     */
    trainingFile: string;
    /**
     * 
     * @type {CreateFineTuningJobRequestHyperparameters}
     * @memberof CreateFineTuningJobRequest
     */
    hyperparameters?: CreateFineTuningJobRequestHyperparameters;
    /**
     * A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`. 
     * @type {string}
     * @memberof CreateFineTuningJobRequest
     */
    suffix?: string;
    /**
     * The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
     * @type {string}
     * @memberof CreateFineTuningJobRequest
     */
    validationFile?: string;
    /**
     * A list of integrations to enable for your fine-tuning job.
     * @type {Array<CreateFineTuningJobRequestIntegrationsInner>}
     * @memberof CreateFineTuningJobRequest
     */
    integrations?: Array<CreateFineTuningJobRequestIntegrationsInner>;
    /**
     * The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
     * @type {number}
     * @memberof CreateFineTuningJobRequest
     */
    seed?: number;
}

export function CreateFineTuningJobRequestFromJSON(json: any): CreateFineTuningJobRequest {
    return {
        'model': CreateFineTuningJobRequestModelFromJSON(json['model']),
        'trainingFile': json['training_file'],
        'hyperparameters': !exists(json, 'hyperparameters') ? undefined : CreateFineTuningJobRequestHyperparametersFromJSON(json['hyperparameters']),
        'suffix': !exists(json, 'suffix') ? undefined : json['suffix'],
        'validationFile': !exists(json, 'validation_file') ? undefined : json['validation_file'],
        'integrations': !exists(json, 'integrations') ? undefined : (json['integrations'] as Array<any>).map(CreateFineTuningJobRequestIntegrationsInnerFromJSON),
        'seed': !exists(json, 'seed') ? undefined : json['seed'],
    };
}

export function CreateFineTuningJobRequestToJSON(value?: CreateFineTuningJobRequest): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'model': CreateFineTuningJobRequestModelToJSON(value.model),
        'training_file': value.trainingFile,
        'hyperparameters': CreateFineTuningJobRequestHyperparametersToJSON(value.hyperparameters),
        'suffix': value.suffix,
        'validation_file': value.validationFile,
        'integrations': value.integrations === undefined ? undefined : (value.integrations as Array<any>).map(CreateFineTuningJobRequestIntegrationsInnerToJSON),
        'seed': value.seed,
    };
}


