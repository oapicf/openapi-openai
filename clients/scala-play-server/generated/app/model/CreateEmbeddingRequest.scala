package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateEmbeddingRequest.
  * @param encodingFormat The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
  * @param dimensions The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
  * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateEmbeddingRequest(
  input: CreateEmbeddingRequestInput,
  model: CreateEmbeddingRequestModel,
  encodingFormat: Option[CreateEmbeddingRequest.EncodingFormat.Value],
  dimensions: Option[Int],
  user: Option[String]
)

object CreateEmbeddingRequest {
  implicit lazy val createEmbeddingRequestJsonFormat: Format[CreateEmbeddingRequest] = Json.format[CreateEmbeddingRequest]

  // noinspection TypeAnnotation
  object EncodingFormat extends Enumeration {
    val Float = Value("float")
    val Base64 = Value("base64")

    type EncodingFormat = Value
    implicit lazy val EncodingFormatJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

