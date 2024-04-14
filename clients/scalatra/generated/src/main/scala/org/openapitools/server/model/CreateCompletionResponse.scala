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

case class CreateCompletionResponse(
  /* A unique identifier for the completion. */
  id: String,

  /* The list of completion choices the model generated for the input prompt. */
  choices: List[CreateCompletionResponseChoicesInner],

  /* The Unix timestamp (in seconds) of when the completion was created. */
  created: Int,

  /* The model used for completion. */
  model: String,

  /* This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  */
  systemFingerprint: Option[String],

  /* The object type, which is always \"text_completion\" */
  `object`: String,

  usage: Option[CompletionUsage]

 )
