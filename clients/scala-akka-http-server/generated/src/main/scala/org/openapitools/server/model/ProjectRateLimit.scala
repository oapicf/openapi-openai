package org.openapitools.server.model


/**
 * Represents a project rate limit config.
 *
 * @param `object` The object type, which is always `project.rate_limit` for example: ''null''
 * @param id The identifier, which can be referenced in API endpoints. for example: ''null''
 * @param model The model this rate limit applies to. for example: ''null''
 * @param maxRequestsPer1Minute The maximum requests per minute. for example: ''null''
 * @param maxTokensPer1Minute The maximum tokens per minute. for example: ''null''
 * @param maxImagesPer1Minute The maximum images per minute. Only present for relevant models. for example: ''null''
 * @param maxAudioMegabytesPer1Minute The maximum audio megabytes per minute. Only present for relevant models. for example: ''null''
 * @param maxRequestsPer1Day The maximum requests per day. Only present for relevant models. for example: ''null''
 * @param batch1DayMaxInputTokens The maximum batch input tokens per day. Only present for relevant models. for example: ''null''
*/
final case class ProjectRateLimit (
  `object`: String,
  id: String,
  model: String,
  maxRequestsPer1Minute: Int,
  maxTokensPer1Minute: Int,
  maxImagesPer1Minute: Option[Int] = None,
  maxAudioMegabytesPer1Minute: Option[Int] = None,
  maxRequestsPer1Day: Option[Int] = None,
  batch1DayMaxInputTokens: Option[Int] = None
)

