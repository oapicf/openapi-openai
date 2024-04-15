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
 * ChatCompletionRequestAssistantMessage.h
 *
 * 
 */

#ifndef ChatCompletionRequestAssistantMessage_H_
#define ChatCompletionRequestAssistantMessage_H_



#include "ChatCompletionRequestAssistantMessage_function_call.h"
#include <string>
#include "ChatCompletionMessageToolCall.h"
#include <vector>
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
/// 
/// </summary>
class  ChatCompletionRequestAssistantMessage 
{
public:
    ChatCompletionRequestAssistantMessage() = default;
    explicit ChatCompletionRequestAssistantMessage(boost::property_tree::ptree const& pt);
    virtual ~ChatCompletionRequestAssistantMessage() = default;

    ChatCompletionRequestAssistantMessage(const ChatCompletionRequestAssistantMessage& other) = default; // copy constructor
    ChatCompletionRequestAssistantMessage(ChatCompletionRequestAssistantMessage&& other) noexcept = default; // move constructor

    ChatCompletionRequestAssistantMessage& operator=(const ChatCompletionRequestAssistantMessage& other) = default; // copy assignment
    ChatCompletionRequestAssistantMessage& operator=(ChatCompletionRequestAssistantMessage&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ChatCompletionRequestAssistantMessage members

    /// <summary>
    /// The contents of the assistant message. Required unless &#x60;tool_calls&#x60; or &#x60;function_call&#x60; is specified. 
    /// </summary>
    std::string getContent() const;
    void setContent(std::string value);

    /// <summary>
    /// The role of the messages author, in this case &#x60;assistant&#x60;.
    /// </summary>
    std::string getRole() const;
    void setRole(std::string value);

    /// <summary>
    /// An optional name for the participant. Provides the model information to differentiate between participants of the same role.
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// The tool calls generated by the model, such as function calls.
    /// </summary>
    std::vector<ChatCompletionMessageToolCall> getToolCalls() const;
    void setToolCalls(std::vector<ChatCompletionMessageToolCall> value);

    /// <summary>
    /// 
    /// </summary>
    ChatCompletionRequestAssistantMessage_function_call getFunctionCall() const;
    void setFunctionCall(ChatCompletionRequestAssistantMessage_function_call value);

protected:
    std::string m_Content = "";
    std::string m_Role = "";
    std::string m_Name = "";
    std::vector<ChatCompletionMessageToolCall> m_Tool_calls;
    ChatCompletionRequestAssistantMessage_function_call m_Function_call;
};

std::vector<ChatCompletionRequestAssistantMessage> createChatCompletionRequestAssistantMessageVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ChatCompletionRequestAssistantMessage>(const ChatCompletionRequestAssistantMessage& val) {
    return val.toPropertyTree();
}

template<>
inline ChatCompletionRequestAssistantMessage fromPt<ChatCompletionRequestAssistantMessage>(const boost::property_tree::ptree& pt) {
    ChatCompletionRequestAssistantMessage ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ChatCompletionRequestAssistantMessage_H_ */