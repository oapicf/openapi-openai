package model

import play.api.libs.json._

/**
  * Static predicted output content, such as the content of a text file that is being regenerated. 
  * @param `type` The type of the predicted content you want to provide. This type is currently always `content`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PredictionContent(
  `type`: PredictionContent.Type.Value,
  content: PredictionContentContent
)

object PredictionContent {
  implicit lazy val predictionContentJsonFormat: Format[PredictionContent] = Json.format[PredictionContent]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Content = Value("content")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

