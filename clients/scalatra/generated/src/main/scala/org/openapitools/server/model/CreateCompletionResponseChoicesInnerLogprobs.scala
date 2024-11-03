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

case class CreateCompletionResponseChoicesInnerLogprobs(
  textOffset: Option[List[Int]],

  tokenLogprobs: Option[List[Double]],

  tokens: Option[List[String]],

  topLogprobs: Option[List[Map[String, Double]]]

 )
