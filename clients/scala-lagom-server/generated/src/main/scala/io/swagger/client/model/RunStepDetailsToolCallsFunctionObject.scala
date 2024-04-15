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

case class RunStepDetailsToolCallsFunctionObject (
            /* The ID of the tool call object. */
                  id: String,
                  `type`:  Option[RunStepDetailsToolCallsFunctionObject&#x60;type&#x60;Enum.RunStepDetailsToolCallsFunctionObject&#x60;type&#x60;Enum],
                  function: RunStepDetailsToolCallsFunctionObjectFunction
)

object RunStepDetailsToolCallsFunctionObject {
implicit val format: Format[RunStepDetailsToolCallsFunctionObject] = Json.format
}

object RunStepDetailsToolCallsFunctionObject&#x60;type&#x60;Enum extends Enumeration {
  val   function = Value
  type RunStepDetailsToolCallsFunctionObject&#x60;type&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[RunStepDetailsToolCallsFunctionObject&#x60;type&#x60;Enum.type])
}