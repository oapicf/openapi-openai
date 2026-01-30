package model

import play.api.libs.json._

/**
  * The aggregated embeddings usage details of the specific time bucket.
  * @param inputTokens The aggregated number of input tokens used.
  * @param numModelRequests The count of requests made to the model.
  * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  * @param userId When `group_by=user_id`, this field provides the user ID of the grouped usage result.
  * @param apiKeyId When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
  * @param model When `group_by=model`, this field provides the model name of the grouped usage result.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UsageEmbeddingsResult(
  `object`: UsageEmbeddingsResult.Object.Value,
  inputTokens: Int,
  numModelRequests: Int,
  projectId: Option[String],
  userId: Option[String],
  apiKeyId: Option[String],
  model: Option[String]
)

object UsageEmbeddingsResult {
  implicit lazy val usageEmbeddingsResultJsonFormat: Format[UsageEmbeddingsResult] = Json.format[UsageEmbeddingsResult]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val OrganizationUsageEmbeddingsResult = Value("organization.usage.embeddings.result")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

