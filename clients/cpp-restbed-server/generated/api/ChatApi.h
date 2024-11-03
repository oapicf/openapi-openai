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
 * ChatApi.h
 *
 * 
 */

#ifndef ChatApi_H_
#define ChatApi_H_


#include <memory>
#include <utility>
#include <exception>
#include <functional>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/service.hpp>
#include <corvusoft/restbed/settings.hpp>

#include "CreateChatCompletionRequest.h"
#include "CreateChatCompletionResponse.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

///
/// Exception to flag problems in the handlers
///
class  ChatApiException: public std::exception
{
public:
    ChatApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace ChatApiResources {
/// <summary>
/// Creates a model response for the given chat conversation.
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  ChatCompletionsResource: public restbed::Resource
{
public:
    ChatCompletionsResource(const std::string& context = "/v1");
    virtual ~ChatCompletionsResource() = default;

    ChatCompletionsResource(
        const ChatCompletionsResource& other) = default; // copy constructor
    ChatCompletionsResource(ChatCompletionsResource&& other) noexcept = default; // move constructor

    ChatCompletionsResource& operator=(const ChatCompletionsResource& other) = default; // copy assignment
    ChatCompletionsResource& operator=(ChatCompletionsResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, CreateChatCompletionResponse>(
        CreateChatCompletionRequest & createChatCompletionRequest)> handler_POST_func =
            [](CreateChatCompletionRequest &) -> std::pair<int, CreateChatCompletionResponse>
                { throw ChatApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, CreateChatCompletionResponse> handler_POST(
        CreateChatCompletionRequest & createChatCompletionRequest);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleChatApiException(const ChatApiException& e);
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

} /* namespace ChatApiResources */

using ChatApiChatCompletionsResource [[deprecated]] = ChatApiResources::ChatCompletionsResource;

//
// The restbed service to actually implement the REST server
//
class  ChatApi
{
public:
    explicit ChatApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~ChatApi();

    std::shared_ptr<ChatApiResources::ChatCompletionsResource> getChatCompletionsResource();

    void setResource(std::shared_ptr<ChatApiResources::ChatCompletionsResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setChatApiChatCompletionsResource(std::shared_ptr<ChatApiResources::ChatCompletionsResource> spChatApiChatCompletionsResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<ChatApiResources::ChatCompletionsResource> m_spChatCompletionsResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* ChatApi_H_ */

