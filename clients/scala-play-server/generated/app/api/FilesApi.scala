package api

import play.api.libs.json._
import model.DeleteFileResponse
import model.ListFilesResponse
import model.OpenAIFile
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
trait FilesApi {
  /**
    * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
    * @param file The File object (not file name) to be uploaded. 
    * @param purpose The intended purpose of the uploaded file.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning. 
    */
  def createFile(file: TemporaryFile, purpose: String): OpenAIFile

  /**
    * Delete a file.
    * @param fileId The ID of the file to use for this request.
    */
  def deleteFile(fileId: String): DeleteFileResponse

  /**
    * Returns the contents of the specified file.
    * @param fileId The ID of the file to use for this request.
    */
  def downloadFile(fileId: String): String

  /**
    * Returns a list of files that belong to the user&#39;s organization.
    * @param purpose Only return files with the given purpose.
    */
  def listFiles(purpose: Option[String]): ListFilesResponse

  /**
    * Returns information about a specific file.
    * @param fileId The ID of the file to use for this request.
    */
  def retrieveFile(fileId: String): OpenAIFile
}
