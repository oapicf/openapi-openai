package org.openapitools.server.model


/**
 * Represents a chat completion response returned by model, based on the provided input.
 *
 * @param id A unique identifier for the chat completion. for example: ''null''
 * @param choices A list of chat completion choices. Can be more than one if `n` is greater than 1. for example: ''null''
 * @param created The Unix timestamp (in seconds) of when the chat completion was created. for example: ''null''
 * @param model The model used for the chat completion. for example: ''null''
 * @param systemFingerprint This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  for example: ''null''
 * @param `object` The object type, which is always `chat.completion`. for example: ''null''
 * @param usage  for example: ''null''
*/
final case class CreateChatCompletionFunctionResponse (
  id: String,
  choices: Seq[CreateChatCompletionFunctionResponseChoicesInner],
  created: Int,
  model: String,
  systemFingerprint: Option[String] = None,
  `object`: String,
  usage: Option[CompletionUsage] = None
)

