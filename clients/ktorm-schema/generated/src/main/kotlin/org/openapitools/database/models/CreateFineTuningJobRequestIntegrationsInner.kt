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
 * @param type 
 * @param wandb 
 */
object CreateFineTuningJobRequestIntegrationsInners : BaseTable<CreateFineTuningJobRequestIntegrationsInner>("CreateFineTuningJobRequest_integrations_inner") {
    val type = long("type")
    val wandb = long("wandb")

    /**
     * Create an entity of type CreateFineTuningJobRequestIntegrationsInner from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CreateFineTuningJobRequestIntegrationsInner(
        type = CreateFineTuningJobRequestIntegrationsInnerTypes.createEntity(row, withReferences) /* CreateFineTuningJobRequestIntegrationsInnerType */,
        wandb = CreateFineTuningJobRequestIntegrationsInnerWandbs.createEntity(row, withReferences) /* CreateFineTuningJobRequestIntegrationsInnerWandb */
    )

    /**
    * Assign all the columns from the entity of type CreateFineTuningJobRequestIntegrationsInner to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CreateFineTuningJobRequestIntegrationsInner()
    * database.update(CreateFineTuningJobRequestIntegrationsInners, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CreateFineTuningJobRequestIntegrationsInner) {
        this.apply {
            set(CreateFineTuningJobRequestIntegrationsInners.type, entity.type)
            set(CreateFineTuningJobRequestIntegrationsInners.wandb, entity.wandb)
        }
    }

}


