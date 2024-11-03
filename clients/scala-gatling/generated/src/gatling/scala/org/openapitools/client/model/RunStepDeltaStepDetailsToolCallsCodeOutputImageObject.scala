
package org.openapitools.client.model


case class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject (
    /* The index of the output in the outputs array. */
    _index: Integer,
    /* Always `image`. */
    _type: String,
    _image: Option[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage]
)
object RunStepDeltaStepDetailsToolCallsCodeOutputImageObject {
    def toStringBody(var_index: Object, var_type: Object, var_image: Object) =
        s"""
        | {
        | "index":$var_index,"type":$var_type,"image":$var_image
        | }
        """.stripMargin
}
