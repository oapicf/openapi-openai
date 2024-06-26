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
 * The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
 * @param nEpochs 
 */
object FineTuningJobHyperparameterss : BaseTable<FineTuningJobHyperparameters>("FineTuningJob_hyperparameters") {
    val nEpochs = long("n_epochs")

    /**
     * Create an entity of type FineTuningJobHyperparameters from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = FineTuningJobHyperparameters(
        nEpochs = FineTuningJobHyperparametersNEpochss.createEntity(row, withReferences) /* FineTuningJobHyperparametersNEpochs */
    )

    /**
    * Assign all the columns from the entity of type FineTuningJobHyperparameters to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = FineTuningJobHyperparameters()
    * database.update(FineTuningJobHyperparameterss, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: FineTuningJobHyperparameters) {
        this.apply {
            set(FineTuningJobHyperparameterss.nEpochs, entity.nEpochs)
        }
    }

}


