/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * FineTuningApi.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_FineTuningApi_H_
#define ORG_OPENAPITOOLS_CLIENT_API_FineTuningApi_H_



#include "CppRestOpenAPIClient/ApiClient.h"

#include "CppRestOpenAPIClient/model/CreateFineTuningJobRequest.h"
#include "CppRestOpenAPIClient/model/FineTuningJob.h"
#include "CppRestOpenAPIClient/model/ListFineTuningJobCheckpointsResponse.h"
#include "CppRestOpenAPIClient/model/ListFineTuningJobEventsResponse.h"
#include "CppRestOpenAPIClient/model/ListPaginatedFineTuningJobsResponse.h"
#include <cpprest/details/basic_types.h>
#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  FineTuningApi 
{
public:

    explicit FineTuningApi( std::shared_ptr<const ApiClient> apiClient );

    virtual ~FineTuningApi();

    /// <summary>
    /// Immediately cancel a fine-tune job. 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="fineTuningJobId">The ID of the fine-tuning job to cancel. </param>
    pplx::task<std::shared_ptr<FineTuningJob>> cancelFineTuningJob(
        utility::string_t fineTuningJobId
    ) const;
    /// <summary>
    /// Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="createFineTuningJobRequest"></param>
    pplx::task<std::shared_ptr<FineTuningJob>> createFineTuningJob(
        std::shared_ptr<CreateFineTuningJobRequest> createFineTuningJobRequest
    ) const;
    /// <summary>
    /// Get status updates for a fine-tuning job. 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="fineTuningJobId">The ID of the fine-tuning job to get events for. </param>
    /// <param name="after">Identifier for the last event from the previous pagination request. (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="limit">Number of events to retrieve. (optional, default to 0)</param>
    pplx::task<std::shared_ptr<ListFineTuningJobEventsResponse>> listFineTuningEvents(
        utility::string_t fineTuningJobId,
        boost::optional<utility::string_t> after,
        boost::optional<int32_t> limit
    ) const;
    /// <summary>
    /// List checkpoints for a fine-tuning job. 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="fineTuningJobId">The ID of the fine-tuning job to get checkpoints for. </param>
    /// <param name="after">Identifier for the last checkpoint ID from the previous pagination request. (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="limit">Number of checkpoints to retrieve. (optional, default to 0)</param>
    pplx::task<std::shared_ptr<ListFineTuningJobCheckpointsResponse>> listFineTuningJobCheckpoints(
        utility::string_t fineTuningJobId,
        boost::optional<utility::string_t> after,
        boost::optional<int32_t> limit
    ) const;
    /// <summary>
    /// List your organization&#39;s fine-tuning jobs 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="after">Identifier for the last job from the previous pagination request. (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="limit">Number of fine-tuning jobs to retrieve. (optional, default to 0)</param>
    pplx::task<std::shared_ptr<ListPaginatedFineTuningJobsResponse>> listPaginatedFineTuningJobs(
        boost::optional<utility::string_t> after,
        boost::optional<int32_t> limit
    ) const;
    /// <summary>
    /// Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="fineTuningJobId">The ID of the fine-tuning job. </param>
    pplx::task<std::shared_ptr<FineTuningJob>> retrieveFineTuningJob(
        utility::string_t fineTuningJobId
    ) const;

protected:
    std::shared_ptr<const ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_API_FineTuningApi_H_ */

