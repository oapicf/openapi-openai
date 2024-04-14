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
 * @param code 
 * @param message 
 * @param param 
 * @param type 
 */
object Errors : BaseTable<Error>("Error") {
    val code = text("code")
    val message = text("message")
    val param = text("param")
    val type = text("type")

    /**
     * Create an entity of type Error from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = Error(
        code = row[code] ?: "" /* kotlin.String */,
        message = row[message] ?: "" /* kotlin.String */,
        param = row[param] ?: "" /* kotlin.String */,
        type = row[type] ?: "" /* kotlin.String */
    )

    /**
    * Assign all the columns from the entity of type Error to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = Error()
    * database.update(Errors, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: Error) {
        this.apply {
            set(Errors.code, entity.code)
            set(Errors.message, entity.message)
            set(Errors.param, entity.param)
            set(Errors.type, entity.type)
        }
    }

}


