
package org.openapitools.client.model


case class FineTuningIntegration (
    /* The type of the integration being enabled for the fine-tuning job */
    _type: String,
    _wandb: CreateFineTuningJobRequestIntegrationsInnerWandb
)
object FineTuningIntegration {
    def toStringBody(var_type: Object, var_wandb: Object) =
        s"""
        | {
        | "type":$var_type,"wandb":$var_wandb
        | }
        """.stripMargin
}
