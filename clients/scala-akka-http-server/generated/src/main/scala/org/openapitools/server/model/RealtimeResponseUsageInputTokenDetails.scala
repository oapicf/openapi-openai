package org.openapitools.server.model


/**
 * Details about the input tokens used in the Response.
 *
 * @param cachedTokens The number of cached tokens used in the Response. for example: ''null''
 * @param textTokens The number of text tokens used in the Response. for example: ''null''
 * @param audioTokens The number of audio tokens used in the Response. for example: ''null''
*/
final case class RealtimeResponseUsageInputTokenDetails (
  cachedTokens: Option[Int] = None,
  textTokens: Option[Int] = None,
  audioTokens: Option[Int] = None
)

