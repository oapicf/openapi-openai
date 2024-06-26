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
 * Controls which (if any) function is called by the model. `none` means the model will not call a function and instead generates a message. `auto` means the model can pick between generating a message or calling a function. Specifying a particular function via `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that function.  `none` is the default when no functions are present. `auto` is the default if functions are present. 
 * @param type The type of the tool. Currently, only `function` is supported.
 * @param function 
 */
object ChatCompletionToolChoiceOptions : BaseTable<ChatCompletionToolChoiceOption>("ChatCompletionToolChoiceOption") {
    val type = text("type").transform({ ChatCompletionToolChoiceOption.Type.valueOf(it) }, { it.value }) /* The type of the tool. Currently, only `function` is supported. */
    val function = long("function")

    /**
     * Create an entity of type ChatCompletionToolChoiceOption from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ChatCompletionToolChoiceOption(
        type = row[type] ?: ChatCompletionToolChoiceOption.Type.valueOf("") /* kotlin.String */ /* The type of the tool. Currently, only `function` is supported. */,
        function = ChatCompletionNamedToolChoiceFunctions.createEntity(row, withReferences) /* ChatCompletionNamedToolChoiceFunction */
    )

    /**
    * Assign all the columns from the entity of type ChatCompletionToolChoiceOption to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ChatCompletionToolChoiceOption()
    * database.update(ChatCompletionToolChoiceOptions, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ChatCompletionToolChoiceOption) {
        this.apply {
            set(ChatCompletionToolChoiceOptions.type, entity.type)
            set(ChatCompletionToolChoiceOptions.function, entity.function)
        }
    }

}


