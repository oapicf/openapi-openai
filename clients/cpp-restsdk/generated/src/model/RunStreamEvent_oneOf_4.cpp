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



#include "CppRestOpenAPIClient/model/RunStreamEvent_oneOf_4.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



RunStreamEvent_oneOf_4::RunStreamEvent_oneOf_4()
{
    m_Event = utility::conversions::to_string_t("");
    m_EventIsSet = false;
    m_DataIsSet = false;
}

RunStreamEvent_oneOf_4::~RunStreamEvent_oneOf_4()
{
}

void RunStreamEvent_oneOf_4::validate()
{
    // TODO: implement validation
}

web::json::value RunStreamEvent_oneOf_4::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_EventIsSet)
    {
        val[utility::conversions::to_string_t(U("event"))] = ModelBase::toJson(m_Event);
    }
    if(m_DataIsSet)
    {
        val[utility::conversions::to_string_t(U("data"))] = ModelBase::toJson(m_Data);
    }

    return val;
}

bool RunStreamEvent_oneOf_4::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("event"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("event")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setEvent;
            ok &= ModelBase::fromJson(fieldValue, refVal_setEvent);
            setEvent(refVal_setEvent);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("data"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("data")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<RunObject> refVal_setData;
            ok &= ModelBase::fromJson(fieldValue, refVal_setData);
            setData(refVal_setData);
        }
    }
    return ok;
}

void RunStreamEvent_oneOf_4::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_EventIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("event")), m_Event));
    }
    if(m_DataIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("data")), m_Data));
    }
}

bool RunStreamEvent_oneOf_4::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("event"))))
    {
        utility::string_t refVal_setEvent;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("event"))), refVal_setEvent );
        setEvent(refVal_setEvent);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("data"))))
    {
        std::shared_ptr<RunObject> refVal_setData;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("data"))), refVal_setData );
        setData(refVal_setData);
    }
    return ok;
}

utility::string_t RunStreamEvent_oneOf_4::getEvent() const
{
    return m_Event;
}

void RunStreamEvent_oneOf_4::setEvent(const utility::string_t& value)
{
    m_Event = value;
    m_EventIsSet = true;
}

bool RunStreamEvent_oneOf_4::eventIsSet() const
{
    return m_EventIsSet;
}

void RunStreamEvent_oneOf_4::unsetEvent()
{
    m_EventIsSet = false;
}
std::shared_ptr<RunObject> RunStreamEvent_oneOf_4::getData() const
{
    return m_Data;
}

void RunStreamEvent_oneOf_4::setData(const std::shared_ptr<RunObject>& value)
{
    m_Data = value;
    m_DataIsSet = true;
}

bool RunStreamEvent_oneOf_4::dataIsSet() const
{
    return m_DataIsSet;
}

void RunStreamEvent_oneOf_4::unsetData()
{
    m_DataIsSet = false;
}
}
}
}
}


