package org.openapitools.server.model


/**
 * An object describing the expected output of the model. If `json_object` only `function` type `tools` are allowed to be passed to the Run. If `text` the model can return text or any value needed. 
 *
 * @param `type` Must be one of `text` or `json_object`. for example: ''json_object''
*/
final case class AssistantsApiResponseFormat (
  `type`: Option[String] = None
)

