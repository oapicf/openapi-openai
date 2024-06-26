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
   * Specifies a tool the model should use. Use to force the model to call a specific tool.
   */
case class AssistantsApiNamedToolChoice(
  /* The type of the tool. If type is `function`, the function name must be set */
  `type`: AssistantsApiNamedToolChoiceEnums.`Type`,
  function: Option[ChatCompletionNamedToolChoiceFunction] = None
)

object AssistantsApiNamedToolChoiceEnums {

  type `Type` = `Type`.Value
  object `Type` extends Enumeration {
    val Function = Value("function")
    val CodeInterpreter = Value("code_interpreter")
    val Retrieval = Value("retrieval")
  }

}
