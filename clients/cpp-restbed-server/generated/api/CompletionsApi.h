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
 * CompletionsApi.h
 *
 * 
 */

#ifndef CompletionsApi_H_
#define CompletionsApi_H_


#include <memory>
#include <utility>
#include <exception>
#include <functional>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/service.hpp>
#include <corvusoft/restbed/settings.hpp>

#include "CreateCompletionRequest.h"
#include "CreateCompletionResponse.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

///
/// Exception to flag problems in the handlers
///
class  CompletionsApiException: public std::exception
{
public:
    CompletionsApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace CompletionsApiResources {
/// <summary>
/// Creates a completion for the provided prompt and parameters.
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  CompletionsResource: public restbed::Resource
{
public:
    CompletionsResource(const std::string& context = "/v1");
    virtual ~CompletionsResource() = default;

    CompletionsResource(
        const CompletionsResource& other) = default; // copy constructor
    CompletionsResource(CompletionsResource&& other) noexcept = default; // move constructor

    CompletionsResource& operator=(const CompletionsResource& other) = default; // copy assignment
    CompletionsResource& operator=(CompletionsResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, CreateCompletionResponse>(
        CreateCompletionRequest & createCompletionRequest)> handler_POST_func =
            [](CreateCompletionRequest &) -> std::pair<int, CreateCompletionResponse>
                { throw CompletionsApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, CreateCompletionResponse> handler_POST(
        CreateCompletionRequest & createCompletionRequest);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleCompletionsApiException(const CompletionsApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);

    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, std::multimap<std::string, std::string>& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_POST_internal(const std::shared_ptr<restbed::Session> session);
};

} /* namespace CompletionsApiResources */

using CompletionsApiCompletionsResource [[deprecated]] = CompletionsApiResources::CompletionsResource;

//
// The restbed service to actually implement the REST server
//
class  CompletionsApi
{
public:
    explicit CompletionsApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~CompletionsApi();

    std::shared_ptr<CompletionsApiResources::CompletionsResource> getCompletionsResource();

    void setResource(std::shared_ptr<CompletionsApiResources::CompletionsResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setCompletionsApiCompletionsResource(std::shared_ptr<CompletionsApiResources::CompletionsResource> spCompletionsApiCompletionsResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<CompletionsApiResources::CompletionsResource> m_spCompletionsResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* CompletionsApi_H_ */

