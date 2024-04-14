
package org.openapitools.client.model


case class MessageContentTextObjectText (
    /* The data that makes up the text. */
    _value: String,
    _annotations: List[MessageContentTextObjectTextAnnotationsInner]
)
object MessageContentTextObjectText {
    def toStringBody(var_value: Object, var_annotations: Object) =
        s"""
        | {
        | "value":$var_value,"annotations":$var_annotations
        | }
        """.stripMargin
}
