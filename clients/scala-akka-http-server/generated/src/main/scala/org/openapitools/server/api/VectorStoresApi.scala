package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.CreateVectorStoreFileBatchRequest
import org.openapitools.server.model.CreateVectorStoreFileRequest
import org.openapitools.server.model.CreateVectorStoreRequest
import org.openapitools.server.model.DeleteVectorStoreFileResponse
import org.openapitools.server.model.DeleteVectorStoreResponse
import org.openapitools.server.model.ListVectorStoreFilesResponse
import org.openapitools.server.model.ListVectorStoresResponse
import org.openapitools.server.model.UpdateVectorStoreRequest
import org.openapitools.server.model.VectorStoreFileBatchObject
import org.openapitools.server.model.VectorStoreFileObject
import org.openapitools.server.model.VectorStoreObject


class VectorStoresApi(
    vectorStoresService: VectorStoresApiService,
    vectorStoresMarshaller: VectorStoresApiMarshaller
) {

  
  import vectorStoresMarshaller._

  lazy val route: Route =
    path("vector_stores" / Segment / "file_batches" / Segment / "cancel") { (vectorStoreId, batchId) => 
      post {  
            vectorStoresService.cancelVectorStoreFileBatch(vectorStoreId = vectorStoreId, batchId = batchId)
      }
    } ~
    path("vector_stores") { 
      post {  
            entity(as[CreateVectorStoreRequest]){ createVectorStoreRequest =>
              vectorStoresService.createVectorStore(createVectorStoreRequest = createVectorStoreRequest)
            }
      }
    } ~
    path("vector_stores" / Segment / "files") { (vectorStoreId) => 
      post {  
            entity(as[CreateVectorStoreFileRequest]){ createVectorStoreFileRequest =>
              vectorStoresService.createVectorStoreFile(vectorStoreId = vectorStoreId, createVectorStoreFileRequest = createVectorStoreFileRequest)
            }
      }
    } ~
    path("vector_stores" / Segment / "file_batches") { (vectorStoreId) => 
      post {  
            entity(as[CreateVectorStoreFileBatchRequest]){ createVectorStoreFileBatchRequest =>
              vectorStoresService.createVectorStoreFileBatch(vectorStoreId = vectorStoreId, createVectorStoreFileBatchRequest = createVectorStoreFileBatchRequest)
            }
      }
    } ~
    path("vector_stores" / Segment) { (vectorStoreId) => 
      delete {  
            vectorStoresService.deleteVectorStore(vectorStoreId = vectorStoreId)
      }
    } ~
    path("vector_stores" / Segment / "files" / Segment) { (vectorStoreId, fileId) => 
      delete {  
            vectorStoresService.deleteVectorStoreFile(vectorStoreId = vectorStoreId, fileId = fileId)
      }
    } ~
    path("vector_stores" / Segment) { (vectorStoreId) => 
      get {  
            vectorStoresService.getVectorStore(vectorStoreId = vectorStoreId)
      }
    } ~
    path("vector_stores" / Segment / "files" / Segment) { (vectorStoreId, fileId) => 
      get {  
            vectorStoresService.getVectorStoreFile(vectorStoreId = vectorStoreId, fileId = fileId)
      }
    } ~
    path("vector_stores" / Segment / "file_batches" / Segment) { (vectorStoreId, batchId) => 
      get {  
            vectorStoresService.getVectorStoreFileBatch(vectorStoreId = vectorStoreId, batchId = batchId)
      }
    } ~
    path("vector_stores" / Segment / "file_batches" / Segment / "files") { (vectorStoreId, batchId) => 
      get { 
        parameters("limit".as[Int].?(20), "order".as[String].?("desc"), "after".as[String].?, "before".as[String].?, "filter".as[String].?) { (limit, order, after, before, filter) => 
            vectorStoresService.listFilesInVectorStoreBatch(vectorStoreId = vectorStoreId, batchId = batchId, limit = limit, order = order, after = after, before = before, filter = filter)
        }
      }
    } ~
    path("vector_stores" / Segment / "files") { (vectorStoreId) => 
      get { 
        parameters("limit".as[Int].?(20), "order".as[String].?("desc"), "after".as[String].?, "before".as[String].?, "filter".as[String].?) { (limit, order, after, before, filter) => 
            vectorStoresService.listVectorStoreFiles(vectorStoreId = vectorStoreId, limit = limit, order = order, after = after, before = before, filter = filter)
        }
      }
    } ~
    path("vector_stores") { 
      get { 
        parameters("limit".as[Int].?(20), "order".as[String].?("desc"), "after".as[String].?, "before".as[String].?) { (limit, order, after, before) => 
            vectorStoresService.listVectorStores(limit = limit, order = order, after = after, before = before)
        }
      }
    } ~
    path("vector_stores" / Segment) { (vectorStoreId) => 
      post {  
            entity(as[UpdateVectorStoreRequest]){ updateVectorStoreRequest =>
              vectorStoresService.modifyVectorStore(vectorStoreId = vectorStoreId, updateVectorStoreRequest = updateVectorStoreRequest)
            }
      }
    }
}


trait VectorStoresApiService {

  def cancelVectorStoreFileBatch200(responseVectorStoreFileBatchObject: VectorStoreFileBatchObject)(implicit toEntityMarshallerVectorStoreFileBatchObject: ToEntityMarshaller[VectorStoreFileBatchObject]): Route =
    complete((200, responseVectorStoreFileBatchObject))
  /**
   * Code: 200, Message: OK, DataType: VectorStoreFileBatchObject
   */
  def cancelVectorStoreFileBatch(vectorStoreId: String, batchId: String)
      (implicit toEntityMarshallerVectorStoreFileBatchObject: ToEntityMarshaller[VectorStoreFileBatchObject]): Route

  def createVectorStore200(responseVectorStoreObject: VectorStoreObject)(implicit toEntityMarshallerVectorStoreObject: ToEntityMarshaller[VectorStoreObject]): Route =
    complete((200, responseVectorStoreObject))
  /**
   * Code: 200, Message: OK, DataType: VectorStoreObject
   */
  def createVectorStore(createVectorStoreRequest: CreateVectorStoreRequest)
      (implicit toEntityMarshallerVectorStoreObject: ToEntityMarshaller[VectorStoreObject]): Route

  def createVectorStoreFile200(responseVectorStoreFileObject: VectorStoreFileObject)(implicit toEntityMarshallerVectorStoreFileObject: ToEntityMarshaller[VectorStoreFileObject]): Route =
    complete((200, responseVectorStoreFileObject))
  /**
   * Code: 200, Message: OK, DataType: VectorStoreFileObject
   */
  def createVectorStoreFile(vectorStoreId: String, createVectorStoreFileRequest: CreateVectorStoreFileRequest)
      (implicit toEntityMarshallerVectorStoreFileObject: ToEntityMarshaller[VectorStoreFileObject]): Route

  def createVectorStoreFileBatch200(responseVectorStoreFileBatchObject: VectorStoreFileBatchObject)(implicit toEntityMarshallerVectorStoreFileBatchObject: ToEntityMarshaller[VectorStoreFileBatchObject]): Route =
    complete((200, responseVectorStoreFileBatchObject))
  /**
   * Code: 200, Message: OK, DataType: VectorStoreFileBatchObject
   */
  def createVectorStoreFileBatch(vectorStoreId: String, createVectorStoreFileBatchRequest: CreateVectorStoreFileBatchRequest)
      (implicit toEntityMarshallerVectorStoreFileBatchObject: ToEntityMarshaller[VectorStoreFileBatchObject]): Route

  def deleteVectorStore200(responseDeleteVectorStoreResponse: DeleteVectorStoreResponse)(implicit toEntityMarshallerDeleteVectorStoreResponse: ToEntityMarshaller[DeleteVectorStoreResponse]): Route =
    complete((200, responseDeleteVectorStoreResponse))
  /**
   * Code: 200, Message: OK, DataType: DeleteVectorStoreResponse
   */
  def deleteVectorStore(vectorStoreId: String)
      (implicit toEntityMarshallerDeleteVectorStoreResponse: ToEntityMarshaller[DeleteVectorStoreResponse]): Route

  def deleteVectorStoreFile200(responseDeleteVectorStoreFileResponse: DeleteVectorStoreFileResponse)(implicit toEntityMarshallerDeleteVectorStoreFileResponse: ToEntityMarshaller[DeleteVectorStoreFileResponse]): Route =
    complete((200, responseDeleteVectorStoreFileResponse))
  /**
   * Code: 200, Message: OK, DataType: DeleteVectorStoreFileResponse
   */
  def deleteVectorStoreFile(vectorStoreId: String, fileId: String)
      (implicit toEntityMarshallerDeleteVectorStoreFileResponse: ToEntityMarshaller[DeleteVectorStoreFileResponse]): Route

  def getVectorStore200(responseVectorStoreObject: VectorStoreObject)(implicit toEntityMarshallerVectorStoreObject: ToEntityMarshaller[VectorStoreObject]): Route =
    complete((200, responseVectorStoreObject))
  /**
   * Code: 200, Message: OK, DataType: VectorStoreObject
   */
  def getVectorStore(vectorStoreId: String)
      (implicit toEntityMarshallerVectorStoreObject: ToEntityMarshaller[VectorStoreObject]): Route

  def getVectorStoreFile200(responseVectorStoreFileObject: VectorStoreFileObject)(implicit toEntityMarshallerVectorStoreFileObject: ToEntityMarshaller[VectorStoreFileObject]): Route =
    complete((200, responseVectorStoreFileObject))
  /**
   * Code: 200, Message: OK, DataType: VectorStoreFileObject
   */
  def getVectorStoreFile(vectorStoreId: String, fileId: String)
      (implicit toEntityMarshallerVectorStoreFileObject: ToEntityMarshaller[VectorStoreFileObject]): Route

  def getVectorStoreFileBatch200(responseVectorStoreFileBatchObject: VectorStoreFileBatchObject)(implicit toEntityMarshallerVectorStoreFileBatchObject: ToEntityMarshaller[VectorStoreFileBatchObject]): Route =
    complete((200, responseVectorStoreFileBatchObject))
  /**
   * Code: 200, Message: OK, DataType: VectorStoreFileBatchObject
   */
  def getVectorStoreFileBatch(vectorStoreId: String, batchId: String)
      (implicit toEntityMarshallerVectorStoreFileBatchObject: ToEntityMarshaller[VectorStoreFileBatchObject]): Route

  def listFilesInVectorStoreBatch200(responseListVectorStoreFilesResponse: ListVectorStoreFilesResponse)(implicit toEntityMarshallerListVectorStoreFilesResponse: ToEntityMarshaller[ListVectorStoreFilesResponse]): Route =
    complete((200, responseListVectorStoreFilesResponse))
  /**
   * Code: 200, Message: OK, DataType: ListVectorStoreFilesResponse
   */
  def listFilesInVectorStoreBatch(vectorStoreId: String, batchId: String, limit: Int, order: String, after: Option[String], before: Option[String], filter: Option[String])
      (implicit toEntityMarshallerListVectorStoreFilesResponse: ToEntityMarshaller[ListVectorStoreFilesResponse]): Route

  def listVectorStoreFiles200(responseListVectorStoreFilesResponse: ListVectorStoreFilesResponse)(implicit toEntityMarshallerListVectorStoreFilesResponse: ToEntityMarshaller[ListVectorStoreFilesResponse]): Route =
    complete((200, responseListVectorStoreFilesResponse))
  /**
   * Code: 200, Message: OK, DataType: ListVectorStoreFilesResponse
   */
  def listVectorStoreFiles(vectorStoreId: String, limit: Int, order: String, after: Option[String], before: Option[String], filter: Option[String])
      (implicit toEntityMarshallerListVectorStoreFilesResponse: ToEntityMarshaller[ListVectorStoreFilesResponse]): Route

  def listVectorStores200(responseListVectorStoresResponse: ListVectorStoresResponse)(implicit toEntityMarshallerListVectorStoresResponse: ToEntityMarshaller[ListVectorStoresResponse]): Route =
    complete((200, responseListVectorStoresResponse))
  /**
   * Code: 200, Message: OK, DataType: ListVectorStoresResponse
   */
  def listVectorStores(limit: Int, order: String, after: Option[String], before: Option[String])
      (implicit toEntityMarshallerListVectorStoresResponse: ToEntityMarshaller[ListVectorStoresResponse]): Route

  def modifyVectorStore200(responseVectorStoreObject: VectorStoreObject)(implicit toEntityMarshallerVectorStoreObject: ToEntityMarshaller[VectorStoreObject]): Route =
    complete((200, responseVectorStoreObject))
  /**
   * Code: 200, Message: OK, DataType: VectorStoreObject
   */
  def modifyVectorStore(vectorStoreId: String, updateVectorStoreRequest: UpdateVectorStoreRequest)
      (implicit toEntityMarshallerVectorStoreObject: ToEntityMarshaller[VectorStoreObject]): Route

}

trait VectorStoresApiMarshaller {
  implicit def fromEntityUnmarshallerCreateVectorStoreRequest: FromEntityUnmarshaller[CreateVectorStoreRequest]

  implicit def fromEntityUnmarshallerCreateVectorStoreFileBatchRequest: FromEntityUnmarshaller[CreateVectorStoreFileBatchRequest]

  implicit def fromEntityUnmarshallerCreateVectorStoreFileRequest: FromEntityUnmarshaller[CreateVectorStoreFileRequest]

  implicit def fromEntityUnmarshallerUpdateVectorStoreRequest: FromEntityUnmarshaller[UpdateVectorStoreRequest]



  implicit def toEntityMarshallerListVectorStoreFilesResponse: ToEntityMarshaller[ListVectorStoreFilesResponse]

  implicit def toEntityMarshallerListVectorStoresResponse: ToEntityMarshaller[ListVectorStoresResponse]

  implicit def toEntityMarshallerVectorStoreObject: ToEntityMarshaller[VectorStoreObject]

  implicit def toEntityMarshallerDeleteVectorStoreResponse: ToEntityMarshaller[DeleteVectorStoreResponse]

  implicit def toEntityMarshallerVectorStoreFileObject: ToEntityMarshaller[VectorStoreFileObject]

  implicit def toEntityMarshallerVectorStoreFileBatchObject: ToEntityMarshaller[VectorStoreFileBatchObject]

  implicit def toEntityMarshallerDeleteVectorStoreFileResponse: ToEntityMarshaller[DeleteVectorStoreFileResponse]

}

