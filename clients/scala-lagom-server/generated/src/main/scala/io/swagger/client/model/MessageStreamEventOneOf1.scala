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

case class MessageStreamEventOneOf1 (
                  event:  Option[MessageStreamEventOneOf1EventEnum.MessageStreamEventOneOf1EventEnum],
                  data: MessageObject
)

object MessageStreamEventOneOf1 {
implicit val format: Format[MessageStreamEventOneOf1] = Json.format
}

object MessageStreamEventOneOf1EventEnum extends Enumeration {
  val   thread.message.in_progress = Value
  type MessageStreamEventOneOf1EventEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[MessageStreamEventOneOf1EventEnum.type])
}
