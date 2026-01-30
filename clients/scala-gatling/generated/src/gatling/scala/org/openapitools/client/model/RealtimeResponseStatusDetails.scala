
package org.openapitools.client.model


case class RealtimeResponseStatusDetails (
    /* The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`).  */
    _type: Option[String],
    /* The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response).  */
    _reason: Option[String],
    _error: Option[RealtimeResponseStatusDetailsError]
)
object RealtimeResponseStatusDetails {
    def toStringBody(var_type: Object, var_reason: Object, var_error: Object) =
        s"""
        | {
        | "type":$var_type,"reason":$var_reason,"error":$var_error
        | }
        """.stripMargin
}
