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

package io.swagger.client.model
import play.api.libs.json._

case class CreateChatCompletionResponseChoicesInner (
                  index: Option[Int],
                  message: Option[ChatCompletionResponseMessage],
                  finishReason:  Option[CreateChatCompletionResponseChoicesInnerFinishReasonEnum.CreateChatCompletionResponseChoicesInnerFinishReasonEnum]
)

object CreateChatCompletionResponseChoicesInner {
implicit val format: Format[CreateChatCompletionResponseChoicesInner] = Json.format
}

object CreateChatCompletionResponseChoicesInnerFinishReasonEnum extends Enumeration {
  val   stop, length, function_call = Value
  type CreateChatCompletionResponseChoicesInnerFinishReasonEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[CreateChatCompletionResponseChoicesInnerFinishReasonEnum.type])
}