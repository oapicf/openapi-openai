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



#include "CppRestOpenAPIClient/model/CreateChatCompletionResponse_choices_inner_logprobs.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CreateChatCompletionResponse_choices_inner_logprobs::CreateChatCompletionResponse_choices_inner_logprobs()
{
    m_ContentIsSet = false;
}

CreateChatCompletionResponse_choices_inner_logprobs::~CreateChatCompletionResponse_choices_inner_logprobs()
{
}

void CreateChatCompletionResponse_choices_inner_logprobs::validate()
{
    // TODO: implement validation
}

web::json::value CreateChatCompletionResponse_choices_inner_logprobs::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_ContentIsSet)
    {
        val[utility::conversions::to_string_t(U("content"))] = ModelBase::toJson(m_Content);
    }

    return val;
}

bool CreateChatCompletionResponse_choices_inner_logprobs::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("content"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("content")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<ChatCompletionTokenLogprob>> refVal_setContent;
            ok &= ModelBase::fromJson(fieldValue, refVal_setContent);
            setContent(refVal_setContent);
        }
    }
    return ok;
}

void CreateChatCompletionResponse_choices_inner_logprobs::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_ContentIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("content")), m_Content));
    }
}

bool CreateChatCompletionResponse_choices_inner_logprobs::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("content"))))
    {
        std::vector<std::shared_ptr<ChatCompletionTokenLogprob>> refVal_setContent;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("content"))), refVal_setContent );
        setContent(refVal_setContent);
    }
    return ok;
}

std::vector<std::shared_ptr<ChatCompletionTokenLogprob>>& CreateChatCompletionResponse_choices_inner_logprobs::getContent()
{
    return m_Content;
}

void CreateChatCompletionResponse_choices_inner_logprobs::setContent(const std::vector<std::shared_ptr<ChatCompletionTokenLogprob>>& value)
{
    m_Content = value;
    m_ContentIsSet = true;
}

bool CreateChatCompletionResponse_choices_inner_logprobs::contentIsSet() const
{
    return m_ContentIsSet;
}

void CreateChatCompletionResponse_choices_inner_logprobs::unsetContent()
{
    m_ContentIsSet = false;
}
}
}
}
}


