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

import { FineTuningJobHyperparametersNEpochs } from '../models/FineTuningJobHyperparametersNEpochs';
import { HttpFile } from '../http/http';

/**
* The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
*/
export class FineTuningJobHyperparameters {
    'nEpochs': FineTuningJobHyperparametersNEpochs;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "nEpochs",
            "baseName": "n_epochs",
            "type": "FineTuningJobHyperparametersNEpochs",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return FineTuningJobHyperparameters.attributeTypeMap;
    }

    public constructor() {
    }
}
