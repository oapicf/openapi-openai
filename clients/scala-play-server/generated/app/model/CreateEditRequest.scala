package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateEditRequest.
  * @param input The input text to use as a starting point for the edit.
  * @param instruction The instruction that tells the model how to edit the prompt.
  * @param n How many edits to generate for the input and instruction.
  * @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
  * @param topP An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateEditRequest(
  model: CreateEditRequestModel,
  input: Option[String],
  instruction: String,
  n: Option[Int],
  temperature: Option[BigDecimal],
  topP: Option[BigDecimal]
)

object CreateEditRequest {
  implicit lazy val createEditRequestJsonFormat: Format[CreateEditRequest] = Json.format[CreateEditRequest]
}

