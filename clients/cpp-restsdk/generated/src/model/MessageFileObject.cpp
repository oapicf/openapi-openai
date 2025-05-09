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



#include "CppRestOpenAPIClient/model/MessageFileObject.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



MessageFileObject::MessageFileObject()
{
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_object = utility::conversions::to_string_t("");
    m_objectIsSet = false;
    m_Created_at = 0;
    m_Created_atIsSet = false;
    m_Message_id = utility::conversions::to_string_t("");
    m_Message_idIsSet = false;
}

MessageFileObject::~MessageFileObject()
{
}

void MessageFileObject::validate()
{
    // TODO: implement validation
}

web::json::value MessageFileObject::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_objectIsSet)
    {
        val[utility::conversions::to_string_t(U("object"))] = ModelBase::toJson(m_object);
    }
    if(m_Created_atIsSet)
    {
        val[utility::conversions::to_string_t(U("created_at"))] = ModelBase::toJson(m_Created_at);
    }
    if(m_Message_idIsSet)
    {
        val[utility::conversions::to_string_t(U("message_id"))] = ModelBase::toJson(m_Message_id);
    }

    return val;
}

bool MessageFileObject::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("message_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("message_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setMessageId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMessageId);
            setMessageId(refVal_setMessageId);
        }
    }
    return ok;
}

void MessageFileObject::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_objectIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("object")), m_object));
    }
    if(m_Created_atIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("created_at")), m_Created_at));
    }
    if(m_Message_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("message_id")), m_Message_id));
    }
}

bool MessageFileObject::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("object"))))
    {
        utility::string_t refVal_setObject;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("object"))), refVal_setObject );
        setObject(refVal_setObject);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("created_at"))))
    {
        int32_t refVal_setCreatedAt;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("created_at"))), refVal_setCreatedAt );
        setCreatedAt(refVal_setCreatedAt);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("message_id"))))
    {
        utility::string_t refVal_setMessageId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("message_id"))), refVal_setMessageId );
        setMessageId(refVal_setMessageId);
    }
    return ok;
}

utility::string_t MessageFileObject::getId() const
{
    return m_Id;
}

void MessageFileObject::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool MessageFileObject::idIsSet() const
{
    return m_IdIsSet;
}

void MessageFileObject::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t MessageFileObject::getObject() const
{
    return m_object;
}

void MessageFileObject::setObject(const utility::string_t& value)
{
    m_object = value;
    m_objectIsSet = true;
}

bool MessageFileObject::objectIsSet() const
{
    return m_objectIsSet;
}

void MessageFileObject::unsetobject()
{
    m_objectIsSet = false;
}
int32_t MessageFileObject::getCreatedAt() const
{
    return m_Created_at;
}

void MessageFileObject::setCreatedAt(int32_t value)
{
    m_Created_at = value;
    m_Created_atIsSet = true;
}

bool MessageFileObject::createdAtIsSet() const
{
    return m_Created_atIsSet;
}

void MessageFileObject::unsetCreated_at()
{
    m_Created_atIsSet = false;
}
utility::string_t MessageFileObject::getMessageId() const
{
    return m_Message_id;
}

void MessageFileObject::setMessageId(const utility::string_t& value)
{
    m_Message_id = value;
    m_Message_idIsSet = true;
}

bool MessageFileObject::messageIdIsSet() const
{
    return m_Message_idIsSet;
}

void MessageFileObject::unsetMessage_id()
{
    m_Message_idIsSet = false;
}
}
}
}
}


