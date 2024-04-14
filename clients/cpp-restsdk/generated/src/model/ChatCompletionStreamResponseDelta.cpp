/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/ChatCompletionStreamResponseDelta.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



ChatCompletionStreamResponseDelta::ChatCompletionStreamResponseDelta()
{
    m_Role = utility::conversions::to_string_t("");
    m_RoleIsSet = false;
    m_Content = utility::conversions::to_string_t("");
    m_ContentIsSet = false;
    m_Function_callIsSet = false;
}

ChatCompletionStreamResponseDelta::~ChatCompletionStreamResponseDelta()
{
}

void ChatCompletionStreamResponseDelta::validate()
{
    // TODO: implement validation
}

web::json::value ChatCompletionStreamResponseDelta::toJson() const
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
    if(m_Function_callIsSet)
    {
        val[utility::conversions::to_string_t(U("function_call"))] = ModelBase::toJson(m_Function_call);
    }

    return val;
}

bool ChatCompletionStreamResponseDelta::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("function_call"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("function_call")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<ChatCompletionRequestMessage_function_call> refVal_setFunctionCall;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFunctionCall);
            setFunctionCall(refVal_setFunctionCall);
        }
    }
    return ok;
}

void ChatCompletionStreamResponseDelta::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_Function_callIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("function_call")), m_Function_call));
    }
}

bool ChatCompletionStreamResponseDelta::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("function_call"))))
    {
        std::shared_ptr<ChatCompletionRequestMessage_function_call> refVal_setFunctionCall;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("function_call"))), refVal_setFunctionCall );
        setFunctionCall(refVal_setFunctionCall);
    }
    return ok;
}

utility::string_t ChatCompletionStreamResponseDelta::getRole() const
{
    return m_Role;
}

void ChatCompletionStreamResponseDelta::setRole(const utility::string_t& value)
{
    m_Role = value;
    m_RoleIsSet = true;
}

bool ChatCompletionStreamResponseDelta::roleIsSet() const
{
    return m_RoleIsSet;
}

void ChatCompletionStreamResponseDelta::unsetRole()
{
    m_RoleIsSet = false;
}
utility::string_t ChatCompletionStreamResponseDelta::getContent() const
{
    return m_Content;
}

void ChatCompletionStreamResponseDelta::setContent(const utility::string_t& value)
{
    m_Content = value;
    m_ContentIsSet = true;
}

bool ChatCompletionStreamResponseDelta::contentIsSet() const
{
    return m_ContentIsSet;
}

void ChatCompletionStreamResponseDelta::unsetContent()
{
    m_ContentIsSet = false;
}
std::shared_ptr<ChatCompletionRequestMessage_function_call> ChatCompletionStreamResponseDelta::getFunctionCall() const
{
    return m_Function_call;
}

void ChatCompletionStreamResponseDelta::setFunctionCall(const std::shared_ptr<ChatCompletionRequestMessage_function_call>& value)
{
    m_Function_call = value;
    m_Function_callIsSet = true;
}

bool ChatCompletionStreamResponseDelta::functionCallIsSet() const
{
    return m_Function_callIsSet;
}

void ChatCompletionStreamResponseDelta::unsetFunction_call()
{
    m_Function_callIsSet = false;
}
}
}
}
}

