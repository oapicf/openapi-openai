package org.openapitools.server.model


/**
 * Details about the output tokens used in the Response.
 *
 * @param textTokens The number of text tokens used in the Response. for example: ''null''
 * @param audioTokens The number of audio tokens used in the Response. for example: ''null''
*/
final case class RealtimeResponseUsageOutputTokenDetails (
  textTokens: Option[Int] = None,
  audioTokens: Option[Int] = None
)

