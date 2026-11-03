package model

import play.api.libs.json._

/**
  * The hyperparameters used for the fine-tuning job. This value is now deprecated in favor of `method`, and should be passed in under the `method` parameter. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CreateFineTuningJobRequestHyperparameters(
  batchSize: Option[CreateFineTuningJobRequestHyperparametersBatchSize],
  learningRateMultiplier: Option[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier],
  nEpochs: Option[CreateFineTuningJobRequestHyperparametersNEpochs]
)

object CreateFineTuningJobRequestHyperparameters {
  implicit lazy val createFineTuningJobRequestHyperparametersJsonFormat: Format[CreateFineTuningJobRequestHyperparameters] = Json.format[CreateFineTuningJobRequestHyperparameters]
}

