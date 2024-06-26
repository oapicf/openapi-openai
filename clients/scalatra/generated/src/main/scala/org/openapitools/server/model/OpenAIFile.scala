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

case class OpenAIFile(
  /* The file identifier, which can be referenced in the API endpoints. */
  id: String,

  /* The size of the file, in bytes. */
  bytes: Int,

  /* The Unix timestamp (in seconds) for when the file was created. */
  createdAt: Int,

  /* The name of the file. */
  filename: String,

  /* The object type, which is always `file`. */
  `object`: String,

  /* The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`. */
  purpose: String,

  /* Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`. */
  status: String,

  /* Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`. */
  statusDetails: Option[String]

 )
