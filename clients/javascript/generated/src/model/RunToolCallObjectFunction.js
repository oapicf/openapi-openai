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

/**
 * The RunToolCallObjectFunction model module.
 * @module model/RunToolCallObjectFunction
 * @version 1.1.1-pre.0
 */
class RunToolCallObjectFunction {
    /**
     * Constructs a new <code>RunToolCallObjectFunction</code>.
     * The function definition.
     * @alias module:model/RunToolCallObjectFunction
     * @param name {String} The name of the function.
     * @param _arguments {String} The arguments that the model expects you to pass to the function.
     */
    constructor(name, _arguments) { 
        
        RunToolCallObjectFunction.initialize(this, name, _arguments);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, name, _arguments) { 
        obj['name'] = name;
        obj['arguments'] = _arguments;
    }

    /**
     * Constructs a <code>RunToolCallObjectFunction</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RunToolCallObjectFunction} obj Optional instance to populate.
     * @return {module:model/RunToolCallObjectFunction} The populated <code>RunToolCallObjectFunction</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RunToolCallObjectFunction();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('arguments')) {
                obj['arguments'] = ApiClient.convertToType(data['arguments'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RunToolCallObjectFunction</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RunToolCallObjectFunction</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of RunToolCallObjectFunction.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }
        // ensure the json data is a string
        if (data['arguments'] && !(typeof data['arguments'] === 'string' || data['arguments'] instanceof String)) {
            throw new Error("Expected the field `arguments` to be a primitive type in the JSON string but got " + data['arguments']);
        }

        return true;
    }


}

RunToolCallObjectFunction.RequiredProperties = ["name", "arguments"];

/**
 * The name of the function.
 * @member {String} name
 */
RunToolCallObjectFunction.prototype['name'] = undefined;

/**
 * The arguments that the model expects you to pass to the function.
 * @member {String} arguments
 */
RunToolCallObjectFunction.prototype['arguments'] = undefined;






export default RunToolCallObjectFunction;

