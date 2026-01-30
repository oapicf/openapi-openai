
package org.openapitools.client.model


case class UsageCompletionsResult (
    _object: String,
    /* The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens. */
    _inputTokens: Integer,
    /* The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. */
    _inputCachedTokens: Option[Integer],
    /* The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. */
    _outputTokens: Integer,
    /* The aggregated number of audio input tokens used, including cached tokens. */
    _inputAudioTokens: Option[Integer],
    /* The aggregated number of audio output tokens used. */
    _outputAudioTokens: Option[Integer],
    /* The count of requests made to the model. */
    _numModelRequests: Integer,
    /* When `group_by=project_id`, this field provides the project ID of the grouped usage result. */
    _projectId: Option[String],
    /* When `group_by=user_id`, this field provides the user ID of the grouped usage result. */
    _userId: Option[String],
    /* When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. */
    _apiKeyId: Option[String],
    /* When `group_by=model`, this field provides the model name of the grouped usage result. */
    _model: Option[String],
    /* When `group_by=batch`, this field tells whether the grouped usage result is batch or not. */
    _batch: Option[Boolean]
)
object UsageCompletionsResult {
    def toStringBody(var_object: Object, var_inputTokens: Object, var_inputCachedTokens: Object, var_outputTokens: Object, var_inputAudioTokens: Object, var_outputAudioTokens: Object, var_numModelRequests: Object, var_projectId: Object, var_userId: Object, var_apiKeyId: Object, var_model: Object, var_batch: Object) =
        s"""
        | {
        | "object":$var_object,"inputTokens":$var_inputTokens,"inputCachedTokens":$var_inputCachedTokens,"outputTokens":$var_outputTokens,"inputAudioTokens":$var_inputAudioTokens,"outputAudioTokens":$var_outputAudioTokens,"numModelRequests":$var_numModelRequests,"projectId":$var_projectId,"userId":$var_userId,"apiKeyId":$var_apiKeyId,"model":$var_model,"batch":$var_batch
        | }
        """.stripMargin
}
