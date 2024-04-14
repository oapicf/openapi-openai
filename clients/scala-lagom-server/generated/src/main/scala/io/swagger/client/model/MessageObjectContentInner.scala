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

case class MessageObjectContentInner (
                  `type`:  Option[MessageObjectContentInner&#x60;type&#x60;Enum.MessageObjectContentInner&#x60;type&#x60;Enum],
                  imageFile: MessageContentImageFileObjectImageFile,
                  text: MessageContentTextObjectText
)

object MessageObjectContentInner {
implicit val format: Format[MessageObjectContentInner] = Json.format
}

object MessageObjectContentInner&#x60;type&#x60;Enum extends Enumeration {
  val   image_file, text = Value
  type MessageObjectContentInner&#x60;type&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[MessageObjectContentInner&#x60;type&#x60;Enum.type])
}
