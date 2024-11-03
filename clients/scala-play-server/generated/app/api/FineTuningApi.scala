package api

import play.api.libs.json._
import model.CreateFineTuningJobRequest
import model.FineTuningJob
import model.ListFineTuningJobCheckpointsResponse
import model.ListFineTuningJobEventsResponse
import model.ListPaginatedFineTuningJobsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
trait FineTuningApi {
  /**
    * Immediately cancel a fine-tune job. 
    * @param fineTuningJobId The ID of the fine-tuning job to cancel. 
    */
  def cancelFineTuningJob(fineTuningJobId: String): FineTuningJob

  /**
    * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    */
  def createFineTuningJob(createFineTuningJobRequest: CreateFineTuningJobRequest): FineTuningJob

  /**
    * Get status updates for a fine-tuning job. 
    * @param fineTuningJobId The ID of the fine-tuning job to get events for. 
    * @param after Identifier for the last event from the previous pagination request.
    * @param limit Number of events to retrieve.
    */
  def listFineTuningEvents(fineTuningJobId: String, after: Option[String], limit: Option[Int]): ListFineTuningJobEventsResponse

  /**
    * List checkpoints for a fine-tuning job. 
    * @param fineTuningJobId The ID of the fine-tuning job to get checkpoints for. 
    * @param after Identifier for the last checkpoint ID from the previous pagination request.
    * @param limit Number of checkpoints to retrieve.
    */
  def listFineTuningJobCheckpoints(fineTuningJobId: String, after: Option[String], limit: Option[Int]): ListFineTuningJobCheckpointsResponse

  /**
    * List your organization&#39;s fine-tuning jobs 
    * @param after Identifier for the last job from the previous pagination request.
    * @param limit Number of fine-tuning jobs to retrieve.
    */
  def listPaginatedFineTuningJobs(after: Option[String], limit: Option[Int]): ListPaginatedFineTuningJobsResponse

  /**
    * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    * @param fineTuningJobId The ID of the fine-tuning job. 
    */
  def retrieveFineTuningJob(fineTuningJobId: String): FineTuningJob
}
