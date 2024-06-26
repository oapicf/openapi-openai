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

case class ChatCompletionToolChoiceOption (
                  `type`:  Option[ChatCompletionToolChoiceOption&#x60;type&#x60;Enum.ChatCompletionToolChoiceOption&#x60;type&#x60;Enum],
                  function: ChatCompletionNamedToolChoiceFunction
)

object ChatCompletionToolChoiceOption {
implicit val format: Format[ChatCompletionToolChoiceOption] = Json.format
}

object ChatCompletionToolChoiceOption&#x60;type&#x60;Enum extends Enumeration {
  val   function = Value
  type ChatCompletionToolChoiceOption&#x60;type&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[ChatCompletionToolChoiceOption&#x60;type&#x60;Enum.type])
}
