package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssistantsNamedToolChoiceFunction._

case class AssistantsNamedToolChoiceFunction (
  /* The name of the function to call. */
  name: String)

object AssistantsNamedToolChoiceFunction {
  import DateTimeCodecs._

  implicit val AssistantsNamedToolChoiceFunctionCodecJson: CodecJson[AssistantsNamedToolChoiceFunction] = CodecJson.derive[AssistantsNamedToolChoiceFunction]
  implicit val AssistantsNamedToolChoiceFunctionDecoder: EntityDecoder[AssistantsNamedToolChoiceFunction] = jsonOf[AssistantsNamedToolChoiceFunction]
  implicit val AssistantsNamedToolChoiceFunctionEncoder: EntityEncoder[AssistantsNamedToolChoiceFunction] = jsonEncoderOf[AssistantsNamedToolChoiceFunction]
}
