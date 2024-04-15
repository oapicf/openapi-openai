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
 * The `File` object represents a document that has been uploaded to OpenAI.
 * @param id The file identifier, which can be referenced in the API endpoints.
 * @param bytes The size of the file, in bytes.
 * @param createdAt The Unix timestamp (in seconds) for when the file was created.
 * @param filename The name of the file.
 * @param object The object type, which is always `file`.
 * @param purpose The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`.
 * @param status Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
 * @param statusDetails Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
 */
object OpenAIFiles : BaseTable<OpenAIFile>("OpenAIFile") {
    val id = text("id") /* The file identifier, which can be referenced in the API endpoints. */
    val bytes = int("bytes") /* The size of the file, in bytes. */
    val createdAt = int("created_at") /* The Unix timestamp (in seconds) for when the file was created. */
    val filename = text("filename") /* The name of the file. */
    val object = text("object").transform({ OpenAIFile.Object.valueOf(it) }, { it.value }) /* The object type, which is always `file`. */
    val purpose = text("purpose").transform({ OpenAIFile.Purpose.valueOf(it) }, { it.value }) /* The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`. */
    @Deprecated(message = "This property is deprecated.")
    val status = text("status").transform({ OpenAIFile.Status.valueOf(it) }, { it.value }) /* Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`. */
    @Deprecated(message = "This property is deprecated.")
    val statusDetails = text("status_details") /* null */ /* Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`. */

    /**
     * Create an entity of type OpenAIFile from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = OpenAIFile(
        id = row[id] ?: "" /* kotlin.String */ /* The file identifier, which can be referenced in the API endpoints. */,
        bytes = row[bytes] ?: 0 /* kotlin.Int */ /* The size of the file, in bytes. */,
        createdAt = row[createdAt] ?: 0 /* kotlin.Int */ /* The Unix timestamp (in seconds) for when the file was created. */,
        filename = row[filename] ?: "" /* kotlin.String */ /* The name of the file. */,
        object = row[object] ?: OpenAIFile.Object.valueOf("") /* kotlin.String */ /* The object type, which is always `file`. */,
        purpose = row[purpose] ?: OpenAIFile.Purpose.valueOf("") /* kotlin.String */ /* The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`. */,
        status = row[status] ?: OpenAIFile.Status.valueOf("") /* kotlin.String */ /* Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`. */,
        statusDetails = row[statusDetails]  /* kotlin.String? */ /* Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`. */
    )

    /**
    * Assign all the columns from the entity of type OpenAIFile to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = OpenAIFile()
    * database.update(OpenAIFiles, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: OpenAIFile) {
        this.apply {
            set(OpenAIFiles.id, entity.id)
            set(OpenAIFiles.bytes, entity.bytes)
            set(OpenAIFiles.createdAt, entity.createdAt)
            set(OpenAIFiles.filename, entity.filename)
            set(OpenAIFiles.object, entity.object)
            set(OpenAIFiles.purpose, entity.purpose)
            set(OpenAIFiles.status, entity.status)
            set(OpenAIFiles.statusDetails, entity.statusDetails)
        }
    }

}

