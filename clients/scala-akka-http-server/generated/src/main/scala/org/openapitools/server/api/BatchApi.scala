package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Batch
import org.openapitools.server.model.CreateBatchRequest
import org.openapitools.server.model.ListBatchesResponse


class BatchApi(
    batchService: BatchApiService,
    batchMarshaller: BatchApiMarshaller
) {

  
  import batchMarshaller._

  lazy val route: Route =
    path("batches" / Segment / "cancel") { (batchId) => 
      post {  
            batchService.cancelBatch(batchId = batchId)
      }
    } ~
    path("batches") { 
      post {  
            entity(as[CreateBatchRequest]){ createBatchRequest =>
              batchService.createBatch(createBatchRequest = createBatchRequest)
            }
      }
    } ~
    path("batches") { 
      get { 
        parameters("after".as[String].?, "limit".as[Int].?(20)) { (after, limit) => 
            batchService.listBatches(after = after, limit = limit)
        }
      }
    } ~
    path("batches" / Segment) { (batchId) => 
      get {  
            batchService.retrieveBatch(batchId = batchId)
      }
    }
}


trait BatchApiService {

  def cancelBatch200(responseBatch: Batch)(implicit toEntityMarshallerBatch: ToEntityMarshaller[Batch]): Route =
    complete((200, responseBatch))
  /**
   * Code: 200, Message: Batch is cancelling. Returns the cancelling batch&#39;s details., DataType: Batch
   */
  def cancelBatch(batchId: String)
      (implicit toEntityMarshallerBatch: ToEntityMarshaller[Batch]): Route

  def createBatch200(responseBatch: Batch)(implicit toEntityMarshallerBatch: ToEntityMarshaller[Batch]): Route =
    complete((200, responseBatch))
  /**
   * Code: 200, Message: Batch created successfully., DataType: Batch
   */
  def createBatch(createBatchRequest: CreateBatchRequest)
      (implicit toEntityMarshallerBatch: ToEntityMarshaller[Batch]): Route

  def listBatches200(responseListBatchesResponse: ListBatchesResponse)(implicit toEntityMarshallerListBatchesResponse: ToEntityMarshaller[ListBatchesResponse]): Route =
    complete((200, responseListBatchesResponse))
  /**
   * Code: 200, Message: Batch listed successfully., DataType: ListBatchesResponse
   */
  def listBatches(after: Option[String], limit: Int)
      (implicit toEntityMarshallerListBatchesResponse: ToEntityMarshaller[ListBatchesResponse]): Route

  def retrieveBatch200(responseBatch: Batch)(implicit toEntityMarshallerBatch: ToEntityMarshaller[Batch]): Route =
    complete((200, responseBatch))
  /**
   * Code: 200, Message: Batch retrieved successfully., DataType: Batch
   */
  def retrieveBatch(batchId: String)
      (implicit toEntityMarshallerBatch: ToEntityMarshaller[Batch]): Route

}

trait BatchApiMarshaller {
  implicit def fromEntityUnmarshallerCreateBatchRequest: FromEntityUnmarshaller[CreateBatchRequest]



  implicit def toEntityMarshallerListBatchesResponse: ToEntityMarshaller[ListBatchesResponse]

  implicit def toEntityMarshallerBatch: ToEntityMarshaller[Batch]

}

