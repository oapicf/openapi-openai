package model

import play.api.libs.json._

/**
  * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateFineTuningJobRequestHyperparametersNEpochs(
)

object CreateFineTuningJobRequestHyperparametersNEpochs {
  implicit lazy val createFineTuningJobRequestHyperparametersNEpochsJsonFormat: Format[CreateFineTuningJobRequestHyperparametersNEpochs] = Json.format[CreateFineTuningJobRequestHyperparametersNEpochs]
}

