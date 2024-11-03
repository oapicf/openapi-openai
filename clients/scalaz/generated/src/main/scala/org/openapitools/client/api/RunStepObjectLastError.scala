package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepObjectLastError._

case class RunStepObjectLastError (
  /* One of `server_error` or `rate_limit_exceeded`. */
  code: Code,
/* A human-readable description of the error. */
  message: String)

object RunStepObjectLastError {
  import DateTimeCodecs._
  sealed trait Code
  case object ServerError extends Code
  case object RateLimitExceeded extends Code

  object Code {
    def toCode(s: String): Option[Code] = s match {
      case "ServerError" => Some(ServerError)
      case "RateLimitExceeded" => Some(RateLimitExceeded)
      case _ => None
    }

    def fromCode(x: Code): String = x match {
      case ServerError => "ServerError"
      case RateLimitExceeded => "RateLimitExceeded"
    }
  }

  implicit val CodeEnumEncoder: EncodeJson[Code] =
    EncodeJson[Code](is => StringEncodeJson(Code.fromCode(is)))

  implicit val CodeEnumDecoder: DecodeJson[Code] =
    DecodeJson.optionDecoder[Code](n => n.string.flatMap(jStr => Code.toCode(jStr)), "Code failed to de-serialize")

  implicit val RunStepObjectLastErrorCodecJson: CodecJson[RunStepObjectLastError] = CodecJson.derive[RunStepObjectLastError]
  implicit val RunStepObjectLastErrorDecoder: EntityDecoder[RunStepObjectLastError] = jsonOf[RunStepObjectLastError]
  implicit val RunStepObjectLastErrorEncoder: EntityEncoder[RunStepObjectLastError] = jsonEncoderOf[RunStepObjectLastError]
}
