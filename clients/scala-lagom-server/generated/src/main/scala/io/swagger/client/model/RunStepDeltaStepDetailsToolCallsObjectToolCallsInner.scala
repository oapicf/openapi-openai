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

case class RunStepDeltaStepDetailsToolCallsObjectToolCallsInner (
            /* The index of the tool call in the tool calls array. */
                  index: Int,
            /* The ID of the tool call object. */
                  id: Option[String],
                  `type`:  Option[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner&#x60;type&#x60;Enum.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner&#x60;type&#x60;Enum],
                  codeInterpreter: Option[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter],
            /* For now, this is always going to be an empty object. */
                  retrieval: Option[Any],
                  function: Option[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction]
)

object RunStepDeltaStepDetailsToolCallsObjectToolCallsInner {
implicit val format: Format[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner] = Json.format
}

object RunStepDeltaStepDetailsToolCallsObjectToolCallsInner&#x60;type&#x60;Enum extends Enumeration {
  val   code_interpreter, retrieval, function = Value
  type RunStepDeltaStepDetailsToolCallsObjectToolCallsInner&#x60;type&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner&#x60;type&#x60;Enum.type])
}
