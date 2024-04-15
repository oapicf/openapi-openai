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

case class ThreadStreamEvent (
                  event:  Option[ThreadStreamEventEventEnum.ThreadStreamEventEventEnum],
                  data: ThreadObject
)

object ThreadStreamEvent {
implicit val format: Format[ThreadStreamEvent] = Json.format
}

object ThreadStreamEventEventEnum extends Enumeration {
  val   thread.created = Value
  type ThreadStreamEventEventEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[ThreadStreamEventEventEnum.type])
}