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



#include "CppRestOpenAPIClient/model/CreateCompletionResponse_choices_inner.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CreateCompletionResponse_choices_inner::CreateCompletionResponse_choices_inner()
{
    m_Finish_reason = utility::conversions::to_string_t("");
    m_Finish_reasonIsSet = false;
    m_Index = 0;
    m_IndexIsSet = false;
    m_LogprobsIsSet = false;
    m_Text = utility::conversions::to_string_t("");
    m_TextIsSet = false;
}

CreateCompletionResponse_choices_inner::~CreateCompletionResponse_choices_inner()
{
}

void CreateCompletionResponse_choices_inner::validate()
{
    // TODO: implement validation
}

web::json::value CreateCompletionResponse_choices_inner::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Finish_reasonIsSet)
    {
        val[utility::conversions::to_string_t(U("finish_reason"))] = ModelBase::toJson(m_Finish_reason);
    }
    if(m_IndexIsSet)
    {
        val[utility::conversions::to_string_t(U("index"))] = ModelBase::toJson(m_Index);
    }
    if(m_LogprobsIsSet)
    {
        val[utility::conversions::to_string_t(U("logprobs"))] = ModelBase::toJson(m_Logprobs);
    }
    if(m_TextIsSet)
    {
        val[utility::conversions::to_string_t(U("text"))] = ModelBase::toJson(m_Text);
    }

    return val;
}

bool CreateCompletionResponse_choices_inner::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("finish_reason"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("finish_reason")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setFinishReason;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFinishReason);
            setFinishReason(refVal_setFinishReason);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("index"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("index")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setIndex;
            ok &= ModelBase::fromJson(fieldValue, refVal_setIndex);
            setIndex(refVal_setIndex);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("logprobs"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("logprobs")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<CreateCompletionResponse_choices_inner_logprobs> refVal_setLogprobs;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLogprobs);
            setLogprobs(refVal_setLogprobs);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("text"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("text")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setText;
            ok &= ModelBase::fromJson(fieldValue, refVal_setText);
            setText(refVal_setText);
        }
    }
    return ok;
}

void CreateCompletionResponse_choices_inner::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Finish_reasonIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("finish_reason")), m_Finish_reason));
    }
    if(m_IndexIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("index")), m_Index));
    }
    if(m_LogprobsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("logprobs")), m_Logprobs));
    }
    if(m_TextIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("text")), m_Text));
    }
}

bool CreateCompletionResponse_choices_inner::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("finish_reason"))))
    {
        utility::string_t refVal_setFinishReason;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("finish_reason"))), refVal_setFinishReason );
        setFinishReason(refVal_setFinishReason);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("index"))))
    {
        int32_t refVal_setIndex;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("index"))), refVal_setIndex );
        setIndex(refVal_setIndex);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("logprobs"))))
    {
        std::shared_ptr<CreateCompletionResponse_choices_inner_logprobs> refVal_setLogprobs;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("logprobs"))), refVal_setLogprobs );
        setLogprobs(refVal_setLogprobs);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("text"))))
    {
        utility::string_t refVal_setText;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("text"))), refVal_setText );
        setText(refVal_setText);
    }
    return ok;
}

utility::string_t CreateCompletionResponse_choices_inner::getFinishReason() const
{
    return m_Finish_reason;
}

void CreateCompletionResponse_choices_inner::setFinishReason(const utility::string_t& value)
{
    m_Finish_reason = value;
    m_Finish_reasonIsSet = true;
}

bool CreateCompletionResponse_choices_inner::finishReasonIsSet() const
{
    return m_Finish_reasonIsSet;
}

void CreateCompletionResponse_choices_inner::unsetFinish_reason()
{
    m_Finish_reasonIsSet = false;
}
int32_t CreateCompletionResponse_choices_inner::getIndex() const
{
    return m_Index;
}

void CreateCompletionResponse_choices_inner::setIndex(int32_t value)
{
    m_Index = value;
    m_IndexIsSet = true;
}

bool CreateCompletionResponse_choices_inner::indexIsSet() const
{
    return m_IndexIsSet;
}

void CreateCompletionResponse_choices_inner::unsetIndex()
{
    m_IndexIsSet = false;
}
std::shared_ptr<CreateCompletionResponse_choices_inner_logprobs> CreateCompletionResponse_choices_inner::getLogprobs() const
{
    return m_Logprobs;
}

void CreateCompletionResponse_choices_inner::setLogprobs(const std::shared_ptr<CreateCompletionResponse_choices_inner_logprobs>& value)
{
    m_Logprobs = value;
    m_LogprobsIsSet = true;
}

bool CreateCompletionResponse_choices_inner::logprobsIsSet() const
{
    return m_LogprobsIsSet;
}

void CreateCompletionResponse_choices_inner::unsetLogprobs()
{
    m_LogprobsIsSet = false;
}
utility::string_t CreateCompletionResponse_choices_inner::getText() const
{
    return m_Text;
}

void CreateCompletionResponse_choices_inner::setText(const utility::string_t& value)
{
    m_Text = value;
    m_TextIsSet = true;
}

bool CreateCompletionResponse_choices_inner::textIsSet() const
{
    return m_TextIsSet;
}

void CreateCompletionResponse_choices_inner::unsetText()
{
    m_TextIsSet = false;
}
}
}
}
}


