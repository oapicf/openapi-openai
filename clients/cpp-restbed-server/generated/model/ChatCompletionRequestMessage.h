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
 * ChatCompletionRequestMessage.h
 *
 * 
 */

#ifndef ChatCompletionRequestMessage_H_
#define ChatCompletionRequestMessage_H_



#include "ChatCompletionRequestAssistantMessage_function_call.h"
#include "ChatCompletionRequestToolMessage.h"
#include "ChatCompletionRequestFunctionMessage.h"
#include "ChatCompletionRequestSystemMessage.h"
#include "ChatCompletionRequestUserMessage.h"
#include <string>
#include "ChatCompletionMessageToolCall.h"
#include "ChatCompletionRequestAssistantMessage.h"
#include <vector>
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "ChatCompletionRequestSystemMessage.h"
#include "ChatCompletionRequestUserMessage.h"
#include "ChatCompletionRequestAssistantMessage.h"
#include "ChatCompletionRequestToolMessage.h"
#include "ChatCompletionRequestFunctionMessage.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ChatCompletionRequestMessage : public ChatCompletionRequestSystemMessage, public ChatCompletionRequestUserMessage, public ChatCompletionRequestAssistantMessage, public ChatCompletionRequestToolMessage, public ChatCompletionRequestFunctionMessage
{
public:
    ChatCompletionRequestMessage() = default;
    explicit ChatCompletionRequestMessage(boost::property_tree::ptree const& pt);
    virtual ~ChatCompletionRequestMessage() = default;

    ChatCompletionRequestMessage(const ChatCompletionRequestMessage& other) = default; // copy constructor
    ChatCompletionRequestMessage(ChatCompletionRequestMessage&& other) noexcept = default; // move constructor

    ChatCompletionRequestMessage& operator=(const ChatCompletionRequestMessage& other) = default; // copy assignment
    ChatCompletionRequestMessage& operator=(ChatCompletionRequestMessage&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ChatCompletionRequestMessage members

    /// <summary>
    /// The contents of the function message.
    /// </summary>
    std::string getContent() const;
    void setContent(std::string value);

    /// <summary>
    /// The role of the messages author, in this case &#x60;function&#x60;.
    /// </summary>
    std::string getRole() const;
    void setRole(std::string value);

    /// <summary>
    /// The name of the function to call.
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

    /// <summary>
    /// Tool call that this message is responding to.
    /// </summary>
    std::string getToolCallId() const;
    void setToolCallId(std::string value);

protected:
    std::string m_Content = "";
    std::string m_Role = "";
    std::string m_Name = "";
    std::vector<ChatCompletionMessageToolCall> m_Tool_calls;
    ChatCompletionRequestAssistantMessage_function_call m_Function_call;
    std::string m_Tool_call_id = "";
};

std::vector<ChatCompletionRequestMessage> createChatCompletionRequestMessageVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ChatCompletionRequestMessage>(const ChatCompletionRequestMessage& val) {
    return val.toPropertyTree();
}

template<>
inline ChatCompletionRequestMessage fromPt<ChatCompletionRequestMessage>(const boost::property_tree::ptree& pt) {
    ChatCompletionRequestMessage ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ChatCompletionRequestMessage_H_ */
