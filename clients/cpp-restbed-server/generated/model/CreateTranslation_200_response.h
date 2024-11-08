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
 * CreateTranslation_200_response.h
 *
 * 
 */

#ifndef CreateTranslation_200_response_H_
#define CreateTranslation_200_response_H_



#include "CreateTranslationResponseJson.h"
#include <string>
#include "TranscriptionSegment.h"
#include <vector>
#include "CreateTranslationResponseVerboseJson.h"
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "CreateTranslationResponseJson.h"
#include "CreateTranslationResponseVerboseJson.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  CreateTranslation_200_response : public CreateTranslationResponseJson, public CreateTranslationResponseVerboseJson
{
public:
    CreateTranslation_200_response() = default;
    explicit CreateTranslation_200_response(boost::property_tree::ptree const& pt);
    virtual ~CreateTranslation_200_response() = default;

    CreateTranslation_200_response(const CreateTranslation_200_response& other) = default; // copy constructor
    CreateTranslation_200_response(CreateTranslation_200_response&& other) noexcept = default; // move constructor

    CreateTranslation_200_response& operator=(const CreateTranslation_200_response& other) = default; // copy assignment
    CreateTranslation_200_response& operator=(CreateTranslation_200_response&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateTranslation_200_response members

    /// <summary>
    /// The translated text.
    /// </summary>
    std::string getText() const;
    void setText(std::string value);

    /// <summary>
    /// The language of the output translation (always &#x60;english&#x60;).
    /// </summary>
    std::string getLanguage() const;
    void setLanguage(std::string value);

    /// <summary>
    /// The duration of the input audio.
    /// </summary>
    std::string getDuration() const;
    void setDuration(std::string value);

    /// <summary>
    /// Segments of the translated text and their corresponding details.
    /// </summary>
    std::vector<TranscriptionSegment> getSegments() const;
    void setSegments(std::vector<TranscriptionSegment> value);

protected:
    std::string m_Text = "";
    std::string m_Language = "";
    std::string m_Duration = "";
    std::vector<TranscriptionSegment> m_Segments;
};

std::vector<CreateTranslation_200_response> createCreateTranslation_200_responseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateTranslation_200_response>(const CreateTranslation_200_response& val) {
    return val.toPropertyTree();
}

template<>
inline CreateTranslation_200_response fromPt<CreateTranslation_200_response>(const boost::property_tree::ptree& pt) {
    CreateTranslation_200_response ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateTranslation_200_response_H_ */
