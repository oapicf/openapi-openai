package api

import play.api.libs.json._
import model.Batch
import model.CreateBatchRequest
import model.ListBatchesResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait BatchApi {
  /**
    * Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
    * @param batchId The ID of the batch to cancel.
    */
  def cancelBatch(batchId: String): Batch

  /**
    * Creates and executes a batch from an uploaded file of requests
    */
  def createBatch(createBatchRequest: CreateBatchRequest): Batch

  /**
    * List your organization&#39;s batches.
    * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    */
  def listBatches(after: Option[String], limit: Option[Int]): ListBatchesResponse

  /**
    * Retrieves a batch.
    * @param batchId The ID of the batch to retrieve.
    */
  def retrieveBatch(batchId: String): Batch
}
