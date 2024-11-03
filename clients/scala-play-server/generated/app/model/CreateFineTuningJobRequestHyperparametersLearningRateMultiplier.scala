package model

import play.api.libs.json._

/**
  * Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateFineTuningJobRequestHyperparametersLearningRateMultiplier(
)

object CreateFineTuningJobRequestHyperparametersLearningRateMultiplier {
  implicit lazy val createFineTuningJobRequestHyperparametersLearningRateMultiplierJsonFormat: Format[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier] = Json.format[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier]
}

