package org.openapitools.server.model


/**
 * @param messages  for example: ''null''
 * @param tools A list of tools the model may generate JSON inputs for. for example: ''null''
 * @param parallelToolCalls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. for example: ''null''
*/
final case class FineTunePreferenceRequestInputInput (
  messages: Option[Seq[FineTuneChatRequestInputMessagesInner]] = None,
  tools: Option[Seq[ChatCompletionTool]] = None,
  parallelToolCalls: Option[Boolean] = None
)

