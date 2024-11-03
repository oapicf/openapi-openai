package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunObjectLastError._

case class RunObjectLastError (
  /* One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`. */
  code: Code,
/* A human-readable description of the error. */
  message: String)

object RunObjectLastError {
  import DateTimeCodecs._
  sealed trait Code
  case object ServerError extends Code
  case object RateLimitExceeded extends Code
  case object InvalidPrompt extends Code

  object Code {
    def toCode(s: String): Option[Code] = s match {
      case "ServerError" => Some(ServerError)
      case "RateLimitExceeded" => Some(RateLimitExceeded)
      case "InvalidPrompt" => Some(InvalidPrompt)
      case _ => None
    }

    def fromCode(x: Code): String = x match {
      case ServerError => "ServerError"
      case RateLimitExceeded => "RateLimitExceeded"
      case InvalidPrompt => "InvalidPrompt"
    }
  }

  implicit val CodeEnumEncoder: EncodeJson[Code] =
    EncodeJson[Code](is => StringEncodeJson(Code.fromCode(is)))

  implicit val CodeEnumDecoder: DecodeJson[Code] =
    DecodeJson.optionDecoder[Code](n => n.string.flatMap(jStr => Code.toCode(jStr)), "Code failed to de-serialize")

  implicit val RunObjectLastErrorCodecJson: CodecJson[RunObjectLastError] = CodecJson.derive[RunObjectLastError]
  implicit val RunObjectLastErrorDecoder: EntityDecoder[RunObjectLastError] = jsonOf[RunObjectLastError]
  implicit val RunObjectLastErrorEncoder: EntityEncoder[RunObjectLastError] = jsonEncoderOf[RunObjectLastError]
}
