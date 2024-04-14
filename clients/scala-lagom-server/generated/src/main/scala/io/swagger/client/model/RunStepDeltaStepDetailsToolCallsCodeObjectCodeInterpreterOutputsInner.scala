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

case class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner (
            /* The index of the output in the outputs array. */
                  index: Int,
                  `type`:  Option[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner&#x60;type&#x60;Enum.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner&#x60;type&#x60;Enum],
            /* The text output from the Code Interpreter tool call. */
                  logs: Option[String],
                  image: Option[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage]
)

object RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
implicit val format: Format[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner] = Json.format
}

object RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner&#x60;type&#x60;Enum extends Enumeration {
  val   logs, image = Value
  type RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner&#x60;type&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner&#x60;type&#x60;Enum.type])
}
