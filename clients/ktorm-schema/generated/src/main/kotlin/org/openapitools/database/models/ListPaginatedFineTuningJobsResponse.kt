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
 * @param data 
 * @param hasMore 
 * @param object 
 */
object ListPaginatedFineTuningJobsResponses : BaseTable<ListPaginatedFineTuningJobsResponse>("ListPaginatedFineTuningJobsResponse") {
    val hasMore = boolean("has_more")
    val object = text("object").transform({ ListPaginatedFineTuningJobsResponse.Object.valueOf(it) }, { it.value })

    /**
     * Create an entity of type ListPaginatedFineTuningJobsResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ListPaginatedFineTuningJobsResponse(
        data = emptyList() /* kotlin.Array<FineTuningJob> */,
        hasMore = row[hasMore] ?: false /* kotlin.Boolean */,
        object = row[object] ?: ListPaginatedFineTuningJobsResponse.Object.valueOf("") /* kotlin.String */
    )

    /**
    * Assign all the columns from the entity of type ListPaginatedFineTuningJobsResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ListPaginatedFineTuningJobsResponse()
    * database.update(ListPaginatedFineTuningJobsResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ListPaginatedFineTuningJobsResponse) {
        this.apply {
            set(ListPaginatedFineTuningJobsResponses.hasMore, entity.hasMore)
            set(ListPaginatedFineTuningJobsResponses.object, entity.object)
        }
    }

}


object ListPaginatedFineTuningJobsResponseFineTuningJob : BaseTable<Pair<kotlin.Long, kotlin.Long>>("ListPaginatedFineTuningJobsResponseFineTuningJob") {
    val listPaginatedFineTuningJobsResponse = long("listPaginatedFineTuningJobsResponse")
    val fineTuningJob = long("fineTuningJob")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[listPaginatedFineTuningJobsResponse] ?: 0, row[fineTuningJob] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(ListPaginatedFineTuningJobsResponseFineTuningJob.listPaginatedFineTuningJobsResponse, entity.first)
            set(ListPaginatedFineTuningJobsResponseFineTuningJob.fineTuningJob, entity.second)
        }
    }

}

