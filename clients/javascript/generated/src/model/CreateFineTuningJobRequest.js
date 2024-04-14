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
import CreateFineTuningJobRequestHyperparameters from './CreateFineTuningJobRequestHyperparameters';
import CreateFineTuningJobRequestIntegrationsInner from './CreateFineTuningJobRequestIntegrationsInner';
import CreateFineTuningJobRequestModel from './CreateFineTuningJobRequestModel';

/**
 * The CreateFineTuningJobRequest model module.
 * @module model/CreateFineTuningJobRequest
 * @version 1.0.1-pre.0
 */
class CreateFineTuningJobRequest {
    /**
     * Constructs a new <code>CreateFineTuningJobRequest</code>.
     * @alias module:model/CreateFineTuningJobRequest
     * @param model {module:model/CreateFineTuningJobRequestModel} 
     * @param trainingFile {String} The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
     */
    constructor(model, trainingFile) { 
        
        CreateFineTuningJobRequest.initialize(this, model, trainingFile);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, model, trainingFile) { 
        obj['model'] = model;
        obj['training_file'] = trainingFile;
    }

    /**
     * Constructs a <code>CreateFineTuningJobRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateFineTuningJobRequest} obj Optional instance to populate.
     * @return {module:model/CreateFineTuningJobRequest} The populated <code>CreateFineTuningJobRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateFineTuningJobRequest();

            if (data.hasOwnProperty('model')) {
                obj['model'] = CreateFineTuningJobRequestModel.constructFromObject(data['model']);
            }
            if (data.hasOwnProperty('training_file')) {
                obj['training_file'] = ApiClient.convertToType(data['training_file'], 'String');
            }
            if (data.hasOwnProperty('hyperparameters')) {
                obj['hyperparameters'] = CreateFineTuningJobRequestHyperparameters.constructFromObject(data['hyperparameters']);
            }
            if (data.hasOwnProperty('suffix')) {
                obj['suffix'] = ApiClient.convertToType(data['suffix'], 'String');
            }
            if (data.hasOwnProperty('validation_file')) {
                obj['validation_file'] = ApiClient.convertToType(data['validation_file'], 'String');
            }
            if (data.hasOwnProperty('integrations')) {
                obj['integrations'] = ApiClient.convertToType(data['integrations'], [CreateFineTuningJobRequestIntegrationsInner]);
            }
            if (data.hasOwnProperty('seed')) {
                obj['seed'] = ApiClient.convertToType(data['seed'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CreateFineTuningJobRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CreateFineTuningJobRequest</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CreateFineTuningJobRequest.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // validate the optional field `model`
        if (data['model']) { // data not null
          CreateFineTuningJobRequestModel.validateJSON(data['model']);
        }
        // ensure the json data is a string
        if (data['training_file'] && !(typeof data['training_file'] === 'string' || data['training_file'] instanceof String)) {
            throw new Error("Expected the field `training_file` to be a primitive type in the JSON string but got " + data['training_file']);
        }
        // validate the optional field `hyperparameters`
        if (data['hyperparameters']) { // data not null
          CreateFineTuningJobRequestHyperparameters.validateJSON(data['hyperparameters']);
        }
        // ensure the json data is a string
        if (data['suffix'] && !(typeof data['suffix'] === 'string' || data['suffix'] instanceof String)) {
            throw new Error("Expected the field `suffix` to be a primitive type in the JSON string but got " + data['suffix']);
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
                CreateFineTuningJobRequestIntegrationsInner.validateJSON(item);
            };
        }

        return true;
    }


}

CreateFineTuningJobRequest.RequiredProperties = ["model", "training_file"];

/**
 * @member {module:model/CreateFineTuningJobRequestModel} model
 */
CreateFineTuningJobRequest.prototype['model'] = undefined;

/**
 * The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
 * @member {String} training_file
 */
CreateFineTuningJobRequest.prototype['training_file'] = undefined;

/**
 * @member {module:model/CreateFineTuningJobRequestHyperparameters} hyperparameters
 */
CreateFineTuningJobRequest.prototype['hyperparameters'] = undefined;

/**
 * A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`. 
 * @member {String} suffix
 */
CreateFineTuningJobRequest.prototype['suffix'] = undefined;

/**
 * The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
 * @member {String} validation_file
 */
CreateFineTuningJobRequest.prototype['validation_file'] = undefined;

/**
 * A list of integrations to enable for your fine-tuning job.
 * @member {Array.<module:model/CreateFineTuningJobRequestIntegrationsInner>} integrations
 */
CreateFineTuningJobRequest.prototype['integrations'] = undefined;

/**
 * The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
 * @member {Number} seed
 */
CreateFineTuningJobRequest.prototype['seed'] = undefined;






export default CreateFineTuningJobRequest;

