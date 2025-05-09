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
 * MessageContentTextObject_text_annotations_inner.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_MessageContentTextObject_text_annotations_inner_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_MessageContentTextObject_text_annotations_inner_H_

#include <variant>

#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/MessageContentTextAnnotationsFileCitationObject.h"
#include "CppRestOpenAPIClient/model/MessageContentTextAnnotationsFileCitationObject_file_citation.h"
#include "CppRestOpenAPIClient/model/MessageContentTextAnnotationsFilePathObject.h"
#include "CppRestOpenAPIClient/model/MessageContentTextAnnotationsFilePathObject_file_path.h"
#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class MessageContentTextAnnotationsFileCitationObject_file_citation;
class MessageContentTextAnnotationsFilePathObject_file_path;


class  MessageContentTextObject_text_annotations_inner
{
public:
    MessageContentTextObject_text_annotations_inner() = default;
    ~MessageContentTextObject_text_annotations_inner() = default;

    /////////////////////////////////////////////

    void validate();

    web::json::value toJson() const;

    template<typename Target>
    bool fromJson(const web::json::value& json) {
        // convert json to Target type
        Target target;
        if (!target.fromJson(json)) {
            return false;
        }

        m_variantValue = target;
        return true;
    }

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const;

    template<typename Target>
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) {
        // convert multipart to Target type
        Target target;
        if (!target.fromMultiPart(multipart, namePrefix)) {
            return false;
        }

        m_variantValue = target;
        return true;
    }

    /////////////////////////////////////////////
    /// MessageContentTextObject_text_annotations_inner members

    using VariantType = std::variant<MessageContentTextAnnotationsFileCitationObject, MessageContentTextAnnotationsFilePathObject>;

    const VariantType& getVariant() const;
    void setVariant(VariantType value);

protected:
    VariantType m_variantValue;
};



}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_MessageContentTextObject_text_annotations_inner_H_ */
