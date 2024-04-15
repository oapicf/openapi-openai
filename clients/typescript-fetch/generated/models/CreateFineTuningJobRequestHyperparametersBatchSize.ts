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
 * @type CreateFineTuningJobRequestHyperparametersBatchSize
 * Number of examples in each batch. A larger batch size means that model parameters
 * are updated less frequently, but with lower variance.
 * 
 * @export
 */
export type CreateFineTuningJobRequestHyperparametersBatchSize = number | string;

export function CreateFineTuningJobRequestHyperparametersBatchSizeFromJSON(json: any): CreateFineTuningJobRequestHyperparametersBatchSize {
    return CreateFineTuningJobRequestHyperparametersBatchSizeFromJSONTyped(json, false);
}

export function CreateFineTuningJobRequestHyperparametersBatchSizeFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateFineTuningJobRequestHyperparametersBatchSize {
    if (json == null) {
        return json;
    }
    return { ...numberFromJSONTyped(json, true), ...stringFromJSONTyped(json, true) };
}

export function CreateFineTuningJobRequestHyperparametersBatchSizeToJSON(value?: CreateFineTuningJobRequestHyperparametersBatchSize | null): any {
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
