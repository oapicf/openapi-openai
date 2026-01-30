
package org.openapitools.client.model


case class FineTuningJob (
    /* The object identifier, which can be referenced in the API endpoints. */
    _id: String,
    /* The Unix timestamp (in seconds) for when the fine-tuning job was created. */
    _createdAt: Integer,
    _error: FineTuningJobError,
    /* The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. */
    _fineTunedModel: String,
    /* The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. */
    _finishedAt: Integer,
    _hyperparameters: FineTuningJobHyperparameters,
    /* The base model that is being fine-tuned. */
    _model: String,
    /* The object type, which is always \"fine_tuning.job\". */
    _object: String,
    /* The organization that owns the fine-tuning job. */
    _organizationId: String,
    /* The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). */
    _resultFiles: List[String],
    /* The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`. */
    _status: String,
    /* The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. */
    _trainedTokens: Integer,
    /* The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). */
    _trainingFile: String,
    /* The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). */
    _validationFile: String,
    /* A list of integrations to enable for this fine-tuning job. */
    _integrations: Option[List[FineTuningJobIntegrationsInner]],
    /* The seed used for the fine-tuning job. */
    _seed: Integer,
    /* The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running. */
    _estimatedFinish: Option[Integer],
    _method: Option[FineTuneMethod]
)
object FineTuningJob {
    def toStringBody(var_id: Object, var_createdAt: Object, var_error: Object, var_fineTunedModel: Object, var_finishedAt: Object, var_hyperparameters: Object, var_model: Object, var_object: Object, var_organizationId: Object, var_resultFiles: Object, var_status: Object, var_trainedTokens: Object, var_trainingFile: Object, var_validationFile: Object, var_integrations: Object, var_seed: Object, var_estimatedFinish: Object, var_method: Object) =
        s"""
        | {
        | "id":$var_id,"createdAt":$var_createdAt,"error":$var_error,"fineTunedModel":$var_fineTunedModel,"finishedAt":$var_finishedAt,"hyperparameters":$var_hyperparameters,"model":$var_model,"object":$var_object,"organizationId":$var_organizationId,"resultFiles":$var_resultFiles,"status":$var_status,"trainedTokens":$var_trainedTokens,"trainingFile":$var_trainingFile,"validationFile":$var_validationFile,"integrations":$var_integrations,"seed":$var_seed,"estimatedFinish":$var_estimatedFinish,"method":$var_method
        | }
        """.stripMargin
}
