package org.openapitools.server.model


/**
 * @param input  for example: ''null''
 * @param model  for example: ''null''
*/
final case class CreateModerationRequest (
  input: CreateModerationRequestInput,
  model: Option[CreateModerationRequestModel] = None
)

