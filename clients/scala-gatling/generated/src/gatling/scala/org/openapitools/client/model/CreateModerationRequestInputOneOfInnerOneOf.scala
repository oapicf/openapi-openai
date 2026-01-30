
package org.openapitools.client.model


case class CreateModerationRequestInputOneOfInnerOneOf (
    /* Always `image_url`. */
    _type: String,
    _imageUrl: CreateModerationRequestInputOneOfInnerOneOfImageUrl
)
object CreateModerationRequestInputOneOfInnerOneOf {
    def toStringBody(var_type: Object, var_imageUrl: Object) =
        s"""
        | {
        | "type":$var_type,"imageUrl":$var_imageUrl
        | }
        """.stripMargin
}
