
package org.openapitools.client.model


case class RunStepDetailsToolCallsFileSearchResultObjectContentInner (
    /* The type of the content. */
    _type: Option[String],
    /* The text content of the file. */
    _text: Option[String]
)
object RunStepDetailsToolCallsFileSearchResultObjectContentInner {
    def toStringBody(var_type: Object, var_text: Object) =
        s"""
        | {
        | "type":$var_type,"text":$var_text
        | }
        """.stripMargin
}
