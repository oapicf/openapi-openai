package model

import play.api.libs.json._

/**
  * Describes an OpenAI model offering that can be used with the API.
  * @param id The model identifier, which can be referenced in the API endpoints.
  * @param created The Unix timestamp (in seconds) when the model was created.
  * @param `object` The object type, which is always \"model\".
  * @param ownedBy The organization that owns the model.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class Model(
  id: String,
  created: Int,
  `object`: Model.Object.Value,
  ownedBy: String
)

object Model {
  implicit lazy val modelJsonFormat: Format[Model] = Json.format[Model]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val Model = Value("model")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

