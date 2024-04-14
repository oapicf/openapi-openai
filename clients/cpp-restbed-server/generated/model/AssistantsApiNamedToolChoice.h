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
 * AssistantsApiNamedToolChoice.h
 *
 * Specifies a tool the model should use. Use to force the model to call a specific tool.
 */

#ifndef AssistantsApiNamedToolChoice_H_
#define AssistantsApiNamedToolChoice_H_



#include "ChatCompletionNamedToolChoice_function.h"
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
/// Specifies a tool the model should use. Use to force the model to call a specific tool.
/// </summary>
class  AssistantsApiNamedToolChoice 
{
public:
    AssistantsApiNamedToolChoice() = default;
    explicit AssistantsApiNamedToolChoice(boost::property_tree::ptree const& pt);
    virtual ~AssistantsApiNamedToolChoice() = default;

    AssistantsApiNamedToolChoice(const AssistantsApiNamedToolChoice& other) = default; // copy constructor
    AssistantsApiNamedToolChoice(AssistantsApiNamedToolChoice&& other) noexcept = default; // move constructor

    AssistantsApiNamedToolChoice& operator=(const AssistantsApiNamedToolChoice& other) = default; // copy assignment
    AssistantsApiNamedToolChoice& operator=(AssistantsApiNamedToolChoice&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// AssistantsApiNamedToolChoice members

    /// <summary>
    /// The type of the tool. If type is &#x60;function&#x60;, the function name must be set
    /// </summary>
    std::string getType() const;
    void setType(std::string value);

    /// <summary>
    /// 
    /// </summary>
    ChatCompletionNamedToolChoice_function getFunction() const;
    void setFunction(ChatCompletionNamedToolChoice_function value);

protected:
    std::string m_Type = "";
    ChatCompletionNamedToolChoice_function m_Function;
};

std::vector<AssistantsApiNamedToolChoice> createAssistantsApiNamedToolChoiceVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<AssistantsApiNamedToolChoice>(const AssistantsApiNamedToolChoice& val) {
    return val.toPropertyTree();
}

template<>
inline AssistantsApiNamedToolChoice fromPt<AssistantsApiNamedToolChoice>(const boost::property_tree::ptree& pt) {
    AssistantsApiNamedToolChoice ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* AssistantsApiNamedToolChoice_H_ */
