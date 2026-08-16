#ifndef TINY_CPP_CLIENT_UsageApi_H_
#define TINY_CPP_CLIENT_UsageApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "UsageResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class UsageApi : public Service {
public:
    UsageApi() = default;

    virtual ~UsageApi() = default;

    /**
    * Get audio speeches usage details for the organization..
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
    */
    Response<
                UsageResponse
        >
    usageAudioSpeeches(
            
            int startTime
            , 
            
            int endTime
            , 
            
            std::string bucketWidth
            , 
            std::list<std::string> projectIds
            
            , 
            std::list<std::string> userIds
            
            , 
            std::list<std::string> apiKeyIds
            
            , 
            std::list<std::string> models
            
            , 
            std::list<std::string> groupBy
            
            , 
            
            int limit
            , 
            
            std::string page
            
    );
    /**
    * Get audio transcriptions usage details for the organization..
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
    */
    Response<
                UsageResponse
        >
    usageAudioTranscriptions(
            
            int startTime
            , 
            
            int endTime
            , 
            
            std::string bucketWidth
            , 
            std::list<std::string> projectIds
            
            , 
            std::list<std::string> userIds
            
            , 
            std::list<std::string> apiKeyIds
            
            , 
            std::list<std::string> models
            
            , 
            std::list<std::string> groupBy
            
            , 
            
            int limit
            , 
            
            std::string page
            
    );
    /**
    * Get code interpreter sessions usage details for the organization..
    *
    * 
    * \param startTime Start time (Unix seconds) of the query time range, inclusive. *Required*
    * \param endTime End time (Unix seconds) of the query time range, exclusive.
    * \param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
    * \param projectIds Return only usage for these projects.
    * \param groupBy Group the usage data by the specified fields. Support fields include `project_id`.
    * \param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
    * \param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
    */
    Response<
                UsageResponse
        >
    usageCodeInterpreterSessions(
            
            int startTime
            , 
            
            int endTime
            , 
            
            std::string bucketWidth
            , 
            std::list<std::string> projectIds
            
            , 
            std::list<std::string> groupBy
            
            , 
            
            int limit
            , 
            
            std::string page
            
    );
    /**
    * Get completions usage details for the organization..
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
    */
    Response<
                UsageResponse
        >
    usageCompletions(
            
            int startTime
            , 
            
            int endTime
            , 
            
            std::string bucketWidth
            , 
            std::list<std::string> projectIds
            
            , 
            std::list<std::string> userIds
            
            , 
            std::list<std::string> apiKeyIds
            
            , 
            std::list<std::string> models
            
            , 
            
            bool batch
            , 
            std::list<std::string> groupBy
            
            , 
            
            int limit
            , 
            
            std::string page
            
    );
    /**
    * Get costs details for the organization..
    *
    * 
    * \param startTime Start time (Unix seconds) of the query time range, inclusive. *Required*
    * \param endTime End time (Unix seconds) of the query time range, exclusive.
    * \param bucketWidth Width of each time bucket in response. Currently only `1d` is supported, default to `1d`.
    * \param projectIds Return only costs for these projects.
    * \param groupBy Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them.
    * \param limit A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. 
    * \param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
    */
    Response<
                UsageResponse
        >
    usageCosts(
            
            int startTime
            , 
            
            int endTime
            , 
            
            std::string bucketWidth
            , 
            std::list<std::string> projectIds
            
            , 
            std::list<std::string> groupBy
            
            , 
            
            int limit
            , 
            
            std::string page
            
    );
    /**
    * Get embeddings usage details for the organization..
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
    */
    Response<
                UsageResponse
        >
    usageEmbeddings(
            
            int startTime
            , 
            
            int endTime
            , 
            
            std::string bucketWidth
            , 
            std::list<std::string> projectIds
            
            , 
            std::list<std::string> userIds
            
            , 
            std::list<std::string> apiKeyIds
            
            , 
            std::list<std::string> models
            
            , 
            std::list<std::string> groupBy
            
            , 
            
            int limit
            , 
            
            std::string page
            
    );
    /**
    * Get images usage details for the organization..
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
    */
    Response<
                UsageResponse
        >
    usageImages(
            
            int startTime
            , 
            
            int endTime
            , 
            
            std::string bucketWidth
            , 
            std::list<std::string> sources
            
            , 
            std::list<std::string> sizes
            
            , 
            std::list<std::string> projectIds
            
            , 
            std::list<std::string> userIds
            
            , 
            std::list<std::string> apiKeyIds
            
            , 
            std::list<std::string> models
            
            , 
            std::list<std::string> groupBy
            
            , 
            
            int limit
            , 
            
            std::string page
            
    );
    /**
    * Get moderations usage details for the organization..
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
    */
    Response<
                UsageResponse
        >
    usageModerations(
            
            int startTime
            , 
            
            int endTime
            , 
            
            std::string bucketWidth
            , 
            std::list<std::string> projectIds
            
            , 
            std::list<std::string> userIds
            
            , 
            std::list<std::string> apiKeyIds
            
            , 
            std::list<std::string> models
            
            , 
            std::list<std::string> groupBy
            
            , 
            
            int limit
            , 
            
            std::string page
            
    );
    /**
    * Get vector stores usage details for the organization..
    *
    * 
    * \param startTime Start time (Unix seconds) of the query time range, inclusive. *Required*
    * \param endTime End time (Unix seconds) of the query time range, exclusive.
    * \param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
    * \param projectIds Return only usage for these projects.
    * \param groupBy Group the usage data by the specified fields. Support fields include `project_id`.
    * \param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
    * \param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
    */
    Response<
                UsageResponse
        >
    usageVectorStores(
            
            int startTime
            , 
            
            int endTime
            , 
            
            std::string bucketWidth
            , 
            std::list<std::string> projectIds
            
            , 
            std::list<std::string> groupBy
            
            , 
            
            int limit
            , 
            
            std::string page
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_UsageApi_H_ */