package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UsageTimeBucket_result_inner.
  * @param inputTokens The aggregated number of input tokens used.
  * @param inputCachedTokens The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
  * @param outputTokens The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
  * @param inputAudioTokens The aggregated number of audio input tokens used, including cached tokens.
  * @param outputAudioTokens The aggregated number of audio output tokens used.
  * @param numModelRequests The count of requests made to the model.
  * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped costs result.
  * @param userId When `group_by=user_id`, this field provides the user ID of the grouped usage result.
  * @param apiKeyId When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
  * @param model When `group_by=model`, this field provides the model name of the grouped usage result.
  * @param batch When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
  * @param images The number of images processed.
  * @param source When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
  * @param size When `group_by=size`, this field provides the image size of the grouped usage result.
  * @param characters The number of characters processed.
  * @param seconds The number of seconds processed.
  * @param usageBytes The vector stores usage in bytes.
  * @param sessions The number of code interpreter sessions.
  * @param lineItem When `group_by=line_item`, this field provides the line item of the grouped costs result.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UsageTimeBucketResultInner(
  `object`: UsageTimeBucketResultInner.Object.Value,
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
  batch: Option[Boolean],
  images: Int,
  source: Option[String],
  size: Option[String],
  characters: Int,
  seconds: Int,
  usageBytes: Int,
  sessions: Int,
  amount: Option[CostsResultAmount],
  lineItem: Option[String]
)

object UsageTimeBucketResultInner {
  implicit lazy val usageTimeBucketResultInnerJsonFormat: Format[UsageTimeBucketResultInner] = Json.format[UsageTimeBucketResultInner]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val OrganizationCostsResult = Value("organization.costs.result")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

