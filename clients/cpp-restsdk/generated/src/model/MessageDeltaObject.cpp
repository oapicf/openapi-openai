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



#include "CppRestOpenAPIClient/model/MessageDeltaObject.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



MessageDeltaObject::MessageDeltaObject()
{
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_object = utility::conversions::to_string_t("");
    m_objectIsSet = false;
    m_DeltaIsSet = false;
}

MessageDeltaObject::~MessageDeltaObject()
{
}

void MessageDeltaObject::validate()
{
    // TODO: implement validation
}

web::json::value MessageDeltaObject::toJson() const
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
    if(m_DeltaIsSet)
    {
        val[utility::conversions::to_string_t(U("delta"))] = ModelBase::toJson(m_Delta);
    }

    return val;
}

bool MessageDeltaObject::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("delta"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("delta")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<MessageDeltaObject_delta> refVal_setDelta;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDelta);
            setDelta(refVal_setDelta);
        }
    }
    return ok;
}

void MessageDeltaObject::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_DeltaIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("delta")), m_Delta));
    }
}

bool MessageDeltaObject::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("delta"))))
    {
        std::shared_ptr<MessageDeltaObject_delta> refVal_setDelta;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("delta"))), refVal_setDelta );
        setDelta(refVal_setDelta);
    }
    return ok;
}

utility::string_t MessageDeltaObject::getId() const
{
    return m_Id;
}

void MessageDeltaObject::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool MessageDeltaObject::idIsSet() const
{
    return m_IdIsSet;
}

void MessageDeltaObject::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t MessageDeltaObject::getObject() const
{
    return m_object;
}

void MessageDeltaObject::setObject(const utility::string_t& value)
{
    m_object = value;
    m_objectIsSet = true;
}

bool MessageDeltaObject::objectIsSet() const
{
    return m_objectIsSet;
}

void MessageDeltaObject::unsetobject()
{
    m_objectIsSet = false;
}
std::shared_ptr<MessageDeltaObject_delta> MessageDeltaObject::getDelta() const
{
    return m_Delta;
}

void MessageDeltaObject::setDelta(const std::shared_ptr<MessageDeltaObject_delta>& value)
{
    m_Delta = value;
    m_DeltaIsSet = true;
}

bool MessageDeltaObject::deltaIsSet() const
{
    return m_DeltaIsSet;
}

void MessageDeltaObject::unsetDelta()
{
    m_DeltaIsSet = false;
}
}
}
}
}


