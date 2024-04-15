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
 * @param text 
 */
object CreateTranslationResponseJsons : BaseTable<CreateTranslationResponseJson>("CreateTranslationResponseJson") {
    val text = text("text")

    /**
     * Create an entity of type CreateTranslationResponseJson from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CreateTranslationResponseJson(
        text = row[text] ?: "" /* kotlin.String */
    )

    /**
    * Assign all the columns from the entity of type CreateTranslationResponseJson to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CreateTranslationResponseJson()
    * database.update(CreateTranslationResponseJsons, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CreateTranslationResponseJson) {
        this.apply {
            set(CreateTranslationResponseJsons.text, entity.text)
        }
    }

}

