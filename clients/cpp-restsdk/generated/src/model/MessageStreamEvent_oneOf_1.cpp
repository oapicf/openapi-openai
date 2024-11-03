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



#include "CppRestOpenAPIClient/model/MessageStreamEvent_oneOf_1.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



MessageStreamEvent_oneOf_1::MessageStreamEvent_oneOf_1()
{
    m_Event = utility::conversions::to_string_t("");
    m_EventIsSet = false;
    m_DataIsSet = false;
}

MessageStreamEvent_oneOf_1::~MessageStreamEvent_oneOf_1()
{
}

void MessageStreamEvent_oneOf_1::validate()
{
    // TODO: implement validation
}

web::json::value MessageStreamEvent_oneOf_1::toJson() const
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

bool MessageStreamEvent_oneOf_1::fromJson(const web::json::value& val)
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
            std::shared_ptr<MessageObject> refVal_setData;
            ok &= ModelBase::fromJson(fieldValue, refVal_setData);
            setData(refVal_setData);
        }
    }
    return ok;
}

void MessageStreamEvent_oneOf_1::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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

bool MessageStreamEvent_oneOf_1::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
        std::shared_ptr<MessageObject> refVal_setData;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("data"))), refVal_setData );
        setData(refVal_setData);
    }
    return ok;
}

utility::string_t MessageStreamEvent_oneOf_1::getEvent() const
{
    return m_Event;
}

void MessageStreamEvent_oneOf_1::setEvent(const utility::string_t& value)
{
    m_Event = value;
    m_EventIsSet = true;
}

bool MessageStreamEvent_oneOf_1::eventIsSet() const
{
    return m_EventIsSet;
}

void MessageStreamEvent_oneOf_1::unsetEvent()
{
    m_EventIsSet = false;
}
std::shared_ptr<MessageObject> MessageStreamEvent_oneOf_1::getData() const
{
    return m_Data;
}

void MessageStreamEvent_oneOf_1::setData(const std::shared_ptr<MessageObject>& value)
{
    m_Data = value;
    m_DataIsSet = true;
}

bool MessageStreamEvent_oneOf_1::dataIsSet() const
{
    return m_DataIsSet;
}

void MessageStreamEvent_oneOf_1::unsetData()
{
    m_DataIsSet = false;
}
}
}
}
}


