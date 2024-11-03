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
 *
 */

import ApiClient from '../ApiClient';
import FineTuningJobError from './FineTuningJobError';
import FineTuningJobHyperparameters from './FineTuningJobHyperparameters';
import FineTuningJobIntegrationsInner from './FineTuningJobIntegrationsInner';

/**
 * The FineTuningJob model module.
 * @module model/FineTuningJob
 * @version 1.1.1-pre.0
 */
class FineTuningJob {
    /**
     * Constructs a new <code>FineTuningJob</code>.
     * The &#x60;fine_tuning.job&#x60; object represents a fine-tuning job that has been created through the API. 
     * @alias module:model/FineTuningJob
     * @param id {String} The object identifier, which can be referenced in the API endpoints.
     * @param createdAt {Number} The Unix timestamp (in seconds) for when the fine-tuning job was created.
     * @param error {module:model/FineTuningJobError} 
     * @param fineTunedModel {String} The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
     * @param finishedAt {Number} The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
     * @param hyperparameters {module:model/FineTuningJobHyperparameters} 
     * @param model {String} The base model that is being fine-tuned.
     * @param object {module:model/FineTuningJob.ObjectEnum} The object type, which is always \"fine_tuning.job\".
     * @param organizationId {String} The organization that owns the fine-tuning job.
     * @param resultFiles {Array.<String>} The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @param status {module:model/FineTuningJob.StatusEnum} The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
     * @param trainedTokens {Number} The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
     * @param trainingFile {String} The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @param validationFile {String} The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @param seed {Number} The seed used for the fine-tuning job.
     */
    constructor(id, createdAt, error, fineTunedModel, finishedAt, hyperparameters, model, object, organizationId, resultFiles, status, trainedTokens, trainingFile, validationFile, seed) { 
        
        FineTuningJob.initialize(this, id, createdAt, error, fineTunedModel, finishedAt, hyperparameters, model, object, organizationId, resultFiles, status, trainedTokens, trainingFile, validationFile, seed);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, createdAt, error, fineTunedModel, finishedAt, hyperparameters, model, object, organizationId, resultFiles, status, trainedTokens, trainingFile, validationFile, seed) { 
        obj['id'] = id;
        obj['created_at'] = createdAt;
        obj['error'] = error;
        obj['fine_tuned_model'] = fineTunedModel;
        obj['finished_at'] = finishedAt;
        obj['hyperparameters'] = hyperparameters;
        obj['model'] = model;
        obj['object'] = object;
        obj['organization_id'] = organizationId;
        obj['result_files'] = resultFiles;
        obj['status'] = status;
        obj['trained_tokens'] = trainedTokens;
        obj['training_file'] = trainingFile;
        obj['validation_file'] = validationFile;
        obj['seed'] = seed;
    }

    /**
     * Constructs a <code>FineTuningJob</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FineTuningJob} obj Optional instance to populate.
     * @return {module:model/FineTuningJob} The populated <code>FineTuningJob</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FineTuningJob();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('created_at')) {
                obj['created_at'] = ApiClient.convertToType(data['created_at'], 'Number');
            }
            if (data.hasOwnProperty('error')) {
                obj['error'] = FineTuningJobError.constructFromObject(data['error']);
            }
            if (data.hasOwnProperty('fine_tuned_model')) {
                obj['fine_tuned_model'] = ApiClient.convertToType(data['fine_tuned_model'], 'String');
            }
            if (data.hasOwnProperty('finished_at')) {
                obj['finished_at'] = ApiClient.convertToType(data['finished_at'], 'Number');
            }
            if (data.hasOwnProperty('hyperparameters')) {
                obj['hyperparameters'] = FineTuningJobHyperparameters.constructFromObject(data['hyperparameters']);
            }
            if (data.hasOwnProperty('model')) {
                obj['model'] = ApiClient.convertToType(data['model'], 'String');
            }
            if (data.hasOwnProperty('object')) {
                obj['object'] = ApiClient.convertToType(data['object'], 'String');
            }
            if (data.hasOwnProperty('organization_id')) {
                obj['organization_id'] = ApiClient.convertToType(data['organization_id'], 'String');
            }
            if (data.hasOwnProperty('result_files')) {
                obj['result_files'] = ApiClient.convertToType(data['result_files'], ['String']);
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
            if (data.hasOwnProperty('trained_tokens')) {
                obj['trained_tokens'] = ApiClient.convertToType(data['trained_tokens'], 'Number');
            }
            if (data.hasOwnProperty('training_file')) {
                obj['training_file'] = ApiClient.convertToType(data['training_file'], 'String');
            }
            if (data.hasOwnProperty('validation_file')) {
                obj['validation_file'] = ApiClient.convertToType(data['validation_file'], 'String');
            }
            if (data.hasOwnProperty('integrations')) {
                obj['integrations'] = ApiClient.convertToType(data['integrations'], [FineTuningJobIntegrationsInner]);
            }
            if (data.hasOwnProperty('seed')) {
                obj['seed'] = ApiClient.convertToType(data['seed'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>FineTuningJob</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>FineTuningJob</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of FineTuningJob.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // validate the optional field `error`
        if (data['error']) { // data not null
          FineTuningJobError.validateJSON(data['error']);
        }
        // ensure the json data is a string
        if (data['fine_tuned_model'] && !(typeof data['fine_tuned_model'] === 'string' || data['fine_tuned_model'] instanceof String)) {
            throw new Error("Expected the field `fine_tuned_model` to be a primitive type in the JSON string but got " + data['fine_tuned_model']);
        }
        // validate the optional field `hyperparameters`
        if (data['hyperparameters']) { // data not null
          FineTuningJobHyperparameters.validateJSON(data['hyperparameters']);
        }
        // ensure the json data is a string
        if (data['model'] && !(typeof data['model'] === 'string' || data['model'] instanceof String)) {
            throw new Error("Expected the field `model` to be a primitive type in the JSON string but got " + data['model']);
        }
        // ensure the json data is a string
        if (data['object'] && !(typeof data['object'] === 'string' || data['object'] instanceof String)) {
            throw new Error("Expected the field `object` to be a primitive type in the JSON string but got " + data['object']);
        }
        // ensure the json data is a string
        if (data['organization_id'] && !(typeof data['organization_id'] === 'string' || data['organization_id'] instanceof String)) {
            throw new Error("Expected the field `organization_id` to be a primitive type in the JSON string but got " + data['organization_id']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['result_files'])) {
            throw new Error("Expected the field `result_files` to be an array in the JSON data but got " + data['result_files']);
        }
        // ensure the json data is a string
        if (data['status'] && !(typeof data['status'] === 'string' || data['status'] instanceof String)) {
            throw new Error("Expected the field `status` to be a primitive type in the JSON string but got " + data['status']);
        }
        // ensure the json data is a string
        if (data['training_file'] && !(typeof data['training_file'] === 'string' || data['training_file'] instanceof String)) {
            throw new Error("Expected the field `training_file` to be a primitive type in the JSON string but got " + data['training_file']);
        }
        // ensure the json data is a string
        if (data['validation_file'] && !(typeof data['validation_file'] === 'string' || data['validation_file'] instanceof String)) {
            throw new Error("Expected the field `validation_file` to be a primitive type in the JSON string but got " + data['validation_file']);
        }
        if (data['integrations']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['integrations'])) {
                throw new Error("Expected the field `integrations` to be an array in the JSON data but got " + data['integrations']);
            }
            // validate the optional field `integrations` (array)
            for (const item of data['integrations']) {
                FineTuningJobIntegrationsInner.validateJSON(item);
            };
        }

        return true;
    }


}

FineTuningJob.RequiredProperties = ["id", "created_at", "error", "fine_tuned_model", "finished_at", "hyperparameters", "model", "object", "organization_id", "result_files", "status", "trained_tokens", "training_file", "validation_file", "seed"];

/**
 * The object identifier, which can be referenced in the API endpoints.
 * @member {String} id
 */
FineTuningJob.prototype['id'] = undefined;

/**
 * The Unix timestamp (in seconds) for when the fine-tuning job was created.
 * @member {Number} created_at
 */
FineTuningJob.prototype['created_at'] = undefined;

/**
 * @member {module:model/FineTuningJobError} error
 */
FineTuningJob.prototype['error'] = undefined;

/**
 * The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
 * @member {String} fine_tuned_model
 */
FineTuningJob.prototype['fine_tuned_model'] = undefined;

/**
 * The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
 * @member {Number} finished_at
 */
FineTuningJob.prototype['finished_at'] = undefined;

/**
 * @member {module:model/FineTuningJobHyperparameters} hyperparameters
 */
FineTuningJob.prototype['hyperparameters'] = undefined;

/**
 * The base model that is being fine-tuned.
 * @member {String} model
 */
FineTuningJob.prototype['model'] = undefined;

/**
 * The object type, which is always \"fine_tuning.job\".
 * @member {module:model/FineTuningJob.ObjectEnum} object
 */
FineTuningJob.prototype['object'] = undefined;

/**
 * The organization that owns the fine-tuning job.
 * @member {String} organization_id
 */
FineTuningJob.prototype['organization_id'] = undefined;

/**
 * The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
 * @member {Array.<String>} result_files
 */
FineTuningJob.prototype['result_files'] = undefined;

/**
 * The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
 * @member {module:model/FineTuningJob.StatusEnum} status
 */
FineTuningJob.prototype['status'] = undefined;

/**
 * The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
 * @member {Number} trained_tokens
 */
FineTuningJob.prototype['trained_tokens'] = undefined;

/**
 * The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
 * @member {String} training_file
 */
FineTuningJob.prototype['training_file'] = undefined;

/**
 * The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
 * @member {String} validation_file
 */
FineTuningJob.prototype['validation_file'] = undefined;

/**
 * A list of integrations to enable for this fine-tuning job.
 * @member {Array.<module:model/FineTuningJobIntegrationsInner>} integrations
 */
FineTuningJob.prototype['integrations'] = undefined;

/**
 * The seed used for the fine-tuning job.
 * @member {Number} seed
 */
FineTuningJob.prototype['seed'] = undefined;





/**
 * Allowed values for the <code>object</code> property.
 * @enum {String}
 * @readonly
 */
FineTuningJob['ObjectEnum'] = {

    /**
     * value: "fine_tuning.job"
     * @const
     */
    "fine_tuning.job": "fine_tuning.job"
};


/**
 * Allowed values for the <code>status</code> property.
 * @enum {String}
 * @readonly
 */
FineTuningJob['StatusEnum'] = {

    /**
     * value: "validating_files"
     * @const
     */
    "validating_files": "validating_files",

    /**
     * value: "queued"
     * @const
     */
    "queued": "queued",

    /**
     * value: "running"
     * @const
     */
    "running": "running",

    /**
     * value: "succeeded"
     * @const
     */
    "succeeded": "succeeded",

    /**
     * value: "failed"
     * @const
     */
    "failed": "failed",

    /**
     * value: "cancelled"
     * @const
     */
    "cancelled": "cancelled"
};



export default FineTuningJob;

