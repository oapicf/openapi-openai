package org.openapitools.server.model


/**
 * @param toolCallId The ID of the tool call in the `required_action` object within the run object the output is being submitted for. for example: ''null''
 * @param output The output of the tool call to be submitted to continue the run. for example: ''null''
*/
final case class SubmitToolOutputsRunRequestToolOutputsInner (
  toolCallId: Option[String] = None,
  output: Option[String] = None
)

