package model

import play.api.libs.json._

/**
  * Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like `{\"type\": \"TOOL_TYPE\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. 
  * @param `type` The type of the tool. If type is `function`, the function name must be set
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AssistantsApiToolChoiceOption(
  `type`: AssistantsApiToolChoiceOption.Type.Value,
  function: Option[ChatCompletionNamedToolChoiceFunction]
)

object AssistantsApiToolChoiceOption {
  implicit lazy val assistantsApiToolChoiceOptionJsonFormat: Format[AssistantsApiToolChoiceOption] = Json.format[AssistantsApiToolChoiceOption]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Function = Value("function")
    val CodeInterpreter = Value("code_interpreter")
    val Retrieval = Value("retrieval")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

