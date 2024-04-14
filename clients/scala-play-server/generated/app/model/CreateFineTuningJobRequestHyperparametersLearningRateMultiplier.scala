package model

import play.api.libs.json._

/**
  * Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateFineTuningJobRequestHyperparametersLearningRateMultiplier(
)

object CreateFineTuningJobRequestHyperparametersLearningRateMultiplier {
  implicit lazy val createFineTuningJobRequestHyperparametersLearningRateMultiplierJsonFormat: Format[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier] = Json.format[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier]
}

