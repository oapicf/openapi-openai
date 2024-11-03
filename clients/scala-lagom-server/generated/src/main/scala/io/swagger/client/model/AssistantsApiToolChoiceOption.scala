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

case class AssistantsApiToolChoiceOption (
                  `type`:  Option[AssistantsApiToolChoiceOption&#x60;type&#x60;Enum.AssistantsApiToolChoiceOption&#x60;type&#x60;Enum],
                  function: Option[ChatCompletionNamedToolChoiceFunction]
)

object AssistantsApiToolChoiceOption {
implicit val format: Format[AssistantsApiToolChoiceOption] = Json.format
}

object AssistantsApiToolChoiceOption&#x60;type&#x60;Enum extends Enumeration {
  val   function, code_interpreter, retrieval = Value
  type AssistantsApiToolChoiceOption&#x60;type&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[AssistantsApiToolChoiceOption&#x60;type&#x60;Enum.type])
}
