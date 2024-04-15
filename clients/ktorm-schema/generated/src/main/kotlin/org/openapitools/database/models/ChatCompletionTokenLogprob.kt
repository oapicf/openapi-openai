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
 * @param token The token.
 * @param logprob The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
 * @param bytes A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
 * @param topLogprobs List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.
 */
object ChatCompletionTokenLogprobs : BaseTable<ChatCompletionTokenLogprob>("ChatCompletionTokenLogprob") {
    val token = text("token") /* The token. */
    val logprob = decimal("logprob") /* The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely. */

    /**
     * Create an entity of type ChatCompletionTokenLogprob from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ChatCompletionTokenLogprob(
        token = row[token] ?: "" /* kotlin.String */ /* The token. */,
        logprob = row[logprob] ?: 0 /* java.math.BigDecimal */ /* The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely. */,
        bytes = emptyList() /* kotlin.Array<kotlin.Int> */ /* A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token. */,
        topLogprobs = emptyList() /* kotlin.Array<ChatCompletionTokenLogprobTopLogprobsInner> */ /* List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned. */
    )

    /**
    * Assign all the columns from the entity of type ChatCompletionTokenLogprob to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ChatCompletionTokenLogprob()
    * database.update(ChatCompletionTokenLogprobs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ChatCompletionTokenLogprob) {
        this.apply {
            set(ChatCompletionTokenLogprobs.token, entity.token)
            set(ChatCompletionTokenLogprobs.logprob, entity.logprob)
        }
    }

}


object ChatCompletionTokenLogprobBytes : BaseTable<Pair<kotlin.Long, kotlin.Int>>("ChatCompletionTokenLogprobBytes") {
    val chatCompletionTokenLogprob = long("chatCompletionTokenLogprob")
    val bytes = int("bytes")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Int> =
        Pair(row[chatCompletionTokenLogprob] ?: 0, row[bytes] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Int>) {
        this.apply {
            set(ChatCompletionTokenLogprobBytes.chatCompletionTokenLogprob, entity.first)
            set(ChatCompletionTokenLogprobBytes.bytes, entity.second)
        }
    }

}

object ChatCompletionTokenLogprobChatCompletionTokenLogprobTopLogprobsInner : BaseTable<Pair<kotlin.Long, kotlin.Long>>("ChatCompletionTokenLogprobChatCompletionTokenLogprobTopLogprobsInner") {
    val chatCompletionTokenLogprob = long("chatCompletionTokenLogprob")
    val chatCompletionTokenLogprobTopLogprobsInner = long("chatCompletionTokenLogprobTopLogprobsInner")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[chatCompletionTokenLogprob] ?: 0, row[chatCompletionTokenLogprobTopLogprobsInner] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(ChatCompletionTokenLogprobChatCompletionTokenLogprobTopLogprobsInner.chatCompletionTokenLogprob, entity.first)
            set(ChatCompletionTokenLogprobChatCompletionTokenLogprobTopLogprobsInner.chatCompletionTokenLogprobTopLogprobsInner, entity.second)
        }
    }

}
