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

import java.math.BigDecimal
import org.openapitools.client.core.ApiModel

case class CreateCompletionResponseChoicesInnerLogprobs (
  textOffset: Option[Seq[Int]] = None,
  tokenLogprobs: Option[Seq[BigDecimal]] = None,
  tokens: Option[Seq[String]] = None,
  topLogprobs: Option[Seq[Map[String, BigDecimal]]] = None
) extends ApiModel

