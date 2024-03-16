package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Model.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class Model(
  id: String,
  `object`: String,
  created: Int,
  ownedBy: String
)

object Model {
  implicit lazy val modelJsonFormat: Format[Model] = Json.format[Model]
}

