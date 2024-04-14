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


case class AssistantObjectToolsInner(
  /* The type of tool being defined: `code_interpreter` */
  `type`: AssistantObjectToolsInnerEnums.`Type`,
  function: FunctionObject
)

object AssistantObjectToolsInnerEnums {

  type `Type` = `Type`.Value
  object `Type` extends Enumeration {
    val CodeInterpreter = Value("code_interpreter")
    val Retrieval = Value("retrieval")
    val Function = Value("function")
  }

}
