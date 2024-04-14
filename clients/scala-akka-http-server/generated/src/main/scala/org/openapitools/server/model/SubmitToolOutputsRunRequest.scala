package org.openapitools.server.model


/**
 * @param toolOutputs A list of tools for which the outputs are being submitted. for example: ''null''
 * @param stream If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message.  for example: ''null''
*/
final case class SubmitToolOutputsRunRequest (
  toolOutputs: Seq[SubmitToolOutputsRunRequestToolOutputsInner],
  stream: Option[Boolean] = None
)

