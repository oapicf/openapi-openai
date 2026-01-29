package api

import model.DeleteModelResponse
import model.ListModelsResponse
import model.Model

/**
  * Provides a default implementation for [[ModelsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class ModelsApiImpl extends ModelsApi {
  /**
    * @inheritdoc
    */
  override def deleteModel(model: String): DeleteModelResponse = {
    // TODO: Implement better logic

    DeleteModelResponse("", false, "")
  }

  /**
    * @inheritdoc
    */
  override def listModels(): ListModelsResponse = {
    // TODO: Implement better logic

    ListModelsResponse("", List.empty[Model])
  }

  /**
    * @inheritdoc
    */
  override def retrieveModel(model: String): Model = {
    // TODO: Implement better logic

    Model("", 0, "", "")
  }
}
