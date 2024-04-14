package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateAssistantFileRequest._

case class CreateAssistantFileRequest (
  /* A [File](/docs/api-reference/files) ID (with `purpose=\"assistants\"`) that the assistant should use. Useful for tools like `retrieval` and `code_interpreter` that can access files. */
  fileId: String)

object CreateAssistantFileRequest {
  import DateTimeCodecs._

  implicit val CreateAssistantFileRequestCodecJson: CodecJson[CreateAssistantFileRequest] = CodecJson.derive[CreateAssistantFileRequest]
  implicit val CreateAssistantFileRequestDecoder: EntityDecoder[CreateAssistantFileRequest] = jsonOf[CreateAssistantFileRequest]
  implicit val CreateAssistantFileRequestEncoder: EntityEncoder[CreateAssistantFileRequest] = jsonEncoderOf[CreateAssistantFileRequest]
}
