package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateFineTuningJobRequest._

case class CreateFineTuningJobRequest (
  model: CreateFineTuningJobRequestModel,
/* The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.  */
  trainingFile: String,
hyperparameters: Option[CreateFineTuningJobRequestHyperparameters],
/* A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`.  */
  suffix: Option[String],
/* The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.  */
  validationFile: Option[String],
/* A list of integrations to enable for your fine-tuning job. */
  integrations: Option[List[CreateFineTuningJobRequestIntegrationsInner]],
/* The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you.  */
  seed: Option[Integer])

object CreateFineTuningJobRequest {
  import DateTimeCodecs._

  implicit val CreateFineTuningJobRequestCodecJson: CodecJson[CreateFineTuningJobRequest] = CodecJson.derive[CreateFineTuningJobRequest]
  implicit val CreateFineTuningJobRequestDecoder: EntityDecoder[CreateFineTuningJobRequest] = jsonOf[CreateFineTuningJobRequest]
  implicit val CreateFineTuningJobRequestEncoder: EntityEncoder[CreateFineTuningJobRequest] = jsonEncoderOf[CreateFineTuningJobRequest]
}
