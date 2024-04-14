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

case class CreateModerationResponse (
            /* The unique identifier for the moderation request. */
                  id: String,
            /* The model used to generate the moderation results. */
                  model: String,
            /* A list of moderation objects. */
                  results: Seq[CreateModerationResponseResultsInner]
)

object CreateModerationResponse {
implicit val format: Format[CreateModerationResponse] = Json.format
}

