package model

import play.api.libs.json._

/**
  * Configuration for the supervised fine-tuning method.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class FineTuneSupervisedMethod(
  hyperparameters: Option[FineTuneSupervisedMethodHyperparameters]
)

object FineTuneSupervisedMethod {
  implicit lazy val fineTuneSupervisedMethodJsonFormat: Format[FineTuneSupervisedMethod] = Json.format[FineTuneSupervisedMethod]
}

