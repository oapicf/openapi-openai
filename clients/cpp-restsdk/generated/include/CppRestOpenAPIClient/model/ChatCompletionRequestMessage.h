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

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ChatCompletionRequestMessage_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ChatCompletionRequestMessage_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/ChatCompletionMessageToolCall.h"
#include "CppRestOpenAPIClient/model/ChatCompletionRequestAssistantMessage_function_call.h"
#include "CppRestOpenAPIClient/model/ChatCompletionRequestUserMessage.h"
#include "CppRestOpenAPIClient/model/ChatCompletionRequestAssistantMessage.h"
#include "CppRestOpenAPIClient/model/ChatCompletionRequestFunctionMessage.h"
#include "CppRestOpenAPIClient/model/ChatCompletionRequestToolMessage.h"
#include <cpprest/details/basic_types.h>
#include <vector>
#include "CppRestOpenAPIClient/model/ChatCompletionRequestSystemMessage.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class ChatCompletionMessageToolCall;
class ChatCompletionRequestAssistantMessage_function_call;

/// <summary>
/// 
/// </summary>
class  ChatCompletionRequestMessage
    : public ModelBase
{
public:
    ChatCompletionRequestMessage();
    virtual ~ChatCompletionRequestMessage();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ChatCompletionRequestMessage members

    /// <summary>
    /// The contents of the function message.
    /// </summary>
    utility::string_t getContent() const;
    bool contentIsSet() const;
    void unsetContent();

    void setContent(const utility::string_t& value);

    /// <summary>
    /// The role of the messages author, in this case &#x60;function&#x60;.
    /// </summary>
    utility::string_t getRole() const;
    bool roleIsSet() const;
    void unsetRole();

    void setRole(const utility::string_t& value);

    /// <summary>
    /// The name of the function to call.
    /// </summary>
    utility::string_t getName() const;
    bool nameIsSet() const;
    void unsetName();

    void setName(const utility::string_t& value);

    /// <summary>
    /// The tool calls generated by the model, such as function calls.
    /// </summary>
    std::vector<std::shared_ptr<ChatCompletionMessageToolCall>>& getToolCalls();
    bool toolCallsIsSet() const;
    void unsetTool_calls();

    void setToolCalls(const std::vector<std::shared_ptr<ChatCompletionMessageToolCall>>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ChatCompletionRequestAssistantMessage_function_call> getFunctionCall() const;
    bool functionCallIsSet() const;
    void unsetFunction_call();

    void setFunctionCall(const std::shared_ptr<ChatCompletionRequestAssistantMessage_function_call>& value);

    /// <summary>
    /// Tool call that this message is responding to.
    /// </summary>
    utility::string_t getToolCallId() const;
    bool toolCallIdIsSet() const;
    void unsetTool_call_id();

    void setToolCallId(const utility::string_t& value);


protected:
    utility::string_t m_Content;
    bool m_ContentIsSet;
    utility::string_t m_Role;
    bool m_RoleIsSet;
    utility::string_t m_Name;
    bool m_NameIsSet;
    std::vector<std::shared_ptr<ChatCompletionMessageToolCall>> m_Tool_calls;
    bool m_Tool_callsIsSet;
    std::shared_ptr<ChatCompletionRequestAssistantMessage_function_call> m_Function_call;
    bool m_Function_callIsSet;
    utility::string_t m_Tool_call_id;
    bool m_Tool_call_idIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ChatCompletionRequestMessage_H_ */
