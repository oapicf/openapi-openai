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

case class MessageContentTextObjectTextAnnotationsInner (
                  `type`:  Option[MessageContentTextObjectTextAnnotationsInner&#x60;type&#x60;Enum.MessageContentTextObjectTextAnnotationsInner&#x60;type&#x60;Enum],
            /* The text in the message content that needs to be replaced. */
                  text: String,
                  fileCitation: MessageContentTextAnnotationsFileCitationObjectFileCitation,
                  startIndex: Int,
                  endIndex: Int,
                  filePath: MessageContentTextAnnotationsFilePathObjectFilePath
)

object MessageContentTextObjectTextAnnotationsInner {
implicit val format: Format[MessageContentTextObjectTextAnnotationsInner] = Json.format
}

object MessageContentTextObjectTextAnnotationsInner&#x60;type&#x60;Enum extends Enumeration {
  val   file_citation, file_path = Value
  type MessageContentTextObjectTextAnnotationsInner&#x60;type&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[MessageContentTextObjectTextAnnotationsInner&#x60;type&#x60;Enum.type])
}
