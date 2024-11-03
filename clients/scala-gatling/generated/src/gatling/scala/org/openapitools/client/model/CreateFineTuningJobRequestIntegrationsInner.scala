
package org.openapitools.client.model


case class CreateFineTuningJobRequestIntegrationsInner (
    _type: CreateFineTuningJobRequestIntegrationsInnerType,
    _wandb: CreateFineTuningJobRequestIntegrationsInnerWandb
)
object CreateFineTuningJobRequestIntegrationsInner {
    def toStringBody(var_type: Object, var_wandb: Object) =
        s"""
        | {
        | "type":$var_type,"wandb":$var_wandb
        | }
        """.stripMargin
}
