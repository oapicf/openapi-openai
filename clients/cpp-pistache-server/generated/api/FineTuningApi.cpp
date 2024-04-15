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

#include "FineTuningApi.h"
#include "Helpers.h"

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::helpers;
using namespace org::openapitools::server::model;

const std::string FineTuningApi::base = "/v1";

FineTuningApi::FineTuningApi(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : ApiBase(rtr)
{
}

void FineTuningApi::init() {
    setupRoutes();
}

void FineTuningApi::setupRoutes() {
    using namespace Pistache::Rest;

    Routes::Post(*router, base + "/fine_tuning/jobs/:fine_tuning_job_id/cancel", Routes::bind(&FineTuningApi::cancel_fine_tuning_job_handler, this));
    Routes::Post(*router, base + "/fine_tuning/jobs", Routes::bind(&FineTuningApi::create_fine_tuning_job_handler, this));
    Routes::Get(*router, base + "/fine_tuning/jobs/:fine_tuning_job_id/events", Routes::bind(&FineTuningApi::list_fine_tuning_events_handler, this));
    Routes::Get(*router, base + "/fine_tuning/jobs/:fine_tuning_job_id/checkpoints", Routes::bind(&FineTuningApi::list_fine_tuning_job_checkpoints_handler, this));
    Routes::Get(*router, base + "/fine_tuning/jobs", Routes::bind(&FineTuningApi::list_paginated_fine_tuning_jobs_handler, this));
    Routes::Get(*router, base + "/fine_tuning/jobs/:fine_tuning_job_id", Routes::bind(&FineTuningApi::retrieve_fine_tuning_job_handler, this));

    // Default handler, called when a route is not found
    router->addCustomHandler(Routes::bind(&FineTuningApi::fine_tuning_api_default_handler, this));
}

std::pair<Pistache::Http::Code, std::string> FineTuningApi::handleParsingException(const std::exception& ex) const noexcept
{
    try {
        throw;
    } catch (nlohmann::detail::exception &e) {
        return std::make_pair(Pistache::Http::Code::Bad_Request, e.what());
    } catch (org::openapitools::server::helpers::ValidationException &e) {
        return std::make_pair(Pistache::Http::Code::Bad_Request, e.what());
    } catch (std::exception &e) {
        return std::make_pair(Pistache::Http::Code::Internal_Server_Error, e.what());
    }
}

std::pair<Pistache::Http::Code, std::string> FineTuningApi::handleOperationException(const std::exception& ex) const noexcept
{
    return std::make_pair(Pistache::Http::Code::Internal_Server_Error, ex.what());
}

void FineTuningApi::cancel_fine_tuning_job_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto fineTuningJobId = request.param(":fineTuningJobId").as<std::string>();
    
    try {
        this->cancel_fine_tuning_job(fineTuningJobId, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        const std::pair<Pistache::Http::Code, std::string> errorInfo = this->handleOperationException(e);
        response.send(errorInfo.first, errorInfo.second);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void FineTuningApi::create_fine_tuning_job_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {


    // Getting the body param
    
    CreateFineTuningJobRequest createFineTuningJobRequest;
    
    try {
        nlohmann::json::parse(request.body()).get_to(createFineTuningJobRequest);
        createFineTuningJobRequest.validate();
    } catch (std::exception &e) {
        const std::pair<Pistache::Http::Code, std::string> errorInfo = this->handleParsingException(e);
        response.send(errorInfo.first, errorInfo.second);
        return;
    }

    try {
        this->create_fine_tuning_job(createFineTuningJobRequest, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        const std::pair<Pistache::Http::Code, std::string> errorInfo = this->handleOperationException(e);
        response.send(errorInfo.first, errorInfo.second);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void FineTuningApi::list_fine_tuning_events_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto fineTuningJobId = request.param(":fineTuningJobId").as<std::string>();
    
    // Getting the query params
    auto afterQuery = request.query().get("after");
    std::optional<std::string> after;
    if(afterQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(afterQuery.value(), valueQuery_instance)){
            after = valueQuery_instance;
        }
    }
    auto limitQuery = request.query().get("limit");
    std::optional<int32_t> limit;
    if(limitQuery.has_value()){
        int32_t valueQuery_instance;
        if(fromStringValue(limitQuery.value(), valueQuery_instance)){
            limit = valueQuery_instance;
        }
    }
    
    try {
        this->list_fine_tuning_events(fineTuningJobId, after, limit, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        const std::pair<Pistache::Http::Code, std::string> errorInfo = this->handleOperationException(e);
        response.send(errorInfo.first, errorInfo.second);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void FineTuningApi::list_fine_tuning_job_checkpoints_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto fineTuningJobId = request.param(":fineTuningJobId").as<std::string>();
    
    // Getting the query params
    auto afterQuery = request.query().get("after");
    std::optional<std::string> after;
    if(afterQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(afterQuery.value(), valueQuery_instance)){
            after = valueQuery_instance;
        }
    }
    auto limitQuery = request.query().get("limit");
    std::optional<int32_t> limit;
    if(limitQuery.has_value()){
        int32_t valueQuery_instance;
        if(fromStringValue(limitQuery.value(), valueQuery_instance)){
            limit = valueQuery_instance;
        }
    }
    
    try {
        this->list_fine_tuning_job_checkpoints(fineTuningJobId, after, limit, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        const std::pair<Pistache::Http::Code, std::string> errorInfo = this->handleOperationException(e);
        response.send(errorInfo.first, errorInfo.second);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void FineTuningApi::list_paginated_fine_tuning_jobs_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {


    // Getting the query params
    auto afterQuery = request.query().get("after");
    std::optional<std::string> after;
    if(afterQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(afterQuery.value(), valueQuery_instance)){
            after = valueQuery_instance;
        }
    }
    auto limitQuery = request.query().get("limit");
    std::optional<int32_t> limit;
    if(limitQuery.has_value()){
        int32_t valueQuery_instance;
        if(fromStringValue(limitQuery.value(), valueQuery_instance)){
            limit = valueQuery_instance;
        }
    }
    
    try {
        this->list_paginated_fine_tuning_jobs(after, limit, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        const std::pair<Pistache::Http::Code, std::string> errorInfo = this->handleOperationException(e);
        response.send(errorInfo.first, errorInfo.second);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void FineTuningApi::retrieve_fine_tuning_job_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto fineTuningJobId = request.param(":fineTuningJobId").as<std::string>();
    
    try {
        this->retrieve_fine_tuning_job(fineTuningJobId, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        const std::pair<Pistache::Http::Code, std::string> errorInfo = this->handleOperationException(e);
        response.send(errorInfo.first, errorInfo.second);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}

void FineTuningApi::fine_tuning_api_default_handler(const Pistache::Rest::Request &, Pistache::Http::ResponseWriter response) {
    response.send(Pistache::Http::Code::Not_Found, "The requested method does not exist");
}

} // namespace org::openapitools::server::api
