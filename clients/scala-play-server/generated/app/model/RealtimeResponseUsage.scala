package model

import play.api.libs.json._

/**
  * Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 
  * @param totalTokens The total number of tokens in the Response including input and output  text and audio tokens. 
  * @param inputTokens The number of input tokens used in the Response, including text and  audio tokens. 
  * @param outputTokens The number of output tokens sent in the Response, including text and  audio tokens. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeResponseUsage(
  totalTokens: Option[Int],
  inputTokens: Option[Int],
  outputTokens: Option[Int],
  inputTokenDetails: Option[RealtimeResponseUsageInputTokenDetails],
  outputTokenDetails: Option[RealtimeResponseUsageOutputTokenDetails]
)

object RealtimeResponseUsage {
  implicit lazy val realtimeResponseUsageJsonFormat: Format[RealtimeResponseUsage] = Json.format[RealtimeResponseUsage]
}

