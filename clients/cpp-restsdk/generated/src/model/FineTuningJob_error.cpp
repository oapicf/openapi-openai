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



#include "CppRestOpenAPIClient/model/FineTuningJob_error.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



FineTuningJob_error::FineTuningJob_error()
{
    m_Code = utility::conversions::to_string_t("");
    m_CodeIsSet = false;
    m_Message = utility::conversions::to_string_t("");
    m_MessageIsSet = false;
    m_Param = utility::conversions::to_string_t("");
    m_ParamIsSet = false;
}

FineTuningJob_error::~FineTuningJob_error()
{
}

void FineTuningJob_error::validate()
{
    // TODO: implement validation
}

web::json::value FineTuningJob_error::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_CodeIsSet)
    {
        val[utility::conversions::to_string_t(U("code"))] = ModelBase::toJson(m_Code);
    }
    if(m_MessageIsSet)
    {
        val[utility::conversions::to_string_t(U("message"))] = ModelBase::toJson(m_Message);
    }
    if(m_ParamIsSet)
    {
        val[utility::conversions::to_string_t(U("param"))] = ModelBase::toJson(m_Param);
    }

    return val;
}

bool FineTuningJob_error::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("code"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("code")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCode;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCode);
            setCode(refVal_setCode);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("message"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("message")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setMessage;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMessage);
            setMessage(refVal_setMessage);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("param"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("param")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setParam;
            ok &= ModelBase::fromJson(fieldValue, refVal_setParam);
            setParam(refVal_setParam);
        }
    }
    return ok;
}

void FineTuningJob_error::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_CodeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("code")), m_Code));
    }
    if(m_MessageIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("message")), m_Message));
    }
    if(m_ParamIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("param")), m_Param));
    }
}

bool FineTuningJob_error::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("code"))))
    {
        utility::string_t refVal_setCode;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("code"))), refVal_setCode );
        setCode(refVal_setCode);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("message"))))
    {
        utility::string_t refVal_setMessage;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("message"))), refVal_setMessage );
        setMessage(refVal_setMessage);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("param"))))
    {
        utility::string_t refVal_setParam;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("param"))), refVal_setParam );
        setParam(refVal_setParam);
    }
    return ok;
}

utility::string_t FineTuningJob_error::getCode() const
{
    return m_Code;
}

void FineTuningJob_error::setCode(const utility::string_t& value)
{
    m_Code = value;
    m_CodeIsSet = true;
}

bool FineTuningJob_error::codeIsSet() const
{
    return m_CodeIsSet;
}

void FineTuningJob_error::unsetCode()
{
    m_CodeIsSet = false;
}
utility::string_t FineTuningJob_error::getMessage() const
{
    return m_Message;
}

void FineTuningJob_error::setMessage(const utility::string_t& value)
{
    m_Message = value;
    m_MessageIsSet = true;
}

bool FineTuningJob_error::messageIsSet() const
{
    return m_MessageIsSet;
}

void FineTuningJob_error::unsetMessage()
{
    m_MessageIsSet = false;
}
utility::string_t FineTuningJob_error::getParam() const
{
    return m_Param;
}

void FineTuningJob_error::setParam(const utility::string_t& value)
{
    m_Param = value;
    m_ParamIsSet = true;
}

bool FineTuningJob_error::paramIsSet() const
{
    return m_ParamIsSet;
}

void FineTuningJob_error::unsetParam()
{
    m_ParamIsSet = false;
}
}
}
}
}


