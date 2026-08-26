package model

import play.api.libs.json._

/**
  * The hyperparameters used for the fine-tuning job. This value will only be returned when running `supervised` jobs.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class FineTuningJobHyperparameters(
  batchSize: Option[CreateFineTuningJobRequestHyperparametersBatchSize],
  learningRateMultiplier: Option[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier],
  nEpochs: Option[CreateFineTuningJobRequestHyperparametersNEpochs]
)

object FineTuningJobHyperparameters {
  implicit lazy val fineTuningJobHyperparametersJsonFormat: Format[FineTuningJobHyperparameters] = Json.format[FineTuningJobHyperparameters]
}

