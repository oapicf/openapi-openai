
package org.openapitools.client.model


case class ErrorEvent (
    _event: String,
    _data: Error
)
object ErrorEvent {
    def toStringBody(var_event: Object, var_data: Object) =
        s"""
        | {
        | "event":$var_event,"data":$var_data
        | }
        """.stripMargin
}
