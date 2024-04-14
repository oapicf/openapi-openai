package org.openapitools.server.model


/**
 * = Model =
 *
 * Describes an OpenAI model offering that can be used with the API.
 *
 * @param id The model identifier, which can be referenced in the API endpoints. for example: ''null''
 * @param created The Unix timestamp (in seconds) when the model was created. for example: ''null''
 * @param `object` The object type, which is always \"model\". for example: ''null''
 * @param ownedBy The organization that owns the model. for example: ''null''
*/
final case class Model (
  id: String,
  created: Int,
  `object`: String,
  ownedBy: String
)

