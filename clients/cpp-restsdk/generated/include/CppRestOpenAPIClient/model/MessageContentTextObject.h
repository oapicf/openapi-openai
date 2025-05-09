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
 * MessageContentTextObject.h
 *
 * The text content that is part of a message.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_MessageContentTextObject_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_MessageContentTextObject_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/MessageContentTextObject_text.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class MessageContentTextObject_text;


/// <summary>
/// The text content that is part of a message.
/// </summary>
class  MessageContentTextObject
    : public ModelBase
{
public:
    MessageContentTextObject();
    virtual ~MessageContentTextObject();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// MessageContentTextObject members

    /// <summary>
    /// Always &#x60;text&#x60;.
    /// </summary>
    utility::string_t getType() const;
    bool typeIsSet() const;
    void unsetType();

    void setType(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<MessageContentTextObject_text> getText() const;
    bool textIsSet() const;
    void unsetText();

    void setText(const std::shared_ptr<MessageContentTextObject_text>& value);


protected:
    utility::string_t m_Type;
    bool m_TypeIsSet;
    std::shared_ptr<MessageContentTextObject_text> m_Text;
    bool m_TextIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_MessageContentTextObject_H_ */
