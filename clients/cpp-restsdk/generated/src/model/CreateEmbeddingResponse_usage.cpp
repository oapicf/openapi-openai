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



#include "CppRestOpenAPIClient/model/CreateEmbeddingResponse_usage.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CreateEmbeddingResponse_usage::CreateEmbeddingResponse_usage()
{
    m_Prompt_tokens = 0;
    m_Prompt_tokensIsSet = false;
    m_Total_tokens = 0;
    m_Total_tokensIsSet = false;
}

CreateEmbeddingResponse_usage::~CreateEmbeddingResponse_usage()
{
}

void CreateEmbeddingResponse_usage::validate()
{
    // TODO: implement validation
}

web::json::value CreateEmbeddingResponse_usage::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Prompt_tokensIsSet)
    {
        val[utility::conversions::to_string_t(U("prompt_tokens"))] = ModelBase::toJson(m_Prompt_tokens);
    }
    if(m_Total_tokensIsSet)
    {
        val[utility::conversions::to_string_t(U("total_tokens"))] = ModelBase::toJson(m_Total_tokens);
    }

    return val;
}

bool CreateEmbeddingResponse_usage::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("prompt_tokens"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("prompt_tokens")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setPromptTokens;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPromptTokens);
            setPromptTokens(refVal_setPromptTokens);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("total_tokens"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("total_tokens")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setTotalTokens;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTotalTokens);
            setTotalTokens(refVal_setTotalTokens);
        }
    }
    return ok;
}

void CreateEmbeddingResponse_usage::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Prompt_tokensIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("prompt_tokens")), m_Prompt_tokens));
    }
    if(m_Total_tokensIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("total_tokens")), m_Total_tokens));
    }
}

bool CreateEmbeddingResponse_usage::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("prompt_tokens"))))
    {
        int32_t refVal_setPromptTokens;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("prompt_tokens"))), refVal_setPromptTokens );
        setPromptTokens(refVal_setPromptTokens);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("total_tokens"))))
    {
        int32_t refVal_setTotalTokens;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("total_tokens"))), refVal_setTotalTokens );
        setTotalTokens(refVal_setTotalTokens);
    }
    return ok;
}

int32_t CreateEmbeddingResponse_usage::getPromptTokens() const
{
    return m_Prompt_tokens;
}

void CreateEmbeddingResponse_usage::setPromptTokens(int32_t value)
{
    m_Prompt_tokens = value;
    m_Prompt_tokensIsSet = true;
}

bool CreateEmbeddingResponse_usage::promptTokensIsSet() const
{
    return m_Prompt_tokensIsSet;
}

void CreateEmbeddingResponse_usage::unsetPrompt_tokens()
{
    m_Prompt_tokensIsSet = false;
}
int32_t CreateEmbeddingResponse_usage::getTotalTokens() const
{
    return m_Total_tokens;
}

void CreateEmbeddingResponse_usage::setTotalTokens(int32_t value)
{
    m_Total_tokens = value;
    m_Total_tokensIsSet = true;
}

bool CreateEmbeddingResponse_usage::totalTokensIsSet() const
{
    return m_Total_tokensIsSet;
}

void CreateEmbeddingResponse_usage::unsetTotal_tokens()
{
    m_Total_tokensIsSet = false;
}
}
}
}
}


