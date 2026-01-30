#ifndef _UsageManager_H_
#define _UsageManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "UsageResponse.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Usage Usage
 * \ingroup Operations
 *  @{
 */
class UsageManager {
public:
	UsageManager();
	virtual ~UsageManager();

/*! \brief Get audio speeches usage details for the organization.. *Synchronous*
 *
 * 
 * \param startTime Start time (Unix seconds) of the query time range, inclusive. *Required*
 * \param endTime End time (Unix seconds) of the query time range, exclusive.
 * \param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
 * \param projectIds Return only usage for these projects.
 * \param userIds Return only usage for these users.
 * \param apiKeyIds Return only usage for these API keys.
 * \param models Return only usage for these models.
 * \param groupBy Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
 * \param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
 * \param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool usageAudioSpeechesSync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData);

/*! \brief Get audio speeches usage details for the organization.. *Asynchronous*
 *
 * 
 * \param startTime Start time (Unix seconds) of the query time range, inclusive. *Required*
 * \param endTime End time (Unix seconds) of the query time range, exclusive.
 * \param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
 * \param projectIds Return only usage for these projects.
 * \param userIds Return only usage for these users.
 * \param apiKeyIds Return only usage for these API keys.
 * \param models Return only usage for these models.
 * \param groupBy Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
 * \param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
 * \param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool usageAudioSpeechesAsync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData);


/*! \brief Get audio transcriptions usage details for the organization.. *Synchronous*
 *
 * 
 * \param startTime Start time (Unix seconds) of the query time range, inclusive. *Required*
 * \param endTime End time (Unix seconds) of the query time range, exclusive.
 * \param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
 * \param projectIds Return only usage for these projects.
 * \param userIds Return only usage for these users.
 * \param apiKeyIds Return only usage for these API keys.
 * \param models Return only usage for these models.
 * \param groupBy Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
 * \param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
 * \param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool usageAudioTranscriptionsSync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData);

/*! \brief Get audio transcriptions usage details for the organization.. *Asynchronous*
 *
 * 
 * \param startTime Start time (Unix seconds) of the query time range, inclusive. *Required*
 * \param endTime End time (Unix seconds) of the query time range, exclusive.
 * \param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
 * \param projectIds Return only usage for these projects.
 * \param userIds Return only usage for these users.
 * \param apiKeyIds Return only usage for these API keys.
 * \param models Return only usage for these models.
 * \param groupBy Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
 * \param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
 * \param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool usageAudioTranscriptionsAsync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData);


/*! \brief Get code interpreter sessions usage details for the organization.. *Synchronous*
 *
 * 
 * \param startTime Start time (Unix seconds) of the query time range, inclusive. *Required*
 * \param endTime End time (Unix seconds) of the query time range, exclusive.
 * \param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
 * \param projectIds Return only usage for these projects.
 * \param groupBy Group the usage data by the specified fields. Support fields include `project_id`.
 * \param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
 * \param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool usageCodeInterpreterSessionsSync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData);

/*! \brief Get code interpreter sessions usage details for the organization.. *Asynchronous*
 *
 * 
 * \param startTime Start time (Unix seconds) of the query time range, inclusive. *Required*
 * \param endTime End time (Unix seconds) of the query time range, exclusive.
 * \param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
 * \param projectIds Return only usage for these projects.
 * \param groupBy Group the usage data by the specified fields. Support fields include `project_id`.
 * \param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
 * \param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool usageCodeInterpreterSessionsAsync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData);


/*! \brief Get completions usage details for the organization.. *Synchronous*
 *
 * 
 * \param startTime Start time (Unix seconds) of the query time range, inclusive. *Required*
 * \param endTime End time (Unix seconds) of the query time range, exclusive.
 * \param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
 * \param projectIds Return only usage for these projects.
 * \param userIds Return only usage for these users.
 * \param apiKeyIds Return only usage for these API keys.
 * \param models Return only usage for these models.
 * \param batch If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both. 
 * \param groupBy Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them.
 * \param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
 * \param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool usageCompletionsSync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, bool batch, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData);

/*! \brief Get completions usage details for the organization.. *Asynchronous*
 *
 * 
 * \param startTime Start time (Unix seconds) of the query time range, inclusive. *Required*
 * \param endTime End time (Unix seconds) of the query time range, exclusive.
 * \param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
 * \param projectIds Return only usage for these projects.
 * \param userIds Return only usage for these users.
 * \param apiKeyIds Return only usage for these API keys.
 * \param models Return only usage for these models.
 * \param batch If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both. 
 * \param groupBy Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them.
 * \param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
 * \param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool usageCompletionsAsync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, bool batch, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData);


/*! \brief Get costs details for the organization.. *Synchronous*
 *
 * 
 * \param startTime Start time (Unix seconds) of the query time range, inclusive. *Required*
 * \param endTime End time (Unix seconds) of the query time range, exclusive.
 * \param bucketWidth Width of each time bucket in response. Currently only `1d` is supported, default to `1d`.
 * \param projectIds Return only costs for these projects.
 * \param groupBy Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them.
 * \param limit A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. 
 * \param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool usageCostsSync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData);

/*! \brief Get costs details for the organization.. *Asynchronous*
 *
 * 
 * \param startTime Start time (Unix seconds) of the query time range, inclusive. *Required*
 * \param endTime End time (Unix seconds) of the query time range, exclusive.
 * \param bucketWidth Width of each time bucket in response. Currently only `1d` is supported, default to `1d`.
 * \param projectIds Return only costs for these projects.
 * \param groupBy Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them.
 * \param limit A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. 
 * \param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool usageCostsAsync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData);


/*! \brief Get embeddings usage details for the organization.. *Synchronous*
 *
 * 
 * \param startTime Start time (Unix seconds) of the query time range, inclusive. *Required*
 * \param endTime End time (Unix seconds) of the query time range, exclusive.
 * \param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
 * \param projectIds Return only usage for these projects.
 * \param userIds Return only usage for these users.
 * \param apiKeyIds Return only usage for these API keys.
 * \param models Return only usage for these models.
 * \param groupBy Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
 * \param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
 * \param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool usageEmbeddingsSync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData);

/*! \brief Get embeddings usage details for the organization.. *Asynchronous*
 *
 * 
 * \param startTime Start time (Unix seconds) of the query time range, inclusive. *Required*
 * \param endTime End time (Unix seconds) of the query time range, exclusive.
 * \param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
 * \param projectIds Return only usage for these projects.
 * \param userIds Return only usage for these users.
 * \param apiKeyIds Return only usage for these API keys.
 * \param models Return only usage for these models.
 * \param groupBy Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
 * \param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
 * \param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool usageEmbeddingsAsync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData);


/*! \brief Get images usage details for the organization.. *Synchronous*
 *
 * 
 * \param startTime Start time (Unix seconds) of the query time range, inclusive. *Required*
 * \param endTime End time (Unix seconds) of the query time range, exclusive.
 * \param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
 * \param sources Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them.
 * \param sizes Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them.
 * \param projectIds Return only usage for these projects.
 * \param userIds Return only usage for these users.
 * \param apiKeyIds Return only usage for these API keys.
 * \param models Return only usage for these models.
 * \param groupBy Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them.
 * \param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
 * \param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool usageImagesSync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> sources, std::list<std::string> sizes, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData);

/*! \brief Get images usage details for the organization.. *Asynchronous*
 *
 * 
 * \param startTime Start time (Unix seconds) of the query time range, inclusive. *Required*
 * \param endTime End time (Unix seconds) of the query time range, exclusive.
 * \param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
 * \param sources Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them.
 * \param sizes Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them.
 * \param projectIds Return only usage for these projects.
 * \param userIds Return only usage for these users.
 * \param apiKeyIds Return only usage for these API keys.
 * \param models Return only usage for these models.
 * \param groupBy Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them.
 * \param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
 * \param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool usageImagesAsync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> sources, std::list<std::string> sizes, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData);


/*! \brief Get moderations usage details for the organization.. *Synchronous*
 *
 * 
 * \param startTime Start time (Unix seconds) of the query time range, inclusive. *Required*
 * \param endTime End time (Unix seconds) of the query time range, exclusive.
 * \param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
 * \param projectIds Return only usage for these projects.
 * \param userIds Return only usage for these users.
 * \param apiKeyIds Return only usage for these API keys.
 * \param models Return only usage for these models.
 * \param groupBy Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
 * \param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
 * \param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool usageModerationsSync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData);

/*! \brief Get moderations usage details for the organization.. *Asynchronous*
 *
 * 
 * \param startTime Start time (Unix seconds) of the query time range, inclusive. *Required*
 * \param endTime End time (Unix seconds) of the query time range, exclusive.
 * \param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
 * \param projectIds Return only usage for these projects.
 * \param userIds Return only usage for these users.
 * \param apiKeyIds Return only usage for these API keys.
 * \param models Return only usage for these models.
 * \param groupBy Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
 * \param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
 * \param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool usageModerationsAsync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData);


/*! \brief Get vector stores usage details for the organization.. *Synchronous*
 *
 * 
 * \param startTime Start time (Unix seconds) of the query time range, inclusive. *Required*
 * \param endTime End time (Unix seconds) of the query time range, exclusive.
 * \param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
 * \param projectIds Return only usage for these projects.
 * \param groupBy Group the usage data by the specified fields. Support fields include `project_id`.
 * \param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
 * \param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool usageVectorStoresSync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData);

/*! \brief Get vector stores usage details for the organization.. *Asynchronous*
 *
 * 
 * \param startTime Start time (Unix seconds) of the query time range, inclusive. *Required*
 * \param endTime End time (Unix seconds) of the query time range, exclusive.
 * \param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
 * \param projectIds Return only usage for these projects.
 * \param groupBy Group the usage data by the specified fields. Support fields include `project_id`.
 * \param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
 * \param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool usageVectorStoresAsync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.openai.com/v1";
	}
};
/** @}*/

}
}
#endif /* UsageManager_H_ */
