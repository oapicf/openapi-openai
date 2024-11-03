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
 * AssistantsApiToolChoiceOption.h
 *
 * Controls which (if any) tool is called by the model. &#x60;none&#x60; means the model will not call any tools and instead generates a message. &#x60;auto&#x60; is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like &#x60;{\&quot;type\&quot;: \&quot;TOOL_TYPE\&quot;}&#x60; or &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that tool. 
 */

#ifndef AssistantsApiToolChoiceOption_H_
#define AssistantsApiToolChoiceOption_H_



#include "ChatCompletionNamedToolChoice_function.h"
#include <string>
#include "AssistantsApiNamedToolChoice.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "AssistantsApiNamedToolChoice.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Controls which (if any) tool is called by the model. &#x60;none&#x60; means the model will not call any tools and instead generates a message. &#x60;auto&#x60; is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like &#x60;{\&quot;type\&quot;: \&quot;TOOL_TYPE\&quot;}&#x60; or &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that tool. 
/// </summary>
class  AssistantsApiToolChoiceOption : public AssistantsApiNamedToolChoice
{
public:
    AssistantsApiToolChoiceOption() = default;
    explicit AssistantsApiToolChoiceOption(boost::property_tree::ptree const& pt);
    virtual ~AssistantsApiToolChoiceOption() = default;

    AssistantsApiToolChoiceOption(const AssistantsApiToolChoiceOption& other) = default; // copy constructor
    AssistantsApiToolChoiceOption(AssistantsApiToolChoiceOption&& other) noexcept = default; // move constructor

    AssistantsApiToolChoiceOption& operator=(const AssistantsApiToolChoiceOption& other) = default; // copy assignment
    AssistantsApiToolChoiceOption& operator=(AssistantsApiToolChoiceOption&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// AssistantsApiToolChoiceOption members

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

std::vector<AssistantsApiToolChoiceOption> createAssistantsApiToolChoiceOptionVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<AssistantsApiToolChoiceOption>(const AssistantsApiToolChoiceOption& val) {
    return val.toPropertyTree();
}

template<>
inline AssistantsApiToolChoiceOption fromPt<AssistantsApiToolChoiceOption>(const boost::property_tree::ptree& pt) {
    AssistantsApiToolChoiceOption ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* AssistantsApiToolChoiceOption_H_ */
