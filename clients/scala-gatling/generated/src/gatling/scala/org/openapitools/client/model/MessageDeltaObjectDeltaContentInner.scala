
package org.openapitools.client.model


case class MessageDeltaObjectDeltaContentInner (
    /* The index of the content part in the message. */
    _index: Integer,
    /* Always `image_file`. */
    _type: String,
    _imageFile: Option[MessageDeltaContentImageFileObjectImageFile],
    _text: Option[MessageDeltaContentTextObjectText],
    _refusal: Option[String],
    _imageUrl: Option[MessageDeltaContentImageUrlObjectImageUrl]
)
object MessageDeltaObjectDeltaContentInner {
    def toStringBody(var_index: Object, var_type: Object, var_imageFile: Object, var_text: Object, var_refusal: Object, var_imageUrl: Object) =
        s"""
        | {
        | "index":$var_index,"type":$var_type,"imageFile":$var_imageFile,"text":$var_text,"refusal":$var_refusal,"imageUrl":$var_imageUrl
        | }
        """.stripMargin
}
