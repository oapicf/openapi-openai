
package org.openapitools.client.model


case class UsageTimeBucketResultInner (
    _object: String,
    /* The aggregated number of input tokens used. */
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
    /* When `group_by=project_id`, this field provides the project ID of the grouped costs result. */
    _projectId: Option[String],
    /* When `group_by=user_id`, this field provides the user ID of the grouped usage result. */
    _userId: Option[String],
    /* When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. */
    _apiKeyId: Option[String],
    /* When `group_by=model`, this field provides the model name of the grouped usage result. */
    _model: Option[String],
    /* When `group_by=batch`, this field tells whether the grouped usage result is batch or not. */
    _batch: Option[Boolean],
    /* The number of images processed. */
    _images: Integer,
    /* When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`. */
    _source: Option[String],
    /* When `group_by=size`, this field provides the image size of the grouped usage result. */
    _size: Option[String],
    /* The number of characters processed. */
    _characters: Integer,
    /* The number of seconds processed. */
    _seconds: Integer,
    /* The vector stores usage in bytes. */
    _usageBytes: Integer,
    /* The number of code interpreter sessions. */
    _sessions: Integer,
    _amount: Option[CostsResultAmount],
    /* When `group_by=line_item`, this field provides the line item of the grouped costs result. */
    _lineItem: Option[String]
)
object UsageTimeBucketResultInner {
    def toStringBody(var_object: Object, var_inputTokens: Object, var_inputCachedTokens: Object, var_outputTokens: Object, var_inputAudioTokens: Object, var_outputAudioTokens: Object, var_numModelRequests: Object, var_projectId: Object, var_userId: Object, var_apiKeyId: Object, var_model: Object, var_batch: Object, var_images: Object, var_source: Object, var_size: Object, var_characters: Object, var_seconds: Object, var_usageBytes: Object, var_sessions: Object, var_amount: Object, var_lineItem: Object) =
        s"""
        | {
        | "object":$var_object,"inputTokens":$var_inputTokens,"inputCachedTokens":$var_inputCachedTokens,"outputTokens":$var_outputTokens,"inputAudioTokens":$var_inputAudioTokens,"outputAudioTokens":$var_outputAudioTokens,"numModelRequests":$var_numModelRequests,"projectId":$var_projectId,"userId":$var_userId,"apiKeyId":$var_apiKeyId,"model":$var_model,"batch":$var_batch,"images":$var_images,"source":$var_source,"size":$var_size,"characters":$var_characters,"seconds":$var_seconds,"usageBytes":$var_usageBytes,"sessions":$var_sessions,"amount":$var_amount,"lineItem":$var_lineItem
        | }
        """.stripMargin
}
