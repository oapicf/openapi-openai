package model

import play.api.libs.json._

/**
  * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. \"auto\" decides the optimal number of epochs based on the size of the dataset. If setting the number manually, we support any number between 1 and 50 epochs.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class FineTuningJobHyperparametersNEpochs(
)

object FineTuningJobHyperparametersNEpochs {
  implicit lazy val fineTuningJobHyperparametersNEpochsJsonFormat: Format[FineTuningJobHyperparametersNEpochs] = Json.format[FineTuningJobHyperparametersNEpochs]
}

