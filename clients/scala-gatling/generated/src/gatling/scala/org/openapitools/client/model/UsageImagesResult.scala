
package org.openapitools.client.model


case class UsageImagesResult (
    _object: String,
    /* The number of images processed. */
    _images: Integer,
    /* The count of requests made to the model. */
    _numModelRequests: Integer,
    /* When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`. */
    _source: Option[String],
    /* When `group_by=size`, this field provides the image size of the grouped usage result. */
    _size: Option[String],
    /* When `group_by=project_id`, this field provides the project ID of the grouped usage result. */
    _projectId: Option[String],
    /* When `group_by=user_id`, this field provides the user ID of the grouped usage result. */
    _userId: Option[String],
    /* When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. */
    _apiKeyId: Option[String],
    /* When `group_by=model`, this field provides the model name of the grouped usage result. */
    _model: Option[String]
)
object UsageImagesResult {
    def toStringBody(var_object: Object, var_images: Object, var_numModelRequests: Object, var_source: Object, var_size: Object, var_projectId: Object, var_userId: Object, var_apiKeyId: Object, var_model: Object) =
        s"""
        | {
        | "object":$var_object,"images":$var_images,"numModelRequests":$var_numModelRequests,"source":$var_source,"size":$var_size,"projectId":$var_projectId,"userId":$var_userId,"apiKeyId":$var_apiKeyId,"model":$var_model
        | }
        """.stripMargin
}
