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
* AudioApiImpl.h
*
* 
*/

#ifndef AUDIO_API_IMPL_H_
#define AUDIO_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>
#include <optional>

#include <AudioApi.h>


#include "CreateSpeechRequest.h"
#include "CreateTranscriptionRequest_model.h"
#include "CreateTranscription_200_response.h"
#include "CreateTranslation_200_response.h"
#include <string>

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::model;

class  AudioApiImpl : public org::openapitools::server::api::AudioApi {
public:
    explicit AudioApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~AudioApiImpl() override = default;

    void create_speech(const CreateSpeechRequest &createSpeechRequest, Pistache::Http::ResponseWriter &response);
    void create_transcription(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter &response);
    void create_translation(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif
