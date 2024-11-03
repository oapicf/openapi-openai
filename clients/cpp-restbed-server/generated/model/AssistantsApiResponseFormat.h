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
 * AssistantsApiResponseFormat.h
 *
 * An object describing the expected output of the model. If &#x60;json_object&#x60; only &#x60;function&#x60; type &#x60;tools&#x60; are allowed to be passed to the Run. If &#x60;text&#x60; the model can return text or any value needed. 
 */

#ifndef AssistantsApiResponseFormat_H_
#define AssistantsApiResponseFormat_H_



#include <string>
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// An object describing the expected output of the model. If &#x60;json_object&#x60; only &#x60;function&#x60; type &#x60;tools&#x60; are allowed to be passed to the Run. If &#x60;text&#x60; the model can return text or any value needed. 
/// </summary>
class  AssistantsApiResponseFormat 
{
public:
    AssistantsApiResponseFormat() = default;
    explicit AssistantsApiResponseFormat(boost::property_tree::ptree const& pt);
    virtual ~AssistantsApiResponseFormat() = default;

    AssistantsApiResponseFormat(const AssistantsApiResponseFormat& other) = default; // copy constructor
    AssistantsApiResponseFormat(AssistantsApiResponseFormat&& other) noexcept = default; // move constructor

    AssistantsApiResponseFormat& operator=(const AssistantsApiResponseFormat& other) = default; // copy assignment
    AssistantsApiResponseFormat& operator=(AssistantsApiResponseFormat&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// AssistantsApiResponseFormat members

    /// <summary>
    /// Must be one of &#x60;text&#x60; or &#x60;json_object&#x60;.
    /// </summary>
    std::string getType() const;
    void setType(std::string value);

protected:
    std::string m_Type = "text";
};

std::vector<AssistantsApiResponseFormat> createAssistantsApiResponseFormatVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<AssistantsApiResponseFormat>(const AssistantsApiResponseFormat& val) {
    return val.toPropertyTree();
}

template<>
inline AssistantsApiResponseFormat fromPt<AssistantsApiResponseFormat>(const boost::property_tree::ptree& pt) {
    AssistantsApiResponseFormat ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* AssistantsApiResponseFormat_H_ */
