
package org.openapitools.client.model


case class RunStepDetailsToolCallsCodeOutputImageObject (
    /* Always `image`. */
    _type: String,
    _image: RunStepDetailsToolCallsCodeOutputImageObjectImage
)
object RunStepDetailsToolCallsCodeOutputImageObject {
    def toStringBody(var_type: Object, var_image: Object) =
        s"""
        | {
        | "type":$var_type,"image":$var_image
        | }
        """.stripMargin
}
