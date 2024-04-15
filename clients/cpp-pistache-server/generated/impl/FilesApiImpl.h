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
* FilesApiImpl.h
*
* 
*/

#ifndef FILES_API_IMPL_H_
#define FILES_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>
#include <optional>

#include <FilesApi.h>


#include "DeleteFileResponse.h"
#include "ListFilesResponse.h"
#include "OpenAIFile.h"
#include <string>

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::model;

class  FilesApiImpl : public org::openapitools::server::api::FilesApi {
public:
    explicit FilesApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~FilesApiImpl() override = default;

    void create_file(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter &response);
    void delete_file(const std::string &fileId, Pistache::Http::ResponseWriter &response);
    void download_file(const std::string &fileId, Pistache::Http::ResponseWriter &response);
    void list_files(const std::optional<std::string> &purpose, Pistache::Http::ResponseWriter &response);
    void retrieve_file(const std::string &fileId, Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif