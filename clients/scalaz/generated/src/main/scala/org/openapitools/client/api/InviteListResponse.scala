package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InviteListResponse._

case class InviteListResponse (
  /* The object type, which is always `list` */
  `object`: `Object`,
data: List[Invite],
/* The first `invite_id` in the retrieved `list` */
  firstId: Option[String],
/* The last `invite_id` in the retrieved `list` */
  lastId: Option[String],
/* The `has_more` property is used for pagination to indicate there are additional results. */
  hasMore: Option[Boolean])

object InviteListResponse {
  import DateTimeCodecs._
  sealed trait `Object`
  case object List extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "List" => Some(List)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case List => "List"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val InviteListResponseCodecJson: CodecJson[InviteListResponse] = CodecJson.derive[InviteListResponse]
  implicit val InviteListResponseDecoder: EntityDecoder[InviteListResponse] = jsonOf[InviteListResponse]
  implicit val InviteListResponseEncoder: EntityEncoder[InviteListResponse] = jsonEncoderOf[InviteListResponse]
}
