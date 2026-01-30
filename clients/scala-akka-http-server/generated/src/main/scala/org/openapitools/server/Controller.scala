package org.openapitools.server

import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Route
import org.openapitools.server.api.AssistantsApi
import org.openapitools.server.api.AudioApi
import org.openapitools.server.api.AuditLogsApi
import org.openapitools.server.api.BatchApi
import org.openapitools.server.api.ChatApi
import org.openapitools.server.api.CompletionsApi
import org.openapitools.server.api.DefaultApi
import org.openapitools.server.api.EmbeddingsApi
import org.openapitools.server.api.FilesApi
import org.openapitools.server.api.FineTuningApi
import org.openapitools.server.api.ImagesApi
import org.openapitools.server.api.InvitesApi
import org.openapitools.server.api.ModelsApi
import org.openapitools.server.api.ModerationsApi
import org.openapitools.server.api.ProjectsApi
import org.openapitools.server.api.RealtimeApi
import org.openapitools.server.api.UploadsApi
import org.openapitools.server.api.UsageApi
import org.openapitools.server.api.UsersApi
import org.openapitools.server.api.VectorStoresApi

import akka.http.scaladsl.server.Directives._
import akka.actor.ActorSystem
import akka.stream.Materializer

class Controller(assistants: AssistantsApi, audio: AudioApi, auditLogs: AuditLogsApi, batch: BatchApi, chat: ChatApi, completions: CompletionsApi, default: DefaultApi, embeddings: EmbeddingsApi, files: FilesApi, fineTuning: FineTuningApi, images: ImagesApi, invites: InvitesApi, models: ModelsApi, moderations: ModerationsApi, projects: ProjectsApi, realtime: RealtimeApi, uploads: UploadsApi, usage: UsageApi, users: UsersApi, vectorStores: VectorStoresApi)(implicit system: ActorSystem, materializer: Materializer) {

    lazy val routes: Route = assistants.route ~ audio.route ~ auditLogs.route ~ batch.route ~ chat.route ~ completions.route ~ default.route ~ embeddings.route ~ files.route ~ fineTuning.route ~ images.route ~ invites.route ~ models.route ~ moderations.route ~ projects.route ~ realtime.route ~ uploads.route ~ usage.route ~ users.route ~ vectorStores.route 

    Http().newServerAt("0.0.0.0", 9000).bind(routes)
}
