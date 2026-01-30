
package org.openapitools.client.model


case class FineTuneSupervisedMethodHyperparameters (
    _batchSize: Option[FineTuneDPOMethodHyperparametersBatchSize],
    _learningRateMultiplier: Option[FineTuneDPOMethodHyperparametersLearningRateMultiplier],
    _nEpochs: Option[FineTuneDPOMethodHyperparametersNEpochs]
)
object FineTuneSupervisedMethodHyperparameters {
    def toStringBody(var_batchSize: Object, var_learningRateMultiplier: Object, var_nEpochs: Object) =
        s"""
        | {
        | "batchSize":$var_batchSize,"learningRateMultiplier":$var_learningRateMultiplier,"nEpochs":$var_nEpochs
        | }
        """.stripMargin
}
