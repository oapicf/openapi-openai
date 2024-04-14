package model

import play.api.libs.json._

/**
  * Metrics at the step number during the fine-tuning job.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class FineTuningJobCheckpointMetrics(
  step: Option[BigDecimal],
  trainLoss: Option[BigDecimal],
  trainMeanTokenAccuracy: Option[BigDecimal],
  validLoss: Option[BigDecimal],
  validMeanTokenAccuracy: Option[BigDecimal],
  fullValidLoss: Option[BigDecimal],
  fullValidMeanTokenAccuracy: Option[BigDecimal]
)

object FineTuningJobCheckpointMetrics {
  implicit lazy val fineTuningJobCheckpointMetricsJsonFormat: Format[FineTuningJobCheckpointMetrics] = Json.format[FineTuningJobCheckpointMetrics]
}

