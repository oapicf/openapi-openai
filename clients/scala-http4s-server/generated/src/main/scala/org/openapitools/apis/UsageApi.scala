package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.UsageResponse


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class UsageApiRoutes[
  F[_]: JsonDecoder: Monad, ApiKeyAuth
](delegate: UsageApiDelegate[F, ApiKeyAuth]) extends Http4sDsl[F] {
  object usageAudioSpeeches {
    import UsageApiDelegate.usageAudioSpeechesResponses

    object start_timeQueryParam extends QueryParamDecoderMatcher[Int]("start_time")
    object end_timeQueryParam extends OptionalQueryParamDecoderMatcher[Int]("end_time")
    object bucket_widthQueryParam extends OptionalQueryParamDecoderMatcher[String]("bucket_width")
    object project_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("project_ids")
    object user_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("user_ids")
    object api_key_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("api_key_ids")
    object modelsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("models")
    object group_byQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("group_by")
    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object pageQueryParam extends OptionalQueryParamDecoderMatcher[String]("page")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "usage" / "audio_speeches" :? start_timeQueryParam(start_time) +& end_timeQueryParam(end_time) +& bucket_widthQueryParam(bucket_width) +& project_idsQueryParam(project_ids) +& user_idsQueryParam(user_ids) +& api_key_idsQueryParam(api_key_ids) +& modelsQueryParam(models) +& group_byQueryParam(group_by) +& limitQueryParam(limit) +& pageQueryParam(page)) as auth =>
        delegate.usageAudioSpeeches.handle_ApiKeyAuth(auth, req, start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, group_by, limit, page, responses)

    }

    val responses: usageAudioSpeechesResponses[F] = new usageAudioSpeechesResponses[F] {
      def resp200(value: UsageResponse): F[Response[F]] = Ok(value)
    }
  }
  object usageAudioTranscriptions {
    import UsageApiDelegate.usageAudioTranscriptionsResponses

    object start_timeQueryParam extends QueryParamDecoderMatcher[Int]("start_time")
    object end_timeQueryParam extends OptionalQueryParamDecoderMatcher[Int]("end_time")
    object bucket_widthQueryParam extends OptionalQueryParamDecoderMatcher[String]("bucket_width")
    object project_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("project_ids")
    object user_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("user_ids")
    object api_key_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("api_key_ids")
    object modelsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("models")
    object group_byQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("group_by")
    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object pageQueryParam extends OptionalQueryParamDecoderMatcher[String]("page")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "usage" / "audio_transcriptions" :? start_timeQueryParam(start_time) +& end_timeQueryParam(end_time) +& bucket_widthQueryParam(bucket_width) +& project_idsQueryParam(project_ids) +& user_idsQueryParam(user_ids) +& api_key_idsQueryParam(api_key_ids) +& modelsQueryParam(models) +& group_byQueryParam(group_by) +& limitQueryParam(limit) +& pageQueryParam(page)) as auth =>
        delegate.usageAudioTranscriptions.handle_ApiKeyAuth(auth, req, start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, group_by, limit, page, responses)

    }

    val responses: usageAudioTranscriptionsResponses[F] = new usageAudioTranscriptionsResponses[F] {
      def resp200(value: UsageResponse): F[Response[F]] = Ok(value)
    }
  }
  object usageCodeInterpreterSessions {
    import UsageApiDelegate.usageCodeInterpreterSessionsResponses

    object start_timeQueryParam extends QueryParamDecoderMatcher[Int]("start_time")
    object end_timeQueryParam extends OptionalQueryParamDecoderMatcher[Int]("end_time")
    object bucket_widthQueryParam extends OptionalQueryParamDecoderMatcher[String]("bucket_width")
    object project_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("project_ids")
    object group_byQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("group_by")
    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object pageQueryParam extends OptionalQueryParamDecoderMatcher[String]("page")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "usage" / "code_interpreter_sessions" :? start_timeQueryParam(start_time) +& end_timeQueryParam(end_time) +& bucket_widthQueryParam(bucket_width) +& project_idsQueryParam(project_ids) +& group_byQueryParam(group_by) +& limitQueryParam(limit) +& pageQueryParam(page)) as auth =>
        delegate.usageCodeInterpreterSessions.handle_ApiKeyAuth(auth, req, start_time, end_time, bucket_width, project_ids, group_by, limit, page, responses)

    }

    val responses: usageCodeInterpreterSessionsResponses[F] = new usageCodeInterpreterSessionsResponses[F] {
      def resp200(value: UsageResponse): F[Response[F]] = Ok(value)
    }
  }
  object usageCompletions {
    import UsageApiDelegate.usageCompletionsResponses

    object start_timeQueryParam extends QueryParamDecoderMatcher[Int]("start_time")
    object end_timeQueryParam extends OptionalQueryParamDecoderMatcher[Int]("end_time")
    object bucket_widthQueryParam extends OptionalQueryParamDecoderMatcher[String]("bucket_width")
    object project_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("project_ids")
    object user_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("user_ids")
    object api_key_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("api_key_ids")
    object modelsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("models")
    object batchQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("batch")
    object group_byQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("group_by")
    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object pageQueryParam extends OptionalQueryParamDecoderMatcher[String]("page")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "usage" / "completions" :? start_timeQueryParam(start_time) +& end_timeQueryParam(end_time) +& bucket_widthQueryParam(bucket_width) +& project_idsQueryParam(project_ids) +& user_idsQueryParam(user_ids) +& api_key_idsQueryParam(api_key_ids) +& modelsQueryParam(models) +& batchQueryParam(batch) +& group_byQueryParam(group_by) +& limitQueryParam(limit) +& pageQueryParam(page)) as auth =>
        delegate.usageCompletions.handle_ApiKeyAuth(auth, req, start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, batch, group_by, limit, page, responses)

    }

    val responses: usageCompletionsResponses[F] = new usageCompletionsResponses[F] {
      def resp200(value: UsageResponse): F[Response[F]] = Ok(value)
    }
  }
  object usageCosts {
    import UsageApiDelegate.usageCostsResponses

    object start_timeQueryParam extends QueryParamDecoderMatcher[Int]("start_time")
    object end_timeQueryParam extends OptionalQueryParamDecoderMatcher[Int]("end_time")
    object bucket_widthQueryParam extends OptionalQueryParamDecoderMatcher[String]("bucket_width")
    object project_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("project_ids")
    object group_byQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("group_by")
    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object pageQueryParam extends OptionalQueryParamDecoderMatcher[String]("page")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "costs" :? start_timeQueryParam(start_time) +& end_timeQueryParam(end_time) +& bucket_widthQueryParam(bucket_width) +& project_idsQueryParam(project_ids) +& group_byQueryParam(group_by) +& limitQueryParam(limit) +& pageQueryParam(page)) as auth =>
        delegate.usageCosts.handle_ApiKeyAuth(auth, req, start_time, end_time, bucket_width, project_ids, group_by, limit, page, responses)

    }

    val responses: usageCostsResponses[F] = new usageCostsResponses[F] {
      def resp200(value: UsageResponse): F[Response[F]] = Ok(value)
    }
  }
  object usageEmbeddings {
    import UsageApiDelegate.usageEmbeddingsResponses

    object start_timeQueryParam extends QueryParamDecoderMatcher[Int]("start_time")
    object end_timeQueryParam extends OptionalQueryParamDecoderMatcher[Int]("end_time")
    object bucket_widthQueryParam extends OptionalQueryParamDecoderMatcher[String]("bucket_width")
    object project_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("project_ids")
    object user_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("user_ids")
    object api_key_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("api_key_ids")
    object modelsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("models")
    object group_byQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("group_by")
    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object pageQueryParam extends OptionalQueryParamDecoderMatcher[String]("page")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "usage" / "embeddings" :? start_timeQueryParam(start_time) +& end_timeQueryParam(end_time) +& bucket_widthQueryParam(bucket_width) +& project_idsQueryParam(project_ids) +& user_idsQueryParam(user_ids) +& api_key_idsQueryParam(api_key_ids) +& modelsQueryParam(models) +& group_byQueryParam(group_by) +& limitQueryParam(limit) +& pageQueryParam(page)) as auth =>
        delegate.usageEmbeddings.handle_ApiKeyAuth(auth, req, start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, group_by, limit, page, responses)

    }

    val responses: usageEmbeddingsResponses[F] = new usageEmbeddingsResponses[F] {
      def resp200(value: UsageResponse): F[Response[F]] = Ok(value)
    }
  }
  object usageImages {
    import UsageApiDelegate.usageImagesResponses

    object start_timeQueryParam extends QueryParamDecoderMatcher[Int]("start_time")
    object end_timeQueryParam extends OptionalQueryParamDecoderMatcher[Int]("end_time")
    object bucket_widthQueryParam extends OptionalQueryParamDecoderMatcher[String]("bucket_width")
    object sourcesQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("sources")
    object sizesQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("sizes")
    object project_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("project_ids")
    object user_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("user_ids")
    object api_key_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("api_key_ids")
    object modelsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("models")
    object group_byQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("group_by")
    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object pageQueryParam extends OptionalQueryParamDecoderMatcher[String]("page")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "usage" / "images" :? start_timeQueryParam(start_time) +& end_timeQueryParam(end_time) +& bucket_widthQueryParam(bucket_width) +& sourcesQueryParam(sources) +& sizesQueryParam(sizes) +& project_idsQueryParam(project_ids) +& user_idsQueryParam(user_ids) +& api_key_idsQueryParam(api_key_ids) +& modelsQueryParam(models) +& group_byQueryParam(group_by) +& limitQueryParam(limit) +& pageQueryParam(page)) as auth =>
        delegate.usageImages.handle_ApiKeyAuth(auth, req, start_time, end_time, bucket_width, sources, sizes, project_ids, user_ids, api_key_ids, models, group_by, limit, page, responses)

    }

    val responses: usageImagesResponses[F] = new usageImagesResponses[F] {
      def resp200(value: UsageResponse): F[Response[F]] = Ok(value)
    }
  }
  object usageModerations {
    import UsageApiDelegate.usageModerationsResponses

    object start_timeQueryParam extends QueryParamDecoderMatcher[Int]("start_time")
    object end_timeQueryParam extends OptionalQueryParamDecoderMatcher[Int]("end_time")
    object bucket_widthQueryParam extends OptionalQueryParamDecoderMatcher[String]("bucket_width")
    object project_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("project_ids")
    object user_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("user_ids")
    object api_key_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("api_key_ids")
    object modelsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("models")
    object group_byQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("group_by")
    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object pageQueryParam extends OptionalQueryParamDecoderMatcher[String]("page")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "usage" / "moderations" :? start_timeQueryParam(start_time) +& end_timeQueryParam(end_time) +& bucket_widthQueryParam(bucket_width) +& project_idsQueryParam(project_ids) +& user_idsQueryParam(user_ids) +& api_key_idsQueryParam(api_key_ids) +& modelsQueryParam(models) +& group_byQueryParam(group_by) +& limitQueryParam(limit) +& pageQueryParam(page)) as auth =>
        delegate.usageModerations.handle_ApiKeyAuth(auth, req, start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, group_by, limit, page, responses)

    }

    val responses: usageModerationsResponses[F] = new usageModerationsResponses[F] {
      def resp200(value: UsageResponse): F[Response[F]] = Ok(value)
    }
  }
  object usageVectorStores {
    import UsageApiDelegate.usageVectorStoresResponses

    object start_timeQueryParam extends QueryParamDecoderMatcher[Int]("start_time")
    object end_timeQueryParam extends OptionalQueryParamDecoderMatcher[Int]("end_time")
    object bucket_widthQueryParam extends OptionalQueryParamDecoderMatcher[String]("bucket_width")
    object project_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("project_ids")
    object group_byQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("group_by")
    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object pageQueryParam extends OptionalQueryParamDecoderMatcher[String]("page")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "usage" / "vector_stores" :? start_timeQueryParam(start_time) +& end_timeQueryParam(end_time) +& bucket_widthQueryParam(bucket_width) +& project_idsQueryParam(project_ids) +& group_byQueryParam(group_by) +& limitQueryParam(limit) +& pageQueryParam(page)) as auth =>
        delegate.usageVectorStores.handle_ApiKeyAuth(auth, req, start_time, end_time, bucket_width, project_ids, group_by, limit, page, responses)

    }

    val responses: usageVectorStoresResponses[F] = new usageVectorStoresResponses[F] {
      def resp200(value: UsageResponse): F[Response[F]] = Ok(value)
    }
  }

  val routesApiKeyAuth =
    usageAudioSpeeches.routeApiKeyAuth <+>
    usageAudioTranscriptions.routeApiKeyAuth <+>
    usageCodeInterpreterSessions.routeApiKeyAuth <+>
    usageCompletions.routeApiKeyAuth <+>
    usageCosts.routeApiKeyAuth <+>
    usageEmbeddings.routeApiKeyAuth <+>
    usageImages.routeApiKeyAuth <+>
    usageModerations.routeApiKeyAuth <+>
    usageVectorStores.routeApiKeyAuth
}

object UsageApiDelegate {
  trait usageAudioSpeechesResponses[F[_]] {
    def resp200(value: UsageResponse): F[Response[F]]
  }

  trait usageAudioTranscriptionsResponses[F[_]] {
    def resp200(value: UsageResponse): F[Response[F]]
  }

  trait usageCodeInterpreterSessionsResponses[F[_]] {
    def resp200(value: UsageResponse): F[Response[F]]
  }

  trait usageCompletionsResponses[F[_]] {
    def resp200(value: UsageResponse): F[Response[F]]
  }

  trait usageCostsResponses[F[_]] {
    def resp200(value: UsageResponse): F[Response[F]]
  }

  trait usageEmbeddingsResponses[F[_]] {
    def resp200(value: UsageResponse): F[Response[F]]
  }

  trait usageImagesResponses[F[_]] {
    def resp200(value: UsageResponse): F[Response[F]]
  }

  trait usageModerationsResponses[F[_]] {
    def resp200(value: UsageResponse): F[Response[F]]
  }

  trait usageVectorStoresResponses[F[_]] {
    def resp200(value: UsageResponse): F[Response[F]]
  }

}

trait UsageApiDelegate[F[_], ApiKeyAuth] {

  trait usageAudioSpeeches {
    import UsageApiDelegate.usageAudioSpeechesResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      startTime: Int,
      endTime: Option[Int],
      bucketWidth: Option[String],
      projectIds: Option[List[String]],
      userIds: Option[List[String]],
      apiKeyIds: Option[List[String]],
      models: Option[List[String]],
      groupBy: Option[List[String]],
      limit: Option[Int],
      page: Option[String],
      responses: usageAudioSpeechesResponses[F]
    ): F[Response[F]]

  }
  def usageAudioSpeeches: usageAudioSpeeches


  trait usageAudioTranscriptions {
    import UsageApiDelegate.usageAudioTranscriptionsResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      startTime: Int,
      endTime: Option[Int],
      bucketWidth: Option[String],
      projectIds: Option[List[String]],
      userIds: Option[List[String]],
      apiKeyIds: Option[List[String]],
      models: Option[List[String]],
      groupBy: Option[List[String]],
      limit: Option[Int],
      page: Option[String],
      responses: usageAudioTranscriptionsResponses[F]
    ): F[Response[F]]

  }
  def usageAudioTranscriptions: usageAudioTranscriptions


  trait usageCodeInterpreterSessions {
    import UsageApiDelegate.usageCodeInterpreterSessionsResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      startTime: Int,
      endTime: Option[Int],
      bucketWidth: Option[String],
      projectIds: Option[List[String]],
      groupBy: Option[List[String]],
      limit: Option[Int],
      page: Option[String],
      responses: usageCodeInterpreterSessionsResponses[F]
    ): F[Response[F]]

  }
  def usageCodeInterpreterSessions: usageCodeInterpreterSessions


  trait usageCompletions {
    import UsageApiDelegate.usageCompletionsResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      startTime: Int,
      endTime: Option[Int],
      bucketWidth: Option[String],
      projectIds: Option[List[String]],
      userIds: Option[List[String]],
      apiKeyIds: Option[List[String]],
      models: Option[List[String]],
      batch: Option[Boolean],
      groupBy: Option[List[String]],
      limit: Option[Int],
      page: Option[String],
      responses: usageCompletionsResponses[F]
    ): F[Response[F]]

  }
  def usageCompletions: usageCompletions


  trait usageCosts {
    import UsageApiDelegate.usageCostsResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      startTime: Int,
      endTime: Option[Int],
      bucketWidth: Option[String],
      projectIds: Option[List[String]],
      groupBy: Option[List[String]],
      limit: Option[Int],
      page: Option[String],
      responses: usageCostsResponses[F]
    ): F[Response[F]]

  }
  def usageCosts: usageCosts


  trait usageEmbeddings {
    import UsageApiDelegate.usageEmbeddingsResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      startTime: Int,
      endTime: Option[Int],
      bucketWidth: Option[String],
      projectIds: Option[List[String]],
      userIds: Option[List[String]],
      apiKeyIds: Option[List[String]],
      models: Option[List[String]],
      groupBy: Option[List[String]],
      limit: Option[Int],
      page: Option[String],
      responses: usageEmbeddingsResponses[F]
    ): F[Response[F]]

  }
  def usageEmbeddings: usageEmbeddings


  trait usageImages {
    import UsageApiDelegate.usageImagesResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      startTime: Int,
      endTime: Option[Int],
      bucketWidth: Option[String],
      sources: Option[List[String]],
      sizes: Option[List[String]],
      projectIds: Option[List[String]],
      userIds: Option[List[String]],
      apiKeyIds: Option[List[String]],
      models: Option[List[String]],
      groupBy: Option[List[String]],
      limit: Option[Int],
      page: Option[String],
      responses: usageImagesResponses[F]
    ): F[Response[F]]

  }
  def usageImages: usageImages


  trait usageModerations {
    import UsageApiDelegate.usageModerationsResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      startTime: Int,
      endTime: Option[Int],
      bucketWidth: Option[String],
      projectIds: Option[List[String]],
      userIds: Option[List[String]],
      apiKeyIds: Option[List[String]],
      models: Option[List[String]],
      groupBy: Option[List[String]],
      limit: Option[Int],
      page: Option[String],
      responses: usageModerationsResponses[F]
    ): F[Response[F]]

  }
  def usageModerations: usageModerations


  trait usageVectorStores {
    import UsageApiDelegate.usageVectorStoresResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      startTime: Int,
      endTime: Option[Int],
      bucketWidth: Option[String],
      projectIds: Option[List[String]],
      groupBy: Option[List[String]],
      limit: Option[Int],
      page: Option[String],
      responses: usageVectorStoresResponses[F]
    ): F[Response[F]]

  }
  def usageVectorStores: usageVectorStores

}