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



#include "CppRestOpenAPIClient/model/RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner()
{
    m_Type = utility::conversions::to_string_t("");
    m_TypeIsSet = false;
    m_Logs = utility::conversions::to_string_t("");
    m_LogsIsSet = false;
    m_ImageIsSet = false;
}

RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::~RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner()
{
}

void RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::validate()
{
    // TODO: implement validation
}

web::json::value RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t(U("type"))] = ModelBase::toJson(m_Type);
    }
    if(m_LogsIsSet)
    {
        val[utility::conversions::to_string_t(U("logs"))] = ModelBase::toJson(m_Logs);
    }
    if(m_ImageIsSet)
    {
        val[utility::conversions::to_string_t(U("image"))] = ModelBase::toJson(m_Image);
    }

    return val;
}

bool RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("logs"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("logs")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setLogs;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLogs);
            setLogs(refVal_setLogs);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("image"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("image")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<RunStepDetailsToolCallsCodeOutputImageObject_image> refVal_setImage;
            ok &= ModelBase::fromJson(fieldValue, refVal_setImage);
            setImage(refVal_setImage);
        }
    }
    return ok;
}

void RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_LogsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("logs")), m_Logs));
    }
    if(m_ImageIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("image")), m_Image));
    }
}

bool RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("logs"))))
    {
        utility::string_t refVal_setLogs;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("logs"))), refVal_setLogs );
        setLogs(refVal_setLogs);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("image"))))
    {
        std::shared_ptr<RunStepDetailsToolCallsCodeOutputImageObject_image> refVal_setImage;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("image"))), refVal_setImage );
        setImage(refVal_setImage);
    }
    return ok;
}

utility::string_t RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getType() const
{
    return m_Type;
}

void RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setType(const utility::string_t& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::typeIsSet() const
{
    return m_TypeIsSet;
}

void RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::unsetType()
{
    m_TypeIsSet = false;
}
utility::string_t RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getLogs() const
{
    return m_Logs;
}

void RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setLogs(const utility::string_t& value)
{
    m_Logs = value;
    m_LogsIsSet = true;
}

bool RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::logsIsSet() const
{
    return m_LogsIsSet;
}

void RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::unsetLogs()
{
    m_LogsIsSet = false;
}
std::shared_ptr<RunStepDetailsToolCallsCodeOutputImageObject_image> RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getImage() const
{
    return m_Image;
}

void RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setImage(const std::shared_ptr<RunStepDetailsToolCallsCodeOutputImageObject_image>& value)
{
    m_Image = value;
    m_ImageIsSet = true;
}

bool RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::imageIsSet() const
{
    return m_ImageIsSet;
}

void RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::unsetImage()
{
    m_ImageIsSet = false;
}
}
}
}
}

