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

case class RunObjectLastError(
  /* One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`. */
  code: String,

  /* A human-readable description of the error. */
  message: String

 )