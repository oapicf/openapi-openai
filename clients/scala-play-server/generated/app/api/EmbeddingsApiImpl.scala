package api

import model.CreateEmbeddingRequest
import model.CreateEmbeddingResponse

/**
  * Provides a default implementation for [[EmbeddingsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class EmbeddingsApiImpl extends EmbeddingsApi {
  /**
    * @inheritdoc
    */
  override def createEmbedding(createEmbeddingRequest: CreateEmbeddingRequest): CreateEmbeddingResponse = {
    // TODO: Implement better logic

    CreateEmbeddingResponse(List.empty[Embedding], "", "", CreateEmbeddingResponseUsage(0, 0))
  }
}
