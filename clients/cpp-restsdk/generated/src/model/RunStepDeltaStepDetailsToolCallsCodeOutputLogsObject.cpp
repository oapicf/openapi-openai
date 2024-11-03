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



#include "CppRestOpenAPIClient/model/RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject()
{
    m_Index = 0;
    m_IndexIsSet = false;
    m_Type = utility::conversions::to_string_t("");
    m_TypeIsSet = false;
    m_Logs = utility::conversions::to_string_t("");
    m_LogsIsSet = false;
}

RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::~RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject()
{
}

void RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::validate()
{
    // TODO: implement validation
}

web::json::value RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IndexIsSet)
    {
        val[utility::conversions::to_string_t(U("index"))] = ModelBase::toJson(m_Index);
    }
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t(U("type"))] = ModelBase::toJson(m_Type);
    }
    if(m_LogsIsSet)
    {
        val[utility::conversions::to_string_t(U("logs"))] = ModelBase::toJson(m_Logs);
    }

    return val;
}

bool RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("index"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("index")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setIndex;
            ok &= ModelBase::fromJson(fieldValue, refVal_setIndex);
            setIndex(refVal_setIndex);
        }
    }
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
    return ok;
}

void RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_IndexIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("index")), m_Index));
    }
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("type")), m_Type));
    }
    if(m_LogsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("logs")), m_Logs));
    }
}

bool RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("index"))))
    {
        int32_t refVal_setIndex;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("index"))), refVal_setIndex );
        setIndex(refVal_setIndex);
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
    return ok;
}

int32_t RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::getIndex() const
{
    return m_Index;
}

void RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::setIndex(int32_t value)
{
    m_Index = value;
    m_IndexIsSet = true;
}

bool RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::indexIsSet() const
{
    return m_IndexIsSet;
}

void RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::unsetIndex()
{
    m_IndexIsSet = false;
}
utility::string_t RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::getType() const
{
    return m_Type;
}

void RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::setType(const utility::string_t& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::typeIsSet() const
{
    return m_TypeIsSet;
}

void RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::unsetType()
{
    m_TypeIsSet = false;
}
utility::string_t RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::getLogs() const
{
    return m_Logs;
}

void RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::setLogs(const utility::string_t& value)
{
    m_Logs = value;
    m_LogsIsSet = true;
}

bool RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::logsIsSet() const
{
    return m_LogsIsSet;
}

void RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::unsetLogs()
{
    m_LogsIsSet = false;
}
}
}
}
}


