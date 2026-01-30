
package org.openapitools.client.model


case class RealtimeSessionInputAudioTranscription (
    /* The model to use for transcription, `whisper-1` is the only currently  supported model.  */
    _model: Option[String]
)
object RealtimeSessionInputAudioTranscription {
    def toStringBody(var_model: Object) =
        s"""
        | {
        | "model":$var_model
        | }
        """.stripMargin
}
