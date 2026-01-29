package org.openapitools.server.model


/**
 * = Code interpreter log output =
 *
 * Text output from the Code Interpreter tool call as part of a run step.
 *
 * @param `type` Always `logs`. for example: ''null''
 * @param logs The text output from the Code Interpreter tool call. for example: ''null''
*/
final case class RunStepDetailsToolCallsCodeOutputLogsObject (
  `type`: String,
  logs: String
)

