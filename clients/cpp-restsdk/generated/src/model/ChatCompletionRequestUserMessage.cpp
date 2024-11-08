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



#include "CppRestOpenAPIClient/model/ChatCompletionRequestUserMessage.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



ChatCompletionRequestUserMessage::ChatCompletionRequestUserMessage()
{
    m_ContentIsSet = false;
    m_Role = utility::conversions::to_string_t("");
    m_RoleIsSet = false;
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
}

ChatCompletionRequestUserMessage::~ChatCompletionRequestUserMessage()
{
}

void ChatCompletionRequestUserMessage::validate()
{
    // TODO: implement validation
}

web::json::value ChatCompletionRequestUserMessage::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_ContentIsSet)
    {
        val[utility::conversions::to_string_t(U("content"))] = ModelBase::toJson(m_Content);
    }
    if(m_RoleIsSet)
    {
        val[utility::conversions::to_string_t(U("role"))] = ModelBase::toJson(m_Role);
    }
    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t(U("name"))] = ModelBase::toJson(m_Name);
    }

    return val;
}

bool ChatCompletionRequestUserMessage::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("content"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("content")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<ChatCompletionRequestUserMessage_content> refVal_setContent;
            ok &= ModelBase::fromJson(fieldValue, refVal_setContent);
            setContent(refVal_setContent);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("role"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("role")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setRole;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRole);
            setRole(refVal_setRole);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("name"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("name")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setName);
            setName(refVal_setName);
        }
    }
    return ok;
}

void ChatCompletionRequestUserMessage::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_RoleIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("role")), m_Role));
    }
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("name")), m_Name));
    }
}

bool ChatCompletionRequestUserMessage::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("content"))))
    {
        std::shared_ptr<ChatCompletionRequestUserMessage_content> refVal_setContent;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("content"))), refVal_setContent );
        setContent(refVal_setContent);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("role"))))
    {
        utility::string_t refVal_setRole;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("role"))), refVal_setRole );
        setRole(refVal_setRole);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("name"))))
    {
        utility::string_t refVal_setName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("name"))), refVal_setName );
        setName(refVal_setName);
    }
    return ok;
}

std::shared_ptr<ChatCompletionRequestUserMessage_content> ChatCompletionRequestUserMessage::getContent() const
{
    return m_Content;
}

void ChatCompletionRequestUserMessage::setContent(const std::shared_ptr<ChatCompletionRequestUserMessage_content>& value)
{
    m_Content = value;
    m_ContentIsSet = true;
}

bool ChatCompletionRequestUserMessage::contentIsSet() const
{
    return m_ContentIsSet;
}

void ChatCompletionRequestUserMessage::unsetContent()
{
    m_ContentIsSet = false;
}
utility::string_t ChatCompletionRequestUserMessage::getRole() const
{
    return m_Role;
}

void ChatCompletionRequestUserMessage::setRole(const utility::string_t& value)
{
    m_Role = value;
    m_RoleIsSet = true;
}

bool ChatCompletionRequestUserMessage::roleIsSet() const
{
    return m_RoleIsSet;
}

void ChatCompletionRequestUserMessage::unsetRole()
{
    m_RoleIsSet = false;
}
utility::string_t ChatCompletionRequestUserMessage::getName() const
{
    return m_Name;
}

void ChatCompletionRequestUserMessage::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool ChatCompletionRequestUserMessage::nameIsSet() const
{
    return m_NameIsSet;
}

void ChatCompletionRequestUserMessage::unsetName()
{
    m_NameIsSet = false;
}
}
}
}
}


