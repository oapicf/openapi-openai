/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.swagger.client.api

import akka.{Done, NotUsed}
import com.lightbend.lagom.scaladsl.api.transport.Method
import com.lightbend.lagom.scaladsl.api.{Service, ServiceCall}
import play.api.libs.json._
import com.lightbend.lagom.scaladsl.api.deser.PathParamSerializer

import io.swagger.client.model.DeleteModelResponse
import io.swagger.client.model.ListModelsResponse
import io.swagger.client.model.Model

trait ModelsApi extends Service {


  final override def descriptor = {
    import Service._
    named("ModelsApi").withCalls(
      restCall(Method.DELETE, "/models/:model", deleteModel _), 
      restCall(Method.GET, "/models", listModels _), 
      restCall(Method.GET, "/models/:model", retrieveModel _)
    ).withAutoAcl(true)
  }


  /**
    * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
    * 
    *  
    * @param model The model to delete 
    * @return DeleteModelResponse
    */
  def deleteModel(model: String): ServiceCall[NotUsed ,DeleteModelResponse]
  
  /**
    * Lists the currently available models, and provides basic information about each one such as the owner and availability.
    * 
    * 
    * @return ListModelsResponse
    */
  def listModels(): ServiceCall[NotUsed ,ListModelsResponse]
  
  /**
    * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    * 
    *  
    * @param model The ID of the model to use for this request 
    * @return Model
    */
  def retrieveModel(model: String): ServiceCall[NotUsed ,Model]
  

  }