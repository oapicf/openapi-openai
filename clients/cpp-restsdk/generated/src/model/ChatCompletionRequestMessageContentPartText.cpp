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



#include "CppRestOpenAPIClient/model/ChatCompletionRequestMessageContentPartText.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



ChatCompletionRequestMessageContentPartText::ChatCompletionRequestMessageContentPartText()
{
    m_Type = utility::conversions::to_string_t("");
    m_TypeIsSet = false;
    m_Text = utility::conversions::to_string_t("");
    m_TextIsSet = false;
}

ChatCompletionRequestMessageContentPartText::~ChatCompletionRequestMessageContentPartText()
{
}

void ChatCompletionRequestMessageContentPartText::validate()
{
    // TODO: implement validation
}

web::json::value ChatCompletionRequestMessageContentPartText::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t(U("type"))] = ModelBase::toJson(m_Type);
    }
    if(m_TextIsSet)
    {
        val[utility::conversions::to_string_t(U("text"))] = ModelBase::toJson(m_Text);
    }

    return val;
}

bool ChatCompletionRequestMessageContentPartText::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("type")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setType);
            setType(refVal_setType);
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

void ChatCompletionRequestMessageContentPartText::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("type")), m_Type));
    }
    if(m_TextIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("text")), m_Text));
    }
}

bool ChatCompletionRequestMessageContentPartText::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("type"))))
    {
        utility::string_t refVal_setType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("type"))), refVal_setType );
        setType(refVal_setType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("text"))))
    {
        utility::string_t refVal_setText;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("text"))), refVal_setText );
        setText(refVal_setText);
    }
    return ok;
}

utility::string_t ChatCompletionRequestMessageContentPartText::getType() const
{
    return m_Type;
}

void ChatCompletionRequestMessageContentPartText::setType(const utility::string_t& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool ChatCompletionRequestMessageContentPartText::typeIsSet() const
{
    return m_TypeIsSet;
}

void ChatCompletionRequestMessageContentPartText::unsetType()
{
    m_TypeIsSet = false;
}
utility::string_t ChatCompletionRequestMessageContentPartText::getText() const
{
    return m_Text;
}

void ChatCompletionRequestMessageContentPartText::setText(const utility::string_t& value)
{
    m_Text = value;
    m_TextIsSet = true;
}

bool ChatCompletionRequestMessageContentPartText::textIsSet() const
{
    return m_TextIsSet;
}

void ChatCompletionRequestMessageContentPartText::unsetText()
{
    m_TextIsSet = false;
}
}
}
}
}

