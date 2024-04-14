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

case class CreateCompletionResponseChoicesInner (
                  finishReason:  Option[CreateCompletionResponseChoicesInnerFinishReasonEnum.CreateCompletionResponseChoicesInnerFinishReasonEnum],
                  index: Int,
                  logprobs: CreateCompletionResponseChoicesInnerLogprobs,
                  text: String
)

object CreateCompletionResponseChoicesInner {
implicit val format: Format[CreateCompletionResponseChoicesInner] = Json.format
}

object CreateCompletionResponseChoicesInnerFinishReasonEnum extends Enumeration {
  val   stop, length, content_filter = Value
  type CreateCompletionResponseChoicesInnerFinishReasonEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[CreateCompletionResponseChoicesInnerFinishReasonEnum.type])
}
