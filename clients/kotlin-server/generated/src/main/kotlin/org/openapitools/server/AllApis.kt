package org.openapitools.server

import io.ktor.server.routing.*
import org.openapitools.server.apis.AssistantsApi
import org.openapitools.server.apis.AudioApi
import org.openapitools.server.apis.AuditLogsApi
import org.openapitools.server.apis.BatchApi
import org.openapitools.server.apis.ChatApi
import org.openapitools.server.apis.CompletionsApi
import org.openapitools.server.apis.DefaultApi
import org.openapitools.server.apis.EmbeddingsApi
import org.openapitools.server.apis.FilesApi
import org.openapitools.server.apis.FineTuningApi
import org.openapitools.server.apis.ImagesApi
import org.openapitools.server.apis.InvitesApi
import org.openapitools.server.apis.ModelsApi
import org.openapitools.server.apis.ModerationsApi
import org.openapitools.server.apis.ProjectsApi
import org.openapitools.server.apis.RealtimeApi
import org.openapitools.server.apis.UploadsApi
import org.openapitools.server.apis.UsageApi
import org.openapitools.server.apis.UsersApi
import org.openapitools.server.apis.VectorStoresApi



fun Route.AllApis() {
    AssistantsApi()
    AudioApi()
    AuditLogsApi()
    BatchApi()
    ChatApi()
    CompletionsApi()
    DefaultApi()
    EmbeddingsApi()
    FilesApi()
    FineTuningApi()
    ImagesApi()
    InvitesApi()
    ModelsApi()
    ModerationsApi()
    ProjectsApi()
    RealtimeApi()
    UploadsApi()
    UsageApi()
    UsersApi()
    VectorStoresApi()
}
