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



#include "CppRestOpenAPIClient/model/RunObject_required_action.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



RunObject_required_action::RunObject_required_action()
{
    m_Type = utility::conversions::to_string_t("");
    m_TypeIsSet = false;
    m_Submit_tool_outputsIsSet = false;
}

RunObject_required_action::~RunObject_required_action()
{
}

void RunObject_required_action::validate()
{
    // TODO: implement validation
}

web::json::value RunObject_required_action::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t(U("type"))] = ModelBase::toJson(m_Type);
    }
    if(m_Submit_tool_outputsIsSet)
    {
        val[utility::conversions::to_string_t(U("submit_tool_outputs"))] = ModelBase::toJson(m_Submit_tool_outputs);
    }

    return val;
}

bool RunObject_required_action::fromJson(const web::json::value& val)
{
    bool ok = true;
    
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
    if(val.has_field(utility::conversions::to_string_t(U("submit_tool_outputs"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("submit_tool_outputs")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<RunObject_required_action_submit_tool_outputs> refVal_setSubmitToolOutputs;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSubmitToolOutputs);
            setSubmitToolOutputs(refVal_setSubmitToolOutputs);
        }
    }
    return ok;
}

void RunObject_required_action::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("type")), m_Type));
    }
    if(m_Submit_tool_outputsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("submit_tool_outputs")), m_Submit_tool_outputs));
    }
}

bool RunObject_required_action::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("type"))))
    {
        utility::string_t refVal_setType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("type"))), refVal_setType );
        setType(refVal_setType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("submit_tool_outputs"))))
    {
        std::shared_ptr<RunObject_required_action_submit_tool_outputs> refVal_setSubmitToolOutputs;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("submit_tool_outputs"))), refVal_setSubmitToolOutputs );
        setSubmitToolOutputs(refVal_setSubmitToolOutputs);
    }
    return ok;
}

utility::string_t RunObject_required_action::getType() const
{
    return m_Type;
}

void RunObject_required_action::setType(const utility::string_t& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool RunObject_required_action::typeIsSet() const
{
    return m_TypeIsSet;
}

void RunObject_required_action::unsetType()
{
    m_TypeIsSet = false;
}
std::shared_ptr<RunObject_required_action_submit_tool_outputs> RunObject_required_action::getSubmitToolOutputs() const
{
    return m_Submit_tool_outputs;
}

void RunObject_required_action::setSubmitToolOutputs(const std::shared_ptr<RunObject_required_action_submit_tool_outputs>& value)
{
    m_Submit_tool_outputs = value;
    m_Submit_tool_outputsIsSet = true;
}

bool RunObject_required_action::submitToolOutputsIsSet() const
{
    return m_Submit_tool_outputsIsSet;
}

void RunObject_required_action::unsetSubmit_tool_outputs()
{
    m_Submit_tool_outputsIsSet = false;
}
}
}
}
}


