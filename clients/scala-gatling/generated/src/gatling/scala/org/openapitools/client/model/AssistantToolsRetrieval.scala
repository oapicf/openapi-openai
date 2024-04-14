
package org.openapitools.client.model


case class AssistantToolsRetrieval (
    /* The type of tool being defined: `retrieval` */
    _type: String
)
object AssistantToolsRetrieval {
    def toStringBody(var_type: Object) =
        s"""
        | {
        | "type":$var_type
        | }
        """.stripMargin
}
