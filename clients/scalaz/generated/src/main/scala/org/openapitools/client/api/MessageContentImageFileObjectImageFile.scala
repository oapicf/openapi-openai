package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageContentImageFileObjectImageFile._

case class MessageContentImageFileObjectImageFile (
  /* The [File](/docs/api-reference/files) ID of the image in the message content. */
  fileId: String)

object MessageContentImageFileObjectImageFile {
  import DateTimeCodecs._

  implicit val MessageContentImageFileObjectImageFileCodecJson: CodecJson[MessageContentImageFileObjectImageFile] = CodecJson.derive[MessageContentImageFileObjectImageFile]
  implicit val MessageContentImageFileObjectImageFileDecoder: EntityDecoder[MessageContentImageFileObjectImageFile] = jsonOf[MessageContentImageFileObjectImageFile]
  implicit val MessageContentImageFileObjectImageFileEncoder: EntityEncoder[MessageContentImageFileObjectImageFile] = jsonEncoderOf[MessageContentImageFileObjectImageFile]
}
