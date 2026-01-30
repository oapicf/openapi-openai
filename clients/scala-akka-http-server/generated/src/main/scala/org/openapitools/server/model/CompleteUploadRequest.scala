package org.openapitools.server.model


/**
 * @param partIds The ordered list of Part IDs.  for example: ''null''
 * @param md5 The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect.  for example: ''null''
*/
final case class CompleteUploadRequest (
  partIds: Seq[String],
  md5: Option[String] = None
)

