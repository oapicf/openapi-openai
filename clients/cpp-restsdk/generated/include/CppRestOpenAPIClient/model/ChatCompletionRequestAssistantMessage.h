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
 * ChatCompletionRequestAssistantMessage.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ChatCompletionRequestAssistantMessage_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ChatCompletionRequestAssistantMessage_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/ChatCompletionMessageToolCall.h"
#include "CppRestOpenAPIClient/model/ChatCompletionRequestAssistantMessage_function_call.h"
#include <cpprest/details/basic_types.h>
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class ChatCompletionMessageToolCall;
class ChatCompletionRequestAssistantMessage_function_call;


/// <summary>
/// 
/// </summary>
class  ChatCompletionRequestAssistantMessage
    : public ModelBase
{
public:
    ChatCompletionRequestAssistantMessage();
    virtual ~ChatCompletionRequestAssistantMessage();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ChatCompletionRequestAssistantMessage members

    /// <summary>
    /// The contents of the assistant message. Required unless &#x60;tool_calls&#x60; or &#x60;function_call&#x60; is specified. 
    /// </summary>
    utility::string_t getContent() const;
    bool contentIsSet() const;
    void unsetContent();

    void setContent(const utility::string_t& value);

    /// <summary>
    /// The role of the messages author, in this case &#x60;assistant&#x60;.
    /// </summary>
    utility::string_t getRole() const;
    bool roleIsSet() const;
    void unsetRole();

    void setRole(const utility::string_t& value);

    /// <summary>
    /// An optional name for the participant. Provides the model information to differentiate between participants of the same role.
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
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ChatCompletionRequestAssistantMessage_H_ */
