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
 * @param value The data that makes up the text.
 * @param annotations 
 */
object MessageDeltaContentTextObjectTexts : BaseTable<MessageDeltaContentTextObjectText>("MessageDeltaContentTextObject_text") {
    val value = text("value") /* null */ /* The data that makes up the text. */

    /**
     * Create an entity of type MessageDeltaContentTextObjectText from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = MessageDeltaContentTextObjectText(
        value = row[value]  /* kotlin.String? */ /* The data that makes up the text. */,
        annotations = emptyList() /* kotlin.Array<MessageDeltaContentTextObjectTextAnnotationsInner>? */
    )

    /**
    * Assign all the columns from the entity of type MessageDeltaContentTextObjectText to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = MessageDeltaContentTextObjectText()
    * database.update(MessageDeltaContentTextObjectTexts, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: MessageDeltaContentTextObjectText) {
        this.apply {
            set(MessageDeltaContentTextObjectTexts.value, entity.value)
        }
    }

}


object MessageDeltaContentTextObjectTextMessageDeltaContentTextObjectTextAnnotationsInner : BaseTable<Pair<kotlin.Long, kotlin.Long>>("MessageDeltaContentTextObjectTextMessageDeltaContentTextObjectTextAnnotationsInner") {
    val messageDeltaContentTextObjectText = long("messageDeltaContentTextObjectText")
    val messageDeltaContentTextObjectTextAnnotationsInner = long("messageDeltaContentTextObjectTextAnnotationsInner")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[messageDeltaContentTextObjectText] ?: 0, row[messageDeltaContentTextObjectTextAnnotationsInner] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(MessageDeltaContentTextObjectTextMessageDeltaContentTextObjectTextAnnotationsInner.messageDeltaContentTextObjectText, entity.first)
            set(MessageDeltaContentTextObjectTextMessageDeltaContentTextObjectTextAnnotationsInner.messageDeltaContentTextObjectTextAnnotationsInner, entity.second)
        }
    }

}

