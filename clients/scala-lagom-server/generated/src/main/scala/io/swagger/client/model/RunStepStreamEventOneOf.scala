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

case class RunStepStreamEventOneOf (
                  event:  Option[RunStepStreamEventOneOfEventEnum.RunStepStreamEventOneOfEventEnum],
                  data: RunStepObject
)

object RunStepStreamEventOneOf {
implicit val format: Format[RunStepStreamEventOneOf] = Json.format
}

object RunStepStreamEventOneOfEventEnum extends Enumeration {
  val   thread.run.step.created = Value
  type RunStepStreamEventOneOfEventEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[RunStepStreamEventOneOfEventEnum.type])
}
