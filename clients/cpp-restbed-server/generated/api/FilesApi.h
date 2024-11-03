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
 * FilesApi.h
 *
 * 
 */

#ifndef FilesApi_H_
#define FilesApi_H_


#include <memory>
#include <utility>
#include <exception>
#include <functional>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/service.hpp>
#include <corvusoft/restbed/settings.hpp>

#include "DeleteFileResponse.h"
#include "ListFilesResponse.h"
#include "OpenAIFile.h"
#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

///
/// Exception to flag problems in the handlers
///
class  FilesApiException: public std::exception
{
public:
    FilesApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace FilesApiResources {
/// <summary>
/// Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  FilesResource: public restbed::Resource
{
public:
    FilesResource(const std::string& context = "/v1");
    virtual ~FilesResource() = default;

    FilesResource(
        const FilesResource& other) = default; // copy constructor
    FilesResource(FilesResource&& other) noexcept = default; // move constructor

    FilesResource& operator=(const FilesResource& other) = default; // copy assignment
    FilesResource& operator=(FilesResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, OpenAIFile>(
        std::string & file, std::string & purpose)> handler_POST_func =
            [](std::string &, std::string &) -> std::pair<int, OpenAIFile>
                { throw FilesApiException(501, "Not implemented"); };

    std::function<std::pair<int, ListFilesResponse>(
        std::string & purpose)> handler_GET_func =
            [](std::string &) -> std::pair<int, ListFilesResponse>
                { throw FilesApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, OpenAIFile> handler_POST(
        std::string & file, std::string & purpose);

    virtual std::pair<int, ListFilesResponse> handler_GET(
        std::string & purpose);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleFilesApiException(const FilesApiException& e);
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
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// Delete a file.
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  FilesFile_idResource: public restbed::Resource
{
public:
    FilesFile_idResource(const std::string& context = "/v1");
    virtual ~FilesFile_idResource() = default;

    FilesFile_idResource(
        const FilesFile_idResource& other) = default; // copy constructor
    FilesFile_idResource(FilesFile_idResource&& other) noexcept = default; // move constructor

    FilesFile_idResource& operator=(const FilesFile_idResource& other) = default; // copy assignment
    FilesFile_idResource& operator=(FilesFile_idResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, DeleteFileResponse>(
        std::string & fileId)> handler_DELETE_func =
            [](std::string &) -> std::pair<int, DeleteFileResponse>
                { throw FilesApiException(501, "Not implemented"); };

    std::function<std::pair<int, OpenAIFile>(
        std::string & fileId)> handler_GET_func =
            [](std::string &) -> std::pair<int, OpenAIFile>
                { throw FilesApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, DeleteFileResponse> handler_DELETE(
        std::string & fileId);

    virtual std::pair<int, OpenAIFile> handler_GET(
        std::string & fileId);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleFilesApiException(const FilesApiException& e);
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
/// Returns the contents of the specified file.
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  FilesFile_idContentResource: public restbed::Resource
{
public:
    FilesFile_idContentResource(const std::string& context = "/v1");
    virtual ~FilesFile_idContentResource() = default;

    FilesFile_idContentResource(
        const FilesFile_idContentResource& other) = default; // copy constructor
    FilesFile_idContentResource(FilesFile_idContentResource&& other) noexcept = default; // move constructor

    FilesFile_idContentResource& operator=(const FilesFile_idContentResource& other) = default; // copy assignment
    FilesFile_idContentResource& operator=(FilesFile_idContentResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        std::string & fileId)> handler_GET_func =
            [](std::string &) -> std::pair<int, std::string>
                { throw FilesApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::string> handler_GET(
        std::string & fileId);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleFilesApiException(const FilesApiException& e);
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

} /* namespace FilesApiResources */

using FilesApiFilesResource [[deprecated]] = FilesApiResources::FilesResource;
using FilesApiFilesFile_idResource [[deprecated]] = FilesApiResources::FilesFile_idResource;
using FilesApiFilesFile_idContentResource [[deprecated]] = FilesApiResources::FilesFile_idContentResource;

//
// The restbed service to actually implement the REST server
//
class  FilesApi
{
public:
    explicit FilesApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~FilesApi();

    std::shared_ptr<FilesApiResources::FilesResource> getFilesResource();
    std::shared_ptr<FilesApiResources::FilesFile_idResource> getFilesFile_idResource();
    std::shared_ptr<FilesApiResources::FilesFile_idContentResource> getFilesFile_idContentResource();

    void setResource(std::shared_ptr<FilesApiResources::FilesResource> resource);
    void setResource(std::shared_ptr<FilesApiResources::FilesFile_idResource> resource);
    void setResource(std::shared_ptr<FilesApiResources::FilesFile_idContentResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setFilesApiFilesResource(std::shared_ptr<FilesApiResources::FilesResource> spFilesApiFilesResource);
    [[deprecated("use setResource()")]]
    virtual void setFilesApiFilesFile_idResource(std::shared_ptr<FilesApiResources::FilesFile_idResource> spFilesApiFilesFile_idResource);
    [[deprecated("use setResource()")]]
    virtual void setFilesApiFilesFile_idContentResource(std::shared_ptr<FilesApiResources::FilesFile_idContentResource> spFilesApiFilesFile_idContentResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<FilesApiResources::FilesResource> m_spFilesResource;
    std::shared_ptr<FilesApiResources::FilesFile_idResource> m_spFilesFile_idResource;
    std::shared_ptr<FilesApiResources::FilesFile_idContentResource> m_spFilesFile_idContentResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* FilesApi_H_ */

