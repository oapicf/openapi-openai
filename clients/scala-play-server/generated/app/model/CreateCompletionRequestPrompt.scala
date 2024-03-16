package model

import play.api.libs.json._

/**
  * The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that <|endoftext|> is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateCompletionRequestPrompt(
)

object CreateCompletionRequestPrompt {
  implicit lazy val createCompletionRequestPromptJsonFormat: Format[CreateCompletionRequestPrompt] = Json.format[CreateCompletionRequestPrompt]
}

