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
 * CreateTranscription_200_response.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CreateTranscription_200_response_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CreateTranscription_200_response_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/CreateTranscriptionResponseVerboseJson.h"
#include "CppRestOpenAPIClient/model/CreateTranscriptionResponseJson.h"
#include "CppRestOpenAPIClient/model/TranscriptionSegment.h"
#include "CppRestOpenAPIClient/model/TranscriptionWord.h"
#include <cpprest/details/basic_types.h>
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class TranscriptionWord;
class TranscriptionSegment;

/// <summary>
/// 
/// </summary>
class  CreateTranscription_200_response
    : public ModelBase
{
public:
    CreateTranscription_200_response();
    virtual ~CreateTranscription_200_response();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CreateTranscription_200_response members

    /// <summary>
    /// The transcribed text.
    /// </summary>
    utility::string_t getText() const;
    bool textIsSet() const;
    void unsetText();

    void setText(const utility::string_t& value);

    /// <summary>
    /// The language of the input audio.
    /// </summary>
    utility::string_t getLanguage() const;
    bool languageIsSet() const;
    void unsetLanguage();

    void setLanguage(const utility::string_t& value);

    /// <summary>
    /// The duration of the input audio.
    /// </summary>
    utility::string_t getDuration() const;
    bool durationIsSet() const;
    void unsetDuration();

    void setDuration(const utility::string_t& value);

    /// <summary>
    /// Extracted words and their corresponding timestamps.
    /// </summary>
    std::vector<std::shared_ptr<TranscriptionWord>>& getWords();
    bool wordsIsSet() const;
    void unsetWords();

    void setWords(const std::vector<std::shared_ptr<TranscriptionWord>>& value);

    /// <summary>
    /// Segments of the transcribed text and their corresponding details.
    /// </summary>
    std::vector<std::shared_ptr<TranscriptionSegment>>& getSegments();
    bool segmentsIsSet() const;
    void unsetSegments();

    void setSegments(const std::vector<std::shared_ptr<TranscriptionSegment>>& value);


protected:
    utility::string_t m_Text;
    bool m_TextIsSet;
    utility::string_t m_Language;
    bool m_LanguageIsSet;
    utility::string_t m_Duration;
    bool m_DurationIsSet;
    std::vector<std::shared_ptr<TranscriptionWord>> m_Words;
    bool m_WordsIsSet;
    std::vector<std::shared_ptr<TranscriptionSegment>> m_Segments;
    bool m_SegmentsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CreateTranscription_200_response_H_ */
