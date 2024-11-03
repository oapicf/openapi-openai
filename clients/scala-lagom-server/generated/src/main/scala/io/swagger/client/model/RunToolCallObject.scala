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

case class RunToolCallObject (
            /* The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint. */
                  id: String,
                  `type`:  Option[RunToolCallObject&#x60;type&#x60;Enum.RunToolCallObject&#x60;type&#x60;Enum],
                  function: RunToolCallObjectFunction
)

object RunToolCallObject {
implicit val format: Format[RunToolCallObject] = Json.format
}

object RunToolCallObject&#x60;type&#x60;Enum extends Enumeration {
  val   function = Value
  type RunToolCallObject&#x60;type&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[RunToolCallObject&#x60;type&#x60;Enum.type])
}
