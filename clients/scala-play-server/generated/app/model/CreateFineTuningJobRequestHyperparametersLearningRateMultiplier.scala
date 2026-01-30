package model

import play.api.libs.json._

/**
  * Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateFineTuningJobRequestHyperparametersLearningRateMultiplier(
)

object CreateFineTuningJobRequestHyperparametersLearningRateMultiplier {
  implicit lazy val createFineTuningJobRequestHyperparametersLearningRateMultiplierJsonFormat: Format[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier] = Json.format[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier]
}

