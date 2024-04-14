package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.DeleteModelResponse
import org.openapitools.server.model.ListModelsResponse
import org.openapitools.server.model.Model


class ModelsApi(
    modelsService: ModelsApiService,
    modelsMarshaller: ModelsApiMarshaller
) {

  
  import modelsMarshaller._

  lazy val route: Route =
    path("models" / Segment) { (model) => 
      delete {  
            modelsService.deleteModel(model = model)
      }
    } ~
    path("models") { 
      get {  
            modelsService.listModels()
      }
    } ~
    path("models" / Segment) { (model) => 
      get {  
            modelsService.retrieveModel(model = model)
      }
    }
}


trait ModelsApiService {

  def deleteModel200(responseDeleteModelResponse: DeleteModelResponse)(implicit toEntityMarshallerDeleteModelResponse: ToEntityMarshaller[DeleteModelResponse]): Route =
    complete((200, responseDeleteModelResponse))
  /**
   * Code: 200, Message: OK, DataType: DeleteModelResponse
   */
  def deleteModel(model: String)
      (implicit toEntityMarshallerDeleteModelResponse: ToEntityMarshaller[DeleteModelResponse]): Route

  def listModels200(responseListModelsResponse: ListModelsResponse)(implicit toEntityMarshallerListModelsResponse: ToEntityMarshaller[ListModelsResponse]): Route =
    complete((200, responseListModelsResponse))
  /**
   * Code: 200, Message: OK, DataType: ListModelsResponse
   */
  def listModels()
      (implicit toEntityMarshallerListModelsResponse: ToEntityMarshaller[ListModelsResponse]): Route

  def retrieveModel200(responseModel: Model)(implicit toEntityMarshallerModel: ToEntityMarshaller[Model]): Route =
    complete((200, responseModel))
  /**
   * Code: 200, Message: OK, DataType: Model
   */
  def retrieveModel(model: String)
      (implicit toEntityMarshallerModel: ToEntityMarshaller[Model]): Route

}

trait ModelsApiMarshaller {


  implicit def toEntityMarshallerModel: ToEntityMarshaller[Model]

  implicit def toEntityMarshallerListModelsResponse: ToEntityMarshaller[ListModelsResponse]

  implicit def toEntityMarshallerDeleteModelResponse: ToEntityMarshaller[DeleteModelResponse]

}

