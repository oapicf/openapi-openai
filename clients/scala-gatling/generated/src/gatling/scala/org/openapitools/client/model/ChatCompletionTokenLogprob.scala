
package org.openapitools.client.model


case class ChatCompletionTokenLogprob (
    /* The token. */
    _token: String,
    /* The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely. */
    _logprob: Number,
    /* A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token. */
    _bytes: List[Integer],
    /* List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned. */
    _topLogprobs: List[ChatCompletionTokenLogprobTopLogprobsInner]
)
object ChatCompletionTokenLogprob {
    def toStringBody(var_token: Object, var_logprob: Object, var_bytes: Object, var_topLogprobs: Object) =
        s"""
        | {
        | "token":$var_token,"logprob":$var_logprob,"bytes":$var_bytes,"topLogprobs":$var_topLogprobs
        | }
        """.stripMargin
}
