
package org.openapitools.client.model


case class ChatCompletionStreamOptions (
    /* If set, an additional chunk will be streamed before the `data: [DONE]` message. The `usage` field on this chunk shows the token usage statistics for the entire request, and the `choices` field will always be an empty array. All other chunks will also include a `usage` field, but with a null value.  */
    _includeUsage: Option[Boolean]
)
object ChatCompletionStreamOptions {
    def toStringBody(var_includeUsage: Object) =
        s"""
        | {
        | "includeUsage":$var_includeUsage
        | }
        """.stripMargin
}
