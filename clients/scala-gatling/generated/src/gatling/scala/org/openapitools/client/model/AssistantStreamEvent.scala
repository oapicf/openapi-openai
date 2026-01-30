
package org.openapitools.client.model


case class AssistantStreamEvent (
    /* Whether to enable input audio transcription. */
    _enabled: Option[Boolean],
    _event: String,
    _data: String
)
object AssistantStreamEvent {
    def toStringBody(var_enabled: Object, var_event: Object, var_data: Object) =
        s"""
        | {
        | "enabled":$var_enabled,"event":$var_event,"data":$var_data
        | }
        """.stripMargin
}
