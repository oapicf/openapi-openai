
package org.openapitools.client.model


case class CreateModerationRequestInputOneOfInner (
    /* Always `image_url`. */
    _type: String,
    _imageUrl: CreateModerationRequestInputOneOfInnerOneOfImageUrl,
    /* A string of text to classify. */
    _text: String
)
object CreateModerationRequestInputOneOfInner {
    def toStringBody(var_type: Object, var_imageUrl: Object, var_text: Object) =
        s"""
        | {
        | "type":$var_type,"imageUrl":$var_imageUrl,"text":$var_text
        | }
        """.stripMargin
}
