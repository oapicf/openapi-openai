
package org.openapitools.client.model


case class RealtimeServerEventConversationItemInputAudioTranscriptionFailedError (
    /* The type of error. */
    _type: Option[String],
    /* Error code, if any. */
    _code: Option[String],
    /* A human-readable error message. */
    _message: Option[String],
    /* Parameter related to the error, if any. */
    _param: Option[String]
)
object RealtimeServerEventConversationItemInputAudioTranscriptionFailedError {
    def toStringBody(var_type: Object, var_code: Object, var_message: Object, var_param: Object) =
        s"""
        | {
        | "type":$var_type,"code":$var_code,"message":$var_message,"param":$var_param
        | }
        """.stripMargin
}
