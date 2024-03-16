
package org.openapitools.client.model


case class CreateCompletionResponseChoicesInnerLogprobs (
    _tokens: Option[List[String]],
    _tokenLogprobs: Option[List[Number]],
    _topLogprobs: Option[List[Any]],
    _textOffset: Option[List[Integer]]
)
object CreateCompletionResponseChoicesInnerLogprobs {
    def toStringBody(var_tokens: Object, var_tokenLogprobs: Object, var_topLogprobs: Object, var_textOffset: Object) =
        s"""
        | {
        | "tokens":$var_tokens,"tokenLogprobs":$var_tokenLogprobs,"topLogprobs":$var_topLogprobs,"textOffset":$var_textOffset
        | }
        """.stripMargin
}
