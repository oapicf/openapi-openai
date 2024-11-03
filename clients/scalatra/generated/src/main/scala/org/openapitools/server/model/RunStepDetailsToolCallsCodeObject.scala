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

case class RunStepDetailsToolCallsCodeObject(
  /* The ID of the tool call. */
  id: String,

  /* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. */
  `type`: String,

  codeInterpreter: RunStepDetailsToolCallsCodeObjectCodeInterpreter

 )
