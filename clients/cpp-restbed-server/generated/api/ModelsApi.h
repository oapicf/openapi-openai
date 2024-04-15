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
 * ModelsApi.h
 *
 * 
 */

#ifndef ModelsApi_H_
#define ModelsApi_H_


#include <memory>
#include <utility>
#include <exception>
#include <functional>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/service.hpp>
#include <corvusoft/restbed/settings.hpp>

#include "DeleteModelResponse.h"
#include "ListModelsResponse.h"
#include "Model.h"
#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

///
/// Exception to flag problems in the handlers
///
class  ModelsApiException: public std::exception
{
public:
    ModelsApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace ModelsApiResources {
/// <summary>
/// Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  ModelsModelResource: public restbed::Resource
{
public:
    ModelsModelResource(const std::string& context = "/v1");
    virtual ~ModelsModelResource() = default;

    ModelsModelResource(
        const ModelsModelResource& other) = default; // copy constructor
    ModelsModelResource(ModelsModelResource&& other) noexcept = default; // move constructor

    ModelsModelResource& operator=(const ModelsModelResource& other) = default; // copy assignment
    ModelsModelResource& operator=(ModelsModelResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, DeleteModelResponse>(
        std::string & model)> handler_DELETE_func =
            [](std::string &) -> std::pair<int, DeleteModelResponse>
                { throw ModelsApiException(501, "Not implemented"); };

    std::function<std::pair<int, Model>(
        std::string & model)> handler_GET_func =
            [](std::string &) -> std::pair<int, Model>
                { throw ModelsApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, DeleteModelResponse> handler_DELETE(
        std::string & model);

    virtual std::pair<int, Model> handler_GET(
        std::string & model);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleModelsApiException(const ModelsApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);

    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, std::multimap<std::string, std::string>& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_DELETE_internal(const std::shared_ptr<restbed::Session> session);
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// Lists the currently available models, and provides basic information about each one such as the owner and availability.
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  ModelsResource: public restbed::Resource
{
public:
    ModelsResource(const std::string& context = "/v1");
    virtual ~ModelsResource() = default;

    ModelsResource(
        const ModelsResource& other) = default; // copy constructor
    ModelsResource(ModelsResource&& other) noexcept = default; // move constructor

    ModelsResource& operator=(const ModelsResource& other) = default; // copy assignment
    ModelsResource& operator=(ModelsResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, ListModelsResponse>(
        )> handler_GET_func =
            []() -> std::pair<int, ListModelsResponse>
                { throw ModelsApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, ListModelsResponse> handler_GET(
        );


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleModelsApiException(const ModelsApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);

    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, std::multimap<std::string, std::string>& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};

} /* namespace ModelsApiResources */

using ModelsApiModelsModelResource [[deprecated]] = ModelsApiResources::ModelsModelResource;
using ModelsApiModelsResource [[deprecated]] = ModelsApiResources::ModelsResource;

//
// The restbed service to actually implement the REST server
//
class  ModelsApi
{
public:
    explicit ModelsApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~ModelsApi();

    std::shared_ptr<ModelsApiResources::ModelsModelResource> getModelsModelResource();
    std::shared_ptr<ModelsApiResources::ModelsResource> getModelsResource();

    void setResource(std::shared_ptr<ModelsApiResources::ModelsModelResource> resource);
    void setResource(std::shared_ptr<ModelsApiResources::ModelsResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setModelsApiModelsModelResource(std::shared_ptr<ModelsApiResources::ModelsModelResource> spModelsApiModelsModelResource);
    [[deprecated("use setResource()")]]
    virtual void setModelsApiModelsResource(std::shared_ptr<ModelsApiResources::ModelsResource> spModelsApiModelsResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<ModelsApiResources::ModelsModelResource> m_spModelsModelResource;
    std::shared_ptr<ModelsApiResources::ModelsResource> m_spModelsResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* ModelsApi_H_ */
