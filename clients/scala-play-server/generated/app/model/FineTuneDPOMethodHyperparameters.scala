package model

import play.api.libs.json._

/**
  * The hyperparameters used for the fine-tuning job.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class FineTuneDPOMethodHyperparameters(
  beta: Option[FineTuneDPOMethodHyperparametersBeta],
  batchSize: Option[FineTuneDPOMethodHyperparametersBatchSize],
  learningRateMultiplier: Option[FineTuneDPOMethodHyperparametersLearningRateMultiplier],
  nEpochs: Option[FineTuneDPOMethodHyperparametersNEpochs]
)

object FineTuneDPOMethodHyperparameters {
  implicit lazy val fineTuneDPOMethodHyperparametersJsonFormat: Format[FineTuneDPOMethodHyperparameters] = Json.format[FineTuneDPOMethodHyperparameters]
}

