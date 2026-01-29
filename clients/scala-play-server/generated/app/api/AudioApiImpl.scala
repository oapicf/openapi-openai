package api

import model.BigDecimal
import model.CreateSpeechRequest
import model.CreateTranscription200Response
import model.CreateTranscriptionRequestModel
import model.CreateTranslation200Response
import play.api.libs.Files.TemporaryFile

/**
  * Provides a default implementation for [[AudioApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class AudioApiImpl extends AudioApi {
  /**
    * @inheritdoc
    */
  override def createSpeech(createSpeechRequest: CreateSpeechRequest): TemporaryFile = {
    // TODO: Implement better logic

    ""
  }

  /**
    * @inheritdoc
    */
  override def createTranscription(file: TemporaryFile, model: CreateTranscriptionRequestModel, language: Option[String], prompt: Option[String], responseFormat: Option[String], temperature: Option[BigDecimal], timestampGranularitiesLeft_Square_BracketRight_Square_Bracket: Option[List[String]]): CreateTranscription200Response = {
    // TODO: Implement better logic

    CreateTranscription200Response("", "", "", None, None)
  }

  /**
    * @inheritdoc
    */
  override def createTranslation(file: TemporaryFile, model: CreateTranscriptionRequestModel, prompt: Option[String], responseFormat: Option[String], temperature: Option[BigDecimal]): CreateTranslation200Response = {
    // TODO: Implement better logic

    CreateTranslation200Response("", "", "", None)
  }
}
