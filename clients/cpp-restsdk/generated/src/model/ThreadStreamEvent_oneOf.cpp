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



#include "CppRestOpenAPIClient/model/ThreadStreamEvent_oneOf.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



ThreadStreamEvent_oneOf::ThreadStreamEvent_oneOf()
{
    m_Event = utility::conversions::to_string_t("");
    m_EventIsSet = false;
    m_DataIsSet = false;
}

ThreadStreamEvent_oneOf::~ThreadStreamEvent_oneOf()
{
}

void ThreadStreamEvent_oneOf::validate()
{
    // TODO: implement validation
}

web::json::value ThreadStreamEvent_oneOf::toJson() const
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

bool ThreadStreamEvent_oneOf::fromJson(const web::json::value& val)
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
            std::shared_ptr<ThreadObject> refVal_setData;
            ok &= ModelBase::fromJson(fieldValue, refVal_setData);
            setData(refVal_setData);
        }
    }
    return ok;
}

void ThreadStreamEvent_oneOf::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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

bool ThreadStreamEvent_oneOf::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
        std::shared_ptr<ThreadObject> refVal_setData;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("data"))), refVal_setData );
        setData(refVal_setData);
    }
    return ok;
}

utility::string_t ThreadStreamEvent_oneOf::getEvent() const
{
    return m_Event;
}

void ThreadStreamEvent_oneOf::setEvent(const utility::string_t& value)
{
    m_Event = value;
    m_EventIsSet = true;
}

bool ThreadStreamEvent_oneOf::eventIsSet() const
{
    return m_EventIsSet;
}

void ThreadStreamEvent_oneOf::unsetEvent()
{
    m_EventIsSet = false;
}
std::shared_ptr<ThreadObject> ThreadStreamEvent_oneOf::getData() const
{
    return m_Data;
}

void ThreadStreamEvent_oneOf::setData(const std::shared_ptr<ThreadObject>& value)
{
    m_Data = value;
    m_DataIsSet = true;
}

bool ThreadStreamEvent_oneOf::dataIsSet() const
{
    return m_DataIsSet;
}

void ThreadStreamEvent_oneOf::unsetData()
{
    m_DataIsSet = false;
}
}
}
}
}


