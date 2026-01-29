package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for FunctionObject.
  * @param description A description of what the function does, used by the model to choose when and how to call the function.
  * @param name The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
  * @param parameters The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class FunctionObject(
  description: Option[String],
  name: String,
  parameters: Option[Map[String, OasAnyTypeNotMapped]],
)

object FunctionObject {
  implicit lazy val functionObjectJsonFormat: Format[FunctionObject] = Json.format[FunctionObject]
}

