package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BatchErrorsDataInner._

case class BatchErrorsDataInner (
  /* An error code identifying the error type. */
  code: Option[String],
/* A human-readable message providing more details about the error. */
  message: Option[String],
/* The name of the parameter that caused the error, if applicable. */
  param: Option[String],
/* The line number of the input file where the error occurred, if applicable. */
  line: Option[Integer])

object BatchErrorsDataInner {
  import DateTimeCodecs._

  implicit val BatchErrorsDataInnerCodecJson: CodecJson[BatchErrorsDataInner] = CodecJson.derive[BatchErrorsDataInner]
  implicit val BatchErrorsDataInnerDecoder: EntityDecoder[BatchErrorsDataInner] = jsonOf[BatchErrorsDataInner]
  implicit val BatchErrorsDataInnerEncoder: EntityEncoder[BatchErrorsDataInner] = jsonEncoderOf[BatchErrorsDataInner]
}
