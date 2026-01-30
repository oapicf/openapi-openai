package api

import model.DeleteFileResponse
import model.ListFilesResponse
import model.OpenAIFile
import play.api.libs.Files.TemporaryFile

/**
  * Provides a default implementation for [[FilesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class FilesApiImpl extends FilesApi {
  /**
    * @inheritdoc
    */
  override def createFile(file: TemporaryFile, purpose: String): OpenAIFile = {
    // TODO: Implement better logic

    OpenAIFile("", 0, 0, "", "", "", "", None)
  }

  /**
    * @inheritdoc
    */
  override def deleteFile(fileId: String): DeleteFileResponse = {
    // TODO: Implement better logic

    DeleteFileResponse("", "", false)
  }

  /**
    * @inheritdoc
    */
  override def downloadFile(fileId: String): String = {
    // TODO: Implement better logic

    ""
  }

  /**
    * @inheritdoc
    */
  override def listFiles(purpose: Option[String], limit: Option[Int], order: Option[String], after: Option[String]): ListFilesResponse = {
    // TODO: Implement better logic

    ListFilesResponse("", List.empty[OpenAIFile], "", "", false)
  }

  /**
    * @inheritdoc
    */
  override def retrieveFile(fileId: String): OpenAIFile = {
    // TODO: Implement better logic

    OpenAIFile("", 0, 0, "", "", "", "", None)
  }
}
