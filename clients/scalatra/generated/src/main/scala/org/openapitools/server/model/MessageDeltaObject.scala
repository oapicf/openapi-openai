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

case class MessageDeltaObject(
  /* The identifier of the message, which can be referenced in API endpoints. */
  id: String,

  /* The object type, which is always `thread.message.delta`. */
  `object`: String,

  delta: MessageDeltaObjectDelta

 )
