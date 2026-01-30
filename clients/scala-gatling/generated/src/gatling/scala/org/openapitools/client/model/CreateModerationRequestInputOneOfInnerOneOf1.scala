
package org.openapitools.client.model


case class CreateModerationRequestInputOneOfInnerOneOf1 (
    /* Always `text`. */
    _type: String,
    /* A string of text to classify. */
    _text: String
)
object CreateModerationRequestInputOneOfInnerOneOf1 {
    def toStringBody(var_type: Object, var_text: Object) =
        s"""
        | {
        | "type":$var_type,"text":$var_text
        | }
        """.stripMargin
}
