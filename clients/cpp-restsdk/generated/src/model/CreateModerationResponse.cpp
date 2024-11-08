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



#include "CppRestOpenAPIClient/model/CreateModerationResponse.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CreateModerationResponse::CreateModerationResponse()
{
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Model = utility::conversions::to_string_t("");
    m_ModelIsSet = false;
    m_ResultsIsSet = false;
}

CreateModerationResponse::~CreateModerationResponse()
{
}

void CreateModerationResponse::validate()
{
    // TODO: implement validation
}

web::json::value CreateModerationResponse::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_ModelIsSet)
    {
        val[utility::conversions::to_string_t(U("model"))] = ModelBase::toJson(m_Model);
    }
    if(m_ResultsIsSet)
    {
        val[utility::conversions::to_string_t(U("results"))] = ModelBase::toJson(m_Results);
    }

    return val;
}

bool CreateModerationResponse::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("model"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("model")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setModel;
            ok &= ModelBase::fromJson(fieldValue, refVal_setModel);
            setModel(refVal_setModel);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("results"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("results")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<CreateModerationResponse_results_inner>> refVal_setResults;
            ok &= ModelBase::fromJson(fieldValue, refVal_setResults);
            setResults(refVal_setResults);
        }
    }
    return ok;
}

void CreateModerationResponse::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_ModelIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("model")), m_Model));
    }
    if(m_ResultsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("results")), m_Results));
    }
}

bool CreateModerationResponse::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("model"))))
    {
        utility::string_t refVal_setModel;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("model"))), refVal_setModel );
        setModel(refVal_setModel);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("results"))))
    {
        std::vector<std::shared_ptr<CreateModerationResponse_results_inner>> refVal_setResults;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("results"))), refVal_setResults );
        setResults(refVal_setResults);
    }
    return ok;
}

utility::string_t CreateModerationResponse::getId() const
{
    return m_Id;
}

void CreateModerationResponse::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool CreateModerationResponse::idIsSet() const
{
    return m_IdIsSet;
}

void CreateModerationResponse::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t CreateModerationResponse::getModel() const
{
    return m_Model;
}

void CreateModerationResponse::setModel(const utility::string_t& value)
{
    m_Model = value;
    m_ModelIsSet = true;
}

bool CreateModerationResponse::modelIsSet() const
{
    return m_ModelIsSet;
}

void CreateModerationResponse::unsetModel()
{
    m_ModelIsSet = false;
}
std::vector<std::shared_ptr<CreateModerationResponse_results_inner>>& CreateModerationResponse::getResults()
{
    return m_Results;
}

void CreateModerationResponse::setResults(const std::vector<std::shared_ptr<CreateModerationResponse_results_inner>>& value)
{
    m_Results = value;
    m_ResultsIsSet = true;
}

bool CreateModerationResponse::resultsIsSet() const
{
    return m_ResultsIsSet;
}

void CreateModerationResponse::unsetResults()
{
    m_ResultsIsSet = false;
}
}
}
}
}


