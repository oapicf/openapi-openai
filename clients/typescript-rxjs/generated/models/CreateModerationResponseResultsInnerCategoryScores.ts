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

/**
 * A list of the categories along with their scores as predicted by model.
 * @export
 * @interface CreateModerationResponseResultsInnerCategoryScores
 */
export interface CreateModerationResponseResultsInnerCategoryScores {
    /**
     * The score for the category \'hate\'.
     * @type {number}
     * @memberof CreateModerationResponseResultsInnerCategoryScores
     */
    hate: number;
    /**
     * The score for the category \'hate/threatening\'.
     * @type {number}
     * @memberof CreateModerationResponseResultsInnerCategoryScores
     */
    hate_threatening: number;
    /**
     * The score for the category \'harassment\'.
     * @type {number}
     * @memberof CreateModerationResponseResultsInnerCategoryScores
     */
    harassment: number;
    /**
     * The score for the category \'harassment/threatening\'.
     * @type {number}
     * @memberof CreateModerationResponseResultsInnerCategoryScores
     */
    harassment_threatening: number;
    /**
     * The score for the category \'self-harm\'.
     * @type {number}
     * @memberof CreateModerationResponseResultsInnerCategoryScores
     */
    self_harm: number;
    /**
     * The score for the category \'self-harm/intent\'.
     * @type {number}
     * @memberof CreateModerationResponseResultsInnerCategoryScores
     */
    self_harm_intent: number;
    /**
     * The score for the category \'self-harm/instructions\'.
     * @type {number}
     * @memberof CreateModerationResponseResultsInnerCategoryScores
     */
    self_harm_instructions: number;
    /**
     * The score for the category \'sexual\'.
     * @type {number}
     * @memberof CreateModerationResponseResultsInnerCategoryScores
     */
    sexual: number;
    /**
     * The score for the category \'sexual/minors\'.
     * @type {number}
     * @memberof CreateModerationResponseResultsInnerCategoryScores
     */
    sexual_minors: number;
    /**
     * The score for the category \'violence\'.
     * @type {number}
     * @memberof CreateModerationResponseResultsInnerCategoryScores
     */
    violence: number;
    /**
     * The score for the category \'violence/graphic\'.
     * @type {number}
     * @memberof CreateModerationResponseResultsInnerCategoryScores
     */
    violence_graphic: number;
}
