package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateChatCompletionStreamResponse._

case class CreateChatCompletionStreamResponse (
  /* A unique identifier for the chat completion. Each chunk has the same ID. */
  id: String,
/* A list of chat completion choices. Can contain more than one elements if `n` is greater than 1. Can also be empty for the last chunk if you set `stream_options: {\"include_usage\": true}`.  */
  choices: List[CreateChatCompletionStreamResponseChoicesInner],
/* The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp. */
  created: Integer,
/* The model to generate the completion. */
  model: String,
/* The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request. */
  serviceTier: Option[ServiceTier],
/* This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  */
  systemFingerprint: Option[String],
/* The object type, which is always `chat.completion.chunk`. */
  `object`: `Object`,
usage: Option[CreateChatCompletionStreamResponseUsage])

object CreateChatCompletionStreamResponse {
  import DateTimeCodecs._
  sealed trait ServiceTier
  case object Scale extends ServiceTier
  case object Default extends ServiceTier

  object ServiceTier {
    def toServiceTier(s: String): Option[ServiceTier] = s match {
      case "Scale" => Some(Scale)
      case "Default" => Some(Default)
      case _ => None
    }

    def fromServiceTier(x: ServiceTier): String = x match {
      case Scale => "Scale"
      case Default => "Default"
    }
  }

  implicit val ServiceTierEnumEncoder: EncodeJson[ServiceTier] =
    EncodeJson[ServiceTier](is => StringEncodeJson(ServiceTier.fromServiceTier(is)))

  implicit val ServiceTierEnumDecoder: DecodeJson[ServiceTier] =
    DecodeJson.optionDecoder[ServiceTier](n => n.string.flatMap(jStr => ServiceTier.toServiceTier(jStr)), "ServiceTier failed to de-serialize")
  sealed trait `Object`
  case object ChatCompletionChunk extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "ChatCompletionChunk" => Some(ChatCompletionChunk)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case ChatCompletionChunk => "ChatCompletionChunk"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val CreateChatCompletionStreamResponseCodecJson: CodecJson[CreateChatCompletionStreamResponse] = CodecJson.derive[CreateChatCompletionStreamResponse]
  implicit val CreateChatCompletionStreamResponseDecoder: EntityDecoder[CreateChatCompletionStreamResponse] = jsonOf[CreateChatCompletionStreamResponse]
  implicit val CreateChatCompletionStreamResponseEncoder: EntityEncoder[CreateChatCompletionStreamResponse] = jsonEncoderOf[CreateChatCompletionStreamResponse]
}
