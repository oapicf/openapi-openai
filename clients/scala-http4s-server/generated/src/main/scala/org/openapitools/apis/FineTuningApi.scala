package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.CreateFineTuningJobRequest
import org.openapitools.models.FineTuningJob
import org.openapitools.models.ListFineTuningJobCheckpointsResponse
import org.openapitools.models.ListFineTuningJobEventsResponse
import org.openapitools.models.ListPaginatedFineTuningJobsResponse


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class FineTuningApiRoutes[
  F[_]: JsonDecoder: Monad, ApiKeyAuth
](delegate: FineTuningApiDelegate[F, ApiKeyAuth]) extends Http4sDsl[F] {
  object cancelFineTuningJob {
    import FineTuningApiDelegate.cancelFineTuningJobResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "fine_tuning" / "jobs" / fine_tuning_job_id / "cancel") as auth =>
        delegate.cancelFineTuningJob.handle_ApiKeyAuth(auth, req, fine_tuning_job_id, responses)

    }

    val responses: cancelFineTuningJobResponses[F] = new cancelFineTuningJobResponses[F] {
      def resp200(value: FineTuningJob): F[Response[F]] = Ok(value)
    }
  }
  object createFineTuningJob {
    import FineTuningApiDelegate.createFineTuningJobResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "fine_tuning" / "jobs") as auth =>
          delegate.createFineTuningJob.handle_ApiKeyAuth(auth, req, req.asJsonDecode[CreateFineTuningJobRequest] , responses)

    }

    val responses: createFineTuningJobResponses[F] = new createFineTuningJobResponses[F] {
      def resp200(value: FineTuningJob): F[Response[F]] = Ok(value)
    }
  }
  object listFineTuningEvents {
    import FineTuningApiDelegate.listFineTuningEventsResponses

    object afterQueryParam extends OptionalQueryParamDecoderMatcher[String]("after")
    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "fine_tuning" / "jobs" / fine_tuning_job_id / "events" :? afterQueryParam(after) +& limitQueryParam(limit)) as auth =>
        delegate.listFineTuningEvents.handle_ApiKeyAuth(auth, req, fine_tuning_job_id, after, limit, responses)

    }

    val responses: listFineTuningEventsResponses[F] = new listFineTuningEventsResponses[F] {
      def resp200(value: ListFineTuningJobEventsResponse): F[Response[F]] = Ok(value)
    }
  }
  object listFineTuningJobCheckpoints {
    import FineTuningApiDelegate.listFineTuningJobCheckpointsResponses

    object afterQueryParam extends OptionalQueryParamDecoderMatcher[String]("after")
    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "fine_tuning" / "jobs" / fine_tuning_job_id / "checkpoints" :? afterQueryParam(after) +& limitQueryParam(limit)) as auth =>
        delegate.listFineTuningJobCheckpoints.handle_ApiKeyAuth(auth, req, fine_tuning_job_id, after, limit, responses)

    }

    val responses: listFineTuningJobCheckpointsResponses[F] = new listFineTuningJobCheckpointsResponses[F] {
      def resp200(value: ListFineTuningJobCheckpointsResponse): F[Response[F]] = Ok(value)
    }
  }
  object listPaginatedFineTuningJobs {
    import FineTuningApiDelegate.listPaginatedFineTuningJobsResponses

    object afterQueryParam extends OptionalQueryParamDecoderMatcher[String]("after")
    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "fine_tuning" / "jobs" :? afterQueryParam(after) +& limitQueryParam(limit)) as auth =>
        delegate.listPaginatedFineTuningJobs.handle_ApiKeyAuth(auth, req, after, limit, responses)

    }

    val responses: listPaginatedFineTuningJobsResponses[F] = new listPaginatedFineTuningJobsResponses[F] {
      def resp200(value: ListPaginatedFineTuningJobsResponse): F[Response[F]] = Ok(value)
    }
  }
  object retrieveFineTuningJob {
    import FineTuningApiDelegate.retrieveFineTuningJobResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "fine_tuning" / "jobs" / fine_tuning_job_id) as auth =>
        delegate.retrieveFineTuningJob.handle_ApiKeyAuth(auth, req, fine_tuning_job_id, responses)

    }

    val responses: retrieveFineTuningJobResponses[F] = new retrieveFineTuningJobResponses[F] {
      def resp200(value: FineTuningJob): F[Response[F]] = Ok(value)
    }
  }

  val routesApiKeyAuth =
    cancelFineTuningJob.routeApiKeyAuth <+>
    createFineTuningJob.routeApiKeyAuth <+>
    listFineTuningEvents.routeApiKeyAuth <+>
    listFineTuningJobCheckpoints.routeApiKeyAuth <+>
    listPaginatedFineTuningJobs.routeApiKeyAuth <+>
    retrieveFineTuningJob.routeApiKeyAuth
}

object FineTuningApiDelegate {
  trait cancelFineTuningJobResponses[F[_]] {
    def resp200(value: FineTuningJob): F[Response[F]]
  }

  trait createFineTuningJobResponses[F[_]] {
    def resp200(value: FineTuningJob): F[Response[F]]
  }

  trait listFineTuningEventsResponses[F[_]] {
    def resp200(value: ListFineTuningJobEventsResponse): F[Response[F]]
  }

  trait listFineTuningJobCheckpointsResponses[F[_]] {
    def resp200(value: ListFineTuningJobCheckpointsResponse): F[Response[F]]
  }

  trait listPaginatedFineTuningJobsResponses[F[_]] {
    def resp200(value: ListPaginatedFineTuningJobsResponse): F[Response[F]]
  }

  trait retrieveFineTuningJobResponses[F[_]] {
    def resp200(value: FineTuningJob): F[Response[F]]
  }

}

trait FineTuningApiDelegate[F[_], ApiKeyAuth] {

  trait cancelFineTuningJob {
    import FineTuningApiDelegate.cancelFineTuningJobResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      fineTuningJobId: String,
      responses: cancelFineTuningJobResponses[F]
    ): F[Response[F]]

  }
  def cancelFineTuningJob: cancelFineTuningJob


  trait createFineTuningJob {
    import FineTuningApiDelegate.createFineTuningJobResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      createFineTuningJob: F[CreateFineTuningJobRequest],
      responses: createFineTuningJobResponses[F]
    ): F[Response[F]]


  }
  def createFineTuningJob: createFineTuningJob


  trait listFineTuningEvents {
    import FineTuningApiDelegate.listFineTuningEventsResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      fineTuningJobId: String,
      after: Option[String],
      limit: Option[Int],
      responses: listFineTuningEventsResponses[F]
    ): F[Response[F]]

  }
  def listFineTuningEvents: listFineTuningEvents


  trait listFineTuningJobCheckpoints {
    import FineTuningApiDelegate.listFineTuningJobCheckpointsResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      fineTuningJobId: String,
      after: Option[String],
      limit: Option[Int],
      responses: listFineTuningJobCheckpointsResponses[F]
    ): F[Response[F]]

  }
  def listFineTuningJobCheckpoints: listFineTuningJobCheckpoints


  trait listPaginatedFineTuningJobs {
    import FineTuningApiDelegate.listPaginatedFineTuningJobsResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      after: Option[String],
      limit: Option[Int],
      responses: listPaginatedFineTuningJobsResponses[F]
    ): F[Response[F]]

  }
  def listPaginatedFineTuningJobs: listPaginatedFineTuningJobs


  trait retrieveFineTuningJob {
    import FineTuningApiDelegate.retrieveFineTuningJobResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      fineTuningJobId: String,
      responses: retrieveFineTuningJobResponses[F]
    ): F[Response[F]]

  }
  def retrieveFineTuningJob: retrieveFineTuningJob

}