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
 * CreateTranslationResponseVerboseJson.h
 *
 * 
 */

#ifndef CreateTranslationResponseVerboseJson_H_
#define CreateTranslationResponseVerboseJson_H_



#include <string>
#include "TranscriptionSegment.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  CreateTranslationResponseVerboseJson 
{
public:
    CreateTranslationResponseVerboseJson() = default;
    explicit CreateTranslationResponseVerboseJson(boost::property_tree::ptree const& pt);
    virtual ~CreateTranslationResponseVerboseJson() = default;

    CreateTranslationResponseVerboseJson(const CreateTranslationResponseVerboseJson& other) = default; // copy constructor
    CreateTranslationResponseVerboseJson(CreateTranslationResponseVerboseJson&& other) noexcept = default; // move constructor

    CreateTranslationResponseVerboseJson& operator=(const CreateTranslationResponseVerboseJson& other) = default; // copy assignment
    CreateTranslationResponseVerboseJson& operator=(CreateTranslationResponseVerboseJson&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateTranslationResponseVerboseJson members

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
    /// The translated text.
    /// </summary>
    std::string getText() const;
    void setText(std::string value);

    /// <summary>
    /// Segments of the translated text and their corresponding details.
    /// </summary>
    std::vector<TranscriptionSegment> getSegments() const;
    void setSegments(std::vector<TranscriptionSegment> value);

protected:
    std::string m_Language = "";
    std::string m_Duration = "";
    std::string m_Text = "";
    std::vector<TranscriptionSegment> m_Segments;
};

std::vector<CreateTranslationResponseVerboseJson> createCreateTranslationResponseVerboseJsonVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateTranslationResponseVerboseJson>(const CreateTranslationResponseVerboseJson& val) {
    return val.toPropertyTree();
}

template<>
inline CreateTranslationResponseVerboseJson fromPt<CreateTranslationResponseVerboseJson>(const boost::property_tree::ptree& pt) {
    CreateTranslationResponseVerboseJson ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateTranslationResponseVerboseJson_H_ */