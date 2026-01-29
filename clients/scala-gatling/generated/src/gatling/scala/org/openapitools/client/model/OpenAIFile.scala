
package org.openapitools.client.model


case class OpenAIFile (
    /* The file identifier, which can be referenced in the API endpoints. */
    _id: String,
    /* The size of the file, in bytes. */
    _bytes: Integer,
    /* The Unix timestamp (in seconds) for when the file was created. */
    _createdAt: Integer,
    /* The name of the file. */
    _filename: String,
    /* The object type, which is always `file`. */
    _object: String,
    /* The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`. */
    _purpose: String,
    /* Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`. */
    _status: String,
    /* Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`. */
    _statusDetails: Option[String]
)
object OpenAIFile {
    def toStringBody(var_id: Object, var_bytes: Object, var_createdAt: Object, var_filename: Object, var_object: Object, var_purpose: Object, var_status: Object, var_statusDetails: Object) =
        s"""
        | {
        | "id":$var_id,"bytes":$var_bytes,"createdAt":$var_createdAt,"filename":$var_filename,"object":$var_object,"purpose":$var_purpose,"status":$var_status,"statusDetails":$var_statusDetails
        | }
        """.stripMargin
}
