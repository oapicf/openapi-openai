/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
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

/**
 * The CreateCompletionRequestModel model module.
 * @module model/CreateCompletionRequestModel
 * @version 0.9.0-pre.0
 */
class CreateCompletionRequestModel {
    /**
     * Constructs a new <code>CreateCompletionRequestModel</code>.
     * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
     * @alias module:model/CreateCompletionRequestModel
     * @param {(module:model/String)} instance The actual instance to initialize CreateCompletionRequestModel.
     */
    constructor(instance = null) {
        if (instance === null) {
            this.actualInstance = null;
            return;
        }
        var match = 0;
        var errorMessages = [];
        try {
            // validate string
            if (!(typeof instance === 'string')) {
                throw new Error("Invalid value. Must be string. Input: " + JSON.stringify(instance));
            }
            this.actualInstance = instance;
            match++;
        } catch(err) {
            // json data failed to deserialize into String
            errorMessages.push("Failed to construct String: " + err)
        }

        try {
            // validate string
            if (!(typeof instance === 'string')) {
                throw new Error("Invalid value. Must be string. Input: " + JSON.stringify(instance));
            }
            this.actualInstance = instance;
            match++;
        } catch(err) {
            // json data failed to deserialize into String
            errorMessages.push("Failed to construct String: " + err)
        }

        if (match > 1) {
            throw new Error("Multiple matches found constructing `CreateCompletionRequestModel` with oneOf schemas String. Input: " + JSON.stringify(instance));
        } else if (match === 0) {
            this.actualInstance = null; // clear the actual instance in case there are multiple matches
            throw new Error("No match found constructing `CreateCompletionRequestModel` with oneOf schemas String. Details: " +
                            errorMessages.join(", "));
        } else { // only 1 match
            // the input is valid
        }
    }

    /**
     * Constructs a <code>CreateCompletionRequestModel</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateCompletionRequestModel} obj Optional instance to populate.
     * @return {module:model/CreateCompletionRequestModel} The populated <code>CreateCompletionRequestModel</code> instance.
     */
    static constructFromObject(data, obj) {
        return new CreateCompletionRequestModel(data);
    }

    /**
     * Gets the actual instance, which can be <code>String</code>.
     * @return {(module:model/String)} The actual instance.
     */
    getActualInstance() {
        return this.actualInstance;
    }

    /**
     * Sets the actual instance, which can be <code>String</code>.
     * @param {(module:model/String)} obj The actual instance.
     */
    setActualInstance(obj) {
       this.actualInstance = CreateCompletionRequestModel.constructFromObject(obj).getActualInstance();
    }

    /**
     * Returns the JSON representation of the actual instance.
     * @return {string}
     */
    toJSON = function(){
        return this.getActualInstance();
    }

    /**
     * Create an instance of CreateCompletionRequestModel from a JSON string.
     * @param {string} json_string JSON string.
     * @return {module:model/CreateCompletionRequestModel} An instance of CreateCompletionRequestModel.
     */
    static fromJSON = function(json_string){
        return CreateCompletionRequestModel.constructFromObject(JSON.parse(json_string));
    }
}


CreateCompletionRequestModel.OneOf = ["String"];

export default CreateCompletionRequestModel;
