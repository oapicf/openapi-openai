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
 * CreateImageEditRequest_model.h
 *
 * The model to use for image generation. Only &#x60;dall-e-2&#x60; is supported at this time.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CreateImageEditRequest_model_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CreateImageEditRequest_model_H_


#include "CppRestOpenAPIClient/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// The model to use for image generation. Only &#x60;dall-e-2&#x60; is supported at this time.
/// </summary>
class  CreateImageEditRequest_model
    : public ModelBase
{
public:
    CreateImageEditRequest_model();
    virtual ~CreateImageEditRequest_model();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CreateImageEditRequest_model members


protected:
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CreateImageEditRequest_model_H_ */
