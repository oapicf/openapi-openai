
package org.openapitools.client.model


case class FineTune (
    _id: String,
    _object: String,
    _createdAt: Integer,
    _updatedAt: Integer,
    _model: String,
    _fineTunedModel: String,
    _organizationId: String,
    _status: String,
    _hyperparams: Any,
    _trainingFiles: List[OpenAIFile],
    _validationFiles: List[OpenAIFile],
    _resultFiles: List[OpenAIFile],
    _events: Option[List[FineTuneEvent]]
)
object FineTune {
    def toStringBody(var_id: Object, var_object: Object, var_createdAt: Object, var_updatedAt: Object, var_model: Object, var_fineTunedModel: Object, var_organizationId: Object, var_status: Object, var_hyperparams: Object, var_trainingFiles: Object, var_validationFiles: Object, var_resultFiles: Object, var_events: Object) =
        s"""
        | {
        | "id":$var_id,"object":$var_object,"createdAt":$var_createdAt,"updatedAt":$var_updatedAt,"model":$var_model,"fineTunedModel":$var_fineTunedModel,"organizationId":$var_organizationId,"status":$var_status,"hyperparams":$var_hyperparams,"trainingFiles":$var_trainingFiles,"validationFiles":$var_validationFiles,"resultFiles":$var_resultFiles,"events":$var_events
        | }
        """.stripMargin
}
