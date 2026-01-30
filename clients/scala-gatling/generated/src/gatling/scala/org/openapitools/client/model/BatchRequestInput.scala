
package org.openapitools.client.model


case class BatchRequestInput (
    /* A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch. */
    _customId: Option[String],
    /* The HTTP method to be used for the request. Currently only `POST` is supported. */
    _method: Option[String],
    /* The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. */
    _url: Option[String]
)
object BatchRequestInput {
    def toStringBody(var_customId: Object, var_method: Object, var_url: Object) =
        s"""
        | {
        | "customId":$var_customId,"method":$var_method,"url":$var_url
        | }
        """.stripMargin
}
