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

case class RunStreamEventOneOf5 (
                  event:  Option[RunStreamEventOneOf5EventEnum.RunStreamEventOneOf5EventEnum],
                  data: RunObject
)

object RunStreamEventOneOf5 {
implicit val format: Format[RunStreamEventOneOf5] = Json.format
}

object RunStreamEventOneOf5EventEnum extends Enumeration {
  val   thread.run.failed = Value
  type RunStreamEventOneOf5EventEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[RunStreamEventOneOf5EventEnum.type])
}
