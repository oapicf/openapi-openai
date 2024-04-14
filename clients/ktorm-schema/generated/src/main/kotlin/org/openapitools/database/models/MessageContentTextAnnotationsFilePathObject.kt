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
 * A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
 * @param type Always `file_path`.
 * @param text The text in the message content that needs to be replaced.
 * @param filePath 
 * @param startIndex 
 * @param endIndex 
 */
object MessageContentTextAnnotationsFilePathObjects : BaseTable<MessageContentTextAnnotationsFilePathObject>("MessageContentTextAnnotationsFilePathObject") {
    val type = text("type").transform({ MessageContentTextAnnotationsFilePathObject.Type.valueOf(it) }, { it.value }) /* Always `file_path`. */
    val text = text("text") /* The text in the message content that needs to be replaced. */
    val filePath = long("file_path")
    val startIndex = int("start_index")
    val endIndex = int("end_index")

    /**
     * Create an entity of type MessageContentTextAnnotationsFilePathObject from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = MessageContentTextAnnotationsFilePathObject(
        type = row[type] ?: MessageContentTextAnnotationsFilePathObject.Type.valueOf("") /* kotlin.String */ /* Always `file_path`. */,
        text = row[text] ?: "" /* kotlin.String */ /* The text in the message content that needs to be replaced. */,
        filePath = MessageContentTextAnnotationsFilePathObjectFilePaths.createEntity(row, withReferences) /* MessageContentTextAnnotationsFilePathObjectFilePath */,
        startIndex = row[startIndex] ?: 0 /* kotlin.Int */,
        endIndex = row[endIndex] ?: 0 /* kotlin.Int */
    )

    /**
    * Assign all the columns from the entity of type MessageContentTextAnnotationsFilePathObject to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = MessageContentTextAnnotationsFilePathObject()
    * database.update(MessageContentTextAnnotationsFilePathObjects, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: MessageContentTextAnnotationsFilePathObject) {
        this.apply {
            set(MessageContentTextAnnotationsFilePathObjects.type, entity.type)
            set(MessageContentTextAnnotationsFilePathObjects.text, entity.text)
            set(MessageContentTextAnnotationsFilePathObjects.filePath, entity.filePath)
            set(MessageContentTextAnnotationsFilePathObjects.startIndex, entity.startIndex)
            set(MessageContentTextAnnotationsFilePathObjects.endIndex, entity.endIndex)
        }
    }

}


