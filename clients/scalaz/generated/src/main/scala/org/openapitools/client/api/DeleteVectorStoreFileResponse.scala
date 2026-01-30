package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteVectorStoreFileResponse._

case class DeleteVectorStoreFileResponse (
  id: String,
deleted: Boolean,
`object`: `Object`)

object DeleteVectorStoreFileResponse {
  import DateTimeCodecs._
  sealed trait `Object`
  case object VectorStoreFileDeleted extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "VectorStoreFileDeleted" => Some(VectorStoreFileDeleted)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case VectorStoreFileDeleted => "VectorStoreFileDeleted"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val DeleteVectorStoreFileResponseCodecJson: CodecJson[DeleteVectorStoreFileResponse] = CodecJson.derive[DeleteVectorStoreFileResponse]
  implicit val DeleteVectorStoreFileResponseDecoder: EntityDecoder[DeleteVectorStoreFileResponse] = jsonOf[DeleteVectorStoreFileResponse]
  implicit val DeleteVectorStoreFileResponseEncoder: EntityEncoder[DeleteVectorStoreFileResponse] = jsonEncoderOf[DeleteVectorStoreFileResponse]
}
