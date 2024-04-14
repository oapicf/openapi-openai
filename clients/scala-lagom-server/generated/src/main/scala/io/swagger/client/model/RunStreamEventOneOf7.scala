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

case class RunStreamEventOneOf7 (
                  event:  Option[RunStreamEventOneOf7EventEnum.RunStreamEventOneOf7EventEnum],
                  data: RunObject
)

object RunStreamEventOneOf7 {
implicit val format: Format[RunStreamEventOneOf7] = Json.format
}

object RunStreamEventOneOf7EventEnum extends Enumeration {
  val   thread.run.cancelled = Value
  type RunStreamEventOneOf7EventEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[RunStreamEventOneOf7EventEnum.type])
}
