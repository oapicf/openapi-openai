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
 * @type CreateModerationRequestInput
 * The input text to classify
 * @export
 */
export type CreateModerationRequestInput = Array<string> | string;

export function CreateModerationRequestInputFromJSON(json: any): CreateModerationRequestInput {
    return CreateModerationRequestInputFromJSONTyped(json, false);
}

export function CreateModerationRequestInputFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateModerationRequestInput {
    if (json == null) {
        return json;
    }
    return { ...Array<string>FromJSONTyped(json, true), ...stringFromJSONTyped(json, true) };
}

export function CreateModerationRequestInputToJSON(value?: CreateModerationRequestInput | null): any {
    if (value == null) {
        return value;
    }

    if (instanceOfArray<string>(value)) {
        return Array<string>ToJSON(value as Array<string>);
    }
    if (instanceOfstring(value)) {
        return stringToJSON(value as string);
    }

    return {};
}

