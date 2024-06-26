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

case class MessageDeltaContentTextAnnotationsFilePathObject (
            /* The index of the annotation in the text content part. */
                  index: Int,
                  `type`:  Option[MessageDeltaContentTextAnnotationsFilePathObject&#x60;type&#x60;Enum.MessageDeltaContentTextAnnotationsFilePathObject&#x60;type&#x60;Enum],
            /* The text in the message content that needs to be replaced. */
                  text: Option[String],
                  filePath: Option[MessageDeltaContentTextAnnotationsFilePathObjectFilePath],
                  startIndex: Option[Int],
                  endIndex: Option[Int]
)

object MessageDeltaContentTextAnnotationsFilePathObject {
implicit val format: Format[MessageDeltaContentTextAnnotationsFilePathObject] = Json.format
}

object MessageDeltaContentTextAnnotationsFilePathObject&#x60;type&#x60;Enum extends Enumeration {
  val   file_path = Value
  type MessageDeltaContentTextAnnotationsFilePathObject&#x60;type&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[MessageDeltaContentTextAnnotationsFilePathObject&#x60;type&#x60;Enum.type])
}
