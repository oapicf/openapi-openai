
package org.openapitools.client.model


case class CreateEmbeddingResponseUsage (
    /* The number of tokens used by the prompt. */
    _promptTokens: Integer,
    /* The total number of tokens used by the request. */
    _totalTokens: Integer
)
object CreateEmbeddingResponseUsage {
    def toStringBody(var_promptTokens: Object, var_totalTokens: Object) =
        s"""
        | {
        | "promptTokens":$var_promptTokens,"totalTokens":$var_totalTokens
        | }
        """.stripMargin
}
