
package org.openapitools.client.model


case class FineTuneDPOMethod (
    _hyperparameters: Option[FineTuneDPOMethodHyperparameters]
)
object FineTuneDPOMethod {
    def toStringBody(var_hyperparameters: Object) =
        s"""
        | {
        | "hyperparameters":$var_hyperparameters
        | }
        """.stripMargin
}
