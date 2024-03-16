package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateEmbeddingRequest.
  * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateEmbeddingRequest(
  model: CreateEmbeddingRequestModel,
  input: CreateEmbeddingRequestInput,
  user: Option[String]
)

object CreateEmbeddingRequest {
  implicit lazy val createEmbeddingRequestJsonFormat: Format[CreateEmbeddingRequest] = Json.format[CreateEmbeddingRequest]
}

