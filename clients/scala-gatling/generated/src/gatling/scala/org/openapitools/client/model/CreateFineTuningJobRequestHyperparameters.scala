
package org.openapitools.client.model


case class CreateFineTuningJobRequestHyperparameters (
    _batchSize: Option[CreateFineTuningJobRequestHyperparametersBatchSize],
    _learningRateMultiplier: Option[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier],
    _nEpochs: Option[CreateFineTuningJobRequestHyperparametersNEpochs]
)
object CreateFineTuningJobRequestHyperparameters {
    def toStringBody(var_batchSize: Object, var_learningRateMultiplier: Object, var_nEpochs: Object) =
        s"""
        | {
        | "batchSize":$var_batchSize,"learningRateMultiplier":$var_learningRateMultiplier,"nEpochs":$var_nEpochs
        | }
        """.stripMargin
}
