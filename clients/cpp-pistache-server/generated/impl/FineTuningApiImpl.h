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

/*
* FineTuningApiImpl.h
*
* 
*/

#ifndef FINE_TUNING_API_IMPL_H_
#define FINE_TUNING_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>
#include <optional>

#include <FineTuningApi.h>


#include "CreateFineTuningJobRequest.h"
#include "FineTuningJob.h"
#include "ListFineTuningJobCheckpointsResponse.h"
#include "ListFineTuningJobEventsResponse.h"
#include "ListPaginatedFineTuningJobsResponse.h"
#include <string>

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::model;

class  FineTuningApiImpl : public org::openapitools::server::api::FineTuningApi {
public:
    explicit FineTuningApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~FineTuningApiImpl() override = default;

    void cancel_fine_tuning_job(const std::string &fineTuningJobId, Pistache::Http::ResponseWriter &response);
    void create_fine_tuning_job(const CreateFineTuningJobRequest &createFineTuningJobRequest, Pistache::Http::ResponseWriter &response);
    void list_fine_tuning_events(const std::string &fineTuningJobId, const std::optional<std::string> &after, const std::optional<int32_t> &limit, Pistache::Http::ResponseWriter &response);
    void list_fine_tuning_job_checkpoints(const std::string &fineTuningJobId, const std::optional<std::string> &after, const std::optional<int32_t> &limit, Pistache::Http::ResponseWriter &response);
    void list_paginated_fine_tuning_jobs(const std::optional<std::string> &after, const std::optional<int32_t> &limit, Pistache::Http::ResponseWriter &response);
    void retrieve_fine_tuning_job(const std::string &fineTuningJobId, Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif
