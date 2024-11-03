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

case class MessageContentTextAnnotationsFileCitationObject (
                  `type`:  Option[MessageContentTextAnnotationsFileCitationObject&#x60;type&#x60;Enum.MessageContentTextAnnotationsFileCitationObject&#x60;type&#x60;Enum],
            /* The text in the message content that needs to be replaced. */
                  text: String,
                  fileCitation: MessageContentTextAnnotationsFileCitationObjectFileCitation,
                  startIndex: Int,
                  endIndex: Int
)

object MessageContentTextAnnotationsFileCitationObject {
implicit val format: Format[MessageContentTextAnnotationsFileCitationObject] = Json.format
}

object MessageContentTextAnnotationsFileCitationObject&#x60;type&#x60;Enum extends Enumeration {
  val   file_citation = Value
  type MessageContentTextAnnotationsFileCitationObject&#x60;type&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[MessageContentTextAnnotationsFileCitationObject&#x60;type&#x60;Enum.type])
}
