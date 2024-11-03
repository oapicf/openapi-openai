
package org.openapitools.client.model


case class FineTuningJobEvent (
    _id: String,
    _createdAt: Integer,
    _level: String,
    _message: String,
    _object: String
)
object FineTuningJobEvent {
    def toStringBody(var_id: Object, var_createdAt: Object, var_level: Object, var_message: Object, var_object: Object) =
        s"""
        | {
        | "id":$var_id,"createdAt":$var_createdAt,"level":$var_level,"message":$var_message,"object":$var_object
        | }
        """.stripMargin
}
