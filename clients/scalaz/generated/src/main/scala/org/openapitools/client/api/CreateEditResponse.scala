package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateEditResponse._

case class CreateEditResponse (
  `object`: String,
created: Integer,
choices: List[CreateEditResponseChoicesInner],
usage: CreateCompletionResponseUsage)

object CreateEditResponse {
  import DateTimeCodecs._

  implicit val CreateEditResponseCodecJson: CodecJson[CreateEditResponse] = CodecJson.derive[CreateEditResponse]
  implicit val CreateEditResponseDecoder: EntityDecoder[CreateEditResponse] = jsonOf[CreateEditResponse]
  implicit val CreateEditResponseEncoder: EntityEncoder[CreateEditResponse] = jsonEncoderOf[CreateEditResponse]
}
