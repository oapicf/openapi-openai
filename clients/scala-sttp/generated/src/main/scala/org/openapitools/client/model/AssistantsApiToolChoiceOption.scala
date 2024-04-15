/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model


  /**
   * Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like `{\"type\": \"TOOL_TYPE\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. 
   */
case class AssistantsApiToolChoiceOption(
  /* The type of the tool. If type is `function`, the function name must be set */
  `type`: AssistantsApiToolChoiceOptionEnums.`Type`,
  function: Option[ChatCompletionNamedToolChoiceFunction] = None
)

object AssistantsApiToolChoiceOptionEnums {

  type `Type` = `Type`.Value
  object `Type` extends Enumeration {
    val Function = Value("function")
    val CodeInterpreter = Value("code_interpreter")
    val Retrieval = Value("retrieval")
  }

}