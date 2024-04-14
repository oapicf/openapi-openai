
package org.openapitools.client.model


case class RunStepStreamEvent (
    _event: String,
    _data: RunStepObject
)
object RunStepStreamEvent {
    def toStringBody(var_event: Object, var_data: Object) =
        s"""
        | {
        | "event":$var_event,"data":$var_data
        | }
        """.stripMargin
}
