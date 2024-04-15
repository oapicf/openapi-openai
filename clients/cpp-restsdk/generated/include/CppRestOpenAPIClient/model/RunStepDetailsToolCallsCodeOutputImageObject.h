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
 * RunStepDetailsToolCallsCodeOutputImageObject.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDetailsToolCallsCodeOutputImageObject_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDetailsToolCallsCodeOutputImageObject_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/RunStepDetailsToolCallsCodeOutputImageObject_image.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class RunStepDetailsToolCallsCodeOutputImageObject_image;

/// <summary>
/// 
/// </summary>
class  RunStepDetailsToolCallsCodeOutputImageObject
    : public ModelBase
{
public:
    RunStepDetailsToolCallsCodeOutputImageObject();
    virtual ~RunStepDetailsToolCallsCodeOutputImageObject();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// RunStepDetailsToolCallsCodeOutputImageObject members

    /// <summary>
    /// Always &#x60;image&#x60;.
    /// </summary>
    utility::string_t getType() const;
    bool typeIsSet() const;
    void unsetType();

    void setType(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<RunStepDetailsToolCallsCodeOutputImageObject_image> getImage() const;
    bool imageIsSet() const;
    void unsetImage();

    void setImage(const std::shared_ptr<RunStepDetailsToolCallsCodeOutputImageObject_image>& value);


protected:
    utility::string_t m_Type;
    bool m_TypeIsSet;
    std::shared_ptr<RunStepDetailsToolCallsCodeOutputImageObject_image> m_Image;
    bool m_ImageIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDetailsToolCallsCodeOutputImageObject_H_ */