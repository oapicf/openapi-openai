package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Static_Chunking_Strategy_static.
  * @param maxChunkSizeTokens The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.
  * @param chunkOverlapTokens The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class StaticChunkingStrategyStatic(
  maxChunkSizeTokens: Int,
  chunkOverlapTokens: Int
)

object StaticChunkingStrategyStatic {
  implicit lazy val staticChunkingStrategyStaticJsonFormat: Format[StaticChunkingStrategyStatic] = Json.format[StaticChunkingStrategyStatic]
}

