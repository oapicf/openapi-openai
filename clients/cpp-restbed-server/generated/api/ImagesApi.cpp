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

#include "ImagesApi.h"

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

ImagesApiException::ImagesApiException(int status_code, std::string what)
  : m_status(status_code),
    m_what(what)
{

}
int ImagesApiException::getStatus() const
{
    return m_status;
}
const char* ImagesApiException::what() const noexcept
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

namespace ImagesApiResources {
ImagesGenerationsResource::ImagesGenerationsResource(const std::string& context /* = "/v1" */)
{
	this->set_path(context + "/images/generations");
	this->set_method_handler("POST",
		std::bind(&ImagesGenerationsResource::handler_POST_internal, this,
			std::placeholders::_1));
}

std::pair<int, std::string> ImagesGenerationsResource::handleImagesApiException(const ImagesApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> ImagesGenerationsResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> ImagesGenerationsResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void ImagesGenerationsResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void ImagesGenerationsResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, std::multimap<std::string, std::string>& responseHeaders)
{
    responseHeaders.insert(std::make_pair("Connection", "close"));
    session->close(status, result, responseHeaders);
}

void ImagesGenerationsResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void ImagesGenerationsResource::handler_POST_internal(const std::shared_ptr<restbed::Session> session)
{
    const auto request = session->get_request();
    // body params or form params here from the body content string
    std::string bodyContent = extractBodyContent(session);
    auto createImageRequest = extractJsonModelBodyParam<CreateImageRequest>(bodyContent);
    
    int status_code = 500;
    ImagesResponse resultObject = ImagesResponse{};
    std::string result = "";
    
    try {
        std::tie(status_code, resultObject) =
            handler_POST(createImageRequest);
    }
    catch(const ImagesApiException& e) {
        std::tie(status_code, result) = handleImagesApiException(e);
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


std::pair<int, ImagesResponse> ImagesGenerationsResource::handler_POST(
        CreateImageRequest & createImageRequest)
{
    return handler_POST_func(createImageRequest);
}


std::string ImagesGenerationsResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
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

std::string ImagesGenerationsResource::extractFormParamsFromBody(const std::string& paramName, const std::string& body) {
    const auto uri = restbed::Uri("urlencoded?" + body, true);
    const auto params = uri.get_query_parameters();
    const auto result = params.find(paramName);
    if (result != params.cend()) {
        return result->second;
    }
    return "";
}
ImagesEditsResource::ImagesEditsResource(const std::string& context /* = "/v1" */)
{
	this->set_path(context + "/images/edits");
	this->set_method_handler("POST",
		std::bind(&ImagesEditsResource::handler_POST_internal, this,
			std::placeholders::_1));
}

std::pair<int, std::string> ImagesEditsResource::handleImagesApiException(const ImagesApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> ImagesEditsResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> ImagesEditsResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void ImagesEditsResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void ImagesEditsResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, std::multimap<std::string, std::string>& responseHeaders)
{
    responseHeaders.insert(std::make_pair("Connection", "close"));
    session->close(status, result, responseHeaders);
}

void ImagesEditsResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void ImagesEditsResource::handler_POST_internal(const std::shared_ptr<restbed::Session> session)
{
    const auto request = session->get_request();
    auto image = boost::lexical_cast<std::string>(extractFormParamsFromBody("image", extractBodyContent(session)));
    auto prompt = boost::lexical_cast<std::string>(extractFormParamsFromBody("prompt", extractBodyContent(session)));
    auto mask = boost::lexical_cast<std::string>(extractFormParamsFromBody("mask", extractBodyContent(session)));
    auto model = boost::lexical_cast<CreateImageEditRequest_model>(extractFormParamsFromBody("model", extractBodyContent(session)));
    auto n = boost::lexical_cast<int32_t>(extractFormParamsFromBody("n", extractBodyContent(session)));
    auto size = boost::lexical_cast<std::string>(extractFormParamsFromBody("size", extractBodyContent(session)));
    auto responseFormat = boost::lexical_cast<std::string>(extractFormParamsFromBody("responseFormat", extractBodyContent(session)));
    auto user = boost::lexical_cast<std::string>(extractFormParamsFromBody("user", extractBodyContent(session)));
    
    int status_code = 500;
    ImagesResponse resultObject = ImagesResponse{};
    std::string result = "";
    
    try {
        std::tie(status_code, resultObject) =
            handler_POST(image, prompt, mask, model, n, size, responseFormat, user);
    }
    catch(const ImagesApiException& e) {
        std::tie(status_code, result) = handleImagesApiException(e);
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
        "multipart/form-data, "
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


std::pair<int, ImagesResponse> ImagesEditsResource::handler_POST(
        std::string & image, std::string & prompt, std::string & mask, CreateImageEditRequest_model & model, int32_t & n, std::string & size, std::string & responseFormat, std::string & user)
{
    return handler_POST_func(image, prompt, mask, model, n, size, responseFormat, user);
}


std::string ImagesEditsResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
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

std::string ImagesEditsResource::extractFormParamsFromBody(const std::string& paramName, const std::string& body) {
    const auto uri = restbed::Uri("urlencoded?" + body, true);
    const auto params = uri.get_query_parameters();
    const auto result = params.find(paramName);
    if (result != params.cend()) {
        return result->second;
    }
    return "";
}
ImagesVariationsResource::ImagesVariationsResource(const std::string& context /* = "/v1" */)
{
	this->set_path(context + "/images/variations");
	this->set_method_handler("POST",
		std::bind(&ImagesVariationsResource::handler_POST_internal, this,
			std::placeholders::_1));
}

std::pair<int, std::string> ImagesVariationsResource::handleImagesApiException(const ImagesApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> ImagesVariationsResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> ImagesVariationsResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void ImagesVariationsResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void ImagesVariationsResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, std::multimap<std::string, std::string>& responseHeaders)
{
    responseHeaders.insert(std::make_pair("Connection", "close"));
    session->close(status, result, responseHeaders);
}

void ImagesVariationsResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void ImagesVariationsResource::handler_POST_internal(const std::shared_ptr<restbed::Session> session)
{
    const auto request = session->get_request();
    auto image = boost::lexical_cast<std::string>(extractFormParamsFromBody("image", extractBodyContent(session)));
    auto model = boost::lexical_cast<CreateImageEditRequest_model>(extractFormParamsFromBody("model", extractBodyContent(session)));
    auto n = boost::lexical_cast<int32_t>(extractFormParamsFromBody("n", extractBodyContent(session)));
    auto responseFormat = boost::lexical_cast<std::string>(extractFormParamsFromBody("responseFormat", extractBodyContent(session)));
    auto size = boost::lexical_cast<std::string>(extractFormParamsFromBody("size", extractBodyContent(session)));
    auto user = boost::lexical_cast<std::string>(extractFormParamsFromBody("user", extractBodyContent(session)));
    
    int status_code = 500;
    ImagesResponse resultObject = ImagesResponse{};
    std::string result = "";
    
    try {
        std::tie(status_code, resultObject) =
            handler_POST(image, model, n, responseFormat, size, user);
    }
    catch(const ImagesApiException& e) {
        std::tie(status_code, result) = handleImagesApiException(e);
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
        "multipart/form-data, "
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


std::pair<int, ImagesResponse> ImagesVariationsResource::handler_POST(
        std::string & image, CreateImageEditRequest_model & model, int32_t & n, std::string & responseFormat, std::string & size, std::string & user)
{
    return handler_POST_func(image, model, n, responseFormat, size, user);
}


std::string ImagesVariationsResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
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

std::string ImagesVariationsResource::extractFormParamsFromBody(const std::string& paramName, const std::string& body) {
    const auto uri = restbed::Uri("urlencoded?" + body, true);
    const auto params = uri.get_query_parameters();
    const auto result = params.find(paramName);
    if (result != params.cend()) {
        return result->second;
    }
    return "";
}

} /* namespace ImagesApiResources */

ImagesApi::ImagesApi(std::shared_ptr<restbed::Service> const& restbedService)
: m_service(restbedService)
{
}

ImagesApi::~ImagesApi() {}

std::shared_ptr<ImagesApiResources::ImagesGenerationsResource> ImagesApi::getImagesGenerationsResource() {
    if (!m_spImagesGenerationsResource) {
        setResource(std::make_shared<ImagesApiResources::ImagesGenerationsResource>());
    }
    return m_spImagesGenerationsResource;
}
std::shared_ptr<ImagesApiResources::ImagesEditsResource> ImagesApi::getImagesEditsResource() {
    if (!m_spImagesEditsResource) {
        setResource(std::make_shared<ImagesApiResources::ImagesEditsResource>());
    }
    return m_spImagesEditsResource;
}
std::shared_ptr<ImagesApiResources::ImagesVariationsResource> ImagesApi::getImagesVariationsResource() {
    if (!m_spImagesVariationsResource) {
        setResource(std::make_shared<ImagesApiResources::ImagesVariationsResource>());
    }
    return m_spImagesVariationsResource;
}
void ImagesApi::setResource(std::shared_ptr<ImagesApiResources::ImagesGenerationsResource> resource) {
    m_spImagesGenerationsResource = resource;
    m_service->publish(m_spImagesGenerationsResource);
}
void ImagesApi::setResource(std::shared_ptr<ImagesApiResources::ImagesEditsResource> resource) {
    m_spImagesEditsResource = resource;
    m_service->publish(m_spImagesEditsResource);
}
void ImagesApi::setResource(std::shared_ptr<ImagesApiResources::ImagesVariationsResource> resource) {
    m_spImagesVariationsResource = resource;
    m_service->publish(m_spImagesVariationsResource);
}
void ImagesApi::setImagesApiImagesGenerationsResource(std::shared_ptr<ImagesApiResources::ImagesGenerationsResource> spImagesGenerationsResource) {
    m_spImagesGenerationsResource = spImagesGenerationsResource;
    m_service->publish(m_spImagesGenerationsResource);
}
void ImagesApi::setImagesApiImagesEditsResource(std::shared_ptr<ImagesApiResources::ImagesEditsResource> spImagesEditsResource) {
    m_spImagesEditsResource = spImagesEditsResource;
    m_service->publish(m_spImagesEditsResource);
}
void ImagesApi::setImagesApiImagesVariationsResource(std::shared_ptr<ImagesApiResources::ImagesVariationsResource> spImagesVariationsResource) {
    m_spImagesVariationsResource = spImagesVariationsResource;
    m_service->publish(m_spImagesVariationsResource);
}


void ImagesApi::publishDefaultResources() {
    if (!m_spImagesGenerationsResource) {
        setResource(std::make_shared<ImagesApiResources::ImagesGenerationsResource>());
    }
    if (!m_spImagesEditsResource) {
        setResource(std::make_shared<ImagesApiResources::ImagesEditsResource>());
    }
    if (!m_spImagesVariationsResource) {
        setResource(std::make_shared<ImagesApiResources::ImagesVariationsResource>());
    }
}

std::shared_ptr<restbed::Service> ImagesApi::service() {
    return m_service;
}


}
}
}
}

