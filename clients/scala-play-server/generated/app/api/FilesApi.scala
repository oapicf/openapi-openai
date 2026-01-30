package api

import play.api.libs.json._
import model.DeleteFileResponse
import model.ListFilesResponse
import model.OpenAIFile
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait FilesApi {
  /**
    * Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
    * @param file The File object (not file name) to be uploaded. 
    * @param purpose The intended purpose of the uploaded file.  Use \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\&quot;vision\\\&quot; for Assistants image file inputs, \\\&quot;batch\\\&quot; for [Batch API](/docs/guides/batch), and \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning). 
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
    * Returns a list of files.
    * @param purpose Only return files with the given purpose.
    * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. 
    * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    */
  def listFiles(purpose: Option[String], limit: Option[Int], order: Option[String], after: Option[String]): ListFilesResponse

  /**
    * Returns information about a specific file.
    * @param fileId The ID of the file to use for this request.
    */
  def retrieveFile(fileId: String): OpenAIFile
}
