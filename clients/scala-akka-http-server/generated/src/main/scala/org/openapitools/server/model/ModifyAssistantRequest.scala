package org.openapitools.server.model


/**
 * @param model  for example: ''null''
 * @param name The name of the assistant. The maximum length is 256 characters.  for example: ''null''
 * @param description The description of the assistant. The maximum length is 512 characters.  for example: ''null''
 * @param instructions The system instructions that the assistant uses. The maximum length is 256,000 characters.  for example: ''null''
 * @param tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`.  for example: ''null''
 * @param toolResources  for example: ''null''
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  for example: ''null''
 * @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  for example: ''1''
 * @param topP An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  for example: ''1''
 * @param responseFormat  for example: ''null''
*/
final case class ModifyAssistantRequest (
  model: Option[String] = None,
  name: Option[String] = None,
  description: Option[String] = None,
  instructions: Option[String] = None,
  tools: Option[Seq[AssistantObjectToolsInner]] = None,
  toolResources: Option[ModifyAssistantRequestToolResources] = None,
  metadata: Option[Any] = None,
  temperature: Option[Double] = None,
  topP: Option[Double] = None,
  responseFormat: Option[AssistantsApiResponseFormatOption] = None
)

