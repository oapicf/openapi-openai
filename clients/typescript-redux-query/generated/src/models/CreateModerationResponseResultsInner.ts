// tslint:disable
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

import { exists, mapValues } from '../runtime';
import {
    CreateModerationResponseResultsInnerCategories,
    CreateModerationResponseResultsInnerCategoriesFromJSON,
    CreateModerationResponseResultsInnerCategoriesToJSON,
    CreateModerationResponseResultsInnerCategoryScores,
    CreateModerationResponseResultsInnerCategoryScoresFromJSON,
    CreateModerationResponseResultsInnerCategoryScoresToJSON,
} from './';

/**
 * 
 * @export
 * @interface CreateModerationResponseResultsInner
 */
export interface CreateModerationResponseResultsInner  {
    /**
     * Whether any of the below categories are flagged.
     * @type {boolean}
     * @memberof CreateModerationResponseResultsInner
     */
    flagged: boolean;
    /**
     * 
     * @type {CreateModerationResponseResultsInnerCategories}
     * @memberof CreateModerationResponseResultsInner
     */
    categories: CreateModerationResponseResultsInnerCategories;
    /**
     * 
     * @type {CreateModerationResponseResultsInnerCategoryScores}
     * @memberof CreateModerationResponseResultsInner
     */
    categoryScores: CreateModerationResponseResultsInnerCategoryScores;
}

export function CreateModerationResponseResultsInnerFromJSON(json: any): CreateModerationResponseResultsInner {
    return {
        'flagged': json['flagged'],
        'categories': CreateModerationResponseResultsInnerCategoriesFromJSON(json['categories']),
        'categoryScores': CreateModerationResponseResultsInnerCategoryScoresFromJSON(json['category_scores']),
    };
}

export function CreateModerationResponseResultsInnerToJSON(value?: CreateModerationResponseResultsInner): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'flagged': value.flagged,
        'categories': CreateModerationResponseResultsInnerCategoriesToJSON(value.categories),
        'category_scores': CreateModerationResponseResultsInnerCategoryScoresToJSON(value.categoryScores),
    };
}


