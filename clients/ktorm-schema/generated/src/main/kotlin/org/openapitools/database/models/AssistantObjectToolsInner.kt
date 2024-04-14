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
 * @param type The type of tool being defined: `code_interpreter`
 * @param function 
 */
object AssistantObjectToolsInners : BaseTable<AssistantObjectToolsInner>("AssistantObject_tools_inner") {
    val type = text("type").transform({ AssistantObjectToolsInner.Type.valueOf(it) }, { it.value }) /* The type of tool being defined: `code_interpreter` */
    val function = long("function")

    /**
     * Create an entity of type AssistantObjectToolsInner from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = AssistantObjectToolsInner(
        type = row[type] ?: AssistantObjectToolsInner.Type.valueOf("") /* kotlin.String */ /* The type of tool being defined: `code_interpreter` */,
        function = FunctionObjects.createEntity(row, withReferences) /* FunctionObject */
    )

    /**
    * Assign all the columns from the entity of type AssistantObjectToolsInner to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = AssistantObjectToolsInner()
    * database.update(AssistantObjectToolsInners, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: AssistantObjectToolsInner) {
        this.apply {
            set(AssistantObjectToolsInners.type, entity.type)
            set(AssistantObjectToolsInners.function, entity.function)
        }
    }

}


