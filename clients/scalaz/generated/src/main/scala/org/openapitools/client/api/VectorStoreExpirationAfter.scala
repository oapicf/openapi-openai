package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VectorStoreExpirationAfter._

case class VectorStoreExpirationAfter (
  /* Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`. */
  anchor: Anchor,
/* The number of days after the anchor time that the vector store will expire. */
  days: Integer)

object VectorStoreExpirationAfter {
  import DateTimeCodecs._
  sealed trait Anchor
  case object LastActiveAt extends Anchor

  object Anchor {
    def toAnchor(s: String): Option[Anchor] = s match {
      case "LastActiveAt" => Some(LastActiveAt)
      case _ => None
    }

    def fromAnchor(x: Anchor): String = x match {
      case LastActiveAt => "LastActiveAt"
    }
  }

  implicit val AnchorEnumEncoder: EncodeJson[Anchor] =
    EncodeJson[Anchor](is => StringEncodeJson(Anchor.fromAnchor(is)))

  implicit val AnchorEnumDecoder: DecodeJson[Anchor] =
    DecodeJson.optionDecoder[Anchor](n => n.string.flatMap(jStr => Anchor.toAnchor(jStr)), "Anchor failed to de-serialize")

  implicit val VectorStoreExpirationAfterCodecJson: CodecJson[VectorStoreExpirationAfter] = CodecJson.derive[VectorStoreExpirationAfter]
  implicit val VectorStoreExpirationAfterDecoder: EntityDecoder[VectorStoreExpirationAfter] = jsonOf[VectorStoreExpirationAfter]
  implicit val VectorStoreExpirationAfterEncoder: EntityEncoder[VectorStoreExpirationAfter] = jsonEncoderOf[VectorStoreExpirationAfter]
}
