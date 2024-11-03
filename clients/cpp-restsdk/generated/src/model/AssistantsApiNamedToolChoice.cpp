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



#include "CppRestOpenAPIClient/model/AssistantsApiNamedToolChoice.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



AssistantsApiNamedToolChoice::AssistantsApiNamedToolChoice()
{
    m_Type = utility::conversions::to_string_t("");
    m_TypeIsSet = false;
    m_FunctionIsSet = false;
}

AssistantsApiNamedToolChoice::~AssistantsApiNamedToolChoice()
{
}

void AssistantsApiNamedToolChoice::validate()
{
    // TODO: implement validation
}

web::json::value AssistantsApiNamedToolChoice::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t(U("type"))] = ModelBase::toJson(m_Type);
    }
    if(m_FunctionIsSet)
    {
        val[utility::conversions::to_string_t(U("function"))] = ModelBase::toJson(m_Function);
    }

    return val;
}

bool AssistantsApiNamedToolChoice::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("function"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("function")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<ChatCompletionNamedToolChoice_function> refVal_setFunction;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFunction);
            setFunction(refVal_setFunction);
        }
    }
    return ok;
}

void AssistantsApiNamedToolChoice::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_FunctionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("function")), m_Function));
    }
}

bool AssistantsApiNamedToolChoice::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("function"))))
    {
        std::shared_ptr<ChatCompletionNamedToolChoice_function> refVal_setFunction;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("function"))), refVal_setFunction );
        setFunction(refVal_setFunction);
    }
    return ok;
}

utility::string_t AssistantsApiNamedToolChoice::getType() const
{
    return m_Type;
}

void AssistantsApiNamedToolChoice::setType(const utility::string_t& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool AssistantsApiNamedToolChoice::typeIsSet() const
{
    return m_TypeIsSet;
}

void AssistantsApiNamedToolChoice::unsetType()
{
    m_TypeIsSet = false;
}
std::shared_ptr<ChatCompletionNamedToolChoice_function> AssistantsApiNamedToolChoice::getFunction() const
{
    return m_Function;
}

void AssistantsApiNamedToolChoice::setFunction(const std::shared_ptr<ChatCompletionNamedToolChoice_function>& value)
{
    m_Function = value;
    m_FunctionIsSet = true;
}

bool AssistantsApiNamedToolChoice::functionIsSet() const
{
    return m_FunctionIsSet;
}

void AssistantsApiNamedToolChoice::unsetFunction()
{
    m_FunctionIsSet = false;
}
}
}
}
}


