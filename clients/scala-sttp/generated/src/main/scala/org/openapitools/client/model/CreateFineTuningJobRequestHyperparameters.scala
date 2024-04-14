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


  /**
   * The hyperparameters used for the fine-tuning job.
   */
case class CreateFineTuningJobRequestHyperparameters(
  batchSize: Option[CreateFineTuningJobRequestHyperparametersBatchSize] = None,
  learningRateMultiplier: Option[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier] = None,
  nEpochs: Option[CreateFineTuningJobRequestHyperparametersNEpochs] = None
)

