
package org.openapitools.client.model


case class CreateChatCompletionResponse (
    /* A unique identifier for the chat completion. */
    _id: String,
    /* A list of chat completion choices. Can be more than one if `n` is greater than 1. */
    _choices: List[CreateChatCompletionResponseChoicesInner],
    /* The Unix timestamp (in seconds) of when the chat completion was created. */
    _created: Integer,
    /* The model used for the chat completion. */
    _model: String,
    /* This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  */
    _systemFingerprint: Option[String],
    /* The object type, which is always `chat.completion`. */
    _object: String,
    _usage: Option[CompletionUsage]
)
object CreateChatCompletionResponse {
    def toStringBody(var_id: Object, var_choices: Object, var_created: Object, var_model: Object, var_systemFingerprint: Object, var_object: Object, var_usage: Object) =
        s"""
        | {
        | "id":$var_id,"choices":$var_choices,"created":$var_created,"model":$var_model,"systemFingerprint":$var_systemFingerprint,"object":$var_object,"usage":$var_usage
        | }
        """.stripMargin
}
