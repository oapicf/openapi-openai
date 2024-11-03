package org.openapitools.server.model


/**
 * Details on the action required to continue the run. Will be `null` if no action is required.
 *
 * @param `type` For now, this is always `submit_tool_outputs`. for example: ''null''
 * @param submitToolOutputs  for example: ''null''
*/
final case class RunObjectRequiredAction (
  `type`: String,
  submitToolOutputs: RunObjectRequiredActionSubmitToolOutputs
)

