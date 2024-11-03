package org.openapitools

import api._
import play.api.inject.{Binding, Module => PlayModule}
import play.api.{Configuration, Environment}

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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
