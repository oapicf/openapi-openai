package model

import play.api.libs.json._

/**
  * ID of the model to use. You can use the `text-davinci-edit-001` or `code-davinci-edit-001` model with this endpoint.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateEditRequestModel(
)

object CreateEditRequestModel {
  implicit lazy val createEditRequestModelJsonFormat: Format[CreateEditRequestModel] = Json.format[CreateEditRequestModel]
}

