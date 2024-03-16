
package org.openapitools.client.model


case class FineTuneEvent (
    _object: String,
    _createdAt: Integer,
    _level: String,
    _message: String
)
object FineTuneEvent {
    def toStringBody(var_object: Object, var_createdAt: Object, var_level: Object, var_message: Object) =
        s"""
        | {
        | "object":$var_object,"createdAt":$var_createdAt,"level":$var_level,"message":$var_message
        | }
        """.stripMargin
}
