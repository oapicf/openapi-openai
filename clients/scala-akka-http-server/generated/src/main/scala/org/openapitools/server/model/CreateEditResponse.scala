package org.openapitools.server.model


/**
 * @param `object`  for example: ''null''
 * @param created  for example: ''null''
 * @param choices  for example: ''null''
 * @param usage  for example: ''null''
*/
final case class CreateEditResponse (
  `object`: String,
  created: Int,
  choices: Seq[CreateEditResponseChoicesInner],
  usage: CreateCompletionResponseUsage
)

