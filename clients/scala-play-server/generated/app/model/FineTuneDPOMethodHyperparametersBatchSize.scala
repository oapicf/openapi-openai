package model

import play.api.libs.json._

/**
  * Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class FineTuneDPOMethodHyperparametersBatchSize(
)

object FineTuneDPOMethodHyperparametersBatchSize {
  implicit lazy val fineTuneDPOMethodHyperparametersBatchSizeJsonFormat: Format[FineTuneDPOMethodHyperparametersBatchSize] = Json.format[FineTuneDPOMethodHyperparametersBatchSize]
}

