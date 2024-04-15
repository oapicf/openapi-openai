/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * ModerationsApi.h
 *
 * 
 */

#ifndef ModerationsApi_H_
#define ModerationsApi_H_


#include <memory>
#include <utility>
#include <exception>
#include <functional>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/service.hpp>
#include <corvusoft/restbed/settings.hpp>

#include "CreateModerationRequest.h"
#include "CreateModerationResponse.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

///
/// Exception to flag problems in the handlers
///
class  ModerationsApiException: public std::exception
{
public:
    ModerationsApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace ModerationsApiResources {
/// <summary>
/// Classifies if text is potentially harmful.
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  ModerationsResource: public restbed::Resource
{
public:
    ModerationsResource(const std::string& context = "/v1");
    virtual ~ModerationsResource() = default;

    ModerationsResource(
        const ModerationsResource& other) = default; // copy constructor
    ModerationsResource(ModerationsResource&& other) noexcept = default; // move constructor

    ModerationsResource& operator=(const ModerationsResource& other) = default; // copy assignment
    ModerationsResource& operator=(ModerationsResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, CreateModerationResponse>(
        CreateModerationRequest & createModerationRequest)> handler_POST_func =
            [](CreateModerationRequest &) -> std::pair<int, CreateModerationResponse>
                { throw ModerationsApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, CreateModerationResponse> handler_POST(
        CreateModerationRequest & createModerationRequest);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleModerationsApiException(const ModerationsApiException& e);
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

} /* namespace ModerationsApiResources */

using ModerationsApiModerationsResource [[deprecated]] = ModerationsApiResources::ModerationsResource;

//
// The restbed service to actually implement the REST server
//
class  ModerationsApi
{
public:
    explicit ModerationsApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~ModerationsApi();

    std::shared_ptr<ModerationsApiResources::ModerationsResource> getModerationsResource();

    void setResource(std::shared_ptr<ModerationsApiResources::ModerationsResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setModerationsApiModerationsResource(std::shared_ptr<ModerationsApiResources::ModerationsResource> spModerationsApiModerationsResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<ModerationsApiResources::ModerationsResource> m_spModerationsResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* ModerationsApi_H_ */
