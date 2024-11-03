package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateFineTuningJobRequestHyperparameters
import org.openapitools.models.CreateFineTuningJobRequestIntegrationsInner
import org.openapitools.models.CreateFineTuningJobRequestModel
import scala.collection.immutable.Seq

/**
 * 
 * @param model 
 * @param trainingUnderscorefile The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
 * @param hyperparameters 
 * @param suffix A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`. 
 * @param validationUnderscorefile The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
 * @param integrations A list of integrations to enable for your fine-tuning job.
 * @param seed The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
 */
case class CreateFineTuningJobRequest(model: CreateFineTuningJobRequestModel,
                trainingUnderscorefile: String,
                hyperparameters: Option[CreateFineTuningJobRequestHyperparameters],
                suffix: Option[String],
                validationUnderscorefile: Option[String],
                integrations: Option[Seq[CreateFineTuningJobRequestIntegrationsInner]],
                seed: Option[Int]
                )

object CreateFineTuningJobRequest {
    /**
     * Creates the codec for converting CreateFineTuningJobRequest from and to JSON.
     */
    implicit val decoder: Decoder[CreateFineTuningJobRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateFineTuningJobRequest] = deriveEncoder
}
