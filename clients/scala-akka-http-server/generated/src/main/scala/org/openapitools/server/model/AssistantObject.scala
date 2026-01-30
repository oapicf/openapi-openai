package org.openapitools.server.model


/**
 * = Assistant =
 *
 * Represents an `assistant` that can call the model and use tools.
 *
 * @param id The identifier, which can be referenced in API endpoints. for example: ''null''
 * @param `object` The object type, which is always `assistant`. for example: ''null''
 * @param createdAt The Unix timestamp (in seconds) for when the assistant was created. for example: ''null''
 * @param name The name of the assistant. The maximum length is 256 characters.  for example: ''null''
 * @param description The description of the assistant. The maximum length is 512 characters.  for example: ''null''
 * @param model ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them.  for example: ''null''
 * @param instructions The system instructions that the assistant uses. The maximum length is 256,000 characters.  for example: ''null''
 * @param tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`.  for example: ''null''
 * @param toolResources  for example: ''null''
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  for example: ''null''
 * @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  for example: ''1''
 * @param topP An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  for example: ''1''
 * @param responseFormat  for example: ''null''
*/
final case class AssistantObject (
  id: String,
  `object`: String,
  createdAt: Int,
  name: String,
  description: String,
  model: String,
  instructions: String,
  tools: Seq[AssistantObjectToolsInner],
  toolResources: Option[AssistantObjectToolResources] = None,
  metadata: Any,
  temperature: Option[Double] = None,
  topP: Option[Double] = None,
  responseFormat: Option[AssistantsApiResponseFormatOption] = None
)

