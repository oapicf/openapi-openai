
package org.openapitools.client.model


case class RealtimeSessionCreateRequestTurnDetection (
    /* Type of turn detection, only `server_vad` is currently supported.  */
    _type: Option[String],
    /* Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments.  */
    _threshold: Option[Number],
    /* Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms.  */
    _prefixPaddingMs: Option[Integer],
    /* Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user.  */
    _silenceDurationMs: Option[Integer],
    /* Whether or not to automatically generate a response when VAD is enabled. `true` by default.  */
    _createResponse: Option[Boolean]
)
object RealtimeSessionCreateRequestTurnDetection {
    def toStringBody(var_type: Object, var_threshold: Object, var_prefixPaddingMs: Object, var_silenceDurationMs: Object, var_createResponse: Object) =
        s"""
        | {
        | "type":$var_type,"threshold":$var_threshold,"prefixPaddingMs":$var_prefixPaddingMs,"silenceDurationMs":$var_silenceDurationMs,"createResponse":$var_createResponse
        | }
        """.stripMargin
}
