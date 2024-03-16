package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OpenAIFile._

case class OpenAIFile (
  id: String,
`object`: String,
bytes: Integer,
createdAt: Integer,
filename: String,
purpose: String,
status: Option[String],
statusDetails: Option[Any])

object OpenAIFile {
  import DateTimeCodecs._

  implicit val OpenAIFileCodecJson: CodecJson[OpenAIFile] = CodecJson.derive[OpenAIFile]
  implicit val OpenAIFileDecoder: EntityDecoder[OpenAIFile] = jsonOf[OpenAIFile]
  implicit val OpenAIFileEncoder: EntityEncoder[OpenAIFile] = jsonEncoderOf[OpenAIFile]
}
