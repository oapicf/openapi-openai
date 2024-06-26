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
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * A list of the categories along with their scores as predicted by model.
 * @param hate The score for the category 'hate'.
 * @param hateThreatening The score for the category 'hate/threatening'.
 * @param harassment The score for the category 'harassment'.
 * @param harassmentThreatening The score for the category 'harassment/threatening'.
 * @param selfHarm The score for the category 'self-harm'.
 * @param selfHarmIntent The score for the category 'self-harm/intent'.
 * @param selfHarmInstructions The score for the category 'self-harm/instructions'.
 * @param sexual The score for the category 'sexual'.
 * @param sexualMinors The score for the category 'sexual/minors'.
 * @param violence The score for the category 'violence'.
 * @param violenceGraphic The score for the category 'violence/graphic'.
 */
object CreateModerationResponseResultsInnerCategoryScoress : BaseTable<CreateModerationResponseResultsInnerCategoryScores>("CreateModerationResponse_results_inner_category_scores") {
    val hate = decimal("hate") /* The score for the category 'hate'. */
    val hateThreatening = decimal("hatethreatening") /* The score for the category 'hate/threatening'. */
    val harassment = decimal("harassment") /* The score for the category 'harassment'. */
    val harassmentThreatening = decimal("harassmentthreatening") /* The score for the category 'harassment/threatening'. */
    val selfHarm = decimal("selfharm") /* The score for the category 'self-harm'. */
    val selfHarmIntent = decimal("selfharmintent") /* The score for the category 'self-harm/intent'. */
    val selfHarmInstructions = decimal("selfharminstructions") /* The score for the category 'self-harm/instructions'. */
    val sexual = decimal("sexual") /* The score for the category 'sexual'. */
    val sexualMinors = decimal("sexualminors") /* The score for the category 'sexual/minors'. */
    val violence = decimal("violence") /* The score for the category 'violence'. */
    val violenceGraphic = decimal("violencegraphic") /* The score for the category 'violence/graphic'. */

    /**
     * Create an entity of type CreateModerationResponseResultsInnerCategoryScores from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CreateModerationResponseResultsInnerCategoryScores(
        hate = row[hate] ?: 0 /* java.math.BigDecimal */ /* The score for the category 'hate'. */,
        hateThreatening = row[hateThreatening] ?: 0 /* java.math.BigDecimal */ /* The score for the category 'hate/threatening'. */,
        harassment = row[harassment] ?: 0 /* java.math.BigDecimal */ /* The score for the category 'harassment'. */,
        harassmentThreatening = row[harassmentThreatening] ?: 0 /* java.math.BigDecimal */ /* The score for the category 'harassment/threatening'. */,
        selfHarm = row[selfHarm] ?: 0 /* java.math.BigDecimal */ /* The score for the category 'self-harm'. */,
        selfHarmIntent = row[selfHarmIntent] ?: 0 /* java.math.BigDecimal */ /* The score for the category 'self-harm/intent'. */,
        selfHarmInstructions = row[selfHarmInstructions] ?: 0 /* java.math.BigDecimal */ /* The score for the category 'self-harm/instructions'. */,
        sexual = row[sexual] ?: 0 /* java.math.BigDecimal */ /* The score for the category 'sexual'. */,
        sexualMinors = row[sexualMinors] ?: 0 /* java.math.BigDecimal */ /* The score for the category 'sexual/minors'. */,
        violence = row[violence] ?: 0 /* java.math.BigDecimal */ /* The score for the category 'violence'. */,
        violenceGraphic = row[violenceGraphic] ?: 0 /* java.math.BigDecimal */ /* The score for the category 'violence/graphic'. */
    )

    /**
    * Assign all the columns from the entity of type CreateModerationResponseResultsInnerCategoryScores to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CreateModerationResponseResultsInnerCategoryScores()
    * database.update(CreateModerationResponseResultsInnerCategoryScoress, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CreateModerationResponseResultsInnerCategoryScores) {
        this.apply {
            set(CreateModerationResponseResultsInnerCategoryScoress.hate, entity.hate)
            set(CreateModerationResponseResultsInnerCategoryScoress.hateThreatening, entity.hateThreatening)
            set(CreateModerationResponseResultsInnerCategoryScoress.harassment, entity.harassment)
            set(CreateModerationResponseResultsInnerCategoryScoress.harassmentThreatening, entity.harassmentThreatening)
            set(CreateModerationResponseResultsInnerCategoryScoress.selfHarm, entity.selfHarm)
            set(CreateModerationResponseResultsInnerCategoryScoress.selfHarmIntent, entity.selfHarmIntent)
            set(CreateModerationResponseResultsInnerCategoryScoress.selfHarmInstructions, entity.selfHarmInstructions)
            set(CreateModerationResponseResultsInnerCategoryScoress.sexual, entity.sexual)
            set(CreateModerationResponseResultsInnerCategoryScoress.sexualMinors, entity.sexualMinors)
            set(CreateModerationResponseResultsInnerCategoryScoress.violence, entity.violence)
            set(CreateModerationResponseResultsInnerCategoryScoress.violenceGraphic, entity.violenceGraphic)
        }
    }

}


