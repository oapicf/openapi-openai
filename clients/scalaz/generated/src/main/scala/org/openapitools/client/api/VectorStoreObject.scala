package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VectorStoreObject._

case class VectorStoreObject (
  /* The identifier, which can be referenced in API endpoints. */
  id: String,
/* The object type, which is always `vector_store`. */
  `object`: `Object`,
/* The Unix timestamp (in seconds) for when the vector store was created. */
  createdAt: Integer,
/* The name of the vector store. */
  name: String,
/* The total number of bytes used by the files in the vector store. */
  usageBytes: Integer,
fileCounts: VectorStoreObjectFileCounts,
/* The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use. */
  status: Status,
expiresAfter: Option[VectorStoreExpirationAfter],
/* The Unix timestamp (in seconds) for when the vector store will expire. */
  expiresAt: Option[Integer],
/* The Unix timestamp (in seconds) for when the vector store was last active. */
  lastActiveAt: Integer,
/* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
  metadata: Any)

object VectorStoreObject {
  import DateTimeCodecs._
  sealed trait `Object`
  case object VectorStore extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "VectorStore" => Some(VectorStore)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case VectorStore => "VectorStore"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")
  sealed trait Status
  case object Expired extends Status
  case object InProgress extends Status
  case object Completed extends Status

  object Status {
    def toStatus(s: String): Option[Status] = s match {
      case "Expired" => Some(Expired)
      case "InProgress" => Some(InProgress)
      case "Completed" => Some(Completed)
      case _ => None
    }

    def fromStatus(x: Status): String = x match {
      case Expired => "Expired"
      case InProgress => "InProgress"
      case Completed => "Completed"
    }
  }

  implicit val StatusEnumEncoder: EncodeJson[Status] =
    EncodeJson[Status](is => StringEncodeJson(Status.fromStatus(is)))

  implicit val StatusEnumDecoder: DecodeJson[Status] =
    DecodeJson.optionDecoder[Status](n => n.string.flatMap(jStr => Status.toStatus(jStr)), "Status failed to de-serialize")

  implicit val VectorStoreObjectCodecJson: CodecJson[VectorStoreObject] = CodecJson.derive[VectorStoreObject]
  implicit val VectorStoreObjectDecoder: EntityDecoder[VectorStoreObject] = jsonOf[VectorStoreObject]
  implicit val VectorStoreObjectEncoder: EntityEncoder[VectorStoreObject] = jsonEncoderOf[VectorStoreObject]
}
