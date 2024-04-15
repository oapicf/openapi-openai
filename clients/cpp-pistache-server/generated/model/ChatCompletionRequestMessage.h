/**
* OpenAI API
* The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
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
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  ChatCompletionRequestMessage
{
public:
    ChatCompletionRequestMessage();
    virtual ~ChatCompletionRequestMessage() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const ChatCompletionRequestMessage& rhs) const;
    bool operator!=(const ChatCompletionRequestMessage& rhs) const;

    /////////////////////////////////////////////
    /// ChatCompletionRequestMessage members

    /// <summary>
    /// The contents of the function message.
    /// </summary>
    std::string getContent() const;
    void setContent(std::string const& value);
    /// <summary>
    /// The role of the messages author, in this case &#x60;function&#x60;.
    /// </summary>
    std::string getRole() const;
    void setRole(std::string const& value);
    /// <summary>
    /// The name of the function to call.
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
    /// <summary>
    /// The tool calls generated by the model, such as function calls.
    /// </summary>
    std::vector<org::openapitools::server::model::ChatCompletionMessageToolCall> getToolCalls() const;
    void setToolCalls(std::vector<org::openapitools::server::model::ChatCompletionMessageToolCall> const& value);
    bool toolCallsIsSet() const;
    void unsetTool_calls();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::ChatCompletionRequestAssistantMessage_function_call getFunctionCall() const;
    void setFunctionCall(org::openapitools::server::model::ChatCompletionRequestAssistantMessage_function_call const& value);
    bool functionCallIsSet() const;
    void unsetFunction_call();
    /// <summary>
    /// Tool call that this message is responding to.
    /// </summary>
    std::string getToolCallId() const;
    void setToolCallId(std::string const& value);

    friend  void to_json(nlohmann::json& j, const ChatCompletionRequestMessage& o);
    friend  void from_json(const nlohmann::json& j, ChatCompletionRequestMessage& o);
protected:
    std::string m_Content;

    std::string m_Role;

    std::string m_Name;

    std::vector<org::openapitools::server::model::ChatCompletionMessageToolCall> m_Tool_calls;
    bool m_Tool_callsIsSet;
    org::openapitools::server::model::ChatCompletionRequestAssistantMessage_function_call m_Function_call;
    bool m_Function_callIsSet;
    std::string m_Tool_call_id;

    
};

} // namespace org::openapitools::server::model

#endif /* ChatCompletionRequestMessage_H_ */