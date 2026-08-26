package model

import play.api.libs.json._

/**
  * The hyperparameters used for the fine-tuning job. This value is now deprecated in favor of `method`, and should be passed in under the `method` parameter. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CreateFineTuningJobRequestHyperparameters(
  batchSize: Option[CreateFineTuningJobRequestHyperparametersBatchSize],
  learningRateMultiplier: Option[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier],
  nEpochs: Option[CreateFineTuningJobRequestHyperparametersNEpochs]
)

object CreateFineTuningJobRequestHyperparameters {
  implicit lazy val createFineTuningJobRequestHyperparametersJsonFormat: Format[CreateFineTuningJobRequestHyperparameters] = Json.format[CreateFineTuningJobRequestHyperparameters]
}

