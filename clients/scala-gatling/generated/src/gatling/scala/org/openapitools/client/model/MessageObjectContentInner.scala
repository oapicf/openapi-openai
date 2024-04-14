
package org.openapitools.client.model


case class MessageObjectContentInner (
    /* Always `image_file`. */
    _type: String,
    _imageFile: MessageContentImageFileObjectImageFile,
    _text: MessageContentTextObjectText
)
object MessageObjectContentInner {
    def toStringBody(var_type: Object, var_imageFile: Object, var_text: Object) =
        s"""
        | {
        | "type":$var_type,"imageFile":$var_imageFile,"text":$var_text
        | }
        """.stripMargin
}
