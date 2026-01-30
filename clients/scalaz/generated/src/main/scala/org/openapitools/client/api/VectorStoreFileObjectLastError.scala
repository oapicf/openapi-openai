package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VectorStoreFileObjectLastError._

case class VectorStoreFileObjectLastError (
  /* One of `server_error` or `rate_limit_exceeded`. */
  code: Code,
/* A human-readable description of the error. */
  message: String)

object VectorStoreFileObjectLastError {
  import DateTimeCodecs._
  sealed trait Code
  case object ServerError extends Code
  case object UnsupportedFile extends Code
  case object InvalidFile extends Code

  object Code {
    def toCode(s: String): Option[Code] = s match {
      case "ServerError" => Some(ServerError)
      case "UnsupportedFile" => Some(UnsupportedFile)
      case "InvalidFile" => Some(InvalidFile)
      case _ => None
    }

    def fromCode(x: Code): String = x match {
      case ServerError => "ServerError"
      case UnsupportedFile => "UnsupportedFile"
      case InvalidFile => "InvalidFile"
    }
  }

  implicit val CodeEnumEncoder: EncodeJson[Code] =
    EncodeJson[Code](is => StringEncodeJson(Code.fromCode(is)))

  implicit val CodeEnumDecoder: DecodeJson[Code] =
    DecodeJson.optionDecoder[Code](n => n.string.flatMap(jStr => Code.toCode(jStr)), "Code failed to de-serialize")

  implicit val VectorStoreFileObjectLastErrorCodecJson: CodecJson[VectorStoreFileObjectLastError] = CodecJson.derive[VectorStoreFileObjectLastError]
  implicit val VectorStoreFileObjectLastErrorDecoder: EntityDecoder[VectorStoreFileObjectLastError] = jsonOf[VectorStoreFileObjectLastError]
  implicit val VectorStoreFileObjectLastErrorEncoder: EntityEncoder[VectorStoreFileObjectLastError] = jsonEncoderOf[VectorStoreFileObjectLastError]
}
