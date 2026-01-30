package model

import play.api.libs.json._

/**
  * The aggregated completions usage details of the specific time bucket.
  * @param inputTokens The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.
  * @param inputCachedTokens The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
  * @param outputTokens The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
  * @param inputAudioTokens The aggregated number of audio input tokens used, including cached tokens.
  * @param outputAudioTokens The aggregated number of audio output tokens used.
  * @param numModelRequests The count of requests made to the model.
  * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  * @param userId When `group_by=user_id`, this field provides the user ID of the grouped usage result.
  * @param apiKeyId When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
  * @param model When `group_by=model`, this field provides the model name of the grouped usage result.
  * @param batch When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UsageCompletionsResult(
  `object`: UsageCompletionsResult.Object.Value,
  inputTokens: Int,
  inputCachedTokens: Option[Int],
  outputTokens: Int,
  inputAudioTokens: Option[Int],
  outputAudioTokens: Option[Int],
  numModelRequests: Int,
  projectId: Option[String],
  userId: Option[String],
  apiKeyId: Option[String],
  model: Option[String],
  batch: Option[Boolean]
)

object UsageCompletionsResult {
  implicit lazy val usageCompletionsResultJsonFormat: Format[UsageCompletionsResult] = Json.format[UsageCompletionsResult]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val OrganizationUsageCompletionsResult = Value("organization.usage.completions.result")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

