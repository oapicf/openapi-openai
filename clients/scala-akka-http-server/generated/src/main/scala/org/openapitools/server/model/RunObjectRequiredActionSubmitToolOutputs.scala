package org.openapitools.server.model


/**
 * Details on the tool outputs needed for this run to continue.
 *
 * @param toolCalls A list of the relevant tool calls. for example: ''null''
*/
final case class RunObjectRequiredActionSubmitToolOutputs (
  toolCalls: Seq[RunToolCallObject]
)

