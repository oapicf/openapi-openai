package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Error._

case class Error (
  `type`: String,
message: String,
param: String,
code: String)

object Error {
  import DateTimeCodecs._

  implicit val ErrorCodecJson: CodecJson[Error] = CodecJson.derive[Error]
  implicit val ErrorDecoder: EntityDecoder[Error] = jsonOf[Error]
  implicit val ErrorEncoder: EntityEncoder[Error] = jsonEncoderOf[Error]
}
