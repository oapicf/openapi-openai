
package org.openapitools.client.model


case class FineTuneDPOMethodHyperparameters (
    _beta: Option[FineTuneDPOMethodHyperparametersBeta],
    _batchSize: Option[FineTuneDPOMethodHyperparametersBatchSize],
    _learningRateMultiplier: Option[FineTuneDPOMethodHyperparametersLearningRateMultiplier],
    _nEpochs: Option[FineTuneDPOMethodHyperparametersNEpochs]
)
object FineTuneDPOMethodHyperparameters {
    def toStringBody(var_beta: Object, var_batchSize: Object, var_learningRateMultiplier: Object, var_nEpochs: Object) =
        s"""
        | {
        | "beta":$var_beta,"batchSize":$var_batchSize,"learningRateMultiplier":$var_learningRateMultiplier,"nEpochs":$var_nEpochs
        | }
        """.stripMargin
}
