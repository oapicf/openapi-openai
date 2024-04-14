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

case class MessageStreamEventOneOf3 (
                  event:  Option[MessageStreamEventOneOf3EventEnum.MessageStreamEventOneOf3EventEnum],
                  data: MessageObject
)

object MessageStreamEventOneOf3 {
implicit val format: Format[MessageStreamEventOneOf3] = Json.format
}

object MessageStreamEventOneOf3EventEnum extends Enumeration {
  val   thread.message.completed = Value
  type MessageStreamEventOneOf3EventEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[MessageStreamEventOneOf3EventEnum.type])
}
