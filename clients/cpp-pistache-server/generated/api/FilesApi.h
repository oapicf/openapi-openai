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
 * FilesApi.h
 *
 * 
 */

#ifndef FilesApi_H_
#define FilesApi_H_


#include "ApiBase.h"

#include <pistache/http.h>
#include <pistache/router.h>
#include <pistache/http_headers.h>

#include <optional>
#include <utility>

#include "DeleteFileResponse.h"
#include "ListFilesResponse.h"
#include "OpenAIFile.h"
#include <string>

namespace org::openapitools::server::api
{

class  FilesApi : public ApiBase {
public:
    explicit FilesApi(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~FilesApi() override = default;
    void init() override;

    static const std::string base;

private:
    void setupRoutes();

    void create_file_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void delete_file_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void download_file_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void list_files_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void retrieve_file_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void files_api_default_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);

    /// <summary>
    /// Helper function to handle unexpected Exceptions during Parameter parsing and validation.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual std::pair<Pistache::Http::Code, std::string> handleParsingException(const std::exception& ex) const noexcept;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during processing of the request in handler functions.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual std::pair<Pistache::Http::Code, std::string> handleOperationException(const std::exception& ex) const noexcept;

    /// <summary>
    /// Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    virtual void create_file(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Delete a file.
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="fileId">The ID of the file to use for this request.</param>
    virtual void delete_file(const std::string &fileId, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Returns the contents of the specified file.
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="fileId">The ID of the file to use for this request.</param>
    virtual void download_file(const std::string &fileId, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Returns a list of files that belong to the user&#39;s organization.
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="purpose">Only return files with the given purpose. (optional, default to &quot;&quot;)</param>
    virtual void list_files(const std::optional<std::string> &purpose, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Returns information about a specific file.
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="fileId">The ID of the file to use for this request.</param>
    virtual void retrieve_file(const std::string &fileId, Pistache::Http::ResponseWriter &response) = 0;

};

} // namespace org::openapitools::server::api

#endif /* FilesApi_H_ */
