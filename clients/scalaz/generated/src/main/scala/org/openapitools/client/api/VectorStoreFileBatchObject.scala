package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VectorStoreFileBatchObject._

case class VectorStoreFileBatchObject (
  /* The identifier, which can be referenced in API endpoints. */
  id: String,
/* The object type, which is always `vector_store.file_batch`. */
  `object`: `Object`,
/* The Unix timestamp (in seconds) for when the vector store files batch was created. */
  createdAt: Integer,
/* The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. */
  vectorStoreId: String,
/* The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`. */
  status: Status,
fileCounts: VectorStoreFileBatchObjectFileCounts)

object VectorStoreFileBatchObject {
  import DateTimeCodecs._
  sealed trait `Object`
  case object VectorStoreFilesBatch extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "VectorStoreFilesBatch" => Some(VectorStoreFilesBatch)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case VectorStoreFilesBatch => "VectorStoreFilesBatch"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")
  sealed trait Status
  case object InProgress extends Status
  case object Completed extends Status
  case object Cancelled extends Status
  case object Failed extends Status

  object Status {
    def toStatus(s: String): Option[Status] = s match {
      case "InProgress" => Some(InProgress)
      case "Completed" => Some(Completed)
      case "Cancelled" => Some(Cancelled)
      case "Failed" => Some(Failed)
      case _ => None
    }

    def fromStatus(x: Status): String = x match {
      case InProgress => "InProgress"
      case Completed => "Completed"
      case Cancelled => "Cancelled"
      case Failed => "Failed"
    }
  }

  implicit val StatusEnumEncoder: EncodeJson[Status] =
    EncodeJson[Status](is => StringEncodeJson(Status.fromStatus(is)))

  implicit val StatusEnumDecoder: DecodeJson[Status] =
    DecodeJson.optionDecoder[Status](n => n.string.flatMap(jStr => Status.toStatus(jStr)), "Status failed to de-serialize")

  implicit val VectorStoreFileBatchObjectCodecJson: CodecJson[VectorStoreFileBatchObject] = CodecJson.derive[VectorStoreFileBatchObject]
  implicit val VectorStoreFileBatchObjectDecoder: EntityDecoder[VectorStoreFileBatchObject] = jsonOf[VectorStoreFileBatchObject]
  implicit val VectorStoreFileBatchObjectEncoder: EntityEncoder[VectorStoreFileBatchObject] = jsonEncoderOf[VectorStoreFileBatchObject]
}
