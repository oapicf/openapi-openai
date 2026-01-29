
package org.openapitools.client.model


case class CreateCompletionResponseChoicesInnerLogprobs (
    _textOffset: Option[List[Integer]],
    _tokenLogprobs: Option[List[Number]],
    _tokens: Option[List[String]],
    _topLogprobs: Option[List[Map[String, Number]]]
)
object CreateCompletionResponseChoicesInnerLogprobs {
    def toStringBody(var_textOffset: Object, var_tokenLogprobs: Object, var_tokens: Object, var_topLogprobs: Object) =
        s"""
        | {
        | "textOffset":$var_textOffset,"tokenLogprobs":$var_tokenLogprobs,"tokens":$var_tokens,"topLogprobs":$var_topLogprobs
        | }
        """.stripMargin
}
