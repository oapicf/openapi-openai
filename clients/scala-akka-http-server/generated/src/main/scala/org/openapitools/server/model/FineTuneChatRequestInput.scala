package org.openapitools.server.model


/**
 * The per-line training example of a fine-tuning input file for chat models using the supervised method.
 *
 * @param messages  for example: ''null''
 * @param tools A list of tools the model may generate JSON inputs for. for example: ''null''
 * @param parallelToolCalls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. for example: ''null''
 * @param functions A list of functions the model may generate JSON inputs for. for example: ''null''
*/
final case class FineTuneChatRequestInput (
  messages: Option[Seq[FineTuneChatRequestInputMessagesInner]] = None,
  tools: Option[Seq[ChatCompletionTool]] = None,
  parallelToolCalls: Option[Boolean] = None,
  functions: Option[Seq[ChatCompletionFunctions]] = None
)

