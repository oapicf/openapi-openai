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

case class RunStreamEventOneOf8 (
                  event:  Option[RunStreamEventOneOf8EventEnum.RunStreamEventOneOf8EventEnum],
                  data: RunObject
)

object RunStreamEventOneOf8 {
implicit val format: Format[RunStreamEventOneOf8] = Json.format
}

object RunStreamEventOneOf8EventEnum extends Enumeration {
  val   thread.run.expired = Value
  type RunStreamEventOneOf8EventEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[RunStreamEventOneOf8EventEnum.type])
}
