/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model

case class RunStepDeltaStepDetailsToolCallsObjectToolCallsInner(
  /* The index of the tool call in the tool calls array. */
  index: Int,

  /* The ID of the tool call object. */
  id: Option[String],

  /* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. */
  `type`: String,

  codeInterpreter: Option[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter],

  /* For now, this is always going to be an empty object. */
  retrieval: Option[Any],

  function: Option[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction]

 )
