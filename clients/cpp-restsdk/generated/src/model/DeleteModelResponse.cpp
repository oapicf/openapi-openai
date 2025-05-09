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



#include "CppRestOpenAPIClient/model/DeleteModelResponse.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



DeleteModelResponse::DeleteModelResponse()
{
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Deleted = false;
    m_DeletedIsSet = false;
    m_object = utility::conversions::to_string_t("");
    m_objectIsSet = false;
}

DeleteModelResponse::~DeleteModelResponse()
{
}

void DeleteModelResponse::validate()
{
    // TODO: implement validation
}

web::json::value DeleteModelResponse::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_DeletedIsSet)
    {
        val[utility::conversions::to_string_t(U("deleted"))] = ModelBase::toJson(m_Deleted);
    }
    if(m_objectIsSet)
    {
        val[utility::conversions::to_string_t(U("object"))] = ModelBase::toJson(m_object);
    }

    return val;
}

bool DeleteModelResponse::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("deleted"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("deleted")));
        if(!fieldValue.is_null())
        {
            bool refVal_setDeleted;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDeleted);
            setDeleted(refVal_setDeleted);
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

void DeleteModelResponse::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_DeletedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("deleted")), m_Deleted));
    }
    if(m_objectIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("object")), m_object));
    }
}

bool DeleteModelResponse::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("deleted"))))
    {
        bool refVal_setDeleted;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("deleted"))), refVal_setDeleted );
        setDeleted(refVal_setDeleted);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("object"))))
    {
        utility::string_t refVal_setObject;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("object"))), refVal_setObject );
        setObject(refVal_setObject);
    }
    return ok;
}

utility::string_t DeleteModelResponse::getId() const
{
    return m_Id;
}

void DeleteModelResponse::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool DeleteModelResponse::idIsSet() const
{
    return m_IdIsSet;
}

void DeleteModelResponse::unsetId()
{
    m_IdIsSet = false;
}
bool DeleteModelResponse::isDeleted() const
{
    return m_Deleted;
}

void DeleteModelResponse::setDeleted(bool value)
{
    m_Deleted = value;
    m_DeletedIsSet = true;
}

bool DeleteModelResponse::deletedIsSet() const
{
    return m_DeletedIsSet;
}

void DeleteModelResponse::unsetDeleted()
{
    m_DeletedIsSet = false;
}
utility::string_t DeleteModelResponse::getObject() const
{
    return m_object;
}

void DeleteModelResponse::setObject(const utility::string_t& value)
{
    m_object = value;
    m_objectIsSet = true;
}

bool DeleteModelResponse::objectIsSet() const
{
    return m_objectIsSet;
}

void DeleteModelResponse::unsetobject()
{
    m_objectIsSet = false;
}
}
}
}
}


