package model

import play.api.libs.json._

/**
  * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateFineTuningJobRequestHyperparametersNEpochs(
)

object CreateFineTuningJobRequestHyperparametersNEpochs {
  implicit lazy val createFineTuningJobRequestHyperparametersNEpochsJsonFormat: Format[CreateFineTuningJobRequestHyperparametersNEpochs] = Json.format[CreateFineTuningJobRequestHyperparametersNEpochs]
}

