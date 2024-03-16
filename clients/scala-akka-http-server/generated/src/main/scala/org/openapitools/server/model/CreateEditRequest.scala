package org.openapitools.server.model


/**
 * @param model  for example: ''null''
 * @param input The input text to use as a starting point for the edit. for example: ''What day of the wek is it?''
 * @param instruction The instruction that tells the model how to edit the prompt. for example: ''Fix the spelling mistakes.''
 * @param n How many edits to generate for the input and instruction. for example: ''1''
 * @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both.  for example: ''1''
 * @param topP An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both.  for example: ''1''
*/
final case class CreateEditRequest (
  model: CreateEditRequestModel,
  input: Option[String] = None,
  instruction: String,
  n: Option[Int] = None,
  temperature: Option[Double] = None,
  topP: Option[Double] = None
)

