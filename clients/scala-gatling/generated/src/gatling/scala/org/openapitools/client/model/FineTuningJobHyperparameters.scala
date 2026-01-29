
package org.openapitools.client.model


case class FineTuningJobHyperparameters (
    _nEpochs: FineTuningJobHyperparametersNEpochs
)
object FineTuningJobHyperparameters {
    def toStringBody(var_nEpochs: Object) =
        s"""
        | {
        | "nEpochs":$var_nEpochs
        | }
        """.stripMargin
}
