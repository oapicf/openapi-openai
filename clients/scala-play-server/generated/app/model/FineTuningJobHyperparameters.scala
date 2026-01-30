package model

import play.api.libs.json._

/**
  * The hyperparameters used for the fine-tuning job. This value will only be returned when running `supervised` jobs.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class FineTuningJobHyperparameters(
  batchSize: Option[CreateFineTuningJobRequestHyperparametersBatchSize],
  learningRateMultiplier: Option[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier],
  nEpochs: Option[CreateFineTuningJobRequestHyperparametersNEpochs]
)

object FineTuningJobHyperparameters {
  implicit lazy val fineTuningJobHyperparametersJsonFormat: Format[FineTuningJobHyperparameters] = Json.format[FineTuningJobHyperparameters]
}

