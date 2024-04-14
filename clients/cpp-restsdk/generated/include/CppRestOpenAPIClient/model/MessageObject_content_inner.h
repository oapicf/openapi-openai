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
 * MessageObject_content_inner.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_MessageObject_content_inner_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_MessageObject_content_inner_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/MessageContentImageFileObject.h"
#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/MessageContentImageFileObject_image_file.h"
#include "CppRestOpenAPIClient/model/MessageContentTextObject.h"
#include "CppRestOpenAPIClient/model/MessageContentTextObject_text.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class MessageContentImageFileObject_image_file;
class MessageContentTextObject_text;

/// <summary>
/// 
/// </summary>
class  MessageObject_content_inner
    : public ModelBase
{
public:
    MessageObject_content_inner();
    virtual ~MessageObject_content_inner();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// MessageObject_content_inner members

    /// <summary>
    /// Always &#x60;image_file&#x60;.
    /// </summary>
    utility::string_t getType() const;
    bool typeIsSet() const;
    void unsetType();

    void setType(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<MessageContentImageFileObject_image_file> getImageFile() const;
    bool imageFileIsSet() const;
    void unsetImage_file();

    void setImageFile(const std::shared_ptr<MessageContentImageFileObject_image_file>& value);

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
    std::shared_ptr<MessageContentImageFileObject_image_file> m_Image_file;
    bool m_Image_fileIsSet;
    std::shared_ptr<MessageContentTextObject_text> m_Text;
    bool m_TextIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_MessageObject_content_inner_H_ */
