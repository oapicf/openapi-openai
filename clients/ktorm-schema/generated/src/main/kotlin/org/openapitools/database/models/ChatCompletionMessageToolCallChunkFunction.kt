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
 * @param name The name of the function to call.
 * @param arguments The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
 */
object ChatCompletionMessageToolCallChunkFunctions : BaseTable<ChatCompletionMessageToolCallChunkFunction>("ChatCompletionMessageToolCallChunk_function") {
    val name = text("name") /* null */ /* The name of the function to call. */
    val arguments = text("arguments") /* null */ /* The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function. */

    /**
     * Create an entity of type ChatCompletionMessageToolCallChunkFunction from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ChatCompletionMessageToolCallChunkFunction(
        name = row[name]  /* kotlin.String? */ /* The name of the function to call. */,
        arguments = row[arguments]  /* kotlin.String? */ /* The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function. */
    )

    /**
    * Assign all the columns from the entity of type ChatCompletionMessageToolCallChunkFunction to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ChatCompletionMessageToolCallChunkFunction()
    * database.update(ChatCompletionMessageToolCallChunkFunctions, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ChatCompletionMessageToolCallChunkFunction) {
        this.apply {
            set(ChatCompletionMessageToolCallChunkFunctions.name, entity.name)
            set(ChatCompletionMessageToolCallChunkFunctions.arguments, entity.arguments)
        }
    }

}

