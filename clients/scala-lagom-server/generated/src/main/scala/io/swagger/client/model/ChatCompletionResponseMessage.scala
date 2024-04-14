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

case class ChatCompletionResponseMessage (
            /* The contents of the message. */
                  content: String,
            /* The tool calls generated by the model, such as function calls. */
                  toolCalls: Option[Seq[ChatCompletionMessageToolCall]],
                  role:  Option[ChatCompletionResponseMessageRoleEnum.ChatCompletionResponseMessageRoleEnum],
                  functionCall: Option[ChatCompletionRequestAssistantMessageFunctionCall]
)

object ChatCompletionResponseMessage {
implicit val format: Format[ChatCompletionResponseMessage] = Json.format
}

object ChatCompletionResponseMessageRoleEnum extends Enumeration {
  val   assistant = Value
  type ChatCompletionResponseMessageRoleEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[ChatCompletionResponseMessageRoleEnum.type])
}
