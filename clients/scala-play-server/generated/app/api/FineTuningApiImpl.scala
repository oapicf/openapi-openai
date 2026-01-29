package api

import model.CreateFineTuningJobRequest
import model.FineTuningJob
import model.ListFineTuningJobCheckpointsResponse
import model.ListFineTuningJobEventsResponse
import model.ListPaginatedFineTuningJobsResponse

/**
  * Provides a default implementation for [[FineTuningApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class FineTuningApiImpl extends FineTuningApi {
  /**
    * @inheritdoc
    */
  override def cancelFineTuningJob(fineTuningJobId: String): FineTuningJob = {
    // TODO: Implement better logic

    FineTuningJob("", 0, FineTuningJobError("", "", ""), "", 0, FineTuningJobHyperparameters(FineTuningJobHyperparametersNEpochs()), "", "", "", List.empty[String], "", 0, "", "", None, 0)
  }

  /**
    * @inheritdoc
    */
  override def createFineTuningJob(createFineTuningJobRequest: CreateFineTuningJobRequest): FineTuningJob = {
    // TODO: Implement better logic

    FineTuningJob("", 0, FineTuningJobError("", "", ""), "", 0, FineTuningJobHyperparameters(FineTuningJobHyperparametersNEpochs()), "", "", "", List.empty[String], "", 0, "", "", None, 0)
  }

  /**
    * @inheritdoc
    */
  override def listFineTuningEvents(fineTuningJobId: String, after: Option[String], limit: Option[Int]): ListFineTuningJobEventsResponse = {
    // TODO: Implement better logic

    ListFineTuningJobEventsResponse(List.empty[FineTuningJobEvent], "")
  }

  /**
    * @inheritdoc
    */
  override def listFineTuningJobCheckpoints(fineTuningJobId: String, after: Option[String], limit: Option[Int]): ListFineTuningJobCheckpointsResponse = {
    // TODO: Implement better logic

    ListFineTuningJobCheckpointsResponse(List.empty[FineTuningJobCheckpoint], "", None, None, false)
  }

  /**
    * @inheritdoc
    */
  override def listPaginatedFineTuningJobs(after: Option[String], limit: Option[Int]): ListPaginatedFineTuningJobsResponse = {
    // TODO: Implement better logic

    ListPaginatedFineTuningJobsResponse(List.empty[FineTuningJob], false, "")
  }

  /**
    * @inheritdoc
    */
  override def retrieveFineTuningJob(fineTuningJobId: String): FineTuningJob = {
    // TODO: Implement better logic

    FineTuningJob("", 0, FineTuningJobError("", "", ""), "", 0, FineTuningJobHyperparameters(FineTuningJobHyperparametersNEpochs()), "", "", "", List.empty[String], "", 0, "", "", None, 0)
  }
}
