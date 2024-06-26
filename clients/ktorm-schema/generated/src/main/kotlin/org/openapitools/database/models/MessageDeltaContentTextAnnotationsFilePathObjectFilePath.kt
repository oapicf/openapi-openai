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
 * @param fileId The ID of the file that was generated.
 */
object MessageDeltaContentTextAnnotationsFilePathObjectFilePaths : BaseTable<MessageDeltaContentTextAnnotationsFilePathObjectFilePath>("MessageDeltaContentTextAnnotationsFilePathObject_file_path") {
    val fileId = text("file_id") /* null */ /* The ID of the file that was generated. */

    /**
     * Create an entity of type MessageDeltaContentTextAnnotationsFilePathObjectFilePath from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = MessageDeltaContentTextAnnotationsFilePathObjectFilePath(
        fileId = row[fileId]  /* kotlin.String? */ /* The ID of the file that was generated. */
    )

    /**
    * Assign all the columns from the entity of type MessageDeltaContentTextAnnotationsFilePathObjectFilePath to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = MessageDeltaContentTextAnnotationsFilePathObjectFilePath()
    * database.update(MessageDeltaContentTextAnnotationsFilePathObjectFilePaths, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: MessageDeltaContentTextAnnotationsFilePathObjectFilePath) {
        this.apply {
            set(MessageDeltaContentTextAnnotationsFilePathObjectFilePaths.fileId, entity.fileId)
        }
    }

}


