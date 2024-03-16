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

case class ChatCompletionStreamResponseDelta (
                  role:  Option[ChatCompletionStreamResponseDeltaRoleEnum.ChatCompletionStreamResponseDeltaRoleEnum],
            /* The contents of the chunk message. */
                  content: Option[String],
                  functionCall: Option[ChatCompletionRequestMessageFunctionCall]
)

object ChatCompletionStreamResponseDelta {
implicit val format: Format[ChatCompletionStreamResponseDelta] = Json.format
}

object ChatCompletionStreamResponseDeltaRoleEnum extends Enumeration {
  val   system, user, assistant, function = Value
  type ChatCompletionStreamResponseDeltaRoleEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[ChatCompletionStreamResponseDeltaRoleEnum.type])
}