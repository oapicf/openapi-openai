
package org.openapitools.client.model


case class StaticChunkingStrategyStatic (
    /* The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`. */
    _maxChunkSizeTokens: Integer,
    /* The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`.  */
    _chunkOverlapTokens: Integer
)
object StaticChunkingStrategyStatic {
    def toStringBody(var_maxChunkSizeTokens: Object, var_chunkOverlapTokens: Object) =
        s"""
        | {
        | "maxChunkSizeTokens":$var_maxChunkSizeTokens,"chunkOverlapTokens":$var_chunkOverlapTokens
        | }
        """.stripMargin
}
