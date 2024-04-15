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
 * For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.
 * @param code A machine-readable error code.
 * @param message A human-readable error message.
 * @param param The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.
 */
object FineTuningJobErrors : BaseTable<FineTuningJobError>("FineTuningJob_error") {
    val code = text("code") /* A machine-readable error code. */
    val message = text("message") /* A human-readable error message. */
    val param = text("param") /* The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific. */

    /**
     * Create an entity of type FineTuningJobError from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = FineTuningJobError(
        code = row[code] ?: "" /* kotlin.String */ /* A machine-readable error code. */,
        message = row[message] ?: "" /* kotlin.String */ /* A human-readable error message. */,
        param = row[param] ?: "" /* kotlin.String */ /* The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific. */
    )

    /**
    * Assign all the columns from the entity of type FineTuningJobError to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = FineTuningJobError()
    * database.update(FineTuningJobErrors, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: FineTuningJobError) {
        this.apply {
            set(FineTuningJobErrors.code, entity.code)
            set(FineTuningJobErrors.message, entity.message)
            set(FineTuningJobErrors.param, entity.param)
        }
    }

}

