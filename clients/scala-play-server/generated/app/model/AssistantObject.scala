package model

import play.api.libs.json._

/**
  * Represents an `assistant` that can call the model and use tools.
  * @param id The identifier, which can be referenced in API endpoints.
  * @param `object` The object type, which is always `assistant`.
  * @param createdAt The Unix timestamp (in seconds) for when the assistant was created.
  * @param name The name of the assistant. The maximum length is 256 characters. 
  * @param description The description of the assistant. The maximum length is 512 characters. 
  * @param model ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
  * @param instructions The system instructions that the assistant uses. The maximum length is 256,000 characters. 
  * @param tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
  * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  * @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
  * @param topP An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AssistantObject(
  id: String,
  `object`: AssistantObject.Object.Value,
  createdAt: Int,
  name: String,
  description: String,
  model: String,
  instructions: String,
  tools: List[AssistantObjectToolsInner],
  toolResources: Option[AssistantObjectToolResources],
  metadata: JsObject,
  temperature: Option[BigDecimal],
  topP: Option[BigDecimal],
  responseFormat: Option[AssistantsApiResponseFormatOption]
)

object AssistantObject {
  implicit lazy val assistantObjectJsonFormat: Format[AssistantObject] = Json.format[AssistantObject]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val Assistant = Value("assistant")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

