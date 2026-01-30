package model

import play.api.libs.json._

/**
  * The hyperparameters used for the fine-tuning job.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class FineTuneSupervisedMethodHyperparameters(
  batchSize: Option[FineTuneDPOMethodHyperparametersBatchSize],
  learningRateMultiplier: Option[FineTuneDPOMethodHyperparametersLearningRateMultiplier],
  nEpochs: Option[FineTuneDPOMethodHyperparametersNEpochs]
)

object FineTuneSupervisedMethodHyperparameters {
  implicit lazy val fineTuneSupervisedMethodHyperparametersJsonFormat: Format[FineTuneSupervisedMethodHyperparameters] = Json.format[FineTuneSupervisedMethodHyperparameters]
}

