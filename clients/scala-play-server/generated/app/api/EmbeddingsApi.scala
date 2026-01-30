package api

import play.api.libs.json._
import model.CreateEmbeddingRequest
import model.CreateEmbeddingResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait EmbeddingsApi {
  /**
    * Creates an embedding vector representing the input text.
    */
  def createEmbedding(createEmbeddingRequest: CreateEmbeddingRequest): CreateEmbeddingResponse
}
