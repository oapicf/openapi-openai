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



#include "CppRestOpenAPIClient/model/RunStepDeltaStepDetailsToolCallsRetrievalObject.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



RunStepDeltaStepDetailsToolCallsRetrievalObject::RunStepDeltaStepDetailsToolCallsRetrievalObject()
{
    m_Index = 0;
    m_IndexIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Type = utility::conversions::to_string_t("");
    m_TypeIsSet = false;
    m_RetrievalIsSet = false;
}

RunStepDeltaStepDetailsToolCallsRetrievalObject::~RunStepDeltaStepDetailsToolCallsRetrievalObject()
{
}

void RunStepDeltaStepDetailsToolCallsRetrievalObject::validate()
{
    // TODO: implement validation
}

web::json::value RunStepDeltaStepDetailsToolCallsRetrievalObject::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IndexIsSet)
    {
        val[utility::conversions::to_string_t(U("index"))] = ModelBase::toJson(m_Index);
    }
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

bool RunStepDeltaStepDetailsToolCallsRetrievalObject::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("index"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("index")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setIndex;
            ok &= ModelBase::fromJson(fieldValue, refVal_setIndex);
            setIndex(refVal_setIndex);
        }
    }
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

void RunStepDeltaStepDetailsToolCallsRetrievalObject::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_IndexIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("index")), m_Index));
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

bool RunStepDeltaStepDetailsToolCallsRetrievalObject::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("index"))))
    {
        int32_t refVal_setIndex;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("index"))), refVal_setIndex );
        setIndex(refVal_setIndex);
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

int32_t RunStepDeltaStepDetailsToolCallsRetrievalObject::getIndex() const
{
    return m_Index;
}

void RunStepDeltaStepDetailsToolCallsRetrievalObject::setIndex(int32_t value)
{
    m_Index = value;
    m_IndexIsSet = true;
}

bool RunStepDeltaStepDetailsToolCallsRetrievalObject::indexIsSet() const
{
    return m_IndexIsSet;
}

void RunStepDeltaStepDetailsToolCallsRetrievalObject::unsetIndex()
{
    m_IndexIsSet = false;
}
utility::string_t RunStepDeltaStepDetailsToolCallsRetrievalObject::getId() const
{
    return m_Id;
}

void RunStepDeltaStepDetailsToolCallsRetrievalObject::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool RunStepDeltaStepDetailsToolCallsRetrievalObject::idIsSet() const
{
    return m_IdIsSet;
}

void RunStepDeltaStepDetailsToolCallsRetrievalObject::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t RunStepDeltaStepDetailsToolCallsRetrievalObject::getType() const
{
    return m_Type;
}

void RunStepDeltaStepDetailsToolCallsRetrievalObject::setType(const utility::string_t& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool RunStepDeltaStepDetailsToolCallsRetrievalObject::typeIsSet() const
{
    return m_TypeIsSet;
}

void RunStepDeltaStepDetailsToolCallsRetrievalObject::unsetType()
{
    m_TypeIsSet = false;
}
std::shared_ptr<Object> RunStepDeltaStepDetailsToolCallsRetrievalObject::getRetrieval() const
{
    return m_Retrieval;
}

void RunStepDeltaStepDetailsToolCallsRetrievalObject::setRetrieval(const std::shared_ptr<Object>& value)
{
    m_Retrieval = value;
    m_RetrievalIsSet = true;
}

bool RunStepDeltaStepDetailsToolCallsRetrievalObject::retrievalIsSet() const
{
    return m_RetrievalIsSet;
}

void RunStepDeltaStepDetailsToolCallsRetrievalObject::unsetRetrieval()
{
    m_RetrievalIsSet = false;
}
}
}
}
}


