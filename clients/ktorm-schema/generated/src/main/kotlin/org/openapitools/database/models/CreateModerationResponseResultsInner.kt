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
 * 
 * @param flagged Whether any of the below categories are flagged.
 * @param categories 
 * @param categoryScores 
 */
object CreateModerationResponseResultsInners : BaseTable<CreateModerationResponseResultsInner>("CreateModerationResponse_results_inner") {
    val flagged = boolean("flagged") /* Whether any of the below categories are flagged. */
    val categories = long("categories")
    val categoryScores = long("category_scores")

    /**
     * Create an entity of type CreateModerationResponseResultsInner from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CreateModerationResponseResultsInner(
        flagged = row[flagged] ?: false /* kotlin.Boolean */ /* Whether any of the below categories are flagged. */,
        categories = CreateModerationResponseResultsInnerCategoriess.createEntity(row, withReferences) /* CreateModerationResponseResultsInnerCategories */,
        categoryScores = CreateModerationResponseResultsInnerCategoryScoress.createEntity(row, withReferences) /* CreateModerationResponseResultsInnerCategoryScores */
    )

    /**
    * Assign all the columns from the entity of type CreateModerationResponseResultsInner to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CreateModerationResponseResultsInner()
    * database.update(CreateModerationResponseResultsInners, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CreateModerationResponseResultsInner) {
        this.apply {
            set(CreateModerationResponseResultsInners.flagged, entity.flagged)
            set(CreateModerationResponseResultsInners.categories, entity.categories)
            set(CreateModerationResponseResultsInners.categoryScores, entity.categoryScores)
        }
    }

}

