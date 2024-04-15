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

case class MessageFileObject(
  /* The identifier, which can be referenced in API endpoints. */
  id: String,

  /* The object type, which is always `thread.message.file`. */
  `object`: String,

  /* The Unix timestamp (in seconds) for when the message file was created. */
  createdAt: Int,

  /* The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to. */
  messageId: String

 )