package model

import play.api.libs.json._

/**
  * The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. 
  * @param id The checkpoint identifier, which can be referenced in the API endpoints.
  * @param createdAt The Unix timestamp (in seconds) for when the checkpoint was created.
  * @param fineTunedModelCheckpoint The name of the fine-tuned checkpoint model that is created.
  * @param stepNumber The step number that the checkpoint was created at.
  * @param fineTuningJobId The name of the fine-tuning job that this checkpoint was created from.
  * @param `object` The object type, which is always \"fine_tuning.job.checkpoint\".
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class FineTuningJobCheckpoint(
  id: String,
  createdAt: Int,
  fineTunedModelCheckpoint: String,
  stepNumber: Int,
  metrics: FineTuningJobCheckpointMetrics,
  fineTuningJobId: String,
  `object`: FineTuningJobCheckpoint.Object.Value
)

object FineTuningJobCheckpoint {
  implicit lazy val fineTuningJobCheckpointJsonFormat: Format[FineTuningJobCheckpoint] = Json.format[FineTuningJobCheckpoint]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val FineTuningJobCheckpoint = Value("fine_tuning.job.checkpoint")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

