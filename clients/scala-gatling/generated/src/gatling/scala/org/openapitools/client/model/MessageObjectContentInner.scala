
package org.openapitools.client.model


case class MessageObjectContentInner (
    /* Always `image_file`. */
    _type: String,
    _imageFile: MessageContentImageFileObjectImageFile,
    _imageUrl: MessageContentImageUrlObjectImageUrl,
    _text: MessageContentTextObjectText,
    _refusal: String
)
object MessageObjectContentInner {
    def toStringBody(var_type: Object, var_imageFile: Object, var_imageUrl: Object, var_text: Object, var_refusal: Object) =
        s"""
        | {
        | "type":$var_type,"imageFile":$var_imageFile,"imageUrl":$var_imageUrl,"text":$var_text,"refusal":$var_refusal
        | }
        """.stripMargin
}
