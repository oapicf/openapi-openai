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


#include <corvusoft/restbed/byte.hpp>
#include <corvusoft/restbed/string.hpp>
#include <corvusoft/restbed/settings.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/uri.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include <boost/lexical_cast.hpp>
#include <boost/algorithm/string.hpp>

#include "FineTuningApi.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

namespace {
[[maybe_unused]]
std::string selectPreferredContentType(const std::vector<std::string>& contentTypes) {
    if (contentTypes.size() == 0) {
        return "application/json";
    }

    if (contentTypes.size() == 1) {
        return contentTypes.at(0);
    }

    static const std::array<std::string, 2> preferredTypes = {"json", "xml"};
    for (const auto& preferredType: preferredTypes) {
        const auto ret = std::find_if(contentTypes.cbegin(),
        contentTypes.cend(),
        [preferredType](const std::string& str) {
            return str.find(preferredType) != std::string::npos;});
        if (ret != contentTypes.cend()) {
            return *ret;
        }
    }

    return contentTypes.at(0);
}
}

FineTuningApiException::FineTuningApiException(int status_code, std::string what)
  : m_status(status_code),
    m_what(what)
{

}
int FineTuningApiException::getStatus() const
{
    return m_status;
}
const char* FineTuningApiException::what() const noexcept
{
    return m_what.c_str();
}


template<class MODEL_T>
MODEL_T extractJsonModelBodyParam(const std::string& bodyContent)
{
    std::stringstream sstream(bodyContent);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream, pt);

    auto model = MODEL_T(pt);
    return model;
}

template<class MODEL_T>
std::vector<MODEL_T> extractJsonArrayBodyParam(const std::string& bodyContent)
{
    std::stringstream sstream(bodyContent);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream, pt);

    auto arrayRet = std::vector<MODEL_T>();
    for (const auto& child: pt) {
        arrayRet.emplace_back(MODEL_T(child.second));
    }
    return arrayRet;
}

template <class KEY_T, class VAL_T>
std::string convertMapResponse(const std::map<KEY_T, VAL_T>& map)
{
    boost::property_tree::ptree pt;
    for(const auto &kv: map) {
    pt.push_back(boost::property_tree::ptree::value_type(
        boost::lexical_cast<std::string>(kv.first),
        boost::property_tree::ptree(
        boost::lexical_cast<std::string>(kv.second))));
    }
    std::stringstream sstream;
    write_json(sstream, pt);
    std::string result = sstream.str();
    return result;
}

namespace FineTuningApiResources {
Fine_tuningJobsFine_tuning_job_idCancelResource::Fine_tuningJobsFine_tuning_job_idCancelResource(const std::string& context /* = "/v1" */)
{
	this->set_path(context + "/fine_tuning/jobs/{fine_tuning_job_id: .*}/cancel");
	this->set_method_handler("POST",
		std::bind(&Fine_tuningJobsFine_tuning_job_idCancelResource::handler_POST_internal, this,
			std::placeholders::_1));
}

std::pair<int, std::string> Fine_tuningJobsFine_tuning_job_idCancelResource::handleFineTuningApiException(const FineTuningApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> Fine_tuningJobsFine_tuning_job_idCancelResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> Fine_tuningJobsFine_tuning_job_idCancelResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void Fine_tuningJobsFine_tuning_job_idCancelResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void Fine_tuningJobsFine_tuning_job_idCancelResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, std::multimap<std::string, std::string>& responseHeaders)
{
    responseHeaders.insert(std::make_pair("Connection", "close"));
    session->close(status, result, responseHeaders);
}

void Fine_tuningJobsFine_tuning_job_idCancelResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void Fine_tuningJobsFine_tuning_job_idCancelResource::handler_POST_internal(const std::shared_ptr<restbed::Session> session)
{
    const auto request = session->get_request();
    // Getting the path params
    std::string fineTuningJobId = request->get_path_parameter("fine_tuning_job_id", "");
    
    int status_code = 500;
    FineTuningJob resultObject = FineTuningJob{};
    std::string result = "";
    
    try {
        std::tie(status_code, resultObject) =
            handler_POST(fineTuningJobId);
    }
    catch(const FineTuningApiException& e) {
        std::tie(status_code, result) = handleFineTuningApiException(e);
    }
    catch(const std::exception& e) {
        std::tie(status_code, result) = handleStdException(e);
    }
    catch(...) {
        std::tie(status_code, result) = handleUnspecifiedException();
    }
    
    std::multimap< std::string, std::string > responseHeaders {};
    static const std::vector<std::string> contentTypes{
        "application/json",
    };
    static const std::string acceptTypes{
    };
    
    if (status_code == 200) {
        responseHeaders.insert(std::make_pair("Content-Type", selectPreferredContentType(contentTypes)));
        if (!acceptTypes.empty()) {
            responseHeaders.insert(std::make_pair("Accept", acceptTypes));
        }
    
        result = resultObject.toJsonString();
        returnResponse(session, 200, result.empty() ? "{}" : result, responseHeaders);
        return;
    }
    defaultSessionClose(session, status_code, result);
    
    
}


std::pair<int, FineTuningJob> Fine_tuningJobsFine_tuning_job_idCancelResource::handler_POST(
        std::string & fineTuningJobId)
{
    return handler_POST_func(fineTuningJobId);
}


std::string Fine_tuningJobsFine_tuning_job_idCancelResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
  const auto request = session->get_request();
  int content_length = request->get_header("Content-Length", 0);
  std::string bodyContent;
  session->fetch(content_length,
                 [&bodyContent](const std::shared_ptr<restbed::Session> session,
                                const restbed::Bytes &body) {
                   bodyContent = restbed::String::format(
                       "%.*s\n", (int)body.size(), body.data());
                 });
  return bodyContent;
}

std::string Fine_tuningJobsFine_tuning_job_idCancelResource::extractFormParamsFromBody(const std::string& paramName, const std::string& body) {
    const auto uri = restbed::Uri("urlencoded?" + body, true);
    const auto params = uri.get_query_parameters();
    const auto result = params.find(paramName);
    if (result != params.cend()) {
        return result->second;
    }
    return "";
}
Fine_tuningJobsResource::Fine_tuningJobsResource(const std::string& context /* = "/v1" */)
{
	this->set_path(context + "/fine_tuning/jobs");
	this->set_method_handler("POST",
		std::bind(&Fine_tuningJobsResource::handler_POST_internal, this,
			std::placeholders::_1));
	this->set_method_handler("GET",
		std::bind(&Fine_tuningJobsResource::handler_GET_internal, this,
			std::placeholders::_1));
}

std::pair<int, std::string> Fine_tuningJobsResource::handleFineTuningApiException(const FineTuningApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> Fine_tuningJobsResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> Fine_tuningJobsResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void Fine_tuningJobsResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void Fine_tuningJobsResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, std::multimap<std::string, std::string>& responseHeaders)
{
    responseHeaders.insert(std::make_pair("Connection", "close"));
    session->close(status, result, responseHeaders);
}

void Fine_tuningJobsResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void Fine_tuningJobsResource::handler_POST_internal(const std::shared_ptr<restbed::Session> session)
{
    const auto request = session->get_request();
    // body params or form params here from the body content string
    std::string bodyContent = extractBodyContent(session);
    auto createFineTuningJobRequest = extractJsonModelBodyParam<CreateFineTuningJobRequest>(bodyContent);
    
    int status_code = 500;
    FineTuningJob resultObject = FineTuningJob{};
    std::string result = "";
    
    try {
        std::tie(status_code, resultObject) =
            handler_POST(createFineTuningJobRequest);
    }
    catch(const FineTuningApiException& e) {
        std::tie(status_code, result) = handleFineTuningApiException(e);
    }
    catch(const std::exception& e) {
        std::tie(status_code, result) = handleStdException(e);
    }
    catch(...) {
        std::tie(status_code, result) = handleUnspecifiedException();
    }
    
    std::multimap< std::string, std::string > responseHeaders {};
    static const std::vector<std::string> contentTypes{
        "application/json",
    };
    static const std::string acceptTypes{
        "application/json, "
    };
    
    if (status_code == 200) {
        responseHeaders.insert(std::make_pair("Content-Type", selectPreferredContentType(contentTypes)));
        if (!acceptTypes.empty()) {
            responseHeaders.insert(std::make_pair("Accept", acceptTypes));
        }
    
        result = resultObject.toJsonString();
        returnResponse(session, 200, result.empty() ? "{}" : result, responseHeaders);
        return;
    }
    defaultSessionClose(session, status_code, result);
    
    
}

// x-extension
void Fine_tuningJobsResource::handler_GET_internal(const std::shared_ptr<restbed::Session> session) {
    const auto request = session->get_request();
    // Getting the query params
    std::string after = request->get_query_parameter("after", "");
    int32_t limit = request->get_query_parameter("limit", 20);
    
    int status_code = 500;
    ListPaginatedFineTuningJobsResponse resultObject = ListPaginatedFineTuningJobsResponse{};
    std::string result = "";
    
    try {
        std::tie(status_code, resultObject) =
            handler_GET(after, limit);
    }
    catch(const FineTuningApiException& e) {
        std::tie(status_code, result) = handleFineTuningApiException(e);
    }
    catch(const std::exception& e) {
        std::tie(status_code, result) = handleStdException(e);
    }
    catch(...) {
        std::tie(status_code, result) = handleUnspecifiedException();
    }
    
    std::multimap< std::string, std::string > responseHeaders {};
    static const std::vector<std::string> contentTypes{
        "application/json",
    };
    static const std::string acceptTypes{
    };
    
    if (status_code == 200) {
        responseHeaders.insert(std::make_pair("Content-Type", selectPreferredContentType(contentTypes)));
        if (!acceptTypes.empty()) {
            responseHeaders.insert(std::make_pair("Accept", acceptTypes));
        }
    
        result = resultObject.toJsonString();
        returnResponse(session, 200, result.empty() ? "{}" : result, responseHeaders);
        return;
    }
    defaultSessionClose(session, status_code, result);
    
    
}

std::pair<int, FineTuningJob> Fine_tuningJobsResource::handler_POST(
        CreateFineTuningJobRequest & createFineTuningJobRequest)
{
    return handler_POST_func(createFineTuningJobRequest);
}

std::pair<int, ListPaginatedFineTuningJobsResponse> Fine_tuningJobsResource::handler_GET(
    std::string & after, int32_t & limit)
{
    return handler_GET_func(after, limit);
}

std::string Fine_tuningJobsResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
  const auto request = session->get_request();
  int content_length = request->get_header("Content-Length", 0);
  std::string bodyContent;
  session->fetch(content_length,
                 [&bodyContent](const std::shared_ptr<restbed::Session> session,
                                const restbed::Bytes &body) {
                   bodyContent = restbed::String::format(
                       "%.*s\n", (int)body.size(), body.data());
                 });
  return bodyContent;
}

std::string Fine_tuningJobsResource::extractFormParamsFromBody(const std::string& paramName, const std::string& body) {
    const auto uri = restbed::Uri("urlencoded?" + body, true);
    const auto params = uri.get_query_parameters();
    const auto result = params.find(paramName);
    if (result != params.cend()) {
        return result->second;
    }
    return "";
}
Fine_tuningJobsFine_tuning_job_idEventsResource::Fine_tuningJobsFine_tuning_job_idEventsResource(const std::string& context /* = "/v1" */)
{
	this->set_path(context + "/fine_tuning/jobs/{fine_tuning_job_id: .*}/events");
	this->set_method_handler("GET",
		std::bind(&Fine_tuningJobsFine_tuning_job_idEventsResource::handler_GET_internal, this,
			std::placeholders::_1));
}

std::pair<int, std::string> Fine_tuningJobsFine_tuning_job_idEventsResource::handleFineTuningApiException(const FineTuningApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> Fine_tuningJobsFine_tuning_job_idEventsResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> Fine_tuningJobsFine_tuning_job_idEventsResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void Fine_tuningJobsFine_tuning_job_idEventsResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void Fine_tuningJobsFine_tuning_job_idEventsResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, std::multimap<std::string, std::string>& responseHeaders)
{
    responseHeaders.insert(std::make_pair("Connection", "close"));
    session->close(status, result, responseHeaders);
}

void Fine_tuningJobsFine_tuning_job_idEventsResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void Fine_tuningJobsFine_tuning_job_idEventsResource::handler_GET_internal(const std::shared_ptr<restbed::Session> session)
{
    const auto request = session->get_request();
    // Getting the path params
    std::string fineTuningJobId = request->get_path_parameter("fine_tuning_job_id", "");
    // Getting the query params
    std::string after = request->get_query_parameter("after", "");
    int32_t limit = request->get_query_parameter("limit", 20);
    
    int status_code = 500;
    ListFineTuningJobEventsResponse resultObject = ListFineTuningJobEventsResponse{};
    std::string result = "";
    
    try {
        std::tie(status_code, resultObject) =
            handler_GET(fineTuningJobId, after, limit);
    }
    catch(const FineTuningApiException& e) {
        std::tie(status_code, result) = handleFineTuningApiException(e);
    }
    catch(const std::exception& e) {
        std::tie(status_code, result) = handleStdException(e);
    }
    catch(...) {
        std::tie(status_code, result) = handleUnspecifiedException();
    }
    
    std::multimap< std::string, std::string > responseHeaders {};
    static const std::vector<std::string> contentTypes{
        "application/json",
    };
    static const std::string acceptTypes{
    };
    
    if (status_code == 200) {
        responseHeaders.insert(std::make_pair("Content-Type", selectPreferredContentType(contentTypes)));
        if (!acceptTypes.empty()) {
            responseHeaders.insert(std::make_pair("Accept", acceptTypes));
        }
    
        result = resultObject.toJsonString();
        returnResponse(session, 200, result.empty() ? "{}" : result, responseHeaders);
        return;
    }
    defaultSessionClose(session, status_code, result);
    
    
}


std::pair<int, ListFineTuningJobEventsResponse> Fine_tuningJobsFine_tuning_job_idEventsResource::handler_GET(
        std::string & fineTuningJobId, std::string & after, int32_t & limit)
{
    return handler_GET_func(fineTuningJobId, after, limit);
}


std::string Fine_tuningJobsFine_tuning_job_idEventsResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
  const auto request = session->get_request();
  int content_length = request->get_header("Content-Length", 0);
  std::string bodyContent;
  session->fetch(content_length,
                 [&bodyContent](const std::shared_ptr<restbed::Session> session,
                                const restbed::Bytes &body) {
                   bodyContent = restbed::String::format(
                       "%.*s\n", (int)body.size(), body.data());
                 });
  return bodyContent;
}

std::string Fine_tuningJobsFine_tuning_job_idEventsResource::extractFormParamsFromBody(const std::string& paramName, const std::string& body) {
    const auto uri = restbed::Uri("urlencoded?" + body, true);
    const auto params = uri.get_query_parameters();
    const auto result = params.find(paramName);
    if (result != params.cend()) {
        return result->second;
    }
    return "";
}
Fine_tuningJobsFine_tuning_job_idCheckpointsResource::Fine_tuningJobsFine_tuning_job_idCheckpointsResource(const std::string& context /* = "/v1" */)
{
	this->set_path(context + "/fine_tuning/jobs/{fine_tuning_job_id: .*}/checkpoints");
	this->set_method_handler("GET",
		std::bind(&Fine_tuningJobsFine_tuning_job_idCheckpointsResource::handler_GET_internal, this,
			std::placeholders::_1));
}

std::pair<int, std::string> Fine_tuningJobsFine_tuning_job_idCheckpointsResource::handleFineTuningApiException(const FineTuningApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> Fine_tuningJobsFine_tuning_job_idCheckpointsResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> Fine_tuningJobsFine_tuning_job_idCheckpointsResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void Fine_tuningJobsFine_tuning_job_idCheckpointsResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void Fine_tuningJobsFine_tuning_job_idCheckpointsResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, std::multimap<std::string, std::string>& responseHeaders)
{
    responseHeaders.insert(std::make_pair("Connection", "close"));
    session->close(status, result, responseHeaders);
}

void Fine_tuningJobsFine_tuning_job_idCheckpointsResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void Fine_tuningJobsFine_tuning_job_idCheckpointsResource::handler_GET_internal(const std::shared_ptr<restbed::Session> session)
{
    const auto request = session->get_request();
    // Getting the path params
    std::string fineTuningJobId = request->get_path_parameter("fine_tuning_job_id", "");
    // Getting the query params
    std::string after = request->get_query_parameter("after", "");
    int32_t limit = request->get_query_parameter("limit", 10);
    
    int status_code = 500;
    ListFineTuningJobCheckpointsResponse resultObject = ListFineTuningJobCheckpointsResponse{};
    std::string result = "";
    
    try {
        std::tie(status_code, resultObject) =
            handler_GET(fineTuningJobId, after, limit);
    }
    catch(const FineTuningApiException& e) {
        std::tie(status_code, result) = handleFineTuningApiException(e);
    }
    catch(const std::exception& e) {
        std::tie(status_code, result) = handleStdException(e);
    }
    catch(...) {
        std::tie(status_code, result) = handleUnspecifiedException();
    }
    
    std::multimap< std::string, std::string > responseHeaders {};
    static const std::vector<std::string> contentTypes{
        "application/json",
    };
    static const std::string acceptTypes{
    };
    
    if (status_code == 200) {
        responseHeaders.insert(std::make_pair("Content-Type", selectPreferredContentType(contentTypes)));
        if (!acceptTypes.empty()) {
            responseHeaders.insert(std::make_pair("Accept", acceptTypes));
        }
    
        result = resultObject.toJsonString();
        returnResponse(session, 200, result.empty() ? "{}" : result, responseHeaders);
        return;
    }
    defaultSessionClose(session, status_code, result);
    
    
}


std::pair<int, ListFineTuningJobCheckpointsResponse> Fine_tuningJobsFine_tuning_job_idCheckpointsResource::handler_GET(
        std::string & fineTuningJobId, std::string & after, int32_t & limit)
{
    return handler_GET_func(fineTuningJobId, after, limit);
}


std::string Fine_tuningJobsFine_tuning_job_idCheckpointsResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
  const auto request = session->get_request();
  int content_length = request->get_header("Content-Length", 0);
  std::string bodyContent;
  session->fetch(content_length,
                 [&bodyContent](const std::shared_ptr<restbed::Session> session,
                                const restbed::Bytes &body) {
                   bodyContent = restbed::String::format(
                       "%.*s\n", (int)body.size(), body.data());
                 });
  return bodyContent;
}

std::string Fine_tuningJobsFine_tuning_job_idCheckpointsResource::extractFormParamsFromBody(const std::string& paramName, const std::string& body) {
    const auto uri = restbed::Uri("urlencoded?" + body, true);
    const auto params = uri.get_query_parameters();
    const auto result = params.find(paramName);
    if (result != params.cend()) {
        return result->second;
    }
    return "";
}
Fine_tuningJobsFine_tuning_job_idResource::Fine_tuningJobsFine_tuning_job_idResource(const std::string& context /* = "/v1" */)
{
	this->set_path(context + "/fine_tuning/jobs/{fine_tuning_job_id: .*}");
	this->set_method_handler("GET",
		std::bind(&Fine_tuningJobsFine_tuning_job_idResource::handler_GET_internal, this,
			std::placeholders::_1));
}

std::pair<int, std::string> Fine_tuningJobsFine_tuning_job_idResource::handleFineTuningApiException(const FineTuningApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> Fine_tuningJobsFine_tuning_job_idResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> Fine_tuningJobsFine_tuning_job_idResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void Fine_tuningJobsFine_tuning_job_idResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void Fine_tuningJobsFine_tuning_job_idResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, std::multimap<std::string, std::string>& responseHeaders)
{
    responseHeaders.insert(std::make_pair("Connection", "close"));
    session->close(status, result, responseHeaders);
}

void Fine_tuningJobsFine_tuning_job_idResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void Fine_tuningJobsFine_tuning_job_idResource::handler_GET_internal(const std::shared_ptr<restbed::Session> session)
{
    const auto request = session->get_request();
    // Getting the path params
    std::string fineTuningJobId = request->get_path_parameter("fine_tuning_job_id", "");
    
    int status_code = 500;
    FineTuningJob resultObject = FineTuningJob{};
    std::string result = "";
    
    try {
        std::tie(status_code, resultObject) =
            handler_GET(fineTuningJobId);
    }
    catch(const FineTuningApiException& e) {
        std::tie(status_code, result) = handleFineTuningApiException(e);
    }
    catch(const std::exception& e) {
        std::tie(status_code, result) = handleStdException(e);
    }
    catch(...) {
        std::tie(status_code, result) = handleUnspecifiedException();
    }
    
    std::multimap< std::string, std::string > responseHeaders {};
    static const std::vector<std::string> contentTypes{
        "application/json",
    };
    static const std::string acceptTypes{
    };
    
    if (status_code == 200) {
        responseHeaders.insert(std::make_pair("Content-Type", selectPreferredContentType(contentTypes)));
        if (!acceptTypes.empty()) {
            responseHeaders.insert(std::make_pair("Accept", acceptTypes));
        }
    
        result = resultObject.toJsonString();
        returnResponse(session, 200, result.empty() ? "{}" : result, responseHeaders);
        return;
    }
    defaultSessionClose(session, status_code, result);
    
    
}


std::pair<int, FineTuningJob> Fine_tuningJobsFine_tuning_job_idResource::handler_GET(
        std::string & fineTuningJobId)
{
    return handler_GET_func(fineTuningJobId);
}


std::string Fine_tuningJobsFine_tuning_job_idResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
  const auto request = session->get_request();
  int content_length = request->get_header("Content-Length", 0);
  std::string bodyContent;
  session->fetch(content_length,
                 [&bodyContent](const std::shared_ptr<restbed::Session> session,
                                const restbed::Bytes &body) {
                   bodyContent = restbed::String::format(
                       "%.*s\n", (int)body.size(), body.data());
                 });
  return bodyContent;
}

std::string Fine_tuningJobsFine_tuning_job_idResource::extractFormParamsFromBody(const std::string& paramName, const std::string& body) {
    const auto uri = restbed::Uri("urlencoded?" + body, true);
    const auto params = uri.get_query_parameters();
    const auto result = params.find(paramName);
    if (result != params.cend()) {
        return result->second;
    }
    return "";
}

} /* namespace FineTuningApiResources */

FineTuningApi::FineTuningApi(std::shared_ptr<restbed::Service> const& restbedService)
: m_service(restbedService)
{
}

FineTuningApi::~FineTuningApi() {}

std::shared_ptr<FineTuningApiResources::Fine_tuningJobsFine_tuning_job_idCancelResource> FineTuningApi::getFine_tuningJobsFine_tuning_job_idCancelResource() {
    if (!m_spFine_tuningJobsFine_tuning_job_idCancelResource) {
        setResource(std::make_shared<FineTuningApiResources::Fine_tuningJobsFine_tuning_job_idCancelResource>());
    }
    return m_spFine_tuningJobsFine_tuning_job_idCancelResource;
}
std::shared_ptr<FineTuningApiResources::Fine_tuningJobsResource> FineTuningApi::getFine_tuningJobsResource() {
    if (!m_spFine_tuningJobsResource) {
        setResource(std::make_shared<FineTuningApiResources::Fine_tuningJobsResource>());
    }
    return m_spFine_tuningJobsResource;
}
std::shared_ptr<FineTuningApiResources::Fine_tuningJobsFine_tuning_job_idEventsResource> FineTuningApi::getFine_tuningJobsFine_tuning_job_idEventsResource() {
    if (!m_spFine_tuningJobsFine_tuning_job_idEventsResource) {
        setResource(std::make_shared<FineTuningApiResources::Fine_tuningJobsFine_tuning_job_idEventsResource>());
    }
    return m_spFine_tuningJobsFine_tuning_job_idEventsResource;
}
std::shared_ptr<FineTuningApiResources::Fine_tuningJobsFine_tuning_job_idCheckpointsResource> FineTuningApi::getFine_tuningJobsFine_tuning_job_idCheckpointsResource() {
    if (!m_spFine_tuningJobsFine_tuning_job_idCheckpointsResource) {
        setResource(std::make_shared<FineTuningApiResources::Fine_tuningJobsFine_tuning_job_idCheckpointsResource>());
    }
    return m_spFine_tuningJobsFine_tuning_job_idCheckpointsResource;
}
std::shared_ptr<FineTuningApiResources::Fine_tuningJobsFine_tuning_job_idResource> FineTuningApi::getFine_tuningJobsFine_tuning_job_idResource() {
    if (!m_spFine_tuningJobsFine_tuning_job_idResource) {
        setResource(std::make_shared<FineTuningApiResources::Fine_tuningJobsFine_tuning_job_idResource>());
    }
    return m_spFine_tuningJobsFine_tuning_job_idResource;
}
void FineTuningApi::setResource(std::shared_ptr<FineTuningApiResources::Fine_tuningJobsFine_tuning_job_idCancelResource> resource) {
    m_spFine_tuningJobsFine_tuning_job_idCancelResource = resource;
    m_service->publish(m_spFine_tuningJobsFine_tuning_job_idCancelResource);
}
void FineTuningApi::setResource(std::shared_ptr<FineTuningApiResources::Fine_tuningJobsResource> resource) {
    m_spFine_tuningJobsResource = resource;
    m_service->publish(m_spFine_tuningJobsResource);
}
void FineTuningApi::setResource(std::shared_ptr<FineTuningApiResources::Fine_tuningJobsFine_tuning_job_idEventsResource> resource) {
    m_spFine_tuningJobsFine_tuning_job_idEventsResource = resource;
    m_service->publish(m_spFine_tuningJobsFine_tuning_job_idEventsResource);
}
void FineTuningApi::setResource(std::shared_ptr<FineTuningApiResources::Fine_tuningJobsFine_tuning_job_idCheckpointsResource> resource) {
    m_spFine_tuningJobsFine_tuning_job_idCheckpointsResource = resource;
    m_service->publish(m_spFine_tuningJobsFine_tuning_job_idCheckpointsResource);
}
void FineTuningApi::setResource(std::shared_ptr<FineTuningApiResources::Fine_tuningJobsFine_tuning_job_idResource> resource) {
    m_spFine_tuningJobsFine_tuning_job_idResource = resource;
    m_service->publish(m_spFine_tuningJobsFine_tuning_job_idResource);
}
void FineTuningApi::setFineTuningApiFine_tuningJobsFine_tuning_job_idCancelResource(std::shared_ptr<FineTuningApiResources::Fine_tuningJobsFine_tuning_job_idCancelResource> spFine_tuningJobsFine_tuning_job_idCancelResource) {
    m_spFine_tuningJobsFine_tuning_job_idCancelResource = spFine_tuningJobsFine_tuning_job_idCancelResource;
    m_service->publish(m_spFine_tuningJobsFine_tuning_job_idCancelResource);
}
void FineTuningApi::setFineTuningApiFine_tuningJobsResource(std::shared_ptr<FineTuningApiResources::Fine_tuningJobsResource> spFine_tuningJobsResource) {
    m_spFine_tuningJobsResource = spFine_tuningJobsResource;
    m_service->publish(m_spFine_tuningJobsResource);
}
void FineTuningApi::setFineTuningApiFine_tuningJobsFine_tuning_job_idEventsResource(std::shared_ptr<FineTuningApiResources::Fine_tuningJobsFine_tuning_job_idEventsResource> spFine_tuningJobsFine_tuning_job_idEventsResource) {
    m_spFine_tuningJobsFine_tuning_job_idEventsResource = spFine_tuningJobsFine_tuning_job_idEventsResource;
    m_service->publish(m_spFine_tuningJobsFine_tuning_job_idEventsResource);
}
void FineTuningApi::setFineTuningApiFine_tuningJobsFine_tuning_job_idCheckpointsResource(std::shared_ptr<FineTuningApiResources::Fine_tuningJobsFine_tuning_job_idCheckpointsResource> spFine_tuningJobsFine_tuning_job_idCheckpointsResource) {
    m_spFine_tuningJobsFine_tuning_job_idCheckpointsResource = spFine_tuningJobsFine_tuning_job_idCheckpointsResource;
    m_service->publish(m_spFine_tuningJobsFine_tuning_job_idCheckpointsResource);
}
void FineTuningApi::setFineTuningApiFine_tuningJobsFine_tuning_job_idResource(std::shared_ptr<FineTuningApiResources::Fine_tuningJobsFine_tuning_job_idResource> spFine_tuningJobsFine_tuning_job_idResource) {
    m_spFine_tuningJobsFine_tuning_job_idResource = spFine_tuningJobsFine_tuning_job_idResource;
    m_service->publish(m_spFine_tuningJobsFine_tuning_job_idResource);
}


void FineTuningApi::publishDefaultResources() {
    if (!m_spFine_tuningJobsFine_tuning_job_idCancelResource) {
        setResource(std::make_shared<FineTuningApiResources::Fine_tuningJobsFine_tuning_job_idCancelResource>());
    }
    if (!m_spFine_tuningJobsResource) {
        setResource(std::make_shared<FineTuningApiResources::Fine_tuningJobsResource>());
    }
    if (!m_spFine_tuningJobsFine_tuning_job_idEventsResource) {
        setResource(std::make_shared<FineTuningApiResources::Fine_tuningJobsFine_tuning_job_idEventsResource>());
    }
    if (!m_spFine_tuningJobsFine_tuning_job_idCheckpointsResource) {
        setResource(std::make_shared<FineTuningApiResources::Fine_tuningJobsFine_tuning_job_idCheckpointsResource>());
    }
    if (!m_spFine_tuningJobsFine_tuning_job_idResource) {
        setResource(std::make_shared<FineTuningApiResources::Fine_tuningJobsFine_tuning_job_idResource>());
    }
}

std::shared_ptr<restbed::Service> FineTuningApi::service() {
    return m_service;
}


}
}
}
}

