
package org.openapitools.client.model


case class RunStreamEvent (
    _event: String,
    _data: RunObject
)
object RunStreamEvent {
    def toStringBody(var_event: Object, var_data: Object) =
        s"""
        | {
        | "event":$var_event,"data":$var_data
        | }
        """.stripMargin
}
