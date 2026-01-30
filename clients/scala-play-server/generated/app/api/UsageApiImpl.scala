package api

import model.UsageResponse

/**
  * Provides a default implementation for [[UsageApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class UsageApiImpl extends UsageApi {
  /**
    * @inheritdoc
    */
  override def usageAudioSpeeches(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Option[List[String]], userIds: Option[List[String]], apiKeyIds: Option[List[String]], models: Option[List[String]], groupBy: Option[List[String]], limit: Option[Int], page: Option[String]): UsageResponse = {
    // TODO: Implement better logic

    UsageResponse("", List.empty[UsageTimeBucket], false, "")
  }

  /**
    * @inheritdoc
    */
  override def usageAudioTranscriptions(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Option[List[String]], userIds: Option[List[String]], apiKeyIds: Option[List[String]], models: Option[List[String]], groupBy: Option[List[String]], limit: Option[Int], page: Option[String]): UsageResponse = {
    // TODO: Implement better logic

    UsageResponse("", List.empty[UsageTimeBucket], false, "")
  }

  /**
    * @inheritdoc
    */
  override def usageCodeInterpreterSessions(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Option[List[String]], groupBy: Option[List[String]], limit: Option[Int], page: Option[String]): UsageResponse = {
    // TODO: Implement better logic

    UsageResponse("", List.empty[UsageTimeBucket], false, "")
  }

  /**
    * @inheritdoc
    */
  override def usageCompletions(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Option[List[String]], userIds: Option[List[String]], apiKeyIds: Option[List[String]], models: Option[List[String]], batch: Option[Boolean], groupBy: Option[List[String]], limit: Option[Int], page: Option[String]): UsageResponse = {
    // TODO: Implement better logic

    UsageResponse("", List.empty[UsageTimeBucket], false, "")
  }

  /**
    * @inheritdoc
    */
  override def usageCosts(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Option[List[String]], groupBy: Option[List[String]], limit: Option[Int], page: Option[String]): UsageResponse = {
    // TODO: Implement better logic

    UsageResponse("", List.empty[UsageTimeBucket], false, "")
  }

  /**
    * @inheritdoc
    */
  override def usageEmbeddings(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Option[List[String]], userIds: Option[List[String]], apiKeyIds: Option[List[String]], models: Option[List[String]], groupBy: Option[List[String]], limit: Option[Int], page: Option[String]): UsageResponse = {
    // TODO: Implement better logic

    UsageResponse("", List.empty[UsageTimeBucket], false, "")
  }

  /**
    * @inheritdoc
    */
  override def usageImages(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], sources: Option[List[String]], sizes: Option[List[String]], projectIds: Option[List[String]], userIds: Option[List[String]], apiKeyIds: Option[List[String]], models: Option[List[String]], groupBy: Option[List[String]], limit: Option[Int], page: Option[String]): UsageResponse = {
    // TODO: Implement better logic

    UsageResponse("", List.empty[UsageTimeBucket], false, "")
  }

  /**
    * @inheritdoc
    */
  override def usageModerations(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Option[List[String]], userIds: Option[List[String]], apiKeyIds: Option[List[String]], models: Option[List[String]], groupBy: Option[List[String]], limit: Option[Int], page: Option[String]): UsageResponse = {
    // TODO: Implement better logic

    UsageResponse("", List.empty[UsageTimeBucket], false, "")
  }

  /**
    * @inheritdoc
    */
  override def usageVectorStores(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Option[List[String]], groupBy: Option[List[String]], limit: Option[Int], page: Option[String]): UsageResponse = {
    // TODO: Implement better logic

    UsageResponse("", List.empty[UsageTimeBucket], false, "")
  }
}
