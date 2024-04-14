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
 * AudioApi.h
 *
 * 
 */

#ifndef AudioApi_H_
#define AudioApi_H_


#include <memory>
#include <utility>
#include <exception>
#include <functional>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/service.hpp>
#include <corvusoft/restbed/settings.hpp>

#include "CreateSpeechRequest.h"
#include "CreateTranscriptionRequest_model.h"
#include "CreateTranscription_200_response.h"
#include "CreateTranslation_200_response.h"
#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

///
/// Exception to flag problems in the handlers
///
class  AudioApiException: public std::exception
{
public:
    AudioApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace AudioApiResources {
/// <summary>
/// Generates audio from the input text.
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  AudioSpeechResource: public restbed::Resource
{
public:
    AudioSpeechResource(const std::string& context = "/v1");
    virtual ~AudioSpeechResource() = default;

    AudioSpeechResource(
        const AudioSpeechResource& other) = default; // copy constructor
    AudioSpeechResource(AudioSpeechResource&& other) noexcept = default; // move constructor

    AudioSpeechResource& operator=(const AudioSpeechResource& other) = default; // copy assignment
    AudioSpeechResource& operator=(AudioSpeechResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        CreateSpeechRequest & createSpeechRequest)> handler_POST_func =
            [](CreateSpeechRequest &) -> std::pair<int, std::string>
                { throw AudioApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::string> handler_POST(
        CreateSpeechRequest & createSpeechRequest);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleAudioApiException(const AudioApiException& e);
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
/// Transcribes audio into the input language.
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  AudioTranscriptionsResource: public restbed::Resource
{
public:
    AudioTranscriptionsResource(const std::string& context = "/v1");
    virtual ~AudioTranscriptionsResource() = default;

    AudioTranscriptionsResource(
        const AudioTranscriptionsResource& other) = default; // copy constructor
    AudioTranscriptionsResource(AudioTranscriptionsResource&& other) noexcept = default; // move constructor

    AudioTranscriptionsResource& operator=(const AudioTranscriptionsResource& other) = default; // copy assignment
    AudioTranscriptionsResource& operator=(AudioTranscriptionsResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, CreateTranscription_200_response>(
        std::string & file, CreateTranscriptionRequest_model & model, std::string & language, std::string & prompt, std::string & responseFormat, double & temperature, std::vector<std::string> & timestampGranularitiesLeft_Square_BracketRight_Square_Bracket)> handler_POST_func =
            [](std::string &, CreateTranscriptionRequest_model &, std::string &, std::string &, std::string &, double &, std::vector<std::string> &) -> std::pair<int, CreateTranscription_200_response>
                { throw AudioApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, CreateTranscription_200_response> handler_POST(
        std::string & file, CreateTranscriptionRequest_model & model, std::string & language, std::string & prompt, std::string & responseFormat, double & temperature, std::vector<std::string> & timestampGranularitiesLeft_Square_BracketRight_Square_Bracket);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleAudioApiException(const AudioApiException& e);
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
/// Translates audio into English.
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  AudioTranslationsResource: public restbed::Resource
{
public:
    AudioTranslationsResource(const std::string& context = "/v1");
    virtual ~AudioTranslationsResource() = default;

    AudioTranslationsResource(
        const AudioTranslationsResource& other) = default; // copy constructor
    AudioTranslationsResource(AudioTranslationsResource&& other) noexcept = default; // move constructor

    AudioTranslationsResource& operator=(const AudioTranslationsResource& other) = default; // copy assignment
    AudioTranslationsResource& operator=(AudioTranslationsResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, CreateTranslation_200_response>(
        std::string & file, CreateTranscriptionRequest_model & model, std::string & prompt, std::string & responseFormat, double & temperature)> handler_POST_func =
            [](std::string &, CreateTranscriptionRequest_model &, std::string &, std::string &, double &) -> std::pair<int, CreateTranslation_200_response>
                { throw AudioApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, CreateTranslation_200_response> handler_POST(
        std::string & file, CreateTranscriptionRequest_model & model, std::string & prompt, std::string & responseFormat, double & temperature);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleAudioApiException(const AudioApiException& e);
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

} /* namespace AudioApiResources */

using AudioApiAudioSpeechResource [[deprecated]] = AudioApiResources::AudioSpeechResource;
using AudioApiAudioTranscriptionsResource [[deprecated]] = AudioApiResources::AudioTranscriptionsResource;
using AudioApiAudioTranslationsResource [[deprecated]] = AudioApiResources::AudioTranslationsResource;

//
// The restbed service to actually implement the REST server
//
class  AudioApi
{
public:
    explicit AudioApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~AudioApi();

    std::shared_ptr<AudioApiResources::AudioSpeechResource> getAudioSpeechResource();
    std::shared_ptr<AudioApiResources::AudioTranscriptionsResource> getAudioTranscriptionsResource();
    std::shared_ptr<AudioApiResources::AudioTranslationsResource> getAudioTranslationsResource();

    void setResource(std::shared_ptr<AudioApiResources::AudioSpeechResource> resource);
    void setResource(std::shared_ptr<AudioApiResources::AudioTranscriptionsResource> resource);
    void setResource(std::shared_ptr<AudioApiResources::AudioTranslationsResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setAudioApiAudioSpeechResource(std::shared_ptr<AudioApiResources::AudioSpeechResource> spAudioApiAudioSpeechResource);
    [[deprecated("use setResource()")]]
    virtual void setAudioApiAudioTranscriptionsResource(std::shared_ptr<AudioApiResources::AudioTranscriptionsResource> spAudioApiAudioTranscriptionsResource);
    [[deprecated("use setResource()")]]
    virtual void setAudioApiAudioTranslationsResource(std::shared_ptr<AudioApiResources::AudioTranslationsResource> spAudioApiAudioTranslationsResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<AudioApiResources::AudioSpeechResource> m_spAudioSpeechResource;
    std::shared_ptr<AudioApiResources::AudioTranscriptionsResource> m_spAudioTranscriptionsResource;
    std::shared_ptr<AudioApiResources::AudioTranslationsResource> m_spAudioTranslationsResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* AudioApi_H_ */

