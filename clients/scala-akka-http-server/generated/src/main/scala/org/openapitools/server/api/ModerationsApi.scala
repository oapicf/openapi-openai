package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.CreateModerationRequest
import org.openapitools.server.model.CreateModerationResponse


class ModerationsApi(
    moderationsService: ModerationsApiService,
    moderationsMarshaller: ModerationsApiMarshaller
) {

  
  import moderationsMarshaller._

  lazy val route: Route =
    path("moderations") { 
      post {  
            entity(as[CreateModerationRequest]){ createModerationRequest =>
              moderationsService.createModeration(createModerationRequest = createModerationRequest)
            }
      }
    }
}


trait ModerationsApiService {

  def createModeration200(responseCreateModerationResponse: CreateModerationResponse)(implicit toEntityMarshallerCreateModerationResponse: ToEntityMarshaller[CreateModerationResponse]): Route =
    complete((200, responseCreateModerationResponse))
  /**
   * Code: 200, Message: OK, DataType: CreateModerationResponse
   */
  def createModeration(createModerationRequest: CreateModerationRequest)
      (implicit toEntityMarshallerCreateModerationResponse: ToEntityMarshaller[CreateModerationResponse]): Route

}

trait ModerationsApiMarshaller {
  implicit def fromEntityUnmarshallerCreateModerationRequest: FromEntityUnmarshaller[CreateModerationRequest]



  implicit def toEntityMarshallerCreateModerationResponse: ToEntityMarshaller[CreateModerationResponse]

}

