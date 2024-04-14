package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateCompletionResponse._

case class CreateCompletionResponse (
  /* A unique identifier for the completion. */
  id: String,
/* The list of completion choices the model generated for the input prompt. */
  choices: List[CreateCompletionResponseChoicesInner],
/* The Unix timestamp (in seconds) of when the completion was created. */
  created: Integer,
/* The model used for completion. */
  model: String,
/* This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  */
  systemFingerprint: Option[String],
/* The object type, which is always \"text_completion\" */
  `object`: `Object`,
usage: Option[CompletionUsage])

object CreateCompletionResponse {
  import DateTimeCodecs._
  sealed trait `Object`
  case object TextCompletion extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "TextCompletion" => Some(TextCompletion)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case TextCompletion => "TextCompletion"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val CreateCompletionResponseCodecJson: CodecJson[CreateCompletionResponse] = CodecJson.derive[CreateCompletionResponse]
  implicit val CreateCompletionResponseDecoder: EntityDecoder[CreateCompletionResponse] = jsonOf[CreateCompletionResponse]
  implicit val CreateCompletionResponseEncoder: EntityEncoder[CreateCompletionResponse] = jsonEncoderOf[CreateCompletionResponse]
}
