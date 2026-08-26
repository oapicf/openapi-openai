package org.openapitools

import org.http4s.circe._
import cats.Monad
import cats.syntax.all._
import cats.data.OptionT
import cats.data.Kleisli
import org.http4s._
import org.http4s.server._

import org.openapitools.apis._

final case class API [
  F[_]: JsonDecoder: Monad, ApiKeyAuth
](
  apiKeyAuth: Kleisli[OptionT[F, *], Request[F], ApiKeyAuth],
)(
  delegateAssistantsApi: AssistantsApiDelegate[F, ApiKeyAuth],
  delegateAudioApi: AudioApiDelegate[F, ApiKeyAuth],
  delegateAuditLogsApi: AuditLogsApiDelegate[F, ApiKeyAuth],
  delegateBatchApi: BatchApiDelegate[F, ApiKeyAuth],
  delegateChatApi: ChatApiDelegate[F, ApiKeyAuth],
  delegateCompletionsApi: CompletionsApiDelegate[F, ApiKeyAuth],
  delegateDefaultApi: DefaultApiDelegate[F, ApiKeyAuth],
  delegateEmbeddingsApi: EmbeddingsApiDelegate[F, ApiKeyAuth],
  delegateFilesApi: FilesApiDelegate[F, ApiKeyAuth],
  delegateFineTuningApi: FineTuningApiDelegate[F, ApiKeyAuth],
  delegateImagesApi: ImagesApiDelegate[F, ApiKeyAuth],
  delegateInvitesApi: InvitesApiDelegate[F, ApiKeyAuth],
  delegateModelsApi: ModelsApiDelegate[F, ApiKeyAuth],
  delegateModerationsApi: ModerationsApiDelegate[F, ApiKeyAuth],
  delegateProjectsApi: ProjectsApiDelegate[F, ApiKeyAuth],
  delegateRealtimeApi: RealtimeApiDelegate[F, ApiKeyAuth],
  delegateUploadsApi: UploadsApiDelegate[F, ApiKeyAuth],
  delegateUsageApi: UsageApiDelegate[F, ApiKeyAuth],
  delegateUsersApi: UsersApiDelegate[F, ApiKeyAuth],
  delegateVectorStoresApi: VectorStoresApiDelegate[F, ApiKeyAuth],
){
  val apiKeyAuthMiddleware = AuthMiddleware(apiKeyAuth)

  val assistantsApiRoutes = new AssistantsApiRoutes(delegateAssistantsApi)
  val audioApiRoutes = new AudioApiRoutes(delegateAudioApi)
  val auditLogsApiRoutes = new AuditLogsApiRoutes(delegateAuditLogsApi)
  val batchApiRoutes = new BatchApiRoutes(delegateBatchApi)
  val chatApiRoutes = new ChatApiRoutes(delegateChatApi)
  val completionsApiRoutes = new CompletionsApiRoutes(delegateCompletionsApi)
  val defaultApiRoutes = new DefaultApiRoutes(delegateDefaultApi)
  val embeddingsApiRoutes = new EmbeddingsApiRoutes(delegateEmbeddingsApi)
  val filesApiRoutes = new FilesApiRoutes(delegateFilesApi)
  val fineTuningApiRoutes = new FineTuningApiRoutes(delegateFineTuningApi)
  val imagesApiRoutes = new ImagesApiRoutes(delegateImagesApi)
  val invitesApiRoutes = new InvitesApiRoutes(delegateInvitesApi)
  val modelsApiRoutes = new ModelsApiRoutes(delegateModelsApi)
  val moderationsApiRoutes = new ModerationsApiRoutes(delegateModerationsApi)
  val projectsApiRoutes = new ProjectsApiRoutes(delegateProjectsApi)
  val realtimeApiRoutes = new RealtimeApiRoutes(delegateRealtimeApi)
  val uploadsApiRoutes = new UploadsApiRoutes(delegateUploadsApi)
  val usageApiRoutes = new UsageApiRoutes(delegateUsageApi)
  val usersApiRoutes = new UsersApiRoutes(delegateUsersApi)
  val vectorStoresApiRoutes = new VectorStoresApiRoutes(delegateVectorStoresApi)

  val routesApiKeyAuth = apiKeyAuthMiddleware(
    assistantsApiRoutes.routesApiKeyAuth <+>
      audioApiRoutes.routesApiKeyAuth <+>
      auditLogsApiRoutes.routesApiKeyAuth <+>
      batchApiRoutes.routesApiKeyAuth <+>
      chatApiRoutes.routesApiKeyAuth <+>
      completionsApiRoutes.routesApiKeyAuth <+>
      defaultApiRoutes.routesApiKeyAuth <+>
      embeddingsApiRoutes.routesApiKeyAuth <+>
      filesApiRoutes.routesApiKeyAuth <+>
      fineTuningApiRoutes.routesApiKeyAuth <+>
      imagesApiRoutes.routesApiKeyAuth <+>
      invitesApiRoutes.routesApiKeyAuth <+>
      modelsApiRoutes.routesApiKeyAuth <+>
      moderationsApiRoutes.routesApiKeyAuth <+>
      projectsApiRoutes.routesApiKeyAuth <+>
      realtimeApiRoutes.routesApiKeyAuth <+>
      uploadsApiRoutes.routesApiKeyAuth <+>
      usageApiRoutes.routesApiKeyAuth <+>
      usersApiRoutes.routesApiKeyAuth <+>
      vectorStoresApiRoutes.routesApiKeyAuth
  )

  val routesAll =
    routesApiKeyAuth
}
