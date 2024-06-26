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
 * CreateSpeechRequest.h
 *
 * 
 */

#ifndef CreateSpeechRequest_H_
#define CreateSpeechRequest_H_


#include <string>
#include "CreateSpeechRequest_model.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  CreateSpeechRequest
{
public:
    CreateSpeechRequest();
    virtual ~CreateSpeechRequest() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const CreateSpeechRequest& rhs) const;
    bool operator!=(const CreateSpeechRequest& rhs) const;

    /////////////////////////////////////////////
    /// CreateSpeechRequest members

    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::CreateSpeechRequest_model getModel() const;
    void setModel(org::openapitools::server::model::CreateSpeechRequest_model const& value);
    /// <summary>
    /// The text to generate audio for. The maximum length is 4096 characters.
    /// </summary>
    std::string getInput() const;
    void setInput(std::string const& value);
    /// <summary>
    /// The voice to use when generating the audio. Supported voices are &#x60;alloy&#x60;, &#x60;echo&#x60;, &#x60;fable&#x60;, &#x60;onyx&#x60;, &#x60;nova&#x60;, and &#x60;shimmer&#x60;. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
    /// </summary>
    std::string getVoice() const;
    void setVoice(std::string const& value);
    /// <summary>
    /// The format to audio in. Supported formats are &#x60;mp3&#x60;, &#x60;opus&#x60;, &#x60;aac&#x60;, &#x60;flac&#x60;, &#x60;wav&#x60;, and &#x60;pcm&#x60;.
    /// </summary>
    std::string getResponseFormat() const;
    void setResponseFormat(std::string const& value);
    bool responseFormatIsSet() const;
    void unsetResponse_format();
    /// <summary>
    /// The speed of the generated audio. Select a value from &#x60;0.25&#x60; to &#x60;4.0&#x60;. &#x60;1.0&#x60; is the default.
    /// </summary>
    double getSpeed() const;
    void setSpeed(double const value);
    bool speedIsSet() const;
    void unsetSpeed();

    friend  void to_json(nlohmann::json& j, const CreateSpeechRequest& o);
    friend  void from_json(const nlohmann::json& j, CreateSpeechRequest& o);
protected:
    org::openapitools::server::model::CreateSpeechRequest_model m_Model;

    std::string m_Input;

    std::string m_Voice;

    std::string m_Response_format;
    bool m_Response_formatIsSet;
    double m_Speed;
    bool m_SpeedIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* CreateSpeechRequest_H_ */
