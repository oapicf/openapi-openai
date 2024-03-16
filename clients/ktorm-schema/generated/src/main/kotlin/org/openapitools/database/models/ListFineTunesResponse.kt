/**
* OpenAI API
* APIs for sampling from and fine-tuning language models
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
 * @param object 
 * @param data 
 */
object ListFineTunesResponses : BaseTable<ListFineTunesResponse>("ListFineTunesResponse") {
    val object = text("object")

    /**
     * Create an entity of type ListFineTunesResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ListFineTunesResponse(
        object = row[object] ?: "" /* kotlin.String */,
        data = emptyList() /* kotlin.Array<FineTune> */
    )

    /**
    * Assign all the columns from the entity of type ListFineTunesResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ListFineTunesResponse()
    * database.update(ListFineTunesResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ListFineTunesResponse) {
        this.apply {
            set(ListFineTunesResponses.object, entity.object)
        }
    }

}


object ListFineTunesResponseFineTune : BaseTable<Pair<kotlin.Long, kotlin.Long>>("ListFineTunesResponseFineTune") {
    val listFineTunesResponse = long("listFineTunesResponse")
    val fineTune = long("fineTune")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[listFineTunesResponse] ?: 0, row[fineTune] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(ListFineTunesResponseFineTune.listFineTunesResponse, entity.first)
            set(ListFineTunesResponseFineTune.fineTune, entity.second)
        }
    }

}

