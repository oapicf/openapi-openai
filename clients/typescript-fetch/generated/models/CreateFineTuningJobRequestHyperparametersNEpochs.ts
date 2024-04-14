/* tslint:disable */
/* eslint-disable */
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

/**
 * @type CreateFineTuningJobRequestHyperparametersNEpochs
 * The number of epochs to train the model for. An epoch refers to one full cycle
 * through the training dataset.
 * 
 * @export
 */
export type CreateFineTuningJobRequestHyperparametersNEpochs = number | string;

export function CreateFineTuningJobRequestHyperparametersNEpochsFromJSON(json: any): CreateFineTuningJobRequestHyperparametersNEpochs {
    return CreateFineTuningJobRequestHyperparametersNEpochsFromJSONTyped(json, false);
}

export function CreateFineTuningJobRequestHyperparametersNEpochsFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateFineTuningJobRequestHyperparametersNEpochs {
    if (json == null) {
        return json;
    }
    return { ...numberFromJSONTyped(json, true), ...stringFromJSONTyped(json, true) };
}

export function CreateFineTuningJobRequestHyperparametersNEpochsToJSON(value?: CreateFineTuningJobRequestHyperparametersNEpochs | null): any {
    if (value == null) {
        return value;
    }

    if (instanceOfnumber(value)) {
        return numberToJSON(value as number);
    }
    if (instanceOfstring(value)) {
        return stringToJSON(value as string);
    }

    return {};
}

