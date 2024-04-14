package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.CreateCompletionRequest
import org.openapitools.server.model.CreateCompletionResponse


class CompletionsApi(
    completionsService: CompletionsApiService,
    completionsMarshaller: CompletionsApiMarshaller
) {

  
  import completionsMarshaller._

  lazy val route: Route =
    path("completions") { 
      post {  
            entity(as[CreateCompletionRequest]){ createCompletionRequest =>
              completionsService.createCompletion(createCompletionRequest = createCompletionRequest)
            }
      }
    }
}


trait CompletionsApiService {

  def createCompletion200(responseCreateCompletionResponse: CreateCompletionResponse)(implicit toEntityMarshallerCreateCompletionResponse: ToEntityMarshaller[CreateCompletionResponse]): Route =
    complete((200, responseCreateCompletionResponse))
  /**
   * Code: 200, Message: OK, DataType: CreateCompletionResponse
   */
  def createCompletion(createCompletionRequest: CreateCompletionRequest)
      (implicit toEntityMarshallerCreateCompletionResponse: ToEntityMarshaller[CreateCompletionResponse]): Route

}

trait CompletionsApiMarshaller {
  implicit def fromEntityUnmarshallerCreateCompletionRequest: FromEntityUnmarshaller[CreateCompletionRequest]



  implicit def toEntityMarshallerCreateCompletionResponse: ToEntityMarshaller[CreateCompletionResponse]

}

