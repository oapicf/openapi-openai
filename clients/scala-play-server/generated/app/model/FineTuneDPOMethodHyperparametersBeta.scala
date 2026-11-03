package model

import play.api.libs.json._

/**
  * The beta value for the DPO method. A higher beta value will increase the weight of the penalty between the policy and reference model. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class FineTuneDPOMethodHyperparametersBeta(
)

object FineTuneDPOMethodHyperparametersBeta {
  implicit lazy val fineTuneDPOMethodHyperparametersBetaJsonFormat: Format[FineTuneDPOMethodHyperparametersBeta] = Json.format[FineTuneDPOMethodHyperparametersBeta]
}

