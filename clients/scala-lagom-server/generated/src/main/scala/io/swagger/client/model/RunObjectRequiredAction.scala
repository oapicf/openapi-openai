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

case class RunObjectRequiredAction (
                  `type`:  Option[RunObjectRequiredAction&#x60;type&#x60;Enum.RunObjectRequiredAction&#x60;type&#x60;Enum],
                  submitToolOutputs: RunObjectRequiredActionSubmitToolOutputs
)

object RunObjectRequiredAction {
implicit val format: Format[RunObjectRequiredAction] = Json.format
}

object RunObjectRequiredAction&#x60;type&#x60;Enum extends Enumeration {
  val   submit_tool_outputs = Value
  type RunObjectRequiredAction&#x60;type&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[RunObjectRequiredAction&#x60;type&#x60;Enum.type])
}
