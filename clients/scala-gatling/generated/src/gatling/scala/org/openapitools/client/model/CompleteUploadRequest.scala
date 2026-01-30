
package org.openapitools.client.model


case class CompleteUploadRequest (
    /* The ordered list of Part IDs.  */
    _partIds: List[String],
    /* The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect.  */
    _md5: Option[String]
)
object CompleteUploadRequest {
    def toStringBody(var_partIds: Object, var_md5: Object) =
        s"""
        | {
        | "partIds":$var_partIds,"md5":$var_md5
        | }
        """.stripMargin
}
