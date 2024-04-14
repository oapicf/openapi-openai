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

case class CreateEmbeddingResponse(
  /* The list of embeddings generated by the model. */
  data: List[Embedding],

  /* The name of the model used to generate the embedding. */
  model: String,

  /* The object type, which is always \"list\". */
  `object`: String,

  usage: CreateEmbeddingResponseUsage

 )
