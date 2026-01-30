
package org.openapitools.client.model


case class RealtimeResponseCreateParamsToolsInner (
    /* The type of the tool, i.e. `function`. */
    _type: Option[String],
    /* The name of the function. */
    _name: Option[String],
    /* The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything).  */
    _description: Option[String],
    /* Parameters of the function in JSON Schema. */
    _parameters: Option[Any]
)
object RealtimeResponseCreateParamsToolsInner {
    def toStringBody(var_type: Object, var_name: Object, var_description: Object, var_parameters: Object) =
        s"""
        | {
        | "type":$var_type,"name":$var_name,"description":$var_description,"parameters":$var_parameters
        | }
        """.stripMargin
}
