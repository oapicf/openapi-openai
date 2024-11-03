package org.openapitools.server.model


/**
 * Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be called, as generated by the model.
 *
 * @param arguments The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function. for example: ''null''
 * @param name The name of the function to call. for example: ''null''
*/
final case class ChatCompletionRequestAssistantMessageFunctionCall (
  arguments: String,
  name: String
)

