
package org.openapitools.client.model


case class MessageDeltaContentImageUrlObject (
    /* The index of the content part in the message. */
    _index: Integer,
    /* Always `image_url`. */
    _type: String,
    _imageUrl: Option[MessageDeltaContentImageUrlObjectImageUrl]
)
object MessageDeltaContentImageUrlObject {
    def toStringBody(var_index: Object, var_type: Object, var_imageUrl: Object) =
        s"""
        | {
        | "index":$var_index,"type":$var_type,"imageUrl":$var_imageUrl
        | }
        """.stripMargin
}
