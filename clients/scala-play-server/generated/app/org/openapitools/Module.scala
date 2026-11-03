package org.openapitools

import api._
import play.api.inject.{Binding, Module => PlayModule}
import play.api.{Configuration, Environment}

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
class Module extends PlayModule {
  override def bindings(environment: Environment, configuration: Configuration): Seq[Binding[_]] = Seq(
    bind[AssistantsApi].to[AssistantsApiImpl],
    bind[AudioApi].to[AudioApiImpl],
    bind[AuditLogsApi].to[AuditLogsApiImpl],
    bind[BatchApi].to[BatchApiImpl],
    bind[ChatApi].to[ChatApiImpl],
    bind[CompletionsApi].to[CompletionsApiImpl],
    bind[DefaultApi].to[DefaultApiImpl],
    bind[EmbeddingsApi].to[EmbeddingsApiImpl],
    bind[FilesApi].to[FilesApiImpl],
    bind[FineTuningApi].to[FineTuningApiImpl],
    bind[ImagesApi].to[ImagesApiImpl],
    bind[InvitesApi].to[InvitesApiImpl],
    bind[ModelsApi].to[ModelsApiImpl],
    bind[ModerationsApi].to[ModerationsApiImpl],
    bind[ProjectsApi].to[ProjectsApiImpl],
    bind[RealtimeApi].to[RealtimeApiImpl],
    bind[UploadsApi].to[UploadsApiImpl],
    bind[UsageApi].to[UsageApiImpl],
    bind[UsersApi].to[UsersApiImpl],
    bind[VectorStoresApi].to[VectorStoresApiImpl]
  )
}
