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
 * CreateCompletionResponse_choices_inner_logprobs.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CreateCompletionResponse_choices_inner_logprobs_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CreateCompletionResponse_choices_inner_logprobs_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include <map>
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  CreateCompletionResponse_choices_inner_logprobs
    : public ModelBase
{
public:
    CreateCompletionResponse_choices_inner_logprobs();
    virtual ~CreateCompletionResponse_choices_inner_logprobs();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CreateCompletionResponse_choices_inner_logprobs members

    /// <summary>
    /// 
    /// </summary>
    std::vector<int32_t>& getTextOffset();
    bool textOffsetIsSet() const;
    void unsetText_offset();

    void setTextOffset(std::vector<int32_t> value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<double>& getTokenLogprobs();
    bool tokenLogprobsIsSet() const;
    void unsetToken_logprobs();

    void setTokenLogprobs(std::vector<double> value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<utility::string_t>& getTokens();
    bool tokensIsSet() const;
    void unsetTokens();

    void setTokens(const std::vector<utility::string_t>& value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<std::map<utility::string_t, double>>& getTopLogprobs();
    bool topLogprobsIsSet() const;
    void unsetTop_logprobs();

    void setTopLogprobs(const std::vector<std::map<utility::string_t, double>>& value);


protected:
    std::vector<int32_t> m_Text_offset;
    bool m_Text_offsetIsSet;
    std::vector<double> m_Token_logprobs;
    bool m_Token_logprobsIsSet;
    std::vector<utility::string_t> m_Tokens;
    bool m_TokensIsSet;
    std::vector<std::map<utility::string_t, double>> m_Top_logprobs;
    bool m_Top_logprobsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CreateCompletionResponse_choices_inner_logprobs_H_ */
