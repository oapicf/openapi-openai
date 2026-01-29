package org.openapitools.server.model


/**
 * Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
 *
 * @param id A unique identifier for the completion. for example: ''null''
 * @param choices The list of completion choices the model generated for the input prompt. for example: ''null''
 * @param created The Unix timestamp (in seconds) of when the completion was created. for example: ''null''
 * @param model The model used for completion. for example: ''null''
 * @param systemFingerprint This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  for example: ''null''
 * @param `object` The object type, which is always \"text_completion\" for example: ''null''
 * @param usage  for example: ''null''
*/
final case class CreateCompletionResponse (
  id: String,
  choices: Seq[CreateCompletionResponseChoicesInner],
  created: Int,
  model: String,
  systemFingerprint: Option[String] = None,
  `object`: String,
  usage: Option[CompletionUsage] = None
)

