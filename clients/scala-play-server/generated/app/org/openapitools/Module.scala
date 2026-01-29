package org.openapitools

import api._
import play.api.inject.{Binding, Module => PlayModule}
import play.api.{Configuration, Environment}

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class Module extends PlayModule {
  override def bindings(environment: Environment, configuration: Configuration): Seq[Binding[_]] = Seq(
    bind[AssistantsApi].to[AssistantsApiImpl],
    bind[AudioApi].to[AudioApiImpl],
    bind[ChatApi].to[ChatApiImpl],
    bind[CompletionsApi].to[CompletionsApiImpl],
    bind[EmbeddingsApi].to[EmbeddingsApiImpl],
    bind[FilesApi].to[FilesApiImpl],
    bind[FineTuningApi].to[FineTuningApiImpl],
    bind[ImagesApi].to[ImagesApiImpl],
    bind[ModelsApi].to[ModelsApiImpl],
    bind[ModerationsApi].to[ModerationsApiImpl]
  )
}
