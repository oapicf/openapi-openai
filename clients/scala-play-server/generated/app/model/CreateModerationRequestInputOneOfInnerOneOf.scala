package model

import play.api.libs.json._

/**
  * An object describing an image to classify.
  * @param `type` Always `image_url`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateModerationRequestInputOneOfInnerOneOf(
  `type`: CreateModerationRequestInputOneOfInnerOneOf.Type.Value,
  imageUrl: CreateModerationRequestInputOneOfInnerOneOfImageUrl
)

object CreateModerationRequestInputOneOfInnerOneOf {
  implicit lazy val createModerationRequestInputOneOfInnerOneOfJsonFormat: Format[CreateModerationRequestInputOneOfInnerOneOf] = Json.format[CreateModerationRequestInputOneOfInnerOneOf]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ImageUrl = Value("image_url")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

