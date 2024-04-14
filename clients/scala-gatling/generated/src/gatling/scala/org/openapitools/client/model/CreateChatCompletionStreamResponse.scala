
package org.openapitools.client.model


case class CreateChatCompletionStreamResponse (
    /* A unique identifier for the chat completion. Each chunk has the same ID. */
    _id: String,
    /* A list of chat completion choices. Can be more than one if `n` is greater than 1. */
    _choices: List[CreateChatCompletionStreamResponseChoicesInner],
    /* The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp. */
    _created: Integer,
    /* The model to generate the completion. */
    _model: String,
    /* This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  */
    _systemFingerprint: Option[String],
    /* The object type, which is always `chat.completion.chunk`. */
    _object: String
)
object CreateChatCompletionStreamResponse {
    def toStringBody(var_id: Object, var_choices: Object, var_created: Object, var_model: Object, var_systemFingerprint: Object, var_object: Object) =
        s"""
        | {
        | "id":$var_id,"choices":$var_choices,"created":$var_created,"model":$var_model,"systemFingerprint":$var_systemFingerprint,"object":$var_object
        | }
        """.stripMargin
}
