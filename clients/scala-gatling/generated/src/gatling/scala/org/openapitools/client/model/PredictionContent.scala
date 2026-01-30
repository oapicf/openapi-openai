
package org.openapitools.client.model


case class PredictionContent (
    /* The type of the predicted content you want to provide. This type is currently always `content`.  */
    _type: String,
    _content: PredictionContentContent
)
object PredictionContent {
    def toStringBody(var_type: Object, var_content: Object) =
        s"""
        | {
        | "type":$var_type,"content":$var_content
        | }
        """.stripMargin
}
