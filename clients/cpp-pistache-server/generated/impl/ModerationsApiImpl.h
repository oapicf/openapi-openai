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
* ModerationsApiImpl.h
*
* 
*/

#ifndef MODERATIONS_API_IMPL_H_
#define MODERATIONS_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>
#include <optional>

#include <ModerationsApi.h>


#include "CreateModerationRequest.h"
#include "CreateModerationResponse.h"

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::model;

class  ModerationsApiImpl : public org::openapitools::server::api::ModerationsApi {
public:
    explicit ModerationsApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~ModerationsApiImpl() override = default;

    void create_moderation(const CreateModerationRequest &createModerationRequest, Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif
