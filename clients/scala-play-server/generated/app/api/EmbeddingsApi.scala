package api

import play.api.libs.json._
import model.CreateEmbeddingRequest
import model.CreateEmbeddingResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
trait EmbeddingsApi {
  /**
    * Creates an embedding vector representing the input text.
    */
  def createEmbedding(createEmbeddingRequest: CreateEmbeddingRequest): CreateEmbeddingResponse
}
