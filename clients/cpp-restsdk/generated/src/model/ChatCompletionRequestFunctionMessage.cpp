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



#include "CppRestOpenAPIClient/model/ChatCompletionRequestFunctionMessage.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



ChatCompletionRequestFunctionMessage::ChatCompletionRequestFunctionMessage()
{
    m_Role = utility::conversions::to_string_t("");
    m_RoleIsSet = false;
    m_Content = utility::conversions::to_string_t("");
    m_ContentIsSet = false;
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
}

ChatCompletionRequestFunctionMessage::~ChatCompletionRequestFunctionMessage()
{
}

void ChatCompletionRequestFunctionMessage::validate()
{
    // TODO: implement validation
}

web::json::value ChatCompletionRequestFunctionMessage::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_RoleIsSet)
    {
        val[utility::conversions::to_string_t(U("role"))] = ModelBase::toJson(m_Role);
    }
    if(m_ContentIsSet)
    {
        val[utility::conversions::to_string_t(U("content"))] = ModelBase::toJson(m_Content);
    }
    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t(U("name"))] = ModelBase::toJson(m_Name);
    }

    return val;
}

bool ChatCompletionRequestFunctionMessage::fromJson(const web::json::value& val)
{
    bool ok = true;
    
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
    if(val.has_field(utility::conversions::to_string_t(U("content"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("content")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setContent;
            ok &= ModelBase::fromJson(fieldValue, refVal_setContent);
            setContent(refVal_setContent);
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

void ChatCompletionRequestFunctionMessage::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_RoleIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("role")), m_Role));
    }
    if(m_ContentIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("content")), m_Content));
    }
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("name")), m_Name));
    }
}

bool ChatCompletionRequestFunctionMessage::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("role"))))
    {
        utility::string_t refVal_setRole;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("role"))), refVal_setRole );
        setRole(refVal_setRole);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("content"))))
    {
        utility::string_t refVal_setContent;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("content"))), refVal_setContent );
        setContent(refVal_setContent);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("name"))))
    {
        utility::string_t refVal_setName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("name"))), refVal_setName );
        setName(refVal_setName);
    }
    return ok;
}

utility::string_t ChatCompletionRequestFunctionMessage::getRole() const
{
    return m_Role;
}

void ChatCompletionRequestFunctionMessage::setRole(const utility::string_t& value)
{
    m_Role = value;
    m_RoleIsSet = true;
}

bool ChatCompletionRequestFunctionMessage::roleIsSet() const
{
    return m_RoleIsSet;
}

void ChatCompletionRequestFunctionMessage::unsetRole()
{
    m_RoleIsSet = false;
}
utility::string_t ChatCompletionRequestFunctionMessage::getContent() const
{
    return m_Content;
}

void ChatCompletionRequestFunctionMessage::setContent(const utility::string_t& value)
{
    m_Content = value;
    m_ContentIsSet = true;
}

bool ChatCompletionRequestFunctionMessage::contentIsSet() const
{
    return m_ContentIsSet;
}

void ChatCompletionRequestFunctionMessage::unsetContent()
{
    m_ContentIsSet = false;
}
utility::string_t ChatCompletionRequestFunctionMessage::getName() const
{
    return m_Name;
}

void ChatCompletionRequestFunctionMessage::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool ChatCompletionRequestFunctionMessage::nameIsSet() const
{
    return m_NameIsSet;
}

void ChatCompletionRequestFunctionMessage::unsetName()
{
    m_NameIsSet = false;
}
}
}
}
}


