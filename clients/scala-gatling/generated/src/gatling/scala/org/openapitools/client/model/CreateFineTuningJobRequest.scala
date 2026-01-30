
package org.openapitools.client.model


case class CreateFineTuningJobRequest (
    _model: CreateFineTuningJobRequestModel,
    /* The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  The contents of the file should differ depending on if the model uses the [chat](/docs/api-reference/fine-tuning/chat-input), [completions](/docs/api-reference/fine-tuning/completions-input) format, or if the fine-tuning method uses the [preference](/docs/api-reference/fine-tuning/preference-input) format.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.  */
    _trainingFile: String,
    _hyperparameters: Option[CreateFineTuningJobRequestHyperparameters],
    /* A string of up to 64 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-4o-mini:openai:custom-model-name:7p4lURel`.  */
    _suffix: Option[String],
    /* The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.  */
    _validationFile: Option[String],
    /* A list of integrations to enable for your fine-tuning job. */
    _integrations: Option[List[CreateFineTuningJobRequestIntegrationsInner]],
    /* The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you.  */
    _seed: Option[Integer],
    _method: Option[FineTuneMethod]
)
object CreateFineTuningJobRequest {
    def toStringBody(var_model: Object, var_trainingFile: Object, var_hyperparameters: Object, var_suffix: Object, var_validationFile: Object, var_integrations: Object, var_seed: Object, var_method: Object) =
        s"""
        | {
        | "model":$var_model,"trainingFile":$var_trainingFile,"hyperparameters":$var_hyperparameters,"suffix":$var_suffix,"validationFile":$var_validationFile,"integrations":$var_integrations,"seed":$var_seed,"method":$var_method
        | }
        """.stripMargin
}
