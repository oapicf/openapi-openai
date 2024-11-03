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

import { mapValues } from '../runtime';
/**
 * The settings for your integration with Weights and Biases. This payload specifies the project that
 * metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags
 * to your run, and set a default entity (team, username, etc) to be associated with your run.
 * 
 * @export
 * @interface CreateFineTuningJobRequestIntegrationsInnerWandb
 */
export interface CreateFineTuningJobRequestIntegrationsInnerWandb {
    /**
     * The name of the project that the new run will be created under.
     * 
     * @type {string}
     * @memberof CreateFineTuningJobRequestIntegrationsInnerWandb
     */
    project: string;
    /**
     * A display name to set for the run. If not set, we will use the Job ID as the name.
     * 
     * @type {string}
     * @memberof CreateFineTuningJobRequestIntegrationsInnerWandb
     */
    name?: string | null;
    /**
     * The entity to use for the run. This allows you to set the team or username of the WandB user that you would
     * like associated with the run. If not set, the default entity for the registered WandB API key is used.
     * 
     * @type {string}
     * @memberof CreateFineTuningJobRequestIntegrationsInnerWandb
     */
    entity?: string | null;
    /**
     * A list of tags to be attached to the newly created run. These tags are passed through directly to WandB. Some
     * default tags are generated by OpenAI: "openai/finetune", "openai/{base-model}", "openai/{ftjob-abcdef}".
     * 
     * @type {Array<string>}
     * @memberof CreateFineTuningJobRequestIntegrationsInnerWandb
     */
    tags?: Array<string>;
}

/**
 * Check if a given object implements the CreateFineTuningJobRequestIntegrationsInnerWandb interface.
 */
export function instanceOfCreateFineTuningJobRequestIntegrationsInnerWandb(value: object): value is CreateFineTuningJobRequestIntegrationsInnerWandb {
    if (!('project' in value) || value['project'] === undefined) return false;
    return true;
}

export function CreateFineTuningJobRequestIntegrationsInnerWandbFromJSON(json: any): CreateFineTuningJobRequestIntegrationsInnerWandb {
    return CreateFineTuningJobRequestIntegrationsInnerWandbFromJSONTyped(json, false);
}

export function CreateFineTuningJobRequestIntegrationsInnerWandbFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateFineTuningJobRequestIntegrationsInnerWandb {
    if (json == null) {
        return json;
    }
    return {
        
        'project': json['project'],
        'name': json['name'] == null ? undefined : json['name'],
        'entity': json['entity'] == null ? undefined : json['entity'],
        'tags': json['tags'] == null ? undefined : json['tags'],
    };
}

  export function CreateFineTuningJobRequestIntegrationsInnerWandbToJSON(json: any): CreateFineTuningJobRequestIntegrationsInnerWandb {
      return CreateFineTuningJobRequestIntegrationsInnerWandbToJSONTyped(json, false);
  }

  export function CreateFineTuningJobRequestIntegrationsInnerWandbToJSONTyped(value?: CreateFineTuningJobRequestIntegrationsInnerWandb | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'project': value['project'],
        'name': value['name'],
        'entity': value['entity'],
        'tags': value['tags'],
    };
}

