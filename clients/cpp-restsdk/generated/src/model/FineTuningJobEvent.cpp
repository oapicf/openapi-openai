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



#include "CppRestOpenAPIClient/model/FineTuningJobEvent.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



FineTuningJobEvent::FineTuningJobEvent()
{
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Created_at = 0;
    m_Created_atIsSet = false;
    m_Level = utility::conversions::to_string_t("");
    m_LevelIsSet = false;
    m_Message = utility::conversions::to_string_t("");
    m_MessageIsSet = false;
    m_object = utility::conversions::to_string_t("");
    m_objectIsSet = false;
}

FineTuningJobEvent::~FineTuningJobEvent()
{
}

void FineTuningJobEvent::validate()
{
    // TODO: implement validation
}

web::json::value FineTuningJobEvent::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_Created_atIsSet)
    {
        val[utility::conversions::to_string_t(U("created_at"))] = ModelBase::toJson(m_Created_at);
    }
    if(m_LevelIsSet)
    {
        val[utility::conversions::to_string_t(U("level"))] = ModelBase::toJson(m_Level);
    }
    if(m_MessageIsSet)
    {
        val[utility::conversions::to_string_t(U("message"))] = ModelBase::toJson(m_Message);
    }
    if(m_objectIsSet)
    {
        val[utility::conversions::to_string_t(U("object"))] = ModelBase::toJson(m_object);
    }

    return val;
}

bool FineTuningJobEvent::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setId);
            setId(refVal_setId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("created_at"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("created_at")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setCreatedAt;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCreatedAt);
            setCreatedAt(refVal_setCreatedAt);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("level"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("level")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setLevel;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLevel);
            setLevel(refVal_setLevel);
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
    if(val.has_field(utility::conversions::to_string_t(U("object"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("object")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setObject;
            ok &= ModelBase::fromJson(fieldValue, refVal_setObject);
            setObject(refVal_setObject);
        }
    }
    return ok;
}

void FineTuningJobEvent::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_Created_atIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("created_at")), m_Created_at));
    }
    if(m_LevelIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("level")), m_Level));
    }
    if(m_MessageIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("message")), m_Message));
    }
    if(m_objectIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("object")), m_object));
    }
}

bool FineTuningJobEvent::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        utility::string_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("created_at"))))
    {
        int32_t refVal_setCreatedAt;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("created_at"))), refVal_setCreatedAt );
        setCreatedAt(refVal_setCreatedAt);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("level"))))
    {
        utility::string_t refVal_setLevel;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("level"))), refVal_setLevel );
        setLevel(refVal_setLevel);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("message"))))
    {
        utility::string_t refVal_setMessage;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("message"))), refVal_setMessage );
        setMessage(refVal_setMessage);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("object"))))
    {
        utility::string_t refVal_setObject;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("object"))), refVal_setObject );
        setObject(refVal_setObject);
    }
    return ok;
}

utility::string_t FineTuningJobEvent::getId() const
{
    return m_Id;
}

void FineTuningJobEvent::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool FineTuningJobEvent::idIsSet() const
{
    return m_IdIsSet;
}

void FineTuningJobEvent::unsetId()
{
    m_IdIsSet = false;
}
int32_t FineTuningJobEvent::getCreatedAt() const
{
    return m_Created_at;
}

void FineTuningJobEvent::setCreatedAt(int32_t value)
{
    m_Created_at = value;
    m_Created_atIsSet = true;
}

bool FineTuningJobEvent::createdAtIsSet() const
{
    return m_Created_atIsSet;
}

void FineTuningJobEvent::unsetCreated_at()
{
    m_Created_atIsSet = false;
}
utility::string_t FineTuningJobEvent::getLevel() const
{
    return m_Level;
}

void FineTuningJobEvent::setLevel(const utility::string_t& value)
{
    m_Level = value;
    m_LevelIsSet = true;
}

bool FineTuningJobEvent::levelIsSet() const
{
    return m_LevelIsSet;
}

void FineTuningJobEvent::unsetLevel()
{
    m_LevelIsSet = false;
}
utility::string_t FineTuningJobEvent::getMessage() const
{
    return m_Message;
}

void FineTuningJobEvent::setMessage(const utility::string_t& value)
{
    m_Message = value;
    m_MessageIsSet = true;
}

bool FineTuningJobEvent::messageIsSet() const
{
    return m_MessageIsSet;
}

void FineTuningJobEvent::unsetMessage()
{
    m_MessageIsSet = false;
}
utility::string_t FineTuningJobEvent::getObject() const
{
    return m_object;
}

void FineTuningJobEvent::setObject(const utility::string_t& value)
{
    m_object = value;
    m_objectIsSet = true;
}

bool FineTuningJobEvent::objectIsSet() const
{
    return m_objectIsSet;
}

void FineTuningJobEvent::unsetobject()
{
    m_objectIsSet = false;
}
}
}
}
}


