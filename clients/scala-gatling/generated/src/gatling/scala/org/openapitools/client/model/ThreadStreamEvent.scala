
package org.openapitools.client.model


case class ThreadStreamEvent (
    _event: String,
    _data: ThreadObject
)
object ThreadStreamEvent {
    def toStringBody(var_event: Object, var_data: Object) =
        s"""
        | {
        | "event":$var_event,"data":$var_data
        | }
        """.stripMargin
}
