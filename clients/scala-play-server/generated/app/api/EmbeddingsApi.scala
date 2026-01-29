package api

import play.api.libs.json._
import model.CreateEmbeddingRequest
import model.CreateEmbeddingResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait EmbeddingsApi {
  /**
    * Creates an embedding vector representing the input text.
    */
  def createEmbedding(createEmbeddingRequest: CreateEmbeddingRequest): CreateEmbeddingResponse
}
