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
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.
 * @param type Always `file_citation`.
 * @param text The text in the message content that needs to be replaced.
 * @param fileCitation 
 * @param startIndex 
 * @param endIndex 
 */
object MessageContentTextAnnotationsFileCitationObjects : BaseTable<MessageContentTextAnnotationsFileCitationObject>("MessageContentTextAnnotationsFileCitationObject") {
    val type = text("type").transform({ MessageContentTextAnnotationsFileCitationObject.Type.valueOf(it) }, { it.value }) /* Always `file_citation`. */
    val text = text("text") /* The text in the message content that needs to be replaced. */
    val fileCitation = long("file_citation")
    val startIndex = int("start_index")
    val endIndex = int("end_index")

    /**
     * Create an entity of type MessageContentTextAnnotationsFileCitationObject from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = MessageContentTextAnnotationsFileCitationObject(
        type = row[type] ?: MessageContentTextAnnotationsFileCitationObject.Type.valueOf("") /* kotlin.String */ /* Always `file_citation`. */,
        text = row[text] ?: "" /* kotlin.String */ /* The text in the message content that needs to be replaced. */,
        fileCitation = MessageContentTextAnnotationsFileCitationObjectFileCitations.createEntity(row, withReferences) /* MessageContentTextAnnotationsFileCitationObjectFileCitation */,
        startIndex = row[startIndex] ?: 0 /* kotlin.Int */,
        endIndex = row[endIndex] ?: 0 /* kotlin.Int */
    )

    /**
    * Assign all the columns from the entity of type MessageContentTextAnnotationsFileCitationObject to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = MessageContentTextAnnotationsFileCitationObject()
    * database.update(MessageContentTextAnnotationsFileCitationObjects, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: MessageContentTextAnnotationsFileCitationObject) {
        this.apply {
            set(MessageContentTextAnnotationsFileCitationObjects.type, entity.type)
            set(MessageContentTextAnnotationsFileCitationObjects.text, entity.text)
            set(MessageContentTextAnnotationsFileCitationObjects.fileCitation, entity.fileCitation)
            set(MessageContentTextAnnotationsFileCitationObjects.startIndex, entity.startIndex)
            set(MessageContentTextAnnotationsFileCitationObjects.endIndex, entity.endIndex)
        }
    }

}


