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

case class RunStepStreamEventOneOf5 (
                  event:  Option[RunStepStreamEventOneOf5EventEnum.RunStepStreamEventOneOf5EventEnum],
                  data: RunStepObject
)

object RunStepStreamEventOneOf5 {
implicit val format: Format[RunStepStreamEventOneOf5] = Json.format
}

object RunStepStreamEventOneOf5EventEnum extends Enumeration {
  val   thread.run.step.cancelled = Value
  type RunStepStreamEventOneOf5EventEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[RunStepStreamEventOneOf5EventEnum.type])
}