
package org.openapitools.client.model


case class FineTuningJobCheckpointMetrics (
    _step: Option[Number],
    _trainLoss: Option[Number],
    _trainMeanTokenAccuracy: Option[Number],
    _validLoss: Option[Number],
    _validMeanTokenAccuracy: Option[Number],
    _fullValidLoss: Option[Number],
    _fullValidMeanTokenAccuracy: Option[Number]
)
object FineTuningJobCheckpointMetrics {
    def toStringBody(var_step: Object, var_trainLoss: Object, var_trainMeanTokenAccuracy: Object, var_validLoss: Object, var_validMeanTokenAccuracy: Object, var_fullValidLoss: Object, var_fullValidMeanTokenAccuracy: Object) =
        s"""
        | {
        | "step":$var_step,"trainLoss":$var_trainLoss,"trainMeanTokenAccuracy":$var_trainMeanTokenAccuracy,"validLoss":$var_validLoss,"validMeanTokenAccuracy":$var_validMeanTokenAccuracy,"fullValidLoss":$var_fullValidLoss,"fullValidMeanTokenAccuracy":$var_fullValidMeanTokenAccuracy
        | }
        """.stripMargin
}
