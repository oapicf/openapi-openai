
package org.openapitools.client.model


case class MessageDeltaContentImageFileObject (
    /* The index of the content part in the message. */
    _index: Integer,
    /* Always `image_file`. */
    _type: String,
    _imageFile: Option[MessageDeltaContentImageFileObjectImageFile]
)
object MessageDeltaContentImageFileObject {
    def toStringBody(var_index: Object, var_type: Object, var_imageFile: Object) =
        s"""
        | {
        | "index":$var_index,"type":$var_type,"imageFile":$var_imageFile
        | }
        """.stripMargin
}
