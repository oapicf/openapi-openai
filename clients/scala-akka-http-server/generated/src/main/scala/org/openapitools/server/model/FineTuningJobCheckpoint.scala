package org.openapitools.server.model


/**
 * = FineTuningJobCheckpoint =
 *
 * The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. 
 *
 * @param id The checkpoint identifier, which can be referenced in the API endpoints. for example: ''null''
 * @param createdAt The Unix timestamp (in seconds) for when the checkpoint was created. for example: ''null''
 * @param fineTunedModelCheckpoint The name of the fine-tuned checkpoint model that is created. for example: ''null''
 * @param stepNumber The step number that the checkpoint was created at. for example: ''null''
 * @param metrics  for example: ''null''
 * @param fineTuningJobId The name of the fine-tuning job that this checkpoint was created from. for example: ''null''
 * @param `object` The object type, which is always \"fine_tuning.job.checkpoint\". for example: ''null''
*/
final case class FineTuningJobCheckpoint (
  id: String,
  createdAt: Int,
  fineTunedModelCheckpoint: String,
  stepNumber: Int,
  metrics: FineTuningJobCheckpointMetrics,
  fineTuningJobId: String,
  `object`: String
)

