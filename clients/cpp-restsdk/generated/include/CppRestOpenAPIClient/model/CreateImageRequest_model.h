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
 * CreateImageRequest_model.h
 *
 * The model to use for image generation.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CreateImageRequest_model_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CreateImageRequest_model_H_


#include "CppRestOpenAPIClient/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// The model to use for image generation.
/// </summary>
class  CreateImageRequest_model
    : public ModelBase
{
public:
    CreateImageRequest_model();
    virtual ~CreateImageRequest_model();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CreateImageRequest_model members


protected:
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CreateImageRequest_model_H_ */
