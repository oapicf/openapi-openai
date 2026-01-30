package api

import play.api.libs.json._
import model.CreateVectorStoreFileBatchRequest
import model.CreateVectorStoreFileRequest
import model.CreateVectorStoreRequest
import model.DeleteVectorStoreFileResponse
import model.DeleteVectorStoreResponse
import model.ListVectorStoreFilesResponse
import model.ListVectorStoresResponse
import model.UpdateVectorStoreRequest
import model.VectorStoreFileBatchObject
import model.VectorStoreFileObject
import model.VectorStoreObject

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait VectorStoresApi {
  /**
    * Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
    * @param vectorStoreId The ID of the vector store that the file batch belongs to.
    * @param batchId The ID of the file batch to cancel.
    */
  def cancelVectorStoreFileBatch(vectorStoreId: String, batchId: String): VectorStoreFileBatchObject

  /**
    * Create a vector store.
    */
  def createVectorStore(createVectorStoreRequest: CreateVectorStoreRequest): VectorStoreObject

  /**
    * Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
    * @param vectorStoreId The ID of the vector store for which to create a File. 
    */
  def createVectorStoreFile(vectorStoreId: String, createVectorStoreFileRequest: CreateVectorStoreFileRequest): VectorStoreFileObject

  /**
    * Create a vector store file batch.
    * @param vectorStoreId The ID of the vector store for which to create a File Batch. 
    */
  def createVectorStoreFileBatch(vectorStoreId: String, createVectorStoreFileBatchRequest: CreateVectorStoreFileBatchRequest): VectorStoreFileBatchObject

  /**
    * Delete a vector store.
    * @param vectorStoreId The ID of the vector store to delete.
    */
  def deleteVectorStore(vectorStoreId: String): DeleteVectorStoreResponse

  /**
    * Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
    * @param vectorStoreId The ID of the vector store that the file belongs to.
    * @param fileId The ID of the file to delete.
    */
  def deleteVectorStoreFile(vectorStoreId: String, fileId: String): DeleteVectorStoreFileResponse

  /**
    * Retrieves a vector store.
    * @param vectorStoreId The ID of the vector store to retrieve.
    */
  def getVectorStore(vectorStoreId: String): VectorStoreObject

  /**
    * Retrieves a vector store file.
    * @param vectorStoreId The ID of the vector store that the file belongs to.
    * @param fileId The ID of the file being retrieved.
    */
  def getVectorStoreFile(vectorStoreId: String, fileId: String): VectorStoreFileObject

  /**
    * Retrieves a vector store file batch.
    * @param vectorStoreId The ID of the vector store that the file batch belongs to.
    * @param batchId The ID of the file batch being retrieved.
    */
  def getVectorStoreFileBatch(vectorStoreId: String, batchId: String): VectorStoreFileBatchObject

  /**
    * Returns a list of vector store files in a batch.
    * @param vectorStoreId The ID of the vector store that the files belong to.
    * @param batchId The ID of the file batch that the files belong to.
    * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    * @param filter Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.
    */
  def listFilesInVectorStoreBatch(vectorStoreId: String, batchId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String], filter: Option[String]): ListVectorStoreFilesResponse

  /**
    * Returns a list of vector store files.
    * @param vectorStoreId The ID of the vector store that the files belong to.
    * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    * @param filter Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.
    */
  def listVectorStoreFiles(vectorStoreId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String], filter: Option[String]): ListVectorStoreFilesResponse

  /**
    * Returns a list of vector stores.
    * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    */
  def listVectorStores(limit: Option[Int], order: Option[String], after: Option[String], before: Option[String]): ListVectorStoresResponse

  /**
    * Modifies a vector store.
    * @param vectorStoreId The ID of the vector store to modify.
    */
  def modifyVectorStore(vectorStoreId: String, updateVectorStoreRequest: UpdateVectorStoreRequest): VectorStoreObject
}
