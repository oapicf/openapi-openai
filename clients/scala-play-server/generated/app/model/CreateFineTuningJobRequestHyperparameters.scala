package model

import play.api.libs.json._

/**
  * The hyperparameters used for the fine-tuning job.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateFineTuningJobRequestHyperparameters(
  batchSize: Option[CreateFineTuningJobRequestHyperparametersBatchSize],
  learningRateMultiplier: Option[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier],
  nEpochs: Option[CreateFineTuningJobRequestHyperparametersNEpochs]
)

object CreateFineTuningJobRequestHyperparameters {
  implicit lazy val createFineTuningJobRequestHyperparametersJsonFormat: Format[CreateFineTuningJobRequestHyperparameters] = Json.format[CreateFineTuningJobRequestHyperparameters]
}

