package model

import play.api.libs.json._

/**
  * The aggregated audio speeches usage details of the specific time bucket.
  * @param characters The number of characters processed.
  * @param numModelRequests The count of requests made to the model.
  * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  * @param userId When `group_by=user_id`, this field provides the user ID of the grouped usage result.
  * @param apiKeyId When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
  * @param model When `group_by=model`, this field provides the model name of the grouped usage result.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UsageAudioSpeechesResult(
  `object`: UsageAudioSpeechesResult.Object.Value,
  characters: Int,
  numModelRequests: Int,
  projectId: Option[String],
  userId: Option[String],
  apiKeyId: Option[String],
  model: Option[String]
)

object UsageAudioSpeechesResult {
  implicit lazy val usageAudioSpeechesResultJsonFormat: Format[UsageAudioSpeechesResult] = Json.format[UsageAudioSpeechesResult]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val OrganizationUsageAudioSpeechesResult = Value("organization.usage.audio_speeches.result")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

