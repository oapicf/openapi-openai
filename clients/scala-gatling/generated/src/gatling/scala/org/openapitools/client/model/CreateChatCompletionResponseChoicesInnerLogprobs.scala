
package org.openapitools.client.model


case class CreateChatCompletionResponseChoicesInnerLogprobs (
    /* A list of message content tokens with log probability information. */
    _content: List[ChatCompletionTokenLogprob],
    /* A list of message refusal tokens with log probability information. */
    _refusal: List[ChatCompletionTokenLogprob]
)
object CreateChatCompletionResponseChoicesInnerLogprobs {
    def toStringBody(var_content: Object, var_refusal: Object) =
        s"""
        | {
        | "content":$var_content,"refusal":$var_refusal
        | }
        """.stripMargin
}
