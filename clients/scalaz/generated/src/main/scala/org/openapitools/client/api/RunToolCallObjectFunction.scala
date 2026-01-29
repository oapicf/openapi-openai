package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunToolCallObjectFunction._

case class RunToolCallObjectFunction (
  /* The name of the function. */
  name: String,
/* The arguments that the model expects you to pass to the function. */
  arguments: String)

object RunToolCallObjectFunction {
  import DateTimeCodecs._

  implicit val RunToolCallObjectFunctionCodecJson: CodecJson[RunToolCallObjectFunction] = CodecJson.derive[RunToolCallObjectFunction]
  implicit val RunToolCallObjectFunctionDecoder: EntityDecoder[RunToolCallObjectFunction] = jsonOf[RunToolCallObjectFunction]
  implicit val RunToolCallObjectFunctionEncoder: EntityEncoder[RunToolCallObjectFunction] = jsonEncoderOf[RunToolCallObjectFunction]
}
