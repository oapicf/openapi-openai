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
 * RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// 
/// </summary>
class  RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image
    : public ModelBase
{
public:
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image();
    virtual ~RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image members

    /// <summary>
    /// The [file](/docs/api-reference/files) ID of the image.
    /// </summary>
    utility::string_t getFileId() const;
    bool fileIdIsSet() const;
    void unsetFile_id();

    void setFileId(const utility::string_t& value);


protected:
    utility::string_t m_File_id;
    bool m_File_idIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image_H_ */
