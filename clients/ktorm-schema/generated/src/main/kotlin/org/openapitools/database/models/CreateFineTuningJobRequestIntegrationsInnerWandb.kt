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
 * The settings for your integration with Weights and Biases. This payload specifies the project that metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags to your run, and set a default entity (team, username, etc) to be associated with your run. 
 * @param project The name of the project that the new run will be created under. 
 * @param name A display name to set for the run. If not set, we will use the Job ID as the name. 
 * @param entity The entity to use for the run. This allows you to set the team or username of the WandB user that you would like associated with the run. If not set, the default entity for the registered WandB API key is used. 
 * @param tags A list of tags to be attached to the newly created run. These tags are passed through directly to WandB. Some default tags are generated by OpenAI: \"openai/finetune\", \"openai/{base-model}\", \"openai/{ftjob-abcdef}\". 
 */
object CreateFineTuningJobRequestIntegrationsInnerWandbs : BaseTable<CreateFineTuningJobRequestIntegrationsInnerWandb>("CreateFineTuningJobRequest_integrations_inner_wandb") {
    val project = text("project") /* The name of the project that the new run will be created under.  */
    val name = text("name") /* null */ /* A display name to set for the run. If not set, we will use the Job ID as the name.  */
    val entity = text("entity") /* null */ /* The entity to use for the run. This allows you to set the team or username of the WandB user that you would like associated with the run. If not set, the default entity for the registered WandB API key is used.  */

    /**
     * Create an entity of type CreateFineTuningJobRequestIntegrationsInnerWandb from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CreateFineTuningJobRequestIntegrationsInnerWandb(
        project = row[project] ?: "" /* kotlin.String */ /* The name of the project that the new run will be created under.  */,
        name = row[name]  /* kotlin.String? */ /* A display name to set for the run. If not set, we will use the Job ID as the name.  */,
        entity = row[entity]  /* kotlin.String? */ /* The entity to use for the run. This allows you to set the team or username of the WandB user that you would like associated with the run. If not set, the default entity for the registered WandB API key is used.  */,
        tags = emptyList() /* kotlin.Array<kotlin.String>? */ /* A list of tags to be attached to the newly created run. These tags are passed through directly to WandB. Some default tags are generated by OpenAI: \"openai/finetune\", \"openai/{base-model}\", \"openai/{ftjob-abcdef}\".  */
    )

    /**
    * Assign all the columns from the entity of type CreateFineTuningJobRequestIntegrationsInnerWandb to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CreateFineTuningJobRequestIntegrationsInnerWandb()
    * database.update(CreateFineTuningJobRequestIntegrationsInnerWandbs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CreateFineTuningJobRequestIntegrationsInnerWandb) {
        this.apply {
            set(CreateFineTuningJobRequestIntegrationsInnerWandbs.project, entity.project)
            set(CreateFineTuningJobRequestIntegrationsInnerWandbs.name, entity.name)
            set(CreateFineTuningJobRequestIntegrationsInnerWandbs.entity, entity.entity)
        }
    }

}


object CreateFineTuningJobRequestIntegrationsInnerWandbTags : BaseTable<Pair<kotlin.Long, kotlin.String>>("CreateFineTuningJobRequestIntegrationsInnerWandbTags") {
    val createFineTuningJobRequestIntegrationsInnerWandb = long("createFineTuningJobRequestIntegrationsInnerWandb")
    val tags = text("tags")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[createFineTuningJobRequestIntegrationsInnerWandb] ?: 0, row[tags] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(CreateFineTuningJobRequestIntegrationsInnerWandbTags.createFineTuningJobRequestIntegrationsInnerWandb, entity.first)
            set(CreateFineTuningJobRequestIntegrationsInnerWandbTags.tags, entity.second)
        }
    }

}
