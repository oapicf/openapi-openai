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

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ChatCompletionRequestToolMessage_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ChatCompletionRequestToolMessage_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  ChatCompletionRequestToolMessage
    : public ModelBase
{
public:
    ChatCompletionRequestToolMessage();
    virtual ~ChatCompletionRequestToolMessage();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ChatCompletionRequestToolMessage members

    /// <summary>
    /// The role of the messages author, in this case &#x60;tool&#x60;.
    /// </summary>
    utility::string_t getRole() const;
    bool roleIsSet() const;
    void unsetRole();

    void setRole(const utility::string_t& value);

    /// <summary>
    /// The contents of the tool message.
    /// </summary>
    utility::string_t getContent() const;
    bool contentIsSet() const;
    void unsetContent();

    void setContent(const utility::string_t& value);

    /// <summary>
    /// Tool call that this message is responding to.
    /// </summary>
    utility::string_t getToolCallId() const;
    bool toolCallIdIsSet() const;
    void unsetTool_call_id();

    void setToolCallId(const utility::string_t& value);


protected:
    utility::string_t m_Role;
    bool m_RoleIsSet;
    utility::string_t m_Content;
    bool m_ContentIsSet;
    utility::string_t m_Tool_call_id;
    bool m_Tool_call_idIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ChatCompletionRequestToolMessage_H_ */
