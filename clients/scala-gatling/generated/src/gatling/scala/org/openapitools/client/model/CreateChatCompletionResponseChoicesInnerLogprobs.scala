
package org.openapitools.client.model


case class CreateChatCompletionResponseChoicesInnerLogprobs (
    /* A list of message content tokens with log probability information. */
    _content: List[ChatCompletionTokenLogprob]
)
object CreateChatCompletionResponseChoicesInnerLogprobs {
    def toStringBody(var_content: Object) =
        s"""
        | {
        | "content":$var_content
        | }
        """.stripMargin
}
