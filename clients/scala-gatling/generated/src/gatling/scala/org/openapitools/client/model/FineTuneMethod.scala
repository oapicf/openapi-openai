
package org.openapitools.client.model


case class FineTuneMethod (
    /* The type of method. Is either `supervised` or `dpo`. */
    _type: Option[String],
    _supervised: Option[FineTuneSupervisedMethod],
    _dpo: Option[FineTuneDPOMethod]
)
object FineTuneMethod {
    def toStringBody(var_type: Object, var_supervised: Object, var_dpo: Object) =
        s"""
        | {
        | "type":$var_type,"supervised":$var_supervised,"dpo":$var_dpo
        | }
        """.stripMargin
}
