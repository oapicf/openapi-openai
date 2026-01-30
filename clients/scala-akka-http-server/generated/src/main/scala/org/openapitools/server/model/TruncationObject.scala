package org.openapitools.server.model


/**
 * = Thread Truncation Controls =
 *
 * Controls for how a thread will be truncated prior to the run. Use this to control the intial context window of the run.
 *
 * @param `type` The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`. for example: ''null''
 * @param lastMessages The number of most recent messages from the thread when constructing the context for the run. for example: ''null''
*/
final case class TruncationObject (
  `type`: String,
  lastMessages: Option[Int] = None
)

