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

case class DeleteFileResponse (
                  id: String,
                  `object`:  Option[DeleteFileResponse&#x60;object&#x60;Enum.DeleteFileResponse&#x60;object&#x60;Enum],
                  deleted: Boolean
)

object DeleteFileResponse {
implicit val format: Format[DeleteFileResponse] = Json.format
}

object DeleteFileResponse&#x60;object&#x60;Enum extends Enumeration {
  val   file = Value
  type DeleteFileResponse&#x60;object&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[DeleteFileResponse&#x60;object&#x60;Enum.type])
}
