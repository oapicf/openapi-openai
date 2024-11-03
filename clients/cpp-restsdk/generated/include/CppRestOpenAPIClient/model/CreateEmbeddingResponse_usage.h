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
 * CreateEmbeddingResponse_usage.h
 *
 * The usage information for the request.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CreateEmbeddingResponse_usage_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CreateEmbeddingResponse_usage_H_


#include "CppRestOpenAPIClient/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// The usage information for the request.
/// </summary>
class  CreateEmbeddingResponse_usage
    : public ModelBase
{
public:
    CreateEmbeddingResponse_usage();
    virtual ~CreateEmbeddingResponse_usage();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CreateEmbeddingResponse_usage members

    /// <summary>
    /// The number of tokens used by the prompt.
    /// </summary>
    int32_t getPromptTokens() const;
    bool promptTokensIsSet() const;
    void unsetPrompt_tokens();

    void setPromptTokens(int32_t value);

    /// <summary>
    /// The total number of tokens used by the request.
    /// </summary>
    int32_t getTotalTokens() const;
    bool totalTokensIsSet() const;
    void unsetTotal_tokens();

    void setTotalTokens(int32_t value);


protected:
    int32_t m_Prompt_tokens;
    bool m_Prompt_tokensIsSet;
    int32_t m_Total_tokens;
    bool m_Total_tokensIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CreateEmbeddingResponse_usage_H_ */
