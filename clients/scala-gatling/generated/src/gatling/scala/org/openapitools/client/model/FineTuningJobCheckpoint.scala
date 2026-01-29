
package org.openapitools.client.model


case class FineTuningJobCheckpoint (
    /* The checkpoint identifier, which can be referenced in the API endpoints. */
    _id: String,
    /* The Unix timestamp (in seconds) for when the checkpoint was created. */
    _createdAt: Integer,
    /* The name of the fine-tuned checkpoint model that is created. */
    _fineTunedModelCheckpoint: String,
    /* The step number that the checkpoint was created at. */
    _stepNumber: Integer,
    _metrics: FineTuningJobCheckpointMetrics,
    /* The name of the fine-tuning job that this checkpoint was created from. */
    _fineTuningJobId: String,
    /* The object type, which is always \"fine_tuning.job.checkpoint\". */
    _object: String
)
object FineTuningJobCheckpoint {
    def toStringBody(var_id: Object, var_createdAt: Object, var_fineTunedModelCheckpoint: Object, var_stepNumber: Object, var_metrics: Object, var_fineTuningJobId: Object, var_object: Object) =
        s"""
        | {
        | "id":$var_id,"createdAt":$var_createdAt,"fineTunedModelCheckpoint":$var_fineTunedModelCheckpoint,"stepNumber":$var_stepNumber,"metrics":$var_metrics,"fineTuningJobId":$var_fineTuningJobId,"object":$var_object
        | }
        """.stripMargin
}
