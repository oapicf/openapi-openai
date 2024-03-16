
package org.openapitools.client.model


case class OpenAIFile (
    _id: String,
    _object: String,
    _bytes: Integer,
    _createdAt: Integer,
    _filename: String,
    _purpose: String,
    _status: Option[String],
    _statusDetails: Option[Any]
)
object OpenAIFile {
    def toStringBody(var_id: Object, var_object: Object, var_bytes: Object, var_createdAt: Object, var_filename: Object, var_purpose: Object, var_status: Object, var_statusDetails: Object) =
        s"""
        | {
        | "id":$var_id,"object":$var_object,"bytes":$var_bytes,"createdAt":$var_createdAt,"filename":$var_filename,"purpose":$var_purpose,"status":$var_status,"statusDetails":$var_statusDetails
        | }
        """.stripMargin
}
