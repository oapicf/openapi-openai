/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/Model.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Model::Model()
{
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_object = utility::conversions::to_string_t("");
    m_objectIsSet = false;
    m_Created = 0;
    m_CreatedIsSet = false;
    m_Owned_by = utility::conversions::to_string_t("");
    m_Owned_byIsSet = false;
}

Model::~Model()
{
}

void Model::validate()
{
    // TODO: implement validation
}

web::json::value Model::toJson() const
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
    if(m_CreatedIsSet)
    {
        val[utility::conversions::to_string_t(U("created"))] = ModelBase::toJson(m_Created);
    }
    if(m_Owned_byIsSet)
    {
        val[utility::conversions::to_string_t(U("owned_by"))] = ModelBase::toJson(m_Owned_by);
    }

    return val;
}

bool Model::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("created"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("created")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setCreated;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCreated);
            setCreated(refVal_setCreated);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("owned_by"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("owned_by")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setOwnedBy;
            ok &= ModelBase::fromJson(fieldValue, refVal_setOwnedBy);
            setOwnedBy(refVal_setOwnedBy);
        }
    }
    return ok;
}

void Model::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_CreatedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("created")), m_Created));
    }
    if(m_Owned_byIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("owned_by")), m_Owned_by));
    }
}

bool Model::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("created"))))
    {
        int32_t refVal_setCreated;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("created"))), refVal_setCreated );
        setCreated(refVal_setCreated);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("owned_by"))))
    {
        utility::string_t refVal_setOwnedBy;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("owned_by"))), refVal_setOwnedBy );
        setOwnedBy(refVal_setOwnedBy);
    }
    return ok;
}

utility::string_t Model::getId() const
{
    return m_Id;
}

void Model::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Model::idIsSet() const
{
    return m_IdIsSet;
}

void Model::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t Model::getObject() const
{
    return m_object;
}

void Model::setObject(const utility::string_t& value)
{
    m_object = value;
    m_objectIsSet = true;
}

bool Model::objectIsSet() const
{
    return m_objectIsSet;
}

void Model::unsetobject()
{
    m_objectIsSet = false;
}
int32_t Model::getCreated() const
{
    return m_Created;
}

void Model::setCreated(int32_t value)
{
    m_Created = value;
    m_CreatedIsSet = true;
}

bool Model::createdIsSet() const
{
    return m_CreatedIsSet;
}

void Model::unsetCreated()
{
    m_CreatedIsSet = false;
}
utility::string_t Model::getOwnedBy() const
{
    return m_Owned_by;
}

void Model::setOwnedBy(const utility::string_t& value)
{
    m_Owned_by = value;
    m_Owned_byIsSet = true;
}

bool Model::ownedByIsSet() const
{
    return m_Owned_byIsSet;
}

void Model::unsetOwned_by()
{
    m_Owned_byIsSet = false;
}
}
}
}
}


