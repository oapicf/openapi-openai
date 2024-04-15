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

case class OpenAIFile (
            /* The file identifier, which can be referenced in the API endpoints. */
                  id: String,
            /* The size of the file, in bytes. */
                  bytes: Int,
            /* The Unix timestamp (in seconds) for when the file was created. */
                  createdAt: Int,
            /* The name of the file. */
                  filename: String,
                  `object`:  Option[OpenAIFile&#x60;object&#x60;Enum.OpenAIFile&#x60;object&#x60;Enum],
                  purpose:  Option[OpenAIFilePurposeEnum.OpenAIFilePurposeEnum],
                  status:  Option[OpenAIFileStatusEnum.OpenAIFileStatusEnum],
            /* Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`. */
                  statusDetails: Option[String]
)

object OpenAIFile {
implicit val format: Format[OpenAIFile] = Json.format
}

object OpenAIFile&#x60;object&#x60;Enum extends Enumeration {
  val   file = Value
  type OpenAIFile&#x60;object&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[OpenAIFile&#x60;object&#x60;Enum.type])
}
object OpenAIFilePurposeEnum extends Enumeration {
  val   fine-tune, fine-tune-results, assistants, assistants_output = Value
  type OpenAIFilePurposeEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[OpenAIFilePurposeEnum.type])
}
object OpenAIFileStatusEnum extends Enumeration {
  val   uploaded, processed, error = Value
  type OpenAIFileStatusEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[OpenAIFileStatusEnum.type])
}