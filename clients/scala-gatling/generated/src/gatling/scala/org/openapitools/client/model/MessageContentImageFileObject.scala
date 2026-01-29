
package org.openapitools.client.model


case class MessageContentImageFileObject (
    /* Always `image_file`. */
    _type: String,
    _imageFile: MessageContentImageFileObjectImageFile
)
object MessageContentImageFileObject {
    def toStringBody(var_type: Object, var_imageFile: Object) =
        s"""
        | {
        | "type":$var_type,"imageFile":$var_imageFile
        | }
        """.stripMargin
}
