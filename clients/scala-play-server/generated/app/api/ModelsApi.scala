package api

import play.api.libs.json._
import model.DeleteModelResponse
import model.ListModelsResponse
import model.Model

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
trait ModelsApi {
  /**
    * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
    * @param model The model to delete
    */
  def deleteModel(model: String): DeleteModelResponse

  /**
    * Lists the currently available models, and provides basic information about each one such as the owner and availability.
    */
  def listModels(): ListModelsResponse

  /**
    * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    * @param model The ID of the model to use for this request
    */
  def retrieveModel(model: String): Model
}
