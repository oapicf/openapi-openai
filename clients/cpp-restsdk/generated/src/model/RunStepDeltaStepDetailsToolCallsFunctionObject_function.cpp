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



#include "CppRestOpenAPIClient/model/RunStepDeltaStepDetailsToolCallsFunctionObject_function.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



RunStepDeltaStepDetailsToolCallsFunctionObject_function::RunStepDeltaStepDetailsToolCallsFunctionObject_function()
{
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
    m_Arguments = utility::conversions::to_string_t("");
    m_ArgumentsIsSet = false;
    m_Output = utility::conversions::to_string_t("");
    m_OutputIsSet = false;
}

RunStepDeltaStepDetailsToolCallsFunctionObject_function::~RunStepDeltaStepDetailsToolCallsFunctionObject_function()
{
}

void RunStepDeltaStepDetailsToolCallsFunctionObject_function::validate()
{
    // TODO: implement validation
}

web::json::value RunStepDeltaStepDetailsToolCallsFunctionObject_function::toJson() const
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
    if(m_OutputIsSet)
    {
        val[utility::conversions::to_string_t(U("output"))] = ModelBase::toJson(m_Output);
    }

    return val;
}

bool RunStepDeltaStepDetailsToolCallsFunctionObject_function::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("output"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("output")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setOutput;
            ok &= ModelBase::fromJson(fieldValue, refVal_setOutput);
            setOutput(refVal_setOutput);
        }
    }
    return ok;
}

void RunStepDeltaStepDetailsToolCallsFunctionObject_function::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_OutputIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("output")), m_Output));
    }
}

bool RunStepDeltaStepDetailsToolCallsFunctionObject_function::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("output"))))
    {
        utility::string_t refVal_setOutput;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("output"))), refVal_setOutput );
        setOutput(refVal_setOutput);
    }
    return ok;
}

utility::string_t RunStepDeltaStepDetailsToolCallsFunctionObject_function::getName() const
{
    return m_Name;
}

void RunStepDeltaStepDetailsToolCallsFunctionObject_function::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool RunStepDeltaStepDetailsToolCallsFunctionObject_function::nameIsSet() const
{
    return m_NameIsSet;
}

void RunStepDeltaStepDetailsToolCallsFunctionObject_function::unsetName()
{
    m_NameIsSet = false;
}
utility::string_t RunStepDeltaStepDetailsToolCallsFunctionObject_function::getArguments() const
{
    return m_Arguments;
}

void RunStepDeltaStepDetailsToolCallsFunctionObject_function::setArguments(const utility::string_t& value)
{
    m_Arguments = value;
    m_ArgumentsIsSet = true;
}

bool RunStepDeltaStepDetailsToolCallsFunctionObject_function::argumentsIsSet() const
{
    return m_ArgumentsIsSet;
}

void RunStepDeltaStepDetailsToolCallsFunctionObject_function::unsetArguments()
{
    m_ArgumentsIsSet = false;
}
utility::string_t RunStepDeltaStepDetailsToolCallsFunctionObject_function::getOutput() const
{
    return m_Output;
}

void RunStepDeltaStepDetailsToolCallsFunctionObject_function::setOutput(const utility::string_t& value)
{
    m_Output = value;
    m_OutputIsSet = true;
}

bool RunStepDeltaStepDetailsToolCallsFunctionObject_function::outputIsSet() const
{
    return m_OutputIsSet;
}

void RunStepDeltaStepDetailsToolCallsFunctionObject_function::unsetOutput()
{
    m_OutputIsSet = false;
}
}
}
}
}

