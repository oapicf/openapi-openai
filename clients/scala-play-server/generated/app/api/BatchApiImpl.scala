package api

import model.Batch
import model.CreateBatchRequest
import model.ListBatchesResponse

/**
  * Provides a default implementation for [[BatchApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
class BatchApiImpl extends BatchApi {
  /**
    * @inheritdoc
    */
  override def cancelBatch(batchId: String): Batch = {
    // TODO: Implement better logic

    Batch("", "", "", None, "", "", "", None, None, 0, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createBatch(createBatchRequest: CreateBatchRequest): Batch = {
    // TODO: Implement better logic

    Batch("", "", "", None, "", "", "", None, None, 0, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def listBatches(after: Option[String], limit: Option[Int]): ListBatchesResponse = {
    // TODO: Implement better logic

    ListBatchesResponse(List.empty[Batch], None, None, false, "")
  }

  /**
    * @inheritdoc
    */
  override def retrieveBatch(batchId: String): Batch = {
    // TODO: Implement better logic

    Batch("", "", "", None, "", "", "", None, None, 0, None, None, None, None, None, None, None, None, None, None)
  }
}
