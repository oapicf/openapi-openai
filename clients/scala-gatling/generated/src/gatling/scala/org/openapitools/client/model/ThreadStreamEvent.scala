
package org.openapitools.client.model


case class ThreadStreamEvent (
    /* Whether to enable input audio transcription. */
    _enabled: Option[Boolean],
    _event: String,
    _data: ThreadObject
)
object ThreadStreamEvent {
    def toStringBody(var_enabled: Object, var_event: Object, var_data: Object) =
        s"""
        | {
        | "enabled":$var_enabled,"event":$var_event,"data":$var_data
        | }
        """.stripMargin
}
