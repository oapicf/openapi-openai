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
 * Details of the message creation by the run step.
 * @param type Always `message_creation`.
 * @param messageCreation 
 */
object RunStepDeltaStepDetailsMessageCreationObjects : BaseTable<RunStepDeltaStepDetailsMessageCreationObject>("RunStepDeltaStepDetailsMessageCreationObject") {
    val type = text("type").transform({ RunStepDeltaStepDetailsMessageCreationObject.Type.valueOf(it) }, { it.value }) /* Always `message_creation`. */
    val messageCreation = long("message_creation") /* null */

    /**
     * Create an entity of type RunStepDeltaStepDetailsMessageCreationObject from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = RunStepDeltaStepDetailsMessageCreationObject(
        type = row[type] ?: RunStepDeltaStepDetailsMessageCreationObject.Type.valueOf("") /* kotlin.String */ /* Always `message_creation`. */,
        messageCreation = RunStepDeltaStepDetailsMessageCreationObjectMessageCreations.createEntity(row, withReferences) /* RunStepDeltaStepDetailsMessageCreationObjectMessageCreation? */
    )

    /**
    * Assign all the columns from the entity of type RunStepDeltaStepDetailsMessageCreationObject to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = RunStepDeltaStepDetailsMessageCreationObject()
    * database.update(RunStepDeltaStepDetailsMessageCreationObjects, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: RunStepDeltaStepDetailsMessageCreationObject) {
        this.apply {
            set(RunStepDeltaStepDetailsMessageCreationObjects.type, entity.type)
            set(RunStepDeltaStepDetailsMessageCreationObjects.messageCreation, entity.messageCreation)
        }
    }

}

