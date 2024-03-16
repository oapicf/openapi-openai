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
 * @param created 
 * @param data 
 */
object ImagesResponses : BaseTable<ImagesResponse>("ImagesResponse") {
    val created = int("created")

    /**
     * Create an entity of type ImagesResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ImagesResponse(
        created = row[created] ?: 0 /* kotlin.Int */,
        data = emptyList() /* kotlin.Array<ImagesResponseDataInner> */
    )

    /**
    * Assign all the columns from the entity of type ImagesResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ImagesResponse()
    * database.update(ImagesResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ImagesResponse) {
        this.apply {
            set(ImagesResponses.created, entity.created)
        }
    }

}


object ImagesResponseImagesResponseDataInner : BaseTable<Pair<kotlin.Long, kotlin.Long>>("ImagesResponseImagesResponseDataInner") {
    val imagesResponse = long("imagesResponse")
    val imagesResponseDataInner = long("imagesResponseDataInner")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[imagesResponse] ?: 0, row[imagesResponseDataInner] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(ImagesResponseImagesResponseDataInner.imagesResponse, entity.first)
            set(ImagesResponseImagesResponseDataInner.imagesResponseDataInner, entity.second)
        }
    }

}
