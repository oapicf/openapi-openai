package org.openapitools.server.model


/**
 * Represents if a given text input is potentially harmful.
 *
 * @param id The unique identifier for the moderation request. for example: ''null''
 * @param model The model used to generate the moderation results. for example: ''null''
 * @param results A list of moderation objects. for example: ''null''
*/
final case class CreateModerationResponse (
  id: String,
  model: String,
  results: Seq[CreateModerationResponseResultsInner]
)

