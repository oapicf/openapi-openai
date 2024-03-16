package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateCompletionResponse._

case class CreateCompletionResponse (
  id: String,
`object`: String,
created: Integer,
model: String,
choices: List[CreateCompletionResponseChoicesInner],
usage: Option[CreateCompletionResponseUsage])

object CreateCompletionResponse {
  import DateTimeCodecs._

  implicit val CreateCompletionResponseCodecJson: CodecJson[CreateCompletionResponse] = CodecJson.derive[CreateCompletionResponse]
  implicit val CreateCompletionResponseDecoder: EntityDecoder[CreateCompletionResponse] = jsonOf[CreateCompletionResponse]
  implicit val CreateCompletionResponseEncoder: EntityEncoder[CreateCompletionResponse] = jsonEncoderOf[CreateCompletionResponse]
}
