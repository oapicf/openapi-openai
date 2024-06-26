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

case class RunStepDetailsToolCallsCodeOutputLogsObject (
                  `type`:  Option[RunStepDetailsToolCallsCodeOutputLogsObject&#x60;type&#x60;Enum.RunStepDetailsToolCallsCodeOutputLogsObject&#x60;type&#x60;Enum],
            /* The text output from the Code Interpreter tool call. */
                  logs: String
)

object RunStepDetailsToolCallsCodeOutputLogsObject {
implicit val format: Format[RunStepDetailsToolCallsCodeOutputLogsObject] = Json.format
}

object RunStepDetailsToolCallsCodeOutputLogsObject&#x60;type&#x60;Enum extends Enumeration {
  val   logs = Value
  type RunStepDetailsToolCallsCodeOutputLogsObject&#x60;type&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[RunStepDetailsToolCallsCodeOutputLogsObject&#x60;type&#x60;Enum.type])
}
