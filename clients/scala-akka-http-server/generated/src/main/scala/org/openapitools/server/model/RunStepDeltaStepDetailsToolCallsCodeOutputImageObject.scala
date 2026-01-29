package org.openapitools.server.model


/**
 * = Code interpreter image output =
 *
 * @param index The index of the output in the outputs array. for example: ''null''
 * @param `type` Always `image`. for example: ''null''
 * @param image  for example: ''null''
*/
final case class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject (
  index: Int,
  `type`: String,
  image: Option[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage] = None
)

