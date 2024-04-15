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



#include "CppRestOpenAPIClient/model/ChatCompletionRequestToolMessage.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



ChatCompletionRequestToolMessage::ChatCompletionRequestToolMessage()
{
    m_Role = utility::conversions::to_string_t("");
    m_RoleIsSet = false;
    m_Content = utility::conversions::to_string_t("");
    m_ContentIsSet = false;
    m_Tool_call_id = utility::conversions::to_string_t("");
    m_Tool_call_idIsSet = false;
}

ChatCompletionRequestToolMessage::~ChatCompletionRequestToolMessage()
{
}

void ChatCompletionRequestToolMessage::validate()
{
    // TODO: implement validation
}

web::json::value ChatCompletionRequestToolMessage::toJson() const
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
    if(m_Tool_call_idIsSet)
    {
        val[utility::conversions::to_string_t(U("tool_call_id"))] = ModelBase::toJson(m_Tool_call_id);
    }

    return val;
}

bool ChatCompletionRequestToolMessage::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("tool_call_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("tool_call_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setToolCallId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setToolCallId);
            setToolCallId(refVal_setToolCallId);
        }
    }
    return ok;
}

void ChatCompletionRequestToolMessage::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_Tool_call_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("tool_call_id")), m_Tool_call_id));
    }
}

bool ChatCompletionRequestToolMessage::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("tool_call_id"))))
    {
        utility::string_t refVal_setToolCallId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("tool_call_id"))), refVal_setToolCallId );
        setToolCallId(refVal_setToolCallId);
    }
    return ok;
}

utility::string_t ChatCompletionRequestToolMessage::getRole() const
{
    return m_Role;
}

void ChatCompletionRequestToolMessage::setRole(const utility::string_t& value)
{
    m_Role = value;
    m_RoleIsSet = true;
}

bool ChatCompletionRequestToolMessage::roleIsSet() const
{
    return m_RoleIsSet;
}

void ChatCompletionRequestToolMessage::unsetRole()
{
    m_RoleIsSet = false;
}
utility::string_t ChatCompletionRequestToolMessage::getContent() const
{
    return m_Content;
}

void ChatCompletionRequestToolMessage::setContent(const utility::string_t& value)
{
    m_Content = value;
    m_ContentIsSet = true;
}

bool ChatCompletionRequestToolMessage::contentIsSet() const
{
    return m_ContentIsSet;
}

void ChatCompletionRequestToolMessage::unsetContent()
{
    m_ContentIsSet = false;
}
utility::string_t ChatCompletionRequestToolMessage::getToolCallId() const
{
    return m_Tool_call_id;
}

void ChatCompletionRequestToolMessage::setToolCallId(const utility::string_t& value)
{
    m_Tool_call_id = value;
    m_Tool_call_idIsSet = true;
}

bool ChatCompletionRequestToolMessage::toolCallIdIsSet() const
{
    return m_Tool_call_idIsSet;
}

void ChatCompletionRequestToolMessage::unsetTool_call_id()
{
    m_Tool_call_idIsSet = false;
}
}
}
}
}

