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

case class DeleteAssistantResponse (
                  id: String,
                  deleted: Boolean,
                  `object`:  Option[DeleteAssistantResponse&#x60;object&#x60;Enum.DeleteAssistantResponse&#x60;object&#x60;Enum]
)

object DeleteAssistantResponse {
implicit val format: Format[DeleteAssistantResponse] = Json.format
}

object DeleteAssistantResponse&#x60;object&#x60;Enum extends Enumeration {
  val   assistant.deleted = Value
  type DeleteAssistantResponse&#x60;object&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[DeleteAssistantResponse&#x60;object&#x60;Enum.type])
}
