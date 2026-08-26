package model

import play.api.libs.json._

/**
  * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class FineTuneDPOMethodHyperparametersNEpochs(
)

object FineTuneDPOMethodHyperparametersNEpochs {
  implicit lazy val fineTuneDPOMethodHyperparametersNEpochsJsonFormat: Format[FineTuneDPOMethodHyperparametersNEpochs] = Json.format[FineTuneDPOMethodHyperparametersNEpochs]
}

