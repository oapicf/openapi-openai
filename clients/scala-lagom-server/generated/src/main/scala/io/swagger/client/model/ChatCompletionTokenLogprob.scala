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

package io.swagger.client.model
import play.api.libs.json._

case class ChatCompletionTokenLogprob (
            /* The token. */
                  token: String,
            /* The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely. */
                  logprob: Number,
            /* A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token. */
                  bytes: Seq[Int],
            /* List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned. */
                  topLogprobs: Seq[ChatCompletionTokenLogprobTopLogprobsInner]
)

object ChatCompletionTokenLogprob {
implicit val format: Format[ChatCompletionTokenLogprob] = Json.format
}
