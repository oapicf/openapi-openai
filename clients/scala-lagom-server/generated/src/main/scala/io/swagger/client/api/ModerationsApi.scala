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

import io.swagger.client.model.CreateModerationRequest
import io.swagger.client.model.CreateModerationResponse

trait ModerationsApi extends Service {


  final override def descriptor = {
    import Service._
    named("ModerationsApi").withCalls(
      restCall(Method.POST, "/moderations", createModeration _)
    ).withAutoAcl(true)
  }


  /**
    * Classifies if text is potentially harmful.
    * 
    *  
    * @return CreateModerationResponse Body Parameter   
    */
  def createModeration(): ServiceCall[CreateModerationRequest ,CreateModerationResponse]
  

  }
