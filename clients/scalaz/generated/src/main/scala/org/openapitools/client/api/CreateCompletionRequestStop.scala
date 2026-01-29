package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateCompletionRequestStop._

case class CreateCompletionRequestStop (
  
object CreateCompletionRequestStop {
  import DateTimeCodecs._

  implicit val CreateCompletionRequestStopCodecJson: CodecJson[CreateCompletionRequestStop] = CodecJson.derive[CreateCompletionRequestStop]
  implicit val CreateCompletionRequestStopDecoder: EntityDecoder[CreateCompletionRequestStop] = jsonOf[CreateCompletionRequestStop]
  implicit val CreateCompletionRequestStopEncoder: EntityEncoder[CreateCompletionRequestStop] = jsonEncoderOf[CreateCompletionRequestStop]
}
