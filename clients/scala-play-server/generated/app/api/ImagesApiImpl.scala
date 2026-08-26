package api

import model.CreateImageEditRequestModel
import model.CreateImageRequest
import model.ImagesResponse
import play.api.libs.Files.TemporaryFile

/**
  * Provides a default implementation for [[ImagesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class ImagesApiImpl extends ImagesApi {
  /**
    * @inheritdoc
    */
  override def createImage(createImageRequest: CreateImageRequest): ImagesResponse = {
    // TODO: Implement better logic

    ImagesResponse(0, List.empty[Image])
  }

  /**
    * @inheritdoc
    */
  override def createImageEdit(image: TemporaryFile, prompt: String, mask: Option[TemporaryFile], model: Option[CreateImageEditRequestModel], n: Option[Int], size: Option[String], responseFormat: Option[String], user: Option[String]): ImagesResponse = {
    // TODO: Implement better logic

    ImagesResponse(0, List.empty[Image])
  }

  /**
    * @inheritdoc
    */
  override def createImageVariation(image: TemporaryFile, model: Option[CreateImageEditRequestModel], n: Option[Int], responseFormat: Option[String], size: Option[String], user: Option[String]): ImagesResponse = {
    // TODO: Implement better logic

    ImagesResponse(0, List.empty[Image])
  }
}
