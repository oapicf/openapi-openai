/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model


case class CreateCompletionResponseChoicesInnerLogprobs(
  tokens: Option[Seq[String]] = None,
  tokenLogprobs: Option[Seq[Double]] = None,
  topLogprobs: Option[Seq[Any]] = None,
  textOffset: Option[Seq[Int]] = None
)
