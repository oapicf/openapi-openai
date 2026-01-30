
package org.openapitools.client.model


case class Upload (
    /* The Upload unique identifier, which can be referenced in API endpoints. */
    _id: String,
    /* The Unix timestamp (in seconds) for when the Upload was created. */
    _createdAt: Integer,
    /* The name of the file to be uploaded. */
    _filename: String,
    /* The intended number of bytes to be uploaded. */
    _bytes: Integer,
    /* The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. */
    _purpose: String,
    /* The status of the Upload. */
    _status: String,
    /* The Unix timestamp (in seconds) for when the Upload was created. */
    _expiresAt: Integer,
    /* The object type, which is always \"upload\". */
    _object: Option[String],
    _file: Option[OpenAIFile]
)
object Upload {
    def toStringBody(var_id: Object, var_createdAt: Object, var_filename: Object, var_bytes: Object, var_purpose: Object, var_status: Object, var_expiresAt: Object, var_object: Object, var_file: Object) =
        s"""
        | {
        | "id":$var_id,"createdAt":$var_createdAt,"filename":$var_filename,"bytes":$var_bytes,"purpose":$var_purpose,"status":$var_status,"expiresAt":$var_expiresAt,"object":$var_object,"file":$var_file
        | }
        """.stripMargin
}
