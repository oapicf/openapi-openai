package model

import play.api.libs.json._

/**
  * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateFineTuningJobRequestHyperparametersNEpochs(
)

object CreateFineTuningJobRequestHyperparametersNEpochs {
  implicit lazy val createFineTuningJobRequestHyperparametersNEpochsJsonFormat: Format[CreateFineTuningJobRequestHyperparametersNEpochs] = Json.format[CreateFineTuningJobRequestHyperparametersNEpochs]
}

