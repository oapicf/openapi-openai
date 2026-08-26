package api

import play.api.libs.json._
import model.CreateEmbeddingRequest
import model.CreateEmbeddingResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait EmbeddingsApi {
  /**
    * Creates an embedding vector representing the input text.
    */
  def createEmbedding(createEmbeddingRequest: CreateEmbeddingRequest): CreateEmbeddingResponse
}
