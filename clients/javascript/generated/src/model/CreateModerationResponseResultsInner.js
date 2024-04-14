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
import CreateModerationResponseResultsInnerCategories from './CreateModerationResponseResultsInnerCategories';
import CreateModerationResponseResultsInnerCategoryScores from './CreateModerationResponseResultsInnerCategoryScores';

/**
 * The CreateModerationResponseResultsInner model module.
 * @module model/CreateModerationResponseResultsInner
 * @version 1.0.1-pre.0
 */
class CreateModerationResponseResultsInner {
    /**
     * Constructs a new <code>CreateModerationResponseResultsInner</code>.
     * @alias module:model/CreateModerationResponseResultsInner
     * @param flagged {Boolean} Whether any of the below categories are flagged.
     * @param categories {module:model/CreateModerationResponseResultsInnerCategories} 
     * @param categoryScores {module:model/CreateModerationResponseResultsInnerCategoryScores} 
     */
    constructor(flagged, categories, categoryScores) { 
        
        CreateModerationResponseResultsInner.initialize(this, flagged, categories, categoryScores);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, flagged, categories, categoryScores) { 
        obj['flagged'] = flagged;
        obj['categories'] = categories;
        obj['category_scores'] = categoryScores;
    }

    /**
     * Constructs a <code>CreateModerationResponseResultsInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateModerationResponseResultsInner} obj Optional instance to populate.
     * @return {module:model/CreateModerationResponseResultsInner} The populated <code>CreateModerationResponseResultsInner</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateModerationResponseResultsInner();

            if (data.hasOwnProperty('flagged')) {
                obj['flagged'] = ApiClient.convertToType(data['flagged'], 'Boolean');
            }
            if (data.hasOwnProperty('categories')) {
                obj['categories'] = CreateModerationResponseResultsInnerCategories.constructFromObject(data['categories']);
            }
            if (data.hasOwnProperty('category_scores')) {
                obj['category_scores'] = CreateModerationResponseResultsInnerCategoryScores.constructFromObject(data['category_scores']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CreateModerationResponseResultsInner</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CreateModerationResponseResultsInner</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CreateModerationResponseResultsInner.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // validate the optional field `categories`
        if (data['categories']) { // data not null
          CreateModerationResponseResultsInnerCategories.validateJSON(data['categories']);
        }
        // validate the optional field `category_scores`
        if (data['category_scores']) { // data not null
          CreateModerationResponseResultsInnerCategoryScores.validateJSON(data['category_scores']);
        }

        return true;
    }


}

CreateModerationResponseResultsInner.RequiredProperties = ["flagged", "categories", "category_scores"];

/**
 * Whether any of the below categories are flagged.
 * @member {Boolean} flagged
 */
CreateModerationResponseResultsInner.prototype['flagged'] = undefined;

/**
 * @member {module:model/CreateModerationResponseResultsInnerCategories} categories
 */
CreateModerationResponseResultsInner.prototype['categories'] = undefined;

/**
 * @member {module:model/CreateModerationResponseResultsInnerCategoryScores} category_scores
 */
CreateModerationResponseResultsInner.prototype['category_scores'] = undefined;






export default CreateModerationResponseResultsInner;

