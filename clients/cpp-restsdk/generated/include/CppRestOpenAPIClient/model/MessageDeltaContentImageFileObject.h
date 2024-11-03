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
 * MessageDeltaContentImageFileObject.h
 *
 * References an image [File](/docs/api-reference/files) in the content of a message.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_MessageDeltaContentImageFileObject_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_MessageDeltaContentImageFileObject_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/MessageDeltaContentImageFileObject_image_file.h"
#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class MessageDeltaContentImageFileObject_image_file;


/// <summary>
/// References an image [File](/docs/api-reference/files) in the content of a message.
/// </summary>
class  MessageDeltaContentImageFileObject
    : public ModelBase
{
public:
    MessageDeltaContentImageFileObject();
    virtual ~MessageDeltaContentImageFileObject();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// MessageDeltaContentImageFileObject members

    /// <summary>
    /// The index of the content part in the message.
    /// </summary>
    int32_t getIndex() const;
    bool indexIsSet() const;
    void unsetIndex();

    void setIndex(int32_t value);

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
    std::shared_ptr<MessageDeltaContentImageFileObject_image_file> getImageFile() const;
    bool imageFileIsSet() const;
    void unsetImage_file();

    void setImageFile(const std::shared_ptr<MessageDeltaContentImageFileObject_image_file>& value);


protected:
    int32_t m_Index;
    bool m_IndexIsSet;
    utility::string_t m_Type;
    bool m_TypeIsSet;
    std::shared_ptr<MessageDeltaContentImageFileObject_image_file> m_Image_file;
    bool m_Image_fileIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_MessageDeltaContentImageFileObject_H_ */
