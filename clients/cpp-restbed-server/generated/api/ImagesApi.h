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
 * ImagesApi.h
 *
 * 
 */

#ifndef ImagesApi_H_
#define ImagesApi_H_


#include <memory>
#include <utility>
#include <exception>
#include <functional>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/service.hpp>
#include <corvusoft/restbed/settings.hpp>

#include "CreateImageEditRequest_model.h"
#include "CreateImageRequest.h"
#include "ImagesResponse.h"
#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

///
/// Exception to flag problems in the handlers
///
class  ImagesApiException: public std::exception
{
public:
    ImagesApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace ImagesApiResources {
/// <summary>
/// Creates an image given a prompt.
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  ImagesGenerationsResource: public restbed::Resource
{
public:
    ImagesGenerationsResource(const std::string& context = "/v1");
    virtual ~ImagesGenerationsResource() = default;

    ImagesGenerationsResource(
        const ImagesGenerationsResource& other) = default; // copy constructor
    ImagesGenerationsResource(ImagesGenerationsResource&& other) noexcept = default; // move constructor

    ImagesGenerationsResource& operator=(const ImagesGenerationsResource& other) = default; // copy assignment
    ImagesGenerationsResource& operator=(ImagesGenerationsResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, ImagesResponse>(
        CreateImageRequest & createImageRequest)> handler_POST_func =
            [](CreateImageRequest &) -> std::pair<int, ImagesResponse>
                { throw ImagesApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, ImagesResponse> handler_POST(
        CreateImageRequest & createImageRequest);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleImagesApiException(const ImagesApiException& e);
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

/// <summary>
/// Creates an edited or extended image given an original image and a prompt.
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  ImagesEditsResource: public restbed::Resource
{
public:
    ImagesEditsResource(const std::string& context = "/v1");
    virtual ~ImagesEditsResource() = default;

    ImagesEditsResource(
        const ImagesEditsResource& other) = default; // copy constructor
    ImagesEditsResource(ImagesEditsResource&& other) noexcept = default; // move constructor

    ImagesEditsResource& operator=(const ImagesEditsResource& other) = default; // copy assignment
    ImagesEditsResource& operator=(ImagesEditsResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, ImagesResponse>(
        std::string & image, std::string & prompt, std::string & mask, CreateImageEditRequest_model & model, int32_t & n, std::string & size, std::string & responseFormat, std::string & user)> handler_POST_func =
            [](std::string &, std::string &, std::string &, CreateImageEditRequest_model &, int32_t &, std::string &, std::string &, std::string &) -> std::pair<int, ImagesResponse>
                { throw ImagesApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, ImagesResponse> handler_POST(
        std::string & image, std::string & prompt, std::string & mask, CreateImageEditRequest_model & model, int32_t & n, std::string & size, std::string & responseFormat, std::string & user);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleImagesApiException(const ImagesApiException& e);
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

/// <summary>
/// Creates a variation of a given image.
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  ImagesVariationsResource: public restbed::Resource
{
public:
    ImagesVariationsResource(const std::string& context = "/v1");
    virtual ~ImagesVariationsResource() = default;

    ImagesVariationsResource(
        const ImagesVariationsResource& other) = default; // copy constructor
    ImagesVariationsResource(ImagesVariationsResource&& other) noexcept = default; // move constructor

    ImagesVariationsResource& operator=(const ImagesVariationsResource& other) = default; // copy assignment
    ImagesVariationsResource& operator=(ImagesVariationsResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, ImagesResponse>(
        std::string & image, CreateImageEditRequest_model & model, int32_t & n, std::string & responseFormat, std::string & size, std::string & user)> handler_POST_func =
            [](std::string &, CreateImageEditRequest_model &, int32_t &, std::string &, std::string &, std::string &) -> std::pair<int, ImagesResponse>
                { throw ImagesApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, ImagesResponse> handler_POST(
        std::string & image, CreateImageEditRequest_model & model, int32_t & n, std::string & responseFormat, std::string & size, std::string & user);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleImagesApiException(const ImagesApiException& e);
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

} /* namespace ImagesApiResources */

using ImagesApiImagesGenerationsResource [[deprecated]] = ImagesApiResources::ImagesGenerationsResource;
using ImagesApiImagesEditsResource [[deprecated]] = ImagesApiResources::ImagesEditsResource;
using ImagesApiImagesVariationsResource [[deprecated]] = ImagesApiResources::ImagesVariationsResource;

//
// The restbed service to actually implement the REST server
//
class  ImagesApi
{
public:
    explicit ImagesApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~ImagesApi();

    std::shared_ptr<ImagesApiResources::ImagesGenerationsResource> getImagesGenerationsResource();
    std::shared_ptr<ImagesApiResources::ImagesEditsResource> getImagesEditsResource();
    std::shared_ptr<ImagesApiResources::ImagesVariationsResource> getImagesVariationsResource();

    void setResource(std::shared_ptr<ImagesApiResources::ImagesGenerationsResource> resource);
    void setResource(std::shared_ptr<ImagesApiResources::ImagesEditsResource> resource);
    void setResource(std::shared_ptr<ImagesApiResources::ImagesVariationsResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setImagesApiImagesGenerationsResource(std::shared_ptr<ImagesApiResources::ImagesGenerationsResource> spImagesApiImagesGenerationsResource);
    [[deprecated("use setResource()")]]
    virtual void setImagesApiImagesEditsResource(std::shared_ptr<ImagesApiResources::ImagesEditsResource> spImagesApiImagesEditsResource);
    [[deprecated("use setResource()")]]
    virtual void setImagesApiImagesVariationsResource(std::shared_ptr<ImagesApiResources::ImagesVariationsResource> spImagesApiImagesVariationsResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<ImagesApiResources::ImagesGenerationsResource> m_spImagesGenerationsResource;
    std::shared_ptr<ImagesApiResources::ImagesEditsResource> m_spImagesEditsResource;
    std::shared_ptr<ImagesApiResources::ImagesVariationsResource> m_spImagesVariationsResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* ImagesApi_H_ */

