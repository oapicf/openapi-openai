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


case class FineTune(
  id: String,
  `object`: String,
  createdAt: Int,
  updatedAt: Int,
  model: String,
  fineTunedModel: String,
  organizationId: String,
  status: String,
  hyperparams: Any,
  trainingFiles: Seq[OpenAIFile],
  validationFiles: Seq[OpenAIFile],
  resultFiles: Seq[OpenAIFile],
  events: Option[Seq[FineTuneEvent]] = None
)

