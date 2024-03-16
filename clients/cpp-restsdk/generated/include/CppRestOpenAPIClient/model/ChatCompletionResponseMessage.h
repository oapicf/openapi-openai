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

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ChatCompletionResponseMessage_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ChatCompletionResponseMessage_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/ChatCompletionRequestMessage_function_call.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class ChatCompletionRequestMessage_function_call;

/// <summary>
/// 
/// </summary>
class  ChatCompletionResponseMessage
    : public ModelBase
{
public:
    ChatCompletionResponseMessage();
    virtual ~ChatCompletionResponseMessage();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ChatCompletionResponseMessage members

    /// <summary>
    /// The role of the author of this message.
    /// </summary>
    utility::string_t getRole() const;
    bool roleIsSet() const;
    void unsetRole();

    void setRole(const utility::string_t& value);

    /// <summary>
    /// The contents of the message.
    /// </summary>
    utility::string_t getContent() const;
    bool contentIsSet() const;
    void unsetContent();

    void setContent(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ChatCompletionRequestMessage_function_call> getFunctionCall() const;
    bool functionCallIsSet() const;
    void unsetFunction_call();

    void setFunctionCall(const std::shared_ptr<ChatCompletionRequestMessage_function_call>& value);


protected:
    utility::string_t m_Role;
    bool m_RoleIsSet;
    utility::string_t m_Content;
    bool m_ContentIsSet;
    std::shared_ptr<ChatCompletionRequestMessage_function_call> m_Function_call;
    bool m_Function_callIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ChatCompletionResponseMessage_H_ */
