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

case class CreateCompletionResponseChoicesInnerLogprobs (
                  textOffset: Option[Seq[Int]],
                  tokenLogprobs: Option[Seq[Number]],
                  tokens: Option[Seq[String]],
                  topLogprobs: Option[Seq[Map[String, Number]]]
)

object CreateCompletionResponseChoicesInnerLogprobs {
implicit val format: Format[CreateCompletionResponseChoicesInnerLogprobs] = Json.format
}

