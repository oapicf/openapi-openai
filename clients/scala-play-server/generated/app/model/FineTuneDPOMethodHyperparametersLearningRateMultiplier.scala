package model

import play.api.libs.json._

/**
  * Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class FineTuneDPOMethodHyperparametersLearningRateMultiplier(
)

object FineTuneDPOMethodHyperparametersLearningRateMultiplier {
  implicit lazy val fineTuneDPOMethodHyperparametersLearningRateMultiplierJsonFormat: Format[FineTuneDPOMethodHyperparametersLearningRateMultiplier] = Json.format[FineTuneDPOMethodHyperparametersLearningRateMultiplier]
}

