package model

import play.api.libs.json._

/**
  * The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class FineTuningJobHyperparameters(
  nEpochs: FineTuningJobHyperparametersNEpochs
)

object FineTuningJobHyperparameters {
  implicit lazy val fineTuningJobHyperparametersJsonFormat: Format[FineTuningJobHyperparameters] = Json.format[FineTuningJobHyperparameters]
}

