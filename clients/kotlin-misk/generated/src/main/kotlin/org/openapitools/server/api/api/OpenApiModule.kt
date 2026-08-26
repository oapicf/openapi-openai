package org.openapitools.server.api.api

import misk.inject.KAbstractModule
import misk.web.WebActionModule
import jakarta.inject.Singleton
import org.openapitools.server.api.api.AssistantsApiAction
import org.openapitools.server.api.api.AudioApiAction
import org.openapitools.server.api.api.AuditLogsApiAction
import org.openapitools.server.api.api.BatchApiAction
import org.openapitools.server.api.api.ChatApiAction
import org.openapitools.server.api.api.CompletionsApiAction
import org.openapitools.server.api.api.DefaultApiAction
import org.openapitools.server.api.api.EmbeddingsApiAction
import org.openapitools.server.api.api.FilesApiAction
import org.openapitools.server.api.api.FineTuningApiAction
import org.openapitools.server.api.api.ImagesApiAction
import org.openapitools.server.api.api.InvitesApiAction
import org.openapitools.server.api.api.ModelsApiAction
import org.openapitools.server.api.api.ModerationsApiAction
import org.openapitools.server.api.api.ProjectsApiAction
import org.openapitools.server.api.api.RealtimeApiAction
import org.openapitools.server.api.api.UploadsApiAction
import org.openapitools.server.api.api.UsageApiAction
import org.openapitools.server.api.api.UsersApiAction
import org.openapitools.server.api.api.VectorStoresApiAction

@Singleton
class OpenApiModule : KAbstractModule() {
    override fun configure() {
        install(WebActionModule.create<AssistantsApiAction>())
        install(WebActionModule.create<AudioApiAction>())
        install(WebActionModule.create<AuditLogsApiAction>())
        install(WebActionModule.create<BatchApiAction>())
        install(WebActionModule.create<ChatApiAction>())
        install(WebActionModule.create<CompletionsApiAction>())
        install(WebActionModule.create<DefaultApiAction>())
        install(WebActionModule.create<EmbeddingsApiAction>())
        install(WebActionModule.create<FilesApiAction>())
        install(WebActionModule.create<FineTuningApiAction>())
        install(WebActionModule.create<ImagesApiAction>())
        install(WebActionModule.create<InvitesApiAction>())
        install(WebActionModule.create<ModelsApiAction>())
        install(WebActionModule.create<ModerationsApiAction>())
        install(WebActionModule.create<ProjectsApiAction>())
        install(WebActionModule.create<RealtimeApiAction>())
        install(WebActionModule.create<UploadsApiAction>())
        install(WebActionModule.create<UsageApiAction>())
        install(WebActionModule.create<UsersApiAction>())
        install(WebActionModule.create<VectorStoresApiAction>())
    }
}