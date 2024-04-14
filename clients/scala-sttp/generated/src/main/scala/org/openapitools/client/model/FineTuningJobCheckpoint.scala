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
   * FineTuningJobCheckpoint
   * The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. 
   */
case class FineTuningJobCheckpoint(
  /* The checkpoint identifier, which can be referenced in the API endpoints. */
  id: String,
  /* The Unix timestamp (in seconds) for when the checkpoint was created. */
  createdAt: Int,
  /* The name of the fine-tuned checkpoint model that is created. */
  fineTunedModelCheckpoint: String,
  /* The step number that the checkpoint was created at. */
  stepNumber: Int,
  metrics: FineTuningJobCheckpointMetrics,
  /* The name of the fine-tuning job that this checkpoint was created from. */
  fineTuningJobId: String,
  /* The object type, which is always \"fine_tuning.job.checkpoint\". */
  `object`: FineTuningJobCheckpointEnums.`Object`
)

object FineTuningJobCheckpointEnums {

  type `Object` = `Object`.Value
  object `Object` extends Enumeration {
    val FineTuningJobCheckpoint = Value("fine_tuning.job.checkpoint")
  }

}
