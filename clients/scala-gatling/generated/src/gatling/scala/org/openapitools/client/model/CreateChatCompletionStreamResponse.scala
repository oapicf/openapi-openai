
package org.openapitools.client.model


case class CreateChatCompletionStreamResponse (
    /* A unique identifier for the chat completion. Each chunk has the same ID. */
    _id: String,
    /* A list of chat completion choices. Can contain more than one elements if `n` is greater than 1. Can also be empty for the last chunk if you set `stream_options: {\"include_usage\": true}`.  */
    _choices: List[CreateChatCompletionStreamResponseChoicesInner],
    /* The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp. */
    _created: Integer,
    /* The model to generate the completion. */
    _model: String,
    /* The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request. */
    _serviceTier: Option[String],
    /* This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  */
    _systemFingerprint: Option[String],
    /* The object type, which is always `chat.completion.chunk`. */
    _object: String,
    _usage: Option[CreateChatCompletionStreamResponseUsage]
)
object CreateChatCompletionStreamResponse {
    def toStringBody(var_id: Object, var_choices: Object, var_created: Object, var_model: Object, var_serviceTier: Object, var_systemFingerprint: Object, var_object: Object, var_usage: Object) =
        s"""
        | {
        | "id":$var_id,"choices":$var_choices,"created":$var_created,"model":$var_model,"serviceTier":$var_serviceTier,"systemFingerprint":$var_systemFingerprint,"object":$var_object,"usage":$var_usage
        | }
        """.stripMargin
}
