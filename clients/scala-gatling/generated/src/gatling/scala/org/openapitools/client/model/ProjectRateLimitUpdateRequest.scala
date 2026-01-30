
package org.openapitools.client.model


case class ProjectRateLimitUpdateRequest (
    /* The maximum requests per minute. */
    _maxRequestsPer1Minute: Option[Integer],
    /* The maximum tokens per minute. */
    _maxTokensPer1Minute: Option[Integer],
    /* The maximum images per minute. Only relevant for certain models. */
    _maxImagesPer1Minute: Option[Integer],
    /* The maximum audio megabytes per minute. Only relevant for certain models. */
    _maxAudioMegabytesPer1Minute: Option[Integer],
    /* The maximum requests per day. Only relevant for certain models. */
    _maxRequestsPer1Day: Option[Integer],
    /* The maximum batch input tokens per day. Only relevant for certain models. */
    _batch1DayMaxInputTokens: Option[Integer]
)
object ProjectRateLimitUpdateRequest {
    def toStringBody(var_maxRequestsPer1Minute: Object, var_maxTokensPer1Minute: Object, var_maxImagesPer1Minute: Object, var_maxAudioMegabytesPer1Minute: Object, var_maxRequestsPer1Day: Object, var_batch1DayMaxInputTokens: Object) =
        s"""
        | {
        | "maxRequestsPer1Minute":$var_maxRequestsPer1Minute,"maxTokensPer1Minute":$var_maxTokensPer1Minute,"maxImagesPer1Minute":$var_maxImagesPer1Minute,"maxAudioMegabytesPer1Minute":$var_maxAudioMegabytesPer1Minute,"maxRequestsPer1Day":$var_maxRequestsPer1Day,"batch1DayMaxInputTokens":$var_batch1DayMaxInputTokens
        | }
        """.stripMargin
}
