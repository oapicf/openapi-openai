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

case class MessageStreamEventOneOf4 (
                  event:  Option[MessageStreamEventOneOf4EventEnum.MessageStreamEventOneOf4EventEnum],
                  data: MessageObject
)

object MessageStreamEventOneOf4 {
implicit val format: Format[MessageStreamEventOneOf4] = Json.format
}

object MessageStreamEventOneOf4EventEnum extends Enumeration {
  val   thread.message.incomplete = Value
  type MessageStreamEventOneOf4EventEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[MessageStreamEventOneOf4EventEnum.type])
}
