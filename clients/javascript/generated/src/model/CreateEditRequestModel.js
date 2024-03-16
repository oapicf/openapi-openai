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
 * The CreateEditRequestModel model module.
 * @module model/CreateEditRequestModel
 * @version 0.9.0-pre.0
 */
class CreateEditRequestModel {
    /**
     * Constructs a new <code>CreateEditRequestModel</code>.
     * ID of the model to use. You can use the &#x60;text-davinci-edit-001&#x60; or &#x60;code-davinci-edit-001&#x60; model with this endpoint.
     * @alias module:model/CreateEditRequestModel
     * @param {(module:model/String)} instance The actual instance to initialize CreateEditRequestModel.
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
            throw new Error("Multiple matches found constructing `CreateEditRequestModel` with oneOf schemas String. Input: " + JSON.stringify(instance));
        } else if (match === 0) {
            this.actualInstance = null; // clear the actual instance in case there are multiple matches
            throw new Error("No match found constructing `CreateEditRequestModel` with oneOf schemas String. Details: " +
                            errorMessages.join(", "));
        } else { // only 1 match
            // the input is valid
        }
    }

    /**
     * Constructs a <code>CreateEditRequestModel</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateEditRequestModel} obj Optional instance to populate.
     * @return {module:model/CreateEditRequestModel} The populated <code>CreateEditRequestModel</code> instance.
     */
    static constructFromObject(data, obj) {
        return new CreateEditRequestModel(data);
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
       this.actualInstance = CreateEditRequestModel.constructFromObject(obj).getActualInstance();
    }

    /**
     * Returns the JSON representation of the actual instance.
     * @return {string}
     */
    toJSON = function(){
        return this.getActualInstance();
    }

    /**
     * Create an instance of CreateEditRequestModel from a JSON string.
     * @param {string} json_string JSON string.
     * @return {module:model/CreateEditRequestModel} An instance of CreateEditRequestModel.
     */
    static fromJSON = function(json_string){
        return CreateEditRequestModel.constructFromObject(JSON.parse(json_string));
    }
}


CreateEditRequestModel.OneOf = ["String"];

export default CreateEditRequestModel;

