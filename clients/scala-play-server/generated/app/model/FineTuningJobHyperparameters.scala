package model

import play.api.libs.json._

/**
  * The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class FineTuningJobHyperparameters(
  nEpochs: FineTuningJobHyperparametersNEpochs
)

object FineTuningJobHyperparameters {
  implicit lazy val fineTuningJobHyperparametersJsonFormat: Format[FineTuningJobHyperparameters] = Json.format[FineTuningJobHyperparameters]
}

