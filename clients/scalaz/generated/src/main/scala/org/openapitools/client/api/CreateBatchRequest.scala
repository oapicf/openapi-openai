package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateBatchRequest._

case class CreateBatchRequest (
  /* The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size.  */
  inputFileId: String,
/* The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch. */
  endpoint: Endpoint,
/* The time frame within which the batch should be processed. Currently only `24h` is supported. */
  completionWindow: CompletionWindow,
/* Optional custom metadata for the batch. */
  metadata: Option[Map[String, String]])

object CreateBatchRequest {
  import DateTimeCodecs._
  sealed trait Endpoint
  case object V1ChatCompletions extends Endpoint
  case object V1Embeddings extends Endpoint
  case object V1Completions extends Endpoint

  object Endpoint {
    def toEndpoint(s: String): Option[Endpoint] = s match {
      case "V1ChatCompletions" => Some(V1ChatCompletions)
      case "V1Embeddings" => Some(V1Embeddings)
      case "V1Completions" => Some(V1Completions)
      case _ => None
    }

    def fromEndpoint(x: Endpoint): String = x match {
      case V1ChatCompletions => "V1ChatCompletions"
      case V1Embeddings => "V1Embeddings"
      case V1Completions => "V1Completions"
    }
  }

  implicit val EndpointEnumEncoder: EncodeJson[Endpoint] =
    EncodeJson[Endpoint](is => StringEncodeJson(Endpoint.fromEndpoint(is)))

  implicit val EndpointEnumDecoder: DecodeJson[Endpoint] =
    DecodeJson.optionDecoder[Endpoint](n => n.string.flatMap(jStr => Endpoint.toEndpoint(jStr)), "Endpoint failed to de-serialize")
  sealed trait CompletionWindow
  case object `24h` extends CompletionWindow

  object CompletionWindow {
    def toCompletionWindow(s: String): Option[CompletionWindow] = s match {
      case "`24h`" => Some(`24h`)
      case _ => None
    }

    def fromCompletionWindow(x: CompletionWindow): String = x match {
      case `24h` => "`24h`"
    }
  }

  implicit val CompletionWindowEnumEncoder: EncodeJson[CompletionWindow] =
    EncodeJson[CompletionWindow](is => StringEncodeJson(CompletionWindow.fromCompletionWindow(is)))

  implicit val CompletionWindowEnumDecoder: DecodeJson[CompletionWindow] =
    DecodeJson.optionDecoder[CompletionWindow](n => n.string.flatMap(jStr => CompletionWindow.toCompletionWindow(jStr)), "CompletionWindow failed to de-serialize")

  implicit val CreateBatchRequestCodecJson: CodecJson[CreateBatchRequest] = CodecJson.derive[CreateBatchRequest]
  implicit val CreateBatchRequestDecoder: EntityDecoder[CreateBatchRequest] = jsonOf[CreateBatchRequest]
  implicit val CreateBatchRequestEncoder: EntityEncoder[CreateBatchRequest] = jsonEncoderOf[CreateBatchRequest]
}
