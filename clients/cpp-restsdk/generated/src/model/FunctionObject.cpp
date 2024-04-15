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



#include "CppRestOpenAPIClient/model/FunctionObject.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



FunctionObject::FunctionObject()
{
    m_Description = utility::conversions::to_string_t("");
    m_DescriptionIsSet = false;
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
    m_ParametersIsSet = false;
}

FunctionObject::~FunctionObject()
{
}

void FunctionObject::validate()
{
    // TODO: implement validation
}

web::json::value FunctionObject::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_DescriptionIsSet)
    {
        val[utility::conversions::to_string_t(U("description"))] = ModelBase::toJson(m_Description);
    }
    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t(U("name"))] = ModelBase::toJson(m_Name);
    }
    if(m_ParametersIsSet)
    {
        val[utility::conversions::to_string_t(U("parameters"))] = ModelBase::toJson(m_Parameters);
    }

    return val;
}

bool FunctionObject::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("description"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("description")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setDescription;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDescription);
            setDescription(refVal_setDescription);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("name"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("name")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setName);
            setName(refVal_setName);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("parameters"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("parameters")));
        if(!fieldValue.is_null())
        {
            std::map<utility::string_t, std::shared_ptr<AnyType>> refVal_setParameters;
            ok &= ModelBase::fromJson(fieldValue, refVal_setParameters);
            setParameters(refVal_setParameters);
        }
    }
    return ok;
}

void FunctionObject::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_DescriptionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("description")), m_Description));
    }
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("name")), m_Name));
    }
    if(m_ParametersIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("parameters")), m_Parameters));
    }
}

bool FunctionObject::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("description"))))
    {
        utility::string_t refVal_setDescription;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("description"))), refVal_setDescription );
        setDescription(refVal_setDescription);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("name"))))
    {
        utility::string_t refVal_setName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("name"))), refVal_setName );
        setName(refVal_setName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("parameters"))))
    {
        std::map<utility::string_t, std::shared_ptr<AnyType>> refVal_setParameters;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("parameters"))), refVal_setParameters );
        setParameters(refVal_setParameters);
    }
    return ok;
}

utility::string_t FunctionObject::getDescription() const
{
    return m_Description;
}

void FunctionObject::setDescription(const utility::string_t& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}

bool FunctionObject::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}

void FunctionObject::unsetDescription()
{
    m_DescriptionIsSet = false;
}
utility::string_t FunctionObject::getName() const
{
    return m_Name;
}

void FunctionObject::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool FunctionObject::nameIsSet() const
{
    return m_NameIsSet;
}

void FunctionObject::unsetName()
{
    m_NameIsSet = false;
}
std::map<utility::string_t, std::shared_ptr<AnyType>>& FunctionObject::getParameters()
{
    return m_Parameters;
}

void FunctionObject::setParameters(const std::map<utility::string_t, std::shared_ptr<AnyType>>& value)
{
    m_Parameters = value;
    m_ParametersIsSet = true;
}

bool FunctionObject::parametersIsSet() const
{
    return m_ParametersIsSet;
}

void FunctionObject::unsetParameters()
{
    m_ParametersIsSet = false;
}
}
}
}
}

