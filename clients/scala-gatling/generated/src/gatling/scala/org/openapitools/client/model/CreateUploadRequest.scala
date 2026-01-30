
package org.openapitools.client.model


case class CreateUploadRequest (
    /* The name of the file to upload.  */
    _filename: String,
    /* The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose).  */
    _purpose: String,
    /* The number of bytes in the file you are uploading.  */
    _bytes: Integer,
    /* The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision.  */
    _mimeType: String
)
object CreateUploadRequest {
    def toStringBody(var_filename: Object, var_purpose: Object, var_bytes: Object, var_mimeType: Object) =
        s"""
        | {
        | "filename":$var_filename,"purpose":$var_purpose,"bytes":$var_bytes,"mimeType":$var_mimeType
        | }
        """.stripMargin
}
