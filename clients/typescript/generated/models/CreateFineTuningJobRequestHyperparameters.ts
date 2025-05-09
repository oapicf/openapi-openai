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

import { CreateFineTuningJobRequestHyperparametersBatchSize } from '../models/CreateFineTuningJobRequestHyperparametersBatchSize';
import { CreateFineTuningJobRequestHyperparametersLearningRateMultiplier } from '../models/CreateFineTuningJobRequestHyperparametersLearningRateMultiplier';
import { CreateFineTuningJobRequestHyperparametersNEpochs } from '../models/CreateFineTuningJobRequestHyperparametersNEpochs';
import { HttpFile } from '../http/http';

/**
* The hyperparameters used for the fine-tuning job.
*/
export class CreateFineTuningJobRequestHyperparameters {
    'batchSize'?: CreateFineTuningJobRequestHyperparametersBatchSize;
    'learningRateMultiplier'?: CreateFineTuningJobRequestHyperparametersLearningRateMultiplier;
    'nEpochs'?: CreateFineTuningJobRequestHyperparametersNEpochs;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "batchSize",
            "baseName": "batch_size",
            "type": "CreateFineTuningJobRequestHyperparametersBatchSize",
            "format": ""
        },
        {
            "name": "learningRateMultiplier",
            "baseName": "learning_rate_multiplier",
            "type": "CreateFineTuningJobRequestHyperparametersLearningRateMultiplier",
            "format": ""
        },
        {
            "name": "nEpochs",
            "baseName": "n_epochs",
            "type": "CreateFineTuningJobRequestHyperparametersNEpochs",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CreateFineTuningJobRequestHyperparameters.attributeTypeMap;
    }

    public constructor() {
    }
}
