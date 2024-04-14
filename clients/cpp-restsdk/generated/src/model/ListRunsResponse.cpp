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



#include "CppRestOpenAPIClient/model/ListRunsResponse.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



ListRunsResponse::ListRunsResponse()
{
    m_object = utility::conversions::to_string_t("");
    m_objectIsSet = false;
    m_DataIsSet = false;
    m_First_id = utility::conversions::to_string_t("");
    m_First_idIsSet = false;
    m_Last_id = utility::conversions::to_string_t("");
    m_Last_idIsSet = false;
    m_Has_more = false;
    m_Has_moreIsSet = false;
}

ListRunsResponse::~ListRunsResponse()
{
}

void ListRunsResponse::validate()
{
    // TODO: implement validation
}

web::json::value ListRunsResponse::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_objectIsSet)
    {
        val[utility::conversions::to_string_t(U("object"))] = ModelBase::toJson(m_object);
    }
    if(m_DataIsSet)
    {
        val[utility::conversions::to_string_t(U("data"))] = ModelBase::toJson(m_Data);
    }
    if(m_First_idIsSet)
    {
        val[utility::conversions::to_string_t(U("first_id"))] = ModelBase::toJson(m_First_id);
    }
    if(m_Last_idIsSet)
    {
        val[utility::conversions::to_string_t(U("last_id"))] = ModelBase::toJson(m_Last_id);
    }
    if(m_Has_moreIsSet)
    {
        val[utility::conversions::to_string_t(U("has_more"))] = ModelBase::toJson(m_Has_more);
    }

    return val;
}

bool ListRunsResponse::fromJson(const web::json::value& val)
{
    bool ok = true;
    
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
    if(val.has_field(utility::conversions::to_string_t(U("data"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("data")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<RunObject>> refVal_setData;
            ok &= ModelBase::fromJson(fieldValue, refVal_setData);
            setData(refVal_setData);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("first_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("first_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setFirstId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFirstId);
            setFirstId(refVal_setFirstId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("last_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("last_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setLastId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLastId);
            setLastId(refVal_setLastId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("has_more"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("has_more")));
        if(!fieldValue.is_null())
        {
            bool refVal_setHasMore;
            ok &= ModelBase::fromJson(fieldValue, refVal_setHasMore);
            setHasMore(refVal_setHasMore);
        }
    }
    return ok;
}

void ListRunsResponse::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_objectIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("object")), m_object));
    }
    if(m_DataIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("data")), m_Data));
    }
    if(m_First_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("first_id")), m_First_id));
    }
    if(m_Last_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("last_id")), m_Last_id));
    }
    if(m_Has_moreIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("has_more")), m_Has_more));
    }
}

bool ListRunsResponse::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("object"))))
    {
        utility::string_t refVal_setObject;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("object"))), refVal_setObject );
        setObject(refVal_setObject);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("data"))))
    {
        std::vector<std::shared_ptr<RunObject>> refVal_setData;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("data"))), refVal_setData );
        setData(refVal_setData);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("first_id"))))
    {
        utility::string_t refVal_setFirstId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("first_id"))), refVal_setFirstId );
        setFirstId(refVal_setFirstId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("last_id"))))
    {
        utility::string_t refVal_setLastId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("last_id"))), refVal_setLastId );
        setLastId(refVal_setLastId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("has_more"))))
    {
        bool refVal_setHasMore;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("has_more"))), refVal_setHasMore );
        setHasMore(refVal_setHasMore);
    }
    return ok;
}

utility::string_t ListRunsResponse::getObject() const
{
    return m_object;
}

void ListRunsResponse::setObject(const utility::string_t& value)
{
    m_object = value;
    m_objectIsSet = true;
}

bool ListRunsResponse::objectIsSet() const
{
    return m_objectIsSet;
}

void ListRunsResponse::unsetobject()
{
    m_objectIsSet = false;
}
std::vector<std::shared_ptr<RunObject>>& ListRunsResponse::getData()
{
    return m_Data;
}

void ListRunsResponse::setData(const std::vector<std::shared_ptr<RunObject>>& value)
{
    m_Data = value;
    m_DataIsSet = true;
}

bool ListRunsResponse::dataIsSet() const
{
    return m_DataIsSet;
}

void ListRunsResponse::unsetData()
{
    m_DataIsSet = false;
}
utility::string_t ListRunsResponse::getFirstId() const
{
    return m_First_id;
}

void ListRunsResponse::setFirstId(const utility::string_t& value)
{
    m_First_id = value;
    m_First_idIsSet = true;
}

bool ListRunsResponse::firstIdIsSet() const
{
    return m_First_idIsSet;
}

void ListRunsResponse::unsetFirst_id()
{
    m_First_idIsSet = false;
}
utility::string_t ListRunsResponse::getLastId() const
{
    return m_Last_id;
}

void ListRunsResponse::setLastId(const utility::string_t& value)
{
    m_Last_id = value;
    m_Last_idIsSet = true;
}

bool ListRunsResponse::lastIdIsSet() const
{
    return m_Last_idIsSet;
}

void ListRunsResponse::unsetLast_id()
{
    m_Last_idIsSet = false;
}
bool ListRunsResponse::isHasMore() const
{
    return m_Has_more;
}

void ListRunsResponse::setHasMore(bool value)
{
    m_Has_more = value;
    m_Has_moreIsSet = true;
}

bool ListRunsResponse::hasMoreIsSet() const
{
    return m_Has_moreIsSet;
}

void ListRunsResponse::unsetHas_more()
{
    m_Has_moreIsSet = false;
}
}
}
}
}


