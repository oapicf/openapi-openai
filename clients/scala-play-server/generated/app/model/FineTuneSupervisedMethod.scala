package model

import play.api.libs.json._

/**
  * Configuration for the supervised fine-tuning method.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class FineTuneSupervisedMethod(
  hyperparameters: Option[FineTuneSupervisedMethodHyperparameters]
)

object FineTuneSupervisedMethod {
  implicit lazy val fineTuneSupervisedMethodJsonFormat: Format[FineTuneSupervisedMethod] = Json.format[FineTuneSupervisedMethod]
}

