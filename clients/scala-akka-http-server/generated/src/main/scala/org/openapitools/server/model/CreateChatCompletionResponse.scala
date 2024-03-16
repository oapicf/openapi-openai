package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param `object`  for example: ''null''
 * @param created  for example: ''null''
 * @param model  for example: ''null''
 * @param choices  for example: ''null''
 * @param usage  for example: ''null''
*/
final case class CreateChatCompletionResponse (
  id: String,
  `object`: String,
  created: Int,
  model: String,
  choices: Seq[CreateChatCompletionResponseChoicesInner],
  usage: Option[CreateCompletionResponseUsage] = None
)

