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

case class CreateCompletionResponseChoicesInnerLogprobs(
  tokens: Option[List[String]],

  tokenLogprobs: Option[List[Double]],

  topLogprobs: Option[List[Any]],

  textOffset: Option[List[Int]]

 )
