
package org.openapitools.client.model


case class CreateEmbeddingResponseUsage (
    _promptTokens: Integer,
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
