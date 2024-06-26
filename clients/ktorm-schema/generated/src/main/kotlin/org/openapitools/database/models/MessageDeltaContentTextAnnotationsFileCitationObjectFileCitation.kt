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
 * @param fileId The ID of the specific File the citation is from.
 * @param quote The specific quote in the file.
 */
object MessageDeltaContentTextAnnotationsFileCitationObjectFileCitations : BaseTable<MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation>("MessageDeltaContentTextAnnotationsFileCitationObject_file_citation") {
    val fileId = text("file_id") /* null */ /* The ID of the specific File the citation is from. */
    val quote = text("quote") /* null */ /* The specific quote in the file. */

    /**
     * Create an entity of type MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation(
        fileId = row[fileId]  /* kotlin.String? */ /* The ID of the specific File the citation is from. */,
        quote = row[quote]  /* kotlin.String? */ /* The specific quote in the file. */
    )

    /**
    * Assign all the columns from the entity of type MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation()
    * database.update(MessageDeltaContentTextAnnotationsFileCitationObjectFileCitations, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation) {
        this.apply {
            set(MessageDeltaContentTextAnnotationsFileCitationObjectFileCitations.fileId, entity.fileId)
            set(MessageDeltaContentTextAnnotationsFileCitationObjectFileCitations.quote, entity.quote)
        }
    }

}


