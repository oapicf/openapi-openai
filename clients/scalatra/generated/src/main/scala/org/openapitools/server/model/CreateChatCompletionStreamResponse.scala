/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model

case class CreateChatCompletionStreamResponse(
  id: String,

  `object`: String,

  created: Int,

  model: String,

  choices: List[CreateChatCompletionStreamResponseChoicesInner]

 )
