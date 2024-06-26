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

case class RunStreamEventOneOf6 (
                  event:  Option[RunStreamEventOneOf6EventEnum.RunStreamEventOneOf6EventEnum],
                  data: RunObject
)

object RunStreamEventOneOf6 {
implicit val format: Format[RunStreamEventOneOf6] = Json.format
}

object RunStreamEventOneOf6EventEnum extends Enumeration {
  val   thread.run.cancelling = Value
  type RunStreamEventOneOf6EventEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[RunStreamEventOneOf6EventEnum.type])
}
