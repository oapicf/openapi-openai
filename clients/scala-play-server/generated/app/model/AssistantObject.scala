package model

import play.api.libs.json._

/**
  * Represents an `assistant` that can call the model and use tools.
  * @param id The identifier, which can be referenced in API endpoints.
  * @param `object` The object type, which is always `assistant`.
  * @param createdAt The Unix timestamp (in seconds) for when the assistant was created.
  * @param name The name of the assistant. The maximum length is 256 characters. 
  * @param description The description of the assistant. The maximum length is 512 characters. 
  * @param model ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
  * @param instructions The system instructions that the assistant uses. The maximum length is 256,000 characters. 
  * @param tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
  * @param fileIds A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
  * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AssistantObject(
  id: String,
  `object`: AssistantObject.Object.Value,
  createdAt: Int,
  name: String,
  description: String,
  model: String,
  instructions: String,
  tools: List[AssistantObjectToolsInner],
  fileIds: List[String],
  metadata: JsObject
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

