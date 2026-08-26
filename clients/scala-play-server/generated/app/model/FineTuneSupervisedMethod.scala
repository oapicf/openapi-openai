package model

import play.api.libs.json._

/**
  * Configuration for the supervised fine-tuning method.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class FineTuneSupervisedMethod(
  hyperparameters: Option[FineTuneSupervisedMethodHyperparameters]
)

object FineTuneSupervisedMethod {
  implicit lazy val fineTuneSupervisedMethodJsonFormat: Format[FineTuneSupervisedMethod] = Json.format[FineTuneSupervisedMethod]
}

