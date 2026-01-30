
package org.openapitools.client.model


case class ChatCompletionRequestAssistantMessageAudio (
    /* Unique identifier for a previous audio response from the model.  */
    _id: String
)
object ChatCompletionRequestAssistantMessageAudio {
    def toStringBody(var_id: Object) =
        s"""
        | {
        | "id":$var_id
        | }
        """.stripMargin
}
