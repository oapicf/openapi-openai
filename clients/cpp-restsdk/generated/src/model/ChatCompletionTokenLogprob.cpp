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



#include "CppRestOpenAPIClient/model/ChatCompletionTokenLogprob.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



ChatCompletionTokenLogprob::ChatCompletionTokenLogprob()
{
    m_Token = utility::conversions::to_string_t("");
    m_TokenIsSet = false;
    m_Logprob = 0.0;
    m_LogprobIsSet = false;
    m_BytesIsSet = false;
    m_Top_logprobsIsSet = false;
}

ChatCompletionTokenLogprob::~ChatCompletionTokenLogprob()
{
}

void ChatCompletionTokenLogprob::validate()
{
    // TODO: implement validation
}

web::json::value ChatCompletionTokenLogprob::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_TokenIsSet)
    {
        val[utility::conversions::to_string_t(U("token"))] = ModelBase::toJson(m_Token);
    }
    if(m_LogprobIsSet)
    {
        val[utility::conversions::to_string_t(U("logprob"))] = ModelBase::toJson(m_Logprob);
    }
    if(m_BytesIsSet)
    {
        val[utility::conversions::to_string_t(U("bytes"))] = ModelBase::toJson(m_Bytes);
    }
    if(m_Top_logprobsIsSet)
    {
        val[utility::conversions::to_string_t(U("top_logprobs"))] = ModelBase::toJson(m_Top_logprobs);
    }

    return val;
}

bool ChatCompletionTokenLogprob::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("token"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("token")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setToken;
            ok &= ModelBase::fromJson(fieldValue, refVal_setToken);
            setToken(refVal_setToken);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("logprob"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("logprob")));
        if(!fieldValue.is_null())
        {
            double refVal_setLogprob;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLogprob);
            setLogprob(refVal_setLogprob);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("bytes"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("bytes")));
        if(!fieldValue.is_null())
        {
            std::vector<int32_t> refVal_setBytes;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBytes);
            setBytes(refVal_setBytes);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("top_logprobs"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("top_logprobs")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<ChatCompletionTokenLogprob_top_logprobs_inner>> refVal_setTopLogprobs;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTopLogprobs);
            setTopLogprobs(refVal_setTopLogprobs);
        }
    }
    return ok;
}

void ChatCompletionTokenLogprob::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_TokenIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("token")), m_Token));
    }
    if(m_LogprobIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("logprob")), m_Logprob));
    }
    if(m_BytesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("bytes")), m_Bytes));
    }
    if(m_Top_logprobsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("top_logprobs")), m_Top_logprobs));
    }
}

bool ChatCompletionTokenLogprob::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("token"))))
    {
        utility::string_t refVal_setToken;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("token"))), refVal_setToken );
        setToken(refVal_setToken);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("logprob"))))
    {
        double refVal_setLogprob;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("logprob"))), refVal_setLogprob );
        setLogprob(refVal_setLogprob);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("bytes"))))
    {
        std::vector<int32_t> refVal_setBytes;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("bytes"))), refVal_setBytes );
        setBytes(refVal_setBytes);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("top_logprobs"))))
    {
        std::vector<std::shared_ptr<ChatCompletionTokenLogprob_top_logprobs_inner>> refVal_setTopLogprobs;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("top_logprobs"))), refVal_setTopLogprobs );
        setTopLogprobs(refVal_setTopLogprobs);
    }
    return ok;
}

utility::string_t ChatCompletionTokenLogprob::getToken() const
{
    return m_Token;
}

void ChatCompletionTokenLogprob::setToken(const utility::string_t& value)
{
    m_Token = value;
    m_TokenIsSet = true;
}

bool ChatCompletionTokenLogprob::tokenIsSet() const
{
    return m_TokenIsSet;
}

void ChatCompletionTokenLogprob::unsetToken()
{
    m_TokenIsSet = false;
}
double ChatCompletionTokenLogprob::getLogprob() const
{
    return m_Logprob;
}

void ChatCompletionTokenLogprob::setLogprob(double value)
{
    m_Logprob = value;
    m_LogprobIsSet = true;
}

bool ChatCompletionTokenLogprob::logprobIsSet() const
{
    return m_LogprobIsSet;
}

void ChatCompletionTokenLogprob::unsetLogprob()
{
    m_LogprobIsSet = false;
}
std::vector<int32_t>& ChatCompletionTokenLogprob::getBytes()
{
    return m_Bytes;
}

void ChatCompletionTokenLogprob::setBytes(std::vector<int32_t> value)
{
    m_Bytes = value;
    m_BytesIsSet = true;
}

bool ChatCompletionTokenLogprob::bytesIsSet() const
{
    return m_BytesIsSet;
}

void ChatCompletionTokenLogprob::unsetBytes()
{
    m_BytesIsSet = false;
}
std::vector<std::shared_ptr<ChatCompletionTokenLogprob_top_logprobs_inner>>& ChatCompletionTokenLogprob::getTopLogprobs()
{
    return m_Top_logprobs;
}

void ChatCompletionTokenLogprob::setTopLogprobs(const std::vector<std::shared_ptr<ChatCompletionTokenLogprob_top_logprobs_inner>>& value)
{
    m_Top_logprobs = value;
    m_Top_logprobsIsSet = true;
}

bool ChatCompletionTokenLogprob::topLogprobsIsSet() const
{
    return m_Top_logprobsIsSet;
}

void ChatCompletionTokenLogprob::unsetTop_logprobs()
{
    m_Top_logprobsIsSet = false;
}
}
}
}
}

