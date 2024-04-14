/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * ChatCompletionResponseMessage.h
 *
 * 
 */

#ifndef ChatCompletionResponseMessage_H_
#define ChatCompletionResponseMessage_H_



#include "ChatCompletionRequestMessage_function_call.h"
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
/// 
/// </summary>
class  ChatCompletionResponseMessage 
{
public:
    ChatCompletionResponseMessage() = default;
    explicit ChatCompletionResponseMessage(boost::property_tree::ptree const& pt);
    virtual ~ChatCompletionResponseMessage() = default;

    ChatCompletionResponseMessage(const ChatCompletionResponseMessage& other) = default; // copy constructor
    ChatCompletionResponseMessage(ChatCompletionResponseMessage&& other) noexcept = default; // move constructor

    ChatCompletionResponseMessage& operator=(const ChatCompletionResponseMessage& other) = default; // copy assignment
    ChatCompletionResponseMessage& operator=(ChatCompletionResponseMessage&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ChatCompletionResponseMessage members

    /// <summary>
    /// The role of the author of this message.
    /// </summary>
    std::string getRole() const;
    void setRole(std::string value);

    /// <summary>
    /// The contents of the message.
    /// </summary>
    std::string getContent() const;
    void setContent(std::string value);

    /// <summary>
    /// 
    /// </summary>
    ChatCompletionRequestMessage_function_call getFunctionCall() const;
    void setFunctionCall(ChatCompletionRequestMessage_function_call value);

protected:
    std::string m_Role = "";
    std::string m_Content = "";
    ChatCompletionRequestMessage_function_call m_Function_call;
};

std::vector<ChatCompletionResponseMessage> createChatCompletionResponseMessageVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ChatCompletionResponseMessage>(const ChatCompletionResponseMessage& val) {
    return val.toPropertyTree();
}

template<>
inline ChatCompletionResponseMessage fromPt<ChatCompletionResponseMessage>(const boost::property_tree::ptree& pt) {
    ChatCompletionResponseMessage ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ChatCompletionResponseMessage_H_ */