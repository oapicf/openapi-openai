
package org.openapitools.client.model


case class FineTuneSupervisedMethod (
    _hyperparameters: Option[FineTuneSupervisedMethodHyperparameters]
)
object FineTuneSupervisedMethod {
    def toStringBody(var_hyperparameters: Object) =
        s"""
        | {
        | "hyperparameters":$var_hyperparameters
        | }
        """.stripMargin
}
