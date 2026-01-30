
package org.openapitools.client.model


case class ProjectRateLimit (
    /* The object type, which is always `project.rate_limit` */
    _object: String,
    /* The identifier, which can be referenced in API endpoints. */
    _id: String,
    /* The model this rate limit applies to. */
    _model: String,
    /* The maximum requests per minute. */
    _maxRequestsPer1Minute: Integer,
    /* The maximum tokens per minute. */
    _maxTokensPer1Minute: Integer,
    /* The maximum images per minute. Only present for relevant models. */
    _maxImagesPer1Minute: Option[Integer],
    /* The maximum audio megabytes per minute. Only present for relevant models. */
    _maxAudioMegabytesPer1Minute: Option[Integer],
    /* The maximum requests per day. Only present for relevant models. */
    _maxRequestsPer1Day: Option[Integer],
    /* The maximum batch input tokens per day. Only present for relevant models. */
    _batch1DayMaxInputTokens: Option[Integer]
)
object ProjectRateLimit {
    def toStringBody(var_object: Object, var_id: Object, var_model: Object, var_maxRequestsPer1Minute: Object, var_maxTokensPer1Minute: Object, var_maxImagesPer1Minute: Object, var_maxAudioMegabytesPer1Minute: Object, var_maxRequestsPer1Day: Object, var_batch1DayMaxInputTokens: Object) =
        s"""
        | {
        | "object":$var_object,"id":$var_id,"model":$var_model,"maxRequestsPer1Minute":$var_maxRequestsPer1Minute,"maxTokensPer1Minute":$var_maxTokensPer1Minute,"maxImagesPer1Minute":$var_maxImagesPer1Minute,"maxAudioMegabytesPer1Minute":$var_maxAudioMegabytesPer1Minute,"maxRequestsPer1Day":$var_maxRequestsPer1Day,"batch1DayMaxInputTokens":$var_batch1DayMaxInputTokens
        | }
        """.stripMargin
}
