package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteVectorStoreResponse._

case class DeleteVectorStoreResponse (
  id: String,
deleted: Boolean,
`object`: `Object`)

object DeleteVectorStoreResponse {
  import DateTimeCodecs._
  sealed trait `Object`
  case object VectorStoreDeleted extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "VectorStoreDeleted" => Some(VectorStoreDeleted)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case VectorStoreDeleted => "VectorStoreDeleted"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val DeleteVectorStoreResponseCodecJson: CodecJson[DeleteVectorStoreResponse] = CodecJson.derive[DeleteVectorStoreResponse]
  implicit val DeleteVectorStoreResponseDecoder: EntityDecoder[DeleteVectorStoreResponse] = jsonOf[DeleteVectorStoreResponse]
  implicit val DeleteVectorStoreResponseEncoder: EntityEncoder[DeleteVectorStoreResponse] = jsonEncoderOf[DeleteVectorStoreResponse]
}
