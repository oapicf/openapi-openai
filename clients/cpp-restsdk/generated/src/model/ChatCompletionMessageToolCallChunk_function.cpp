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



#include "CppRestOpenAPIClient/model/ChatCompletionMessageToolCallChunk_function.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



ChatCompletionMessageToolCallChunk_function::ChatCompletionMessageToolCallChunk_function()
{
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
    m_Arguments = utility::conversions::to_string_t("");
    m_ArgumentsIsSet = false;
}

ChatCompletionMessageToolCallChunk_function::~ChatCompletionMessageToolCallChunk_function()
{
}

void ChatCompletionMessageToolCallChunk_function::validate()
{
    // TODO: implement validation
}

web::json::value ChatCompletionMessageToolCallChunk_function::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t(U("name"))] = ModelBase::toJson(m_Name);
    }
    if(m_ArgumentsIsSet)
    {
        val[utility::conversions::to_string_t(U("arguments"))] = ModelBase::toJson(m_Arguments);
    }

    return val;
}

bool ChatCompletionMessageToolCallChunk_function::fromJson(const web::json::value& val)
{
    bool ok = true;
    
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
    if(val.has_field(utility::conversions::to_string_t(U("arguments"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("arguments")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setArguments;
            ok &= ModelBase::fromJson(fieldValue, refVal_setArguments);
            setArguments(refVal_setArguments);
        }
    }
    return ok;
}

void ChatCompletionMessageToolCallChunk_function::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("name")), m_Name));
    }
    if(m_ArgumentsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("arguments")), m_Arguments));
    }
}

bool ChatCompletionMessageToolCallChunk_function::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("name"))))
    {
        utility::string_t refVal_setName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("name"))), refVal_setName );
        setName(refVal_setName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("arguments"))))
    {
        utility::string_t refVal_setArguments;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("arguments"))), refVal_setArguments );
        setArguments(refVal_setArguments);
    }
    return ok;
}

utility::string_t ChatCompletionMessageToolCallChunk_function::getName() const
{
    return m_Name;
}

void ChatCompletionMessageToolCallChunk_function::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool ChatCompletionMessageToolCallChunk_function::nameIsSet() const
{
    return m_NameIsSet;
}

void ChatCompletionMessageToolCallChunk_function::unsetName()
{
    m_NameIsSet = false;
}
utility::string_t ChatCompletionMessageToolCallChunk_function::getArguments() const
{
    return m_Arguments;
}

void ChatCompletionMessageToolCallChunk_function::setArguments(const utility::string_t& value)
{
    m_Arguments = value;
    m_ArgumentsIsSet = true;
}

bool ChatCompletionMessageToolCallChunk_function::argumentsIsSet() const
{
    return m_ArgumentsIsSet;
}

void ChatCompletionMessageToolCallChunk_function::unsetArguments()
{
    m_ArgumentsIsSet = false;
}
}
}
}
}


