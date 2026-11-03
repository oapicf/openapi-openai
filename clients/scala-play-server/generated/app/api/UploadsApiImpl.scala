package api

import model.CompleteUploadRequest
import model.CreateUploadRequest
import play.api.libs.Files.TemporaryFile
import model.Upload
import model.UploadPart

/**
  * Provides a default implementation for [[UploadsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
class UploadsApiImpl extends UploadsApi {
  /**
    * @inheritdoc
    */
  override def addUploadPart(uploadId: String, data: TemporaryFile): UploadPart = {
    // TODO: Implement better logic

    UploadPart("", 0, "", "")
  }

  /**
    * @inheritdoc
    */
  override def cancelUpload(uploadId: String): Upload = {
    // TODO: Implement better logic

    Upload("", 0, "", 0, "", "", 0, None, None)
  }

  /**
    * @inheritdoc
    */
  override def completeUpload(uploadId: String, completeUploadRequest: CompleteUploadRequest): Upload = {
    // TODO: Implement better logic

    Upload("", 0, "", 0, "", "", 0, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createUpload(createUploadRequest: CreateUploadRequest): Upload = {
    // TODO: Implement better logic

    Upload("", 0, "", 0, "", "", 0, None, None)
  }
}
