
package org.openapitools.client.model


case class ArrayOfContentPartsInner (
    /* Always `image_file`. */
    _type: String,
    _imageFile: MessageContentImageFileObjectImageFile,
    _imageUrl: MessageContentImageUrlObjectImageUrl,
    /* Text content to be sent to the model */
    _text: String
)
object ArrayOfContentPartsInner {
    def toStringBody(var_type: Object, var_imageFile: Object, var_imageUrl: Object, var_text: Object) =
        s"""
        | {
        | "type":$var_type,"imageFile":$var_imageFile,"imageUrl":$var_imageUrl,"text":$var_text
        | }
        """.stripMargin
}
