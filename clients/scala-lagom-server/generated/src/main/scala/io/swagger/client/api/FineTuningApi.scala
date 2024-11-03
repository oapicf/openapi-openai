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

import io.swagger.client.model.CreateFineTuningJobRequest
import io.swagger.client.model.FineTuningJob
import io.swagger.client.model.ListFineTuningJobCheckpointsResponse
import io.swagger.client.model.ListFineTuningJobEventsResponse
import io.swagger.client.model.ListPaginatedFineTuningJobsResponse

trait FineTuningApi extends Service {


  final override def descriptor = {
    import Service._
    named("FineTuningApi").withCalls(
      restCall(Method.POST, "/fine_tuning/jobs/:fine_tuning_job_id/cancel", cancelFineTuningJob _), 
      restCall(Method.POST, "/fine_tuning/jobs", createFineTuningJob _), 
      restCall(Method.GET, "/fine_tuning/jobs/:fine_tuning_job_id/events?after&limit", listFineTuningEvents _), 
      restCall(Method.GET, "/fine_tuning/jobs/:fine_tuning_job_id/checkpoints?after&limit", listFineTuningJobCheckpoints _), 
      restCall(Method.GET, "/fine_tuning/jobs?after&limit", listPaginatedFineTuningJobs _), 
      restCall(Method.GET, "/fine_tuning/jobs/:fine_tuning_job_id", retrieveFineTuningJob _)
    ).withAutoAcl(true)
  }


  /**
    * Immediately cancel a fine-tune job. 
    * 
    *  
    * @param fineTuningJobId The ID of the fine-tuning job to cancel.  
    * @return FineTuningJob
    */
  def cancelFineTuningJob(fineTuningJobId: String): ServiceCall[NotUsed ,FineTuningJob]
  
  /**
    * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    * 
    *  
    * @return FineTuningJob Body Parameter   
    */
  def createFineTuningJob(): ServiceCall[CreateFineTuningJobRequest ,FineTuningJob]
        
  /**
    * Get status updates for a fine-tuning job. 
    * 
    *  
    * @param fineTuningJobId The ID of the fine-tuning job to get events for.   
    * @param after Identifier for the last event from the previous pagination request. (optional) 
    * @param limit Number of events to retrieve. (optional, default to 20)
    * @return ListFineTuningJobEventsResponse
    */
  def listFineTuningEvents(after:           Option[String] = None,limit:           Option[Int] /* = 20*/fineTuningJobId: String): ServiceCall[NotUsed ,ListFineTuningJobEventsResponse]
        
  /**
    * List checkpoints for a fine-tuning job. 
    * 
    *  
    * @param fineTuningJobId The ID of the fine-tuning job to get checkpoints for.   
    * @param after Identifier for the last checkpoint ID from the previous pagination request. (optional) 
    * @param limit Number of checkpoints to retrieve. (optional, default to 10)
    * @return ListFineTuningJobCheckpointsResponse
    */
  def listFineTuningJobCheckpoints(after:           Option[String] = None,limit:           Option[Int] /* = 10*/fineTuningJobId: String): ServiceCall[NotUsed ,ListFineTuningJobCheckpointsResponse]
        
  /**
    * List your organization&#39;s fine-tuning jobs 
    * 
    *  
    * @param after Identifier for the last job from the previous pagination request. (optional) 
    * @param limit Number of fine-tuning jobs to retrieve. (optional, default to 20)
    * @return ListPaginatedFineTuningJobsResponse
    */
  def listPaginatedFineTuningJobs(after:           Option[String] = None,limit:           Option[Int] /* = 20*/): ServiceCall[NotUsed ,ListPaginatedFineTuningJobsResponse]
  
  /**
    * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    * 
    *  
    * @param fineTuningJobId The ID of the fine-tuning job.  
    * @return FineTuningJob
    */
  def retrieveFineTuningJob(fineTuningJobId: String): ServiceCall[NotUsed ,FineTuningJob]
  

  }
