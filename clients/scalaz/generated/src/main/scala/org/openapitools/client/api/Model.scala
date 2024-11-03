package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Model._

case class Model (
  /* The model identifier, which can be referenced in the API endpoints. */
  id: String,
/* The Unix timestamp (in seconds) when the model was created. */
  created: Integer,
/* The object type, which is always \"model\". */
  `object`: `Object`,
/* The organization that owns the model. */
  ownedBy: String)

object Model {
  import DateTimeCodecs._
  sealed trait `Object`
  case object Model extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "Model" => Some(Model)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case Model => "Model"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val ModelCodecJson: CodecJson[Model] = CodecJson.derive[Model]
  implicit val ModelDecoder: EntityDecoder[Model] = jsonOf[Model]
  implicit val ModelEncoder: EntityEncoder[Model] = jsonEncoderOf[Model]
}
