
package org.openapitools.client.model


case class CreateChatCompletionRequestAudio (
    /* The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive).  */
    _voice: String,
    /* Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`.  */
    _format: String
)
object CreateChatCompletionRequestAudio {
    def toStringBody(var_voice: Object, var_format: Object) =
        s"""
        | {
        | "voice":$var_voice,"format":$var_format
        | }
        """.stripMargin
}
