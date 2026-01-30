package model

import play.api.libs.json._

/**
  * The aggregated images usage details of the specific time bucket.
  * @param images The number of images processed.
  * @param numModelRequests The count of requests made to the model.
  * @param source When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
  * @param size When `group_by=size`, this field provides the image size of the grouped usage result.
  * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  * @param userId When `group_by=user_id`, this field provides the user ID of the grouped usage result.
  * @param apiKeyId When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
  * @param model When `group_by=model`, this field provides the model name of the grouped usage result.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UsageImagesResult(
  `object`: UsageImagesResult.Object.Value,
  images: Int,
  numModelRequests: Int,
  source: Option[String],
  size: Option[String],
  projectId: Option[String],
  userId: Option[String],
  apiKeyId: Option[String],
  model: Option[String]
)

object UsageImagesResult {
  implicit lazy val usageImagesResultJsonFormat: Format[UsageImagesResult] = Json.format[UsageImagesResult]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val OrganizationUsageImagesResult = Value("organization.usage.images.result")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

