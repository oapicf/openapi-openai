package org.openapitools.server

import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Route
import org.openapitools.server.api.AssistantsApi
import org.openapitools.server.api.AudioApi
import org.openapitools.server.api.ChatApi
import org.openapitools.server.api.CompletionsApi
import org.openapitools.server.api.EmbeddingsApi
import org.openapitools.server.api.FilesApi
import org.openapitools.server.api.FineTuningApi
import org.openapitools.server.api.ImagesApi
import org.openapitools.server.api.ModelsApi
import org.openapitools.server.api.ModerationsApi

import akka.http.scaladsl.server.Directives._
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer

class Controller(assistants: AssistantsApi, audio: AudioApi, chat: ChatApi, completions: CompletionsApi, embeddings: EmbeddingsApi, files: FilesApi, fineTuning: FineTuningApi, images: ImagesApi, models: ModelsApi, moderations: ModerationsApi)(implicit system: ActorSystem, materializer: ActorMaterializer) {

    lazy val routes: Route = assistants.route ~ audio.route ~ chat.route ~ completions.route ~ embeddings.route ~ files.route ~ fineTuning.route ~ images.route ~ models.route ~ moderations.route 

    Http().bindAndHandle(routes, "0.0.0.0", 9000)
}