package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.CreateFineTuningJobRequest
import org.openapitools.server.model.FineTuningJob
import org.openapitools.server.model.ListFineTuningJobCheckpointsResponse
import org.openapitools.server.model.ListFineTuningJobEventsResponse
import org.openapitools.server.model.ListPaginatedFineTuningJobsResponse


class FineTuningApi(
    fineTuningService: FineTuningApiService,
    fineTuningMarshaller: FineTuningApiMarshaller
) {

  
  import fineTuningMarshaller._

  lazy val route: Route =
    path("fine_tuning" / "jobs" / Segment / "cancel") { (fineTuningJobId) => 
      post {  
            fineTuningService.cancelFineTuningJob(fineTuningJobId = fineTuningJobId)
      }
    } ~
    path("fine_tuning" / "jobs") { 
      post {  
            entity(as[CreateFineTuningJobRequest]){ createFineTuningJobRequest =>
              fineTuningService.createFineTuningJob(createFineTuningJobRequest = createFineTuningJobRequest)
            }
      }
    } ~
    path("fine_tuning" / "jobs" / Segment / "events") { (fineTuningJobId) => 
      get { 
        parameters("after".as[String].?, "limit".as[Int].?(20)) { (after, limit) => 
            fineTuningService.listFineTuningEvents(fineTuningJobId = fineTuningJobId, after = after, limit = limit)
        }
      }
    } ~
    path("fine_tuning" / "jobs" / Segment / "checkpoints") { (fineTuningJobId) => 
      get { 
        parameters("after".as[String].?, "limit".as[Int].?(10)) { (after, limit) => 
            fineTuningService.listFineTuningJobCheckpoints(fineTuningJobId = fineTuningJobId, after = after, limit = limit)
        }
      }
    } ~
    path("fine_tuning" / "jobs") { 
      get { 
        parameters("after".as[String].?, "limit".as[Int].?(20)) { (after, limit) => 
            fineTuningService.listPaginatedFineTuningJobs(after = after, limit = limit)
        }
      }
    } ~
    path("fine_tuning" / "jobs" / Segment) { (fineTuningJobId) => 
      get {  
            fineTuningService.retrieveFineTuningJob(fineTuningJobId = fineTuningJobId)
      }
    }
}


trait FineTuningApiService {

  def cancelFineTuningJob200(responseFineTuningJob: FineTuningJob)(implicit toEntityMarshallerFineTuningJob: ToEntityMarshaller[FineTuningJob]): Route =
    complete((200, responseFineTuningJob))
  /**
   * Code: 200, Message: OK, DataType: FineTuningJob
   */
  def cancelFineTuningJob(fineTuningJobId: String)
      (implicit toEntityMarshallerFineTuningJob: ToEntityMarshaller[FineTuningJob]): Route

  def createFineTuningJob200(responseFineTuningJob: FineTuningJob)(implicit toEntityMarshallerFineTuningJob: ToEntityMarshaller[FineTuningJob]): Route =
    complete((200, responseFineTuningJob))
  /**
   * Code: 200, Message: OK, DataType: FineTuningJob
   */
  def createFineTuningJob(createFineTuningJobRequest: CreateFineTuningJobRequest)
      (implicit toEntityMarshallerFineTuningJob: ToEntityMarshaller[FineTuningJob]): Route

  def listFineTuningEvents200(responseListFineTuningJobEventsResponse: ListFineTuningJobEventsResponse)(implicit toEntityMarshallerListFineTuningJobEventsResponse: ToEntityMarshaller[ListFineTuningJobEventsResponse]): Route =
    complete((200, responseListFineTuningJobEventsResponse))
  /**
   * Code: 200, Message: OK, DataType: ListFineTuningJobEventsResponse
   */
  def listFineTuningEvents(fineTuningJobId: String, after: Option[String], limit: Int)
      (implicit toEntityMarshallerListFineTuningJobEventsResponse: ToEntityMarshaller[ListFineTuningJobEventsResponse]): Route

  def listFineTuningJobCheckpoints200(responseListFineTuningJobCheckpointsResponse: ListFineTuningJobCheckpointsResponse)(implicit toEntityMarshallerListFineTuningJobCheckpointsResponse: ToEntityMarshaller[ListFineTuningJobCheckpointsResponse]): Route =
    complete((200, responseListFineTuningJobCheckpointsResponse))
  /**
   * Code: 200, Message: OK, DataType: ListFineTuningJobCheckpointsResponse
   */
  def listFineTuningJobCheckpoints(fineTuningJobId: String, after: Option[String], limit: Int)
      (implicit toEntityMarshallerListFineTuningJobCheckpointsResponse: ToEntityMarshaller[ListFineTuningJobCheckpointsResponse]): Route

  def listPaginatedFineTuningJobs200(responseListPaginatedFineTuningJobsResponse: ListPaginatedFineTuningJobsResponse)(implicit toEntityMarshallerListPaginatedFineTuningJobsResponse: ToEntityMarshaller[ListPaginatedFineTuningJobsResponse]): Route =
    complete((200, responseListPaginatedFineTuningJobsResponse))
  /**
   * Code: 200, Message: OK, DataType: ListPaginatedFineTuningJobsResponse
   */
  def listPaginatedFineTuningJobs(after: Option[String], limit: Int)
      (implicit toEntityMarshallerListPaginatedFineTuningJobsResponse: ToEntityMarshaller[ListPaginatedFineTuningJobsResponse]): Route

  def retrieveFineTuningJob200(responseFineTuningJob: FineTuningJob)(implicit toEntityMarshallerFineTuningJob: ToEntityMarshaller[FineTuningJob]): Route =
    complete((200, responseFineTuningJob))
  /**
   * Code: 200, Message: OK, DataType: FineTuningJob
   */
  def retrieveFineTuningJob(fineTuningJobId: String)
      (implicit toEntityMarshallerFineTuningJob: ToEntityMarshaller[FineTuningJob]): Route

}

trait FineTuningApiMarshaller {
  implicit def fromEntityUnmarshallerCreateFineTuningJobRequest: FromEntityUnmarshaller[CreateFineTuningJobRequest]



  implicit def toEntityMarshallerListFineTuningJobCheckpointsResponse: ToEntityMarshaller[ListFineTuningJobCheckpointsResponse]

  implicit def toEntityMarshallerFineTuningJob: ToEntityMarshaller[FineTuningJob]

  implicit def toEntityMarshallerListPaginatedFineTuningJobsResponse: ToEntityMarshaller[ListPaginatedFineTuningJobsResponse]

  implicit def toEntityMarshallerListFineTuningJobEventsResponse: ToEntityMarshaller[ListFineTuningJobEventsResponse]

}

