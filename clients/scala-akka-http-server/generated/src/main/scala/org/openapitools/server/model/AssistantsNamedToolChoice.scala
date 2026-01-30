package org.openapitools.server.model


/**
 * Specifies a tool the model should use. Use to force the model to call a specific tool.
 *
 * @param `type` The type of the tool. If type is `function`, the function name must be set for example: ''null''
 * @param function  for example: ''null''
*/
final case class AssistantsNamedToolChoice (
  `type`: String,
  function: Option[AssistantsNamedToolChoiceFunction] = None
)

