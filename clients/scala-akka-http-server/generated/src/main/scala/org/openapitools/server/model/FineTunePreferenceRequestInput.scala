package org.openapitools.server.model


/**
 * The per-line training example of a fine-tuning input file for chat models using the dpo method.
 *
 * @param input  for example: ''null''
 * @param preferredCompletion The preferred completion message for the output. for example: ''null''
 * @param nonPreferredCompletion The non-preferred completion message for the output. for example: ''null''
*/
final case class FineTunePreferenceRequestInput (
  input: Option[FineTunePreferenceRequestInputInput] = None,
  preferredCompletion: Option[Seq[FineTunePreferenceRequestInputPreferredCompletionInner]] = None,
  nonPreferredCompletion: Option[Seq[FineTunePreferenceRequestInputPreferredCompletionInner]] = None
)

