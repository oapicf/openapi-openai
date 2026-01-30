package api

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

/**
  * Provides a default implementation for [[VectorStoresApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class VectorStoresApiImpl extends VectorStoresApi {
  /**
    * @inheritdoc
    */
  override def cancelVectorStoreFileBatch(vectorStoreId: String, batchId: String): VectorStoreFileBatchObject = {
    // TODO: Implement better logic

    VectorStoreFileBatchObject("", "", 0, "", "", VectorStoreFileBatchObjectFileCounts(0, 0, 0, 0, 0))
  }

  /**
    * @inheritdoc
    */
  override def createVectorStore(createVectorStoreRequest: CreateVectorStoreRequest): VectorStoreObject = {
    // TODO: Implement better logic

    VectorStoreObject("", "", 0, "", 0, VectorStoreObjectFileCounts(0, 0, 0, 0, 0), "", None, None, 0, null)
  }

  /**
    * @inheritdoc
    */
  override def createVectorStoreFile(vectorStoreId: String, createVectorStoreFileRequest: CreateVectorStoreFileRequest): VectorStoreFileObject = {
    // TODO: Implement better logic

    VectorStoreFileObject("", "", 0, 0, "", "", VectorStoreFileObjectLastError("", ""), None)
  }

  /**
    * @inheritdoc
    */
  override def createVectorStoreFileBatch(vectorStoreId: String, createVectorStoreFileBatchRequest: CreateVectorStoreFileBatchRequest): VectorStoreFileBatchObject = {
    // TODO: Implement better logic

    VectorStoreFileBatchObject("", "", 0, "", "", VectorStoreFileBatchObjectFileCounts(0, 0, 0, 0, 0))
  }

  /**
    * @inheritdoc
    */
  override def deleteVectorStore(vectorStoreId: String): DeleteVectorStoreResponse = {
    // TODO: Implement better logic

    DeleteVectorStoreResponse("", false, "")
  }

  /**
    * @inheritdoc
    */
  override def deleteVectorStoreFile(vectorStoreId: String, fileId: String): DeleteVectorStoreFileResponse = {
    // TODO: Implement better logic

    DeleteVectorStoreFileResponse("", false, "")
  }

  /**
    * @inheritdoc
    */
  override def getVectorStore(vectorStoreId: String): VectorStoreObject = {
    // TODO: Implement better logic

    VectorStoreObject("", "", 0, "", 0, VectorStoreObjectFileCounts(0, 0, 0, 0, 0), "", None, None, 0, null)
  }

  /**
    * @inheritdoc
    */
  override def getVectorStoreFile(vectorStoreId: String, fileId: String): VectorStoreFileObject = {
    // TODO: Implement better logic

    VectorStoreFileObject("", "", 0, 0, "", "", VectorStoreFileObjectLastError("", ""), None)
  }

  /**
    * @inheritdoc
    */
  override def getVectorStoreFileBatch(vectorStoreId: String, batchId: String): VectorStoreFileBatchObject = {
    // TODO: Implement better logic

    VectorStoreFileBatchObject("", "", 0, "", "", VectorStoreFileBatchObjectFileCounts(0, 0, 0, 0, 0))
  }

  /**
    * @inheritdoc
    */
  override def listFilesInVectorStoreBatch(vectorStoreId: String, batchId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String], filter: Option[String]): ListVectorStoreFilesResponse = {
    // TODO: Implement better logic

    ListVectorStoreFilesResponse("", List.empty[VectorStoreFileObject], "", "", false)
  }

  /**
    * @inheritdoc
    */
  override def listVectorStoreFiles(vectorStoreId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String], filter: Option[String]): ListVectorStoreFilesResponse = {
    // TODO: Implement better logic

    ListVectorStoreFilesResponse("", List.empty[VectorStoreFileObject], "", "", false)
  }

  /**
    * @inheritdoc
    */
  override def listVectorStores(limit: Option[Int], order: Option[String], after: Option[String], before: Option[String]): ListVectorStoresResponse = {
    // TODO: Implement better logic

    ListVectorStoresResponse("", List.empty[VectorStoreObject], "", "", false)
  }

  /**
    * @inheritdoc
    */
  override def modifyVectorStore(vectorStoreId: String, updateVectorStoreRequest: UpdateVectorStoreRequest): VectorStoreObject = {
    // TODO: Implement better logic

    VectorStoreObject("", "", 0, "", 0, VectorStoreObjectFileCounts(0, 0, 0, 0, 0), "", None, None, 0, null)
  }
}
