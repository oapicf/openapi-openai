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
 * Represents a run step delta i.e. any changed fields on a run step during streaming. 
 * @param id The identifier of the run step, which can be referenced in API endpoints.
 * @param object The object type, which is always `thread.run.step.delta`.
 * @param delta 
 */
object RunStepDeltaObjects : BaseTable<RunStepDeltaObject>("RunStepDeltaObject") {
    val id = text("id") /* The identifier of the run step, which can be referenced in API endpoints. */
    val object = text("object").transform({ RunStepDeltaObject.Object.valueOf(it) }, { it.value }) /* The object type, which is always `thread.run.step.delta`. */
    val delta = long("delta")

    /**
     * Create an entity of type RunStepDeltaObject from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = RunStepDeltaObject(
        id = row[id] ?: "" /* kotlin.String */ /* The identifier of the run step, which can be referenced in API endpoints. */,
        object = row[object] ?: RunStepDeltaObject.Object.valueOf("") /* kotlin.String */ /* The object type, which is always `thread.run.step.delta`. */,
        delta = RunStepDeltaObjectDeltas.createEntity(row, withReferences) /* RunStepDeltaObjectDelta */
    )

    /**
    * Assign all the columns from the entity of type RunStepDeltaObject to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = RunStepDeltaObject()
    * database.update(RunStepDeltaObjects, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: RunStepDeltaObject) {
        this.apply {
            set(RunStepDeltaObjects.id, entity.id)
            set(RunStepDeltaObjects.object, entity.object)
            set(RunStepDeltaObjects.delta, entity.delta)
        }
    }

}

