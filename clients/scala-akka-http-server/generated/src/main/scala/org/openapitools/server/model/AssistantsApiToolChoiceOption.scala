package org.openapitools.server.model


/**
 * Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling one or more tools. `required` means the model must call one or more tools before responding to the user. Specifying a particular tool like `{\"type\": \"file_search\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. 
 *
 * @param `type` The type of the tool. If type is `function`, the function name must be set for example: ''null''
 * @param function  for example: ''null''
*/
final case class AssistantsApiToolChoiceOption (
  `type`: String,
  function: Option[AssistantsNamedToolChoiceFunction] = None
)

