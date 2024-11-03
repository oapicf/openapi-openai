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



#include "CppRestOpenAPIClient/model/RunStepDetailsToolCallsRetrievalObject.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



RunStepDetailsToolCallsRetrievalObject::RunStepDetailsToolCallsRetrievalObject()
{
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Type = utility::conversions::to_string_t("");
    m_TypeIsSet = false;
    m_RetrievalIsSet = false;
}

RunStepDetailsToolCallsRetrievalObject::~RunStepDetailsToolCallsRetrievalObject()
{
}

void RunStepDetailsToolCallsRetrievalObject::validate()
{
    // TODO: implement validation
}

web::json::value RunStepDetailsToolCallsRetrievalObject::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t(U("type"))] = ModelBase::toJson(m_Type);
    }
    if(m_RetrievalIsSet)
    {
        val[utility::conversions::to_string_t(U("retrieval"))] = ModelBase::toJson(m_Retrieval);
    }

    return val;
}

bool RunStepDetailsToolCallsRetrievalObject::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("type")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setType);
            setType(refVal_setType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("retrieval"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("retrieval")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Object> refVal_setRetrieval;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRetrieval);
            setRetrieval(refVal_setRetrieval);
        }
    }
    return ok;
}

void RunStepDetailsToolCallsRetrievalObject::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("type")), m_Type));
    }
    if(m_RetrievalIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("retrieval")), m_Retrieval));
    }
}

bool RunStepDetailsToolCallsRetrievalObject::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("type"))))
    {
        utility::string_t refVal_setType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("type"))), refVal_setType );
        setType(refVal_setType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("retrieval"))))
    {
        std::shared_ptr<Object> refVal_setRetrieval;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("retrieval"))), refVal_setRetrieval );
        setRetrieval(refVal_setRetrieval);
    }
    return ok;
}

utility::string_t RunStepDetailsToolCallsRetrievalObject::getId() const
{
    return m_Id;
}

void RunStepDetailsToolCallsRetrievalObject::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool RunStepDetailsToolCallsRetrievalObject::idIsSet() const
{
    return m_IdIsSet;
}

void RunStepDetailsToolCallsRetrievalObject::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t RunStepDetailsToolCallsRetrievalObject::getType() const
{
    return m_Type;
}

void RunStepDetailsToolCallsRetrievalObject::setType(const utility::string_t& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool RunStepDetailsToolCallsRetrievalObject::typeIsSet() const
{
    return m_TypeIsSet;
}

void RunStepDetailsToolCallsRetrievalObject::unsetType()
{
    m_TypeIsSet = false;
}
std::shared_ptr<Object> RunStepDetailsToolCallsRetrievalObject::getRetrieval() const
{
    return m_Retrieval;
}

void RunStepDetailsToolCallsRetrievalObject::setRetrieval(const std::shared_ptr<Object>& value)
{
    m_Retrieval = value;
    m_RetrievalIsSet = true;
}

bool RunStepDetailsToolCallsRetrievalObject::retrievalIsSet() const
{
    return m_RetrievalIsSet;
}

void RunStepDetailsToolCallsRetrievalObject::unsetRetrieval()
{
    m_RetrievalIsSet = false;
}
}
}
}
}


