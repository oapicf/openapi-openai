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

case class MessageDeltaContentTextObject (
            /* The index of the content part in the message. */
                  index: Int,
                  `type`:  Option[MessageDeltaContentTextObject&#x60;type&#x60;Enum.MessageDeltaContentTextObject&#x60;type&#x60;Enum],
                  text: Option[MessageDeltaContentTextObjectText]
)

object MessageDeltaContentTextObject {
implicit val format: Format[MessageDeltaContentTextObject] = Json.format
}

object MessageDeltaContentTextObject&#x60;type&#x60;Enum extends Enumeration {
  val   text = Value
  type MessageDeltaContentTextObject&#x60;type&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[MessageDeltaContentTextObject&#x60;type&#x60;Enum.type])
}