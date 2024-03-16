package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Model._

case class Model (
  id: String,
`object`: String,
created: Integer,
ownedBy: String)

object Model {
  import DateTimeCodecs._

  implicit val ModelCodecJson: CodecJson[Model] = CodecJson.derive[Model]
  implicit val ModelDecoder: EntityDecoder[Model] = jsonOf[Model]
  implicit val ModelEncoder: EntityEncoder[Model] = jsonEncoderOf[Model]
}
