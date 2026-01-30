package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BatchErrors._

case class BatchErrors (
  /* The object type, which is always `list`. */
  `object`: Option[String],
data: Option[List[BatchErrorsDataInner]])

object BatchErrors {
  import DateTimeCodecs._

  implicit val BatchErrorsCodecJson: CodecJson[BatchErrors] = CodecJson.derive[BatchErrors]
  implicit val BatchErrorsDecoder: EntityDecoder[BatchErrors] = jsonOf[BatchErrors]
  implicit val BatchErrorsEncoder: EntityEncoder[BatchErrors] = jsonEncoderOf[BatchErrors]
}
