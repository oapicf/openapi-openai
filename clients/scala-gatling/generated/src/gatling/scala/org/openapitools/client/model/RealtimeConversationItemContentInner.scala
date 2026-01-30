
package org.openapitools.client.model


case class RealtimeConversationItemContentInner (
    /* The content type (`input_text`, `input_audio`, `item_reference`, `text`).  */
    _type: Option[String],
    /* The text content, used for `input_text` and `text` content types.  */
    _text: Option[String],
    /* ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items.  */
    _id: Option[String],
    /* Base64-encoded audio bytes, used for `input_audio` content type.  */
    _audio: Option[String],
    /* The transcript of the audio, used for `input_audio` content type.  */
    _transcript: Option[String]
)
object RealtimeConversationItemContentInner {
    def toStringBody(var_type: Object, var_text: Object, var_id: Object, var_audio: Object, var_transcript: Object) =
        s"""
        | {
        | "type":$var_type,"text":$var_text,"id":$var_id,"audio":$var_audio,"transcript":$var_transcript
        | }
        """.stripMargin
}
