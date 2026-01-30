package org.openapitools.server.model


/**
 * Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 
 *
 * @param totalTokens The total number of tokens in the Response including input and output  text and audio tokens.  for example: ''null''
 * @param inputTokens The number of input tokens used in the Response, including text and  audio tokens.  for example: ''null''
 * @param outputTokens The number of output tokens sent in the Response, including text and  audio tokens.  for example: ''null''
 * @param inputTokenDetails  for example: ''null''
 * @param outputTokenDetails  for example: ''null''
*/
final case class RealtimeResponseUsage (
  totalTokens: Option[Int] = None,
  inputTokens: Option[Int] = None,
  outputTokens: Option[Int] = None,
  inputTokenDetails: Option[RealtimeResponseUsageInputTokenDetails] = None,
  outputTokenDetails: Option[RealtimeResponseUsageOutputTokenDetails] = None
)

