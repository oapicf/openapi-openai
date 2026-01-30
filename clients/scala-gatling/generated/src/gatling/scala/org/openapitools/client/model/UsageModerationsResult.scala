
package org.openapitools.client.model


case class UsageModerationsResult (
    _object: String,
    /* The aggregated number of input tokens used. */
    _inputTokens: Integer,
    /* The count of requests made to the model. */
    _numModelRequests: Integer,
    /* When `group_by=project_id`, this field provides the project ID of the grouped usage result. */
    _projectId: Option[String],
    /* When `group_by=user_id`, this field provides the user ID of the grouped usage result. */
    _userId: Option[String],
    /* When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. */
    _apiKeyId: Option[String],
    /* When `group_by=model`, this field provides the model name of the grouped usage result. */
    _model: Option[String]
)
object UsageModerationsResult {
    def toStringBody(var_object: Object, var_inputTokens: Object, var_numModelRequests: Object, var_projectId: Object, var_userId: Object, var_apiKeyId: Object, var_model: Object) =
        s"""
        | {
        | "object":$var_object,"inputTokens":$var_inputTokens,"numModelRequests":$var_numModelRequests,"projectId":$var_projectId,"userId":$var_userId,"apiKeyId":$var_apiKeyId,"model":$var_model
        | }
        """.stripMargin
}
