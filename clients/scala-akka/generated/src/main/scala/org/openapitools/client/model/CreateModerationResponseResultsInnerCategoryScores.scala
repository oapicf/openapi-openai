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

case class CreateModerationResponseResultsInnerCategoryScores (
  /* The score for the category 'hate'. */
  hate: BigDecimal,
  /* The score for the category 'hate/threatening'. */
  hateThreatening: BigDecimal,
  /* The score for the category 'harassment'. */
  harassment: BigDecimal,
  /* The score for the category 'harassment/threatening'. */
  harassmentThreatening: BigDecimal,
  /* The score for the category 'self-harm'. */
  selfHarm: BigDecimal,
  /* The score for the category 'self-harm/intent'. */
  selfHarmIntent: BigDecimal,
  /* The score for the category 'self-harm/instructions'. */
  selfHarmInstructions: BigDecimal,
  /* The score for the category 'sexual'. */
  sexual: BigDecimal,
  /* The score for the category 'sexual/minors'. */
  sexualMinors: BigDecimal,
  /* The score for the category 'violence'. */
  violence: BigDecimal,
  /* The score for the category 'violence/graphic'. */
  violenceGraphic: BigDecimal
) extends ApiModel

