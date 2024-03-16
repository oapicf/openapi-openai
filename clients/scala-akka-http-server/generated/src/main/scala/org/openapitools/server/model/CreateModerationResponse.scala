package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param model  for example: ''null''
 * @param results  for example: ''null''
*/
final case class CreateModerationResponse (
  id: String,
  model: String,
  results: Seq[CreateModerationResponseResultsInner]
)

