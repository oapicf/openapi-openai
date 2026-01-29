
package org.openapitools.client.model


case class AssistantStreamEvent (
    _event: String,
    _data: String
)
object AssistantStreamEvent {
    def toStringBody(var_event: Object, var_data: Object) =
        s"""
        | {
        | "event":$var_event,"data":$var_data
        | }
        """.stripMargin
}
