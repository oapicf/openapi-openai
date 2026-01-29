package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateChatCompletionResponse._

case class CreateChatCompletionResponse (
  /* A unique identifier for the chat completion. */
  id: String,
/* A list of chat completion choices. Can be more than one if `n` is greater than 1. */
  choices: List[CreateChatCompletionResponseChoicesInner],
/* The Unix timestamp (in seconds) of when the chat completion was created. */
  created: Integer,
/* The model used for the chat completion. */
  model: String,
/* This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  */
  systemFingerprint: Option[String],
/* The object type, which is always `chat.completion`. */
  `object`: `Object`,
usage: Option[CompletionUsage])

object CreateChatCompletionResponse {
  import DateTimeCodecs._
  sealed trait `Object`
  case object ChatCompletion extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "ChatCompletion" => Some(ChatCompletion)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case ChatCompletion => "ChatCompletion"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val CreateChatCompletionResponseCodecJson: CodecJson[CreateChatCompletionResponse] = CodecJson.derive[CreateChatCompletionResponse]
  implicit val CreateChatCompletionResponseDecoder: EntityDecoder[CreateChatCompletionResponse] = jsonOf[CreateChatCompletionResponse]
  implicit val CreateChatCompletionResponseEncoder: EntityEncoder[CreateChatCompletionResponse] = jsonEncoderOf[CreateChatCompletionResponse]
}
