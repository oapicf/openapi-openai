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
 * ChatCompletionRequestToolMessage.h
 *
 * 
 */

#ifndef ChatCompletionRequestToolMessage_H_
#define ChatCompletionRequestToolMessage_H_



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
class  ChatCompletionRequestToolMessage 
{
public:
    ChatCompletionRequestToolMessage() = default;
    explicit ChatCompletionRequestToolMessage(boost::property_tree::ptree const& pt);
    virtual ~ChatCompletionRequestToolMessage() = default;

    ChatCompletionRequestToolMessage(const ChatCompletionRequestToolMessage& other) = default; // copy constructor
    ChatCompletionRequestToolMessage(ChatCompletionRequestToolMessage&& other) noexcept = default; // move constructor

    ChatCompletionRequestToolMessage& operator=(const ChatCompletionRequestToolMessage& other) = default; // copy assignment
    ChatCompletionRequestToolMessage& operator=(ChatCompletionRequestToolMessage&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ChatCompletionRequestToolMessage members

    /// <summary>
    /// The role of the messages author, in this case &#x60;tool&#x60;.
    /// </summary>
    std::string getRole() const;
    void setRole(std::string value);

    /// <summary>
    /// The contents of the tool message.
    /// </summary>
    std::string getContent() const;
    void setContent(std::string value);

    /// <summary>
    /// Tool call that this message is responding to.
    /// </summary>
    std::string getToolCallId() const;
    void setToolCallId(std::string value);

protected:
    std::string m_Role = "";
    std::string m_Content = "";
    std::string m_Tool_call_id = "";
};

std::vector<ChatCompletionRequestToolMessage> createChatCompletionRequestToolMessageVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ChatCompletionRequestToolMessage>(const ChatCompletionRequestToolMessage& val) {
    return val.toPropertyTree();
}

template<>
inline ChatCompletionRequestToolMessage fromPt<ChatCompletionRequestToolMessage>(const boost::property_tree::ptree& pt) {
    ChatCompletionRequestToolMessage ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ChatCompletionRequestToolMessage_H_ */
