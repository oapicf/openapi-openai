package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateFineTuningJobRequest.
  * @param trainingFile The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
  * @param suffix A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`. 
  * @param validationFile The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
  * @param integrations A list of integrations to enable for your fine-tuning job.
  * @param seed The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateFineTuningJobRequest(
  model: CreateFineTuningJobRequestModel,
  trainingFile: String,
  hyperparameters: Option[CreateFineTuningJobRequestHyperparameters],
  suffix: Option[String],
  validationFile: Option[String],
  integrations: Option[List[CreateFineTuningJobRequestIntegrationsInner]],
  seed: Option[Int]
)

object CreateFineTuningJobRequest {
  implicit lazy val createFineTuningJobRequestJsonFormat: Format[CreateFineTuningJobRequest] = Json.format[CreateFineTuningJobRequest]
}

