package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for FunctionObject.
  * @param description A description of what the function does, used by the model to choose when and how to call the function.
  * @param name The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
  * @param parameters The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.
  * @param strict Whether to enable strict schema adherence when generating the function call. If set to true, the model will follow the exact schema defined in the `parameters` field. Only a subset of JSON Schema is supported when `strict` is `true`. Learn more about Structured Outputs in the [function calling guide](docs/guides/function-calling).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class FunctionObject(
  description: Option[String],
  name: String,
  parameters: Option[Map[String, OasAnyTypeNotMapped]],
  strict: Option[Boolean]
)

object FunctionObject {
  implicit lazy val functionObjectJsonFormat: Format[FunctionObject] = Json.format[FunctionObject]
}

