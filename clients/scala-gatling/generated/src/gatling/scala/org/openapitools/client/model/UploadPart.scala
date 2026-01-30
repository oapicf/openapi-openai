
package org.openapitools.client.model


case class UploadPart (
    /* The upload Part unique identifier, which can be referenced in API endpoints. */
    _id: String,
    /* The Unix timestamp (in seconds) for when the Part was created. */
    _createdAt: Integer,
    /* The ID of the Upload object that this Part was added to. */
    _uploadId: String,
    /* The object type, which is always `upload.part`. */
    _object: String
)
object UploadPart {
    def toStringBody(var_id: Object, var_createdAt: Object, var_uploadId: Object, var_object: Object) =
        s"""
        | {
        | "id":$var_id,"createdAt":$var_createdAt,"uploadId":$var_uploadId,"object":$var_object
        | }
        """.stripMargin
}
