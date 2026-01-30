package api

import play.api.libs.json._
import model.UsageResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait UsageApi {
  /**
    * Get audio speeches usage details for the organization.
    * @param startTime Start time (Unix seconds) of the query time range, inclusive.
    * @param endTime End time (Unix seconds) of the query time range, exclusive.
    * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    * @param projectIds Return only usage for these projects.
    * @param userIds Return only usage for these users.
    * @param apiKeyIds Return only usage for these API keys.
    * @param models Return only usage for these models.
    * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
    * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    */
  def usageAudioSpeeches(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Option[List[String]], userIds: Option[List[String]], apiKeyIds: Option[List[String]], models: Option[List[String]], groupBy: Option[List[String]], limit: Option[Int], page: Option[String]): UsageResponse

  /**
    * Get audio transcriptions usage details for the organization.
    * @param startTime Start time (Unix seconds) of the query time range, inclusive.
    * @param endTime End time (Unix seconds) of the query time range, exclusive.
    * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    * @param projectIds Return only usage for these projects.
    * @param userIds Return only usage for these users.
    * @param apiKeyIds Return only usage for these API keys.
    * @param models Return only usage for these models.
    * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
    * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    */
  def usageAudioTranscriptions(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Option[List[String]], userIds: Option[List[String]], apiKeyIds: Option[List[String]], models: Option[List[String]], groupBy: Option[List[String]], limit: Option[Int], page: Option[String]): UsageResponse

  /**
    * Get code interpreter sessions usage details for the organization.
    * @param startTime Start time (Unix seconds) of the query time range, inclusive.
    * @param endTime End time (Unix seconds) of the query time range, exclusive.
    * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    * @param projectIds Return only usage for these projects.
    * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.
    * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    */
  def usageCodeInterpreterSessions(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Option[List[String]], groupBy: Option[List[String]], limit: Option[Int], page: Option[String]): UsageResponse

  /**
    * Get completions usage details for the organization.
    * @param startTime Start time (Unix seconds) of the query time range, inclusive.
    * @param endTime End time (Unix seconds) of the query time range, exclusive.
    * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    * @param projectIds Return only usage for these projects.
    * @param userIds Return only usage for these users.
    * @param apiKeyIds Return only usage for these API keys.
    * @param models Return only usage for these models.
    * @param batch If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both. 
    * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them.
    * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    */
  def usageCompletions(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Option[List[String]], userIds: Option[List[String]], apiKeyIds: Option[List[String]], models: Option[List[String]], batch: Option[Boolean], groupBy: Option[List[String]], limit: Option[Int], page: Option[String]): UsageResponse

  /**
    * Get costs details for the organization.
    * @param startTime Start time (Unix seconds) of the query time range, inclusive.
    * @param endTime End time (Unix seconds) of the query time range, exclusive.
    * @param bucketWidth Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;.
    * @param projectIds Return only costs for these projects.
    * @param groupBy Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them.
    * @param limit A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. 
    * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    */
  def usageCosts(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Option[List[String]], groupBy: Option[List[String]], limit: Option[Int], page: Option[String]): UsageResponse

  /**
    * Get embeddings usage details for the organization.
    * @param startTime Start time (Unix seconds) of the query time range, inclusive.
    * @param endTime End time (Unix seconds) of the query time range, exclusive.
    * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    * @param projectIds Return only usage for these projects.
    * @param userIds Return only usage for these users.
    * @param apiKeyIds Return only usage for these API keys.
    * @param models Return only usage for these models.
    * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
    * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    */
  def usageEmbeddings(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Option[List[String]], userIds: Option[List[String]], apiKeyIds: Option[List[String]], models: Option[List[String]], groupBy: Option[List[String]], limit: Option[Int], page: Option[String]): UsageResponse

  /**
    * Get images usage details for the organization.
    * @param startTime Start time (Unix seconds) of the query time range, inclusive.
    * @param endTime End time (Unix seconds) of the query time range, exclusive.
    * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    * @param sources Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them.
    * @param sizes Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them.
    * @param projectIds Return only usage for these projects.
    * @param userIds Return only usage for these users.
    * @param apiKeyIds Return only usage for these API keys.
    * @param models Return only usage for these models.
    * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them.
    * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    */
  def usageImages(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], sources: Option[List[String]], sizes: Option[List[String]], projectIds: Option[List[String]], userIds: Option[List[String]], apiKeyIds: Option[List[String]], models: Option[List[String]], groupBy: Option[List[String]], limit: Option[Int], page: Option[String]): UsageResponse

  /**
    * Get moderations usage details for the organization.
    * @param startTime Start time (Unix seconds) of the query time range, inclusive.
    * @param endTime End time (Unix seconds) of the query time range, exclusive.
    * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    * @param projectIds Return only usage for these projects.
    * @param userIds Return only usage for these users.
    * @param apiKeyIds Return only usage for these API keys.
    * @param models Return only usage for these models.
    * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
    * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    */
  def usageModerations(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Option[List[String]], userIds: Option[List[String]], apiKeyIds: Option[List[String]], models: Option[List[String]], groupBy: Option[List[String]], limit: Option[Int], page: Option[String]): UsageResponse

  /**
    * Get vector stores usage details for the organization.
    * @param startTime Start time (Unix seconds) of the query time range, inclusive.
    * @param endTime End time (Unix seconds) of the query time range, exclusive.
    * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    * @param projectIds Return only usage for these projects.
    * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.
    * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    */
  def usageVectorStores(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Option[List[String]], groupBy: Option[List[String]], limit: Option[Int], page: Option[String]): UsageResponse
}
