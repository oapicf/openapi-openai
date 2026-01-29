
package org.openapitools.client.model


case class MessageDeltaContentTextObjectText (
    /* The data that makes up the text. */
    _value: Option[String],
    _annotations: Option[List[MessageDeltaContentTextObjectTextAnnotationsInner]]
)
object MessageDeltaContentTextObjectText {
    def toStringBody(var_value: Object, var_annotations: Object) =
        s"""
        | {
        | "value":$var_value,"annotations":$var_annotations
        | }
        """.stripMargin
}
