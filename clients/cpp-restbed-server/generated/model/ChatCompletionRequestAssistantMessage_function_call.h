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
 * ChatCompletionRequestAssistantMessage_function_call.h
 *
 * Deprecated and replaced by &#x60;tool_calls&#x60;. The name and arguments of a function that should be called, as generated by the model.
 */

#ifndef ChatCompletionRequestAssistantMessage_function_call_H_
#define ChatCompletionRequestAssistantMessage_function_call_H_



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
/// Deprecated and replaced by &#x60;tool_calls&#x60;. The name and arguments of a function that should be called, as generated by the model.
/// </summary>
class  ChatCompletionRequestAssistantMessage_function_call 
{
public:
    ChatCompletionRequestAssistantMessage_function_call() = default;
    explicit ChatCompletionRequestAssistantMessage_function_call(boost::property_tree::ptree const& pt);
    virtual ~ChatCompletionRequestAssistantMessage_function_call() = default;

    ChatCompletionRequestAssistantMessage_function_call(const ChatCompletionRequestAssistantMessage_function_call& other) = default; // copy constructor
    ChatCompletionRequestAssistantMessage_function_call(ChatCompletionRequestAssistantMessage_function_call&& other) noexcept = default; // move constructor

    ChatCompletionRequestAssistantMessage_function_call& operator=(const ChatCompletionRequestAssistantMessage_function_call& other) = default; // copy assignment
    ChatCompletionRequestAssistantMessage_function_call& operator=(ChatCompletionRequestAssistantMessage_function_call&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ChatCompletionRequestAssistantMessage_function_call members

    /// <summary>
    /// The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
    /// </summary>
    std::string getArguments() const;
    void setArguments(std::string value);

    /// <summary>
    /// The name of the function to call.
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

protected:
    std::string m_Arguments = "";
    std::string m_Name = "";
};

std::vector<ChatCompletionRequestAssistantMessage_function_call> createChatCompletionRequestAssistantMessage_function_callVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ChatCompletionRequestAssistantMessage_function_call>(const ChatCompletionRequestAssistantMessage_function_call& val) {
    return val.toPropertyTree();
}

template<>
inline ChatCompletionRequestAssistantMessage_function_call fromPt<ChatCompletionRequestAssistantMessage_function_call>(const boost::property_tree::ptree& pt) {
    ChatCompletionRequestAssistantMessage_function_call ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ChatCompletionRequestAssistantMessage_function_call_H_ */