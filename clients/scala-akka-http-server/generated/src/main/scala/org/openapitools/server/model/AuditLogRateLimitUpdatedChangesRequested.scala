package org.openapitools.server.model


/**
 * The payload used to update the rate limits.
 *
 * @param maxRequestsPer1Minute The maximum requests per minute. for example: ''null''
 * @param maxTokensPer1Minute The maximum tokens per minute. for example: ''null''
 * @param maxImagesPer1Minute The maximum images per minute. Only relevant for certain models. for example: ''null''
 * @param maxAudioMegabytesPer1Minute The maximum audio megabytes per minute. Only relevant for certain models. for example: ''null''
 * @param maxRequestsPer1Day The maximum requests per day. Only relevant for certain models. for example: ''null''
 * @param batch1DayMaxInputTokens The maximum batch input tokens per day. Only relevant for certain models. for example: ''null''
*/
final case class AuditLogRateLimitUpdatedChangesRequested (
  maxRequestsPer1Minute: Option[Int] = None,
  maxTokensPer1Minute: Option[Int] = None,
  maxImagesPer1Minute: Option[Int] = None,
  maxAudioMegabytesPer1Minute: Option[Int] = None,
  maxRequestsPer1Day: Option[Int] = None,
  batch1DayMaxInputTokens: Option[Int] = None
)

