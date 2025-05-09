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
 * ChatCompletionFunctionCallOption.h
 *
 * Specifying a particular function via &#x60;{\&quot;name\&quot;: \&quot;my_function\&quot;}&#x60; forces the model to call that function. 
 */

#ifndef ChatCompletionFunctionCallOption_H_
#define ChatCompletionFunctionCallOption_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Specifying a particular function via &#x60;{\&quot;name\&quot;: \&quot;my_function\&quot;}&#x60; forces the model to call that function. 
/// </summary>
class  ChatCompletionFunctionCallOption 
{
public:
    ChatCompletionFunctionCallOption() = default;
    explicit ChatCompletionFunctionCallOption(boost::property_tree::ptree const& pt);
    virtual ~ChatCompletionFunctionCallOption() = default;

    ChatCompletionFunctionCallOption(const ChatCompletionFunctionCallOption& other) = default; // copy constructor
    ChatCompletionFunctionCallOption(ChatCompletionFunctionCallOption&& other) noexcept = default; // move constructor

    ChatCompletionFunctionCallOption& operator=(const ChatCompletionFunctionCallOption& other) = default; // copy assignment
    ChatCompletionFunctionCallOption& operator=(ChatCompletionFunctionCallOption&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ChatCompletionFunctionCallOption members

    /// <summary>
    /// The name of the function to call.
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

protected:
    std::string m_Name = "";
};

std::vector<ChatCompletionFunctionCallOption> createChatCompletionFunctionCallOptionVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ChatCompletionFunctionCallOption>(const ChatCompletionFunctionCallOption& val) {
    return val.toPropertyTree();
}

template<>
inline ChatCompletionFunctionCallOption fromPt<ChatCompletionFunctionCallOption>(const boost::property_tree::ptree& pt) {
    ChatCompletionFunctionCallOption ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ChatCompletionFunctionCallOption_H_ */
