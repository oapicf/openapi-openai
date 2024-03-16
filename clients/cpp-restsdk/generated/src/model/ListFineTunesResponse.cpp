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



#include "CppRestOpenAPIClient/model/ListFineTunesResponse.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



ListFineTunesResponse::ListFineTunesResponse()
{
    m_object = utility::conversions::to_string_t("");
    m_objectIsSet = false;
    m_DataIsSet = false;
}

ListFineTunesResponse::~ListFineTunesResponse()
{
}

void ListFineTunesResponse::validate()
{
    // TODO: implement validation
}

web::json::value ListFineTunesResponse::toJson() const
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

    return val;
}

bool ListFineTunesResponse::fromJson(const web::json::value& val)
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
            std::vector<std::shared_ptr<FineTune>> refVal_setData;
            ok &= ModelBase::fromJson(fieldValue, refVal_setData);
            setData(refVal_setData);
        }
    }
    return ok;
}

void ListFineTunesResponse::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
}

bool ListFineTunesResponse::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
        std::vector<std::shared_ptr<FineTune>> refVal_setData;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("data"))), refVal_setData );
        setData(refVal_setData);
    }
    return ok;
}

utility::string_t ListFineTunesResponse::getObject() const
{
    return m_object;
}

void ListFineTunesResponse::setObject(const utility::string_t& value)
{
    m_object = value;
    m_objectIsSet = true;
}

bool ListFineTunesResponse::objectIsSet() const
{
    return m_objectIsSet;
}

void ListFineTunesResponse::unsetobject()
{
    m_objectIsSet = false;
}
std::vector<std::shared_ptr<FineTune>>& ListFineTunesResponse::getData()
{
    return m_Data;
}

void ListFineTunesResponse::setData(const std::vector<std::shared_ptr<FineTune>>& value)
{
    m_Data = value;
    m_DataIsSet = true;
}

bool ListFineTunesResponse::dataIsSet() const
{
    return m_DataIsSet;
}

void ListFineTunesResponse::unsetData()
{
    m_DataIsSet = false;
}
}
}
}
}


