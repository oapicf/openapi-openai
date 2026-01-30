package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateAssistantRequest.
  * @param name The name of the assistant. The maximum length is 256 characters. 
  * @param description The description of the assistant. The maximum length is 512 characters. 
  * @param instructions The system instructions that the assistant uses. The maximum length is 256,000 characters. 
  * @param tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
  * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  * @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
  * @param topP An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateAssistantRequest(
  model: CreateAssistantRequestModel,
  name: Option[String],
  description: Option[String],
  instructions: Option[String],
  tools: Option[List[AssistantObjectToolsInner]],
  toolResources: Option[CreateAssistantRequestToolResources],
  metadata: Option[JsObject],
  temperature: Option[BigDecimal],
  topP: Option[BigDecimal],
  responseFormat: Option[AssistantsApiResponseFormatOption]
)

object CreateAssistantRequest {
  implicit lazy val createAssistantRequestJsonFormat: Format[CreateAssistantRequest] = Json.format[CreateAssistantRequest]
}

