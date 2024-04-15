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

case class CreateEmbeddingResponse (
            /* The list of embeddings generated by the model. */
                  data: Seq[Embedding],
            /* The name of the model used to generate the embedding. */
                  model: String,
                  `object`:  Option[CreateEmbeddingResponse&#x60;object&#x60;Enum.CreateEmbeddingResponse&#x60;object&#x60;Enum],
                  usage: CreateEmbeddingResponseUsage
)

object CreateEmbeddingResponse {
implicit val format: Format[CreateEmbeddingResponse] = Json.format
}

object CreateEmbeddingResponse&#x60;object&#x60;Enum extends Enumeration {
  val   list = Value
  type CreateEmbeddingResponse&#x60;object&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[CreateEmbeddingResponse&#x60;object&#x60;Enum.type])
}