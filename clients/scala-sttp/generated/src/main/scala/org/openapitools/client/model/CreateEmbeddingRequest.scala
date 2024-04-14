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


case class CreateEmbeddingRequest(
  input: CreateEmbeddingRequestInput,
  model: CreateEmbeddingRequestModel,
  /* The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/). */
  encodingFormat: Option[CreateEmbeddingRequestEnums.EncodingFormat] = None,
  /* The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models.  */
  dimensions: Option[Int] = None,
  /* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  */
  user: Option[String] = None
)

object CreateEmbeddingRequestEnums {

  type EncodingFormat = EncodingFormat.Value
  object EncodingFormat extends Enumeration {
    val Float = Value("float")
    val Base64 = Value("base64")
  }

}
