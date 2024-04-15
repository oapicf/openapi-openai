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

case class AssistantToolsCode (
                  `type`:  Option[AssistantToolsCode&#x60;type&#x60;Enum.AssistantToolsCode&#x60;type&#x60;Enum]
)

object AssistantToolsCode {
implicit val format: Format[AssistantToolsCode] = Json.format
}

object AssistantToolsCode&#x60;type&#x60;Enum extends Enumeration {
  val   code_interpreter = Value
  type AssistantToolsCode&#x60;type&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[AssistantToolsCode&#x60;type&#x60;Enum.type])
}