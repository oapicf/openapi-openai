
package org.openapitools.client.model


case class MessageDeltaObjectDeltaContentInner (
    /* The index of the content part in the message. */
    _index: Integer,
    /* Always `image_file`. */
    _type: String,
    _imageFile: Option[MessageDeltaContentImageFileObjectImageFile],
    _text: Option[MessageDeltaContentTextObjectText]
)
object MessageDeltaObjectDeltaContentInner {
    def toStringBody(var_index: Object, var_type: Object, var_imageFile: Object, var_text: Object) =
        s"""
        | {
        | "index":$var_index,"type":$var_type,"imageFile":$var_imageFile,"text":$var_text
        | }
        """.stripMargin
}
