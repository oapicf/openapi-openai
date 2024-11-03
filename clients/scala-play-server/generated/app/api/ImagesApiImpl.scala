package api

import model.CreateImageEditRequestModel
import model.CreateImageRequest
import model.ImagesResponse
import play.api.libs.Files.TemporaryFile

/**
  * Provides a default implementation for [[ImagesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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
