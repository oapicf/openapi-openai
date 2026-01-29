package org.openapitools.server.model


/**
 * The definition of the function that was called.
 *
 * @param name The name of the function. for example: ''null''
 * @param arguments The arguments passed to the function. for example: ''null''
 * @param output The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet. for example: ''null''
*/
final case class RunStepDeltaStepDetailsToolCallsFunctionObjectFunction (
  name: Option[String] = None,
  arguments: Option[String] = None,
  output: Option[String] = None
)

