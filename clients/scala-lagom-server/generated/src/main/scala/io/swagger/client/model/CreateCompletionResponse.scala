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

case class CreateCompletionResponse (
            /* A unique identifier for the completion. */
                  id: String,
            /* The list of completion choices the model generated for the input prompt. */
                  choices: Seq[CreateCompletionResponseChoicesInner],
            /* The Unix timestamp (in seconds) of when the completion was created. */
                  created: Int,
            /* The model used for completion. */
                  model: String,
            /* This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  */
                  systemFingerprint: Option[String],
                  `object`:  Option[CreateCompletionResponse&#x60;object&#x60;Enum.CreateCompletionResponse&#x60;object&#x60;Enum],
                  usage: Option[CompletionUsage]
)

object CreateCompletionResponse {
implicit val format: Format[CreateCompletionResponse] = Json.format
}

object CreateCompletionResponse&#x60;object&#x60;Enum extends Enumeration {
  val   text_completion = Value
  type CreateCompletionResponse&#x60;object&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[CreateCompletionResponse&#x60;object&#x60;Enum.type])
}
