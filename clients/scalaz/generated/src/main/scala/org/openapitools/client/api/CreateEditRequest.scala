package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateEditRequest._

case class CreateEditRequest (
  model: CreateEditRequestModel,
/* The input text to use as a starting point for the edit. */
  input: Option[String],
/* The instruction that tells the model how to edit the prompt. */
  instruction: String,
/* How many edits to generate for the input and instruction. */
  n: Option[Integer],
/* What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both.  */
  temperature: Option[BigDecimal],
/* An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both.  */
  topP: Option[BigDecimal])

object CreateEditRequest {
  import DateTimeCodecs._

  implicit val CreateEditRequestCodecJson: CodecJson[CreateEditRequest] = CodecJson.derive[CreateEditRequest]
  implicit val CreateEditRequestDecoder: EntityDecoder[CreateEditRequest] = jsonOf[CreateEditRequest]
  implicit val CreateEditRequestEncoder: EntityEncoder[CreateEditRequest] = jsonEncoderOf[CreateEditRequest]
}
