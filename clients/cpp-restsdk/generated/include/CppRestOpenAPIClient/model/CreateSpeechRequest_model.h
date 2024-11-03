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
 * CreateSpeechRequest_model.h
 *
 * One of the available [TTS models](/docs/models/tts): &#x60;tts-1&#x60; or &#x60;tts-1-hd&#x60; 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CreateSpeechRequest_model_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CreateSpeechRequest_model_H_


#include "CppRestOpenAPIClient/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// One of the available [TTS models](/docs/models/tts): &#x60;tts-1&#x60; or &#x60;tts-1-hd&#x60; 
/// </summary>
class  CreateSpeechRequest_model
    : public ModelBase
{
public:
    CreateSpeechRequest_model();
    virtual ~CreateSpeechRequest_model();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CreateSpeechRequest_model members


protected:
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CreateSpeechRequest_model_H_ */
