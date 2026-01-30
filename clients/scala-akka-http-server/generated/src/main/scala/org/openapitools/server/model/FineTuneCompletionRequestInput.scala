package org.openapitools.server.model


/**
 * The per-line training example of a fine-tuning input file for completions models
 *
 * @param prompt The input prompt for this training example. for example: ''null''
 * @param completion The desired completion for this training example. for example: ''null''
*/
final case class FineTuneCompletionRequestInput (
  prompt: Option[String] = None,
  completion: Option[String] = None
)

