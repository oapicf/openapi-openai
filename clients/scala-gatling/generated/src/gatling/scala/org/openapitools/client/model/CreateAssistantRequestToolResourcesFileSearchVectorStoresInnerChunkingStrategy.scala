
package org.openapitools.client.model


case class CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy (
    /* Always `auto`. */
    _type: String,
    _static: StaticChunkingStrategyStatic
)
object CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy {
    def toStringBody(var_type: Object, var_static: Object) =
        s"""
        | {
        | "type":$var_type,"static":$var_static
        | }
        """.stripMargin
}
