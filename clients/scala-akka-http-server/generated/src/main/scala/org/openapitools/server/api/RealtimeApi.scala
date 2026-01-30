package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.RealtimeSessionCreateRequest
import org.openapitools.server.model.RealtimeSessionCreateResponse


class RealtimeApi(
    realtimeService: RealtimeApiService,
    realtimeMarshaller: RealtimeApiMarshaller
) {

  
  import realtimeMarshaller._

  lazy val route: Route =
    path("realtime" / "sessions") { 
      post {  
            entity(as[RealtimeSessionCreateRequest]){ realtimeSessionCreateRequest =>
              realtimeService.createRealtimeSession(realtimeSessionCreateRequest = realtimeSessionCreateRequest)
            }
      }
    }
}


trait RealtimeApiService {

  def createRealtimeSession200(responseRealtimeSessionCreateResponse: RealtimeSessionCreateResponse)(implicit toEntityMarshallerRealtimeSessionCreateResponse: ToEntityMarshaller[RealtimeSessionCreateResponse]): Route =
    complete((200, responseRealtimeSessionCreateResponse))
  /**
   * Code: 200, Message: Session created successfully., DataType: RealtimeSessionCreateResponse
   */
  def createRealtimeSession(realtimeSessionCreateRequest: RealtimeSessionCreateRequest)
      (implicit toEntityMarshallerRealtimeSessionCreateResponse: ToEntityMarshaller[RealtimeSessionCreateResponse]): Route

}

trait RealtimeApiMarshaller {
  implicit def fromEntityUnmarshallerRealtimeSessionCreateRequest: FromEntityUnmarshaller[RealtimeSessionCreateRequest]



  implicit def toEntityMarshallerRealtimeSessionCreateResponse: ToEntityMarshaller[RealtimeSessionCreateResponse]

}

