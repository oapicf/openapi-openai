package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateModerationRequest_input_oneOf_inner.
  * @param `type` Always `image_url`.
  * @param text A string of text to classify.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CreateModerationRequestInputOneOfInner(
  `type`: CreateModerationRequestInputOneOfInner.Type.Value,
  imageUrl: CreateModerationRequestInputOneOfInnerOneOfImageUrl,
  text: String
)

object CreateModerationRequestInputOneOfInner {
  implicit lazy val createModerationRequestInputOneOfInnerJsonFormat: Format[CreateModerationRequestInputOneOfInner] = Json.format[CreateModerationRequestInputOneOfInner]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ImageUrl = Value("image_url")
    val Text = Value("text")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

