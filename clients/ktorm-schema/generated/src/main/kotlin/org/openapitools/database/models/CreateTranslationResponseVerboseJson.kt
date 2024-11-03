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
 * @param language The language of the output translation (always `english`).
 * @param duration The duration of the input audio.
 * @param text The translated text.
 * @param segments Segments of the translated text and their corresponding details.
 */
object CreateTranslationResponseVerboseJsons : BaseTable<CreateTranslationResponseVerboseJson>("CreateTranslationResponseVerboseJson") {
    val language = text("language") /* The language of the output translation (always `english`). */
    val duration = text("duration") /* The duration of the input audio. */
    val text = text("text") /* The translated text. */

    /**
     * Create an entity of type CreateTranslationResponseVerboseJson from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CreateTranslationResponseVerboseJson(
        language = row[language] ?: "" /* kotlin.String */ /* The language of the output translation (always `english`). */,
        duration = row[duration] ?: "" /* kotlin.String */ /* The duration of the input audio. */,
        text = row[text] ?: "" /* kotlin.String */ /* The translated text. */,
        segments = emptyList() /* kotlin.Array<TranscriptionSegment>? */ /* Segments of the translated text and their corresponding details. */
    )

    /**
    * Assign all the columns from the entity of type CreateTranslationResponseVerboseJson to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CreateTranslationResponseVerboseJson()
    * database.update(CreateTranslationResponseVerboseJsons, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CreateTranslationResponseVerboseJson) {
        this.apply {
            set(CreateTranslationResponseVerboseJsons.language, entity.language)
            set(CreateTranslationResponseVerboseJsons.duration, entity.duration)
            set(CreateTranslationResponseVerboseJsons.text, entity.text)
        }
    }

}


object CreateTranslationResponseVerboseJsonTranscriptionSegment : BaseTable<Pair<kotlin.Long, kotlin.Long>>("CreateTranslationResponseVerboseJsonTranscriptionSegment") {
    val createTranslationResponseVerboseJson = long("createTranslationResponseVerboseJson")
    val transcriptionSegment = long("transcriptionSegment")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[createTranslationResponseVerboseJson] ?: 0, row[transcriptionSegment] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(CreateTranslationResponseVerboseJsonTranscriptionSegment.createTranslationResponseVerboseJson, entity.first)
            set(CreateTranslationResponseVerboseJsonTranscriptionSegment.transcriptionSegment, entity.second)
        }
    }

}

