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



#include "CppRestOpenAPIClient/model/SubmitToolOutputsRunRequest_tool_outputs_inner.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



SubmitToolOutputsRunRequest_tool_outputs_inner::SubmitToolOutputsRunRequest_tool_outputs_inner()
{
    m_Tool_call_id = utility::conversions::to_string_t("");
    m_Tool_call_idIsSet = false;
    m_Output = utility::conversions::to_string_t("");
    m_OutputIsSet = false;
}

SubmitToolOutputsRunRequest_tool_outputs_inner::~SubmitToolOutputsRunRequest_tool_outputs_inner()
{
}

void SubmitToolOutputsRunRequest_tool_outputs_inner::validate()
{
    // TODO: implement validation
}

web::json::value SubmitToolOutputsRunRequest_tool_outputs_inner::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Tool_call_idIsSet)
    {
        val[utility::conversions::to_string_t(U("tool_call_id"))] = ModelBase::toJson(m_Tool_call_id);
    }
    if(m_OutputIsSet)
    {
        val[utility::conversions::to_string_t(U("output"))] = ModelBase::toJson(m_Output);
    }

    return val;
}

bool SubmitToolOutputsRunRequest_tool_outputs_inner::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("tool_call_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("tool_call_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setToolCallId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setToolCallId);
            setToolCallId(refVal_setToolCallId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("output"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("output")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setOutput;
            ok &= ModelBase::fromJson(fieldValue, refVal_setOutput);
            setOutput(refVal_setOutput);
        }
    }
    return ok;
}

void SubmitToolOutputsRunRequest_tool_outputs_inner::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Tool_call_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("tool_call_id")), m_Tool_call_id));
    }
    if(m_OutputIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("output")), m_Output));
    }
}

bool SubmitToolOutputsRunRequest_tool_outputs_inner::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("tool_call_id"))))
    {
        utility::string_t refVal_setToolCallId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("tool_call_id"))), refVal_setToolCallId );
        setToolCallId(refVal_setToolCallId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("output"))))
    {
        utility::string_t refVal_setOutput;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("output"))), refVal_setOutput );
        setOutput(refVal_setOutput);
    }
    return ok;
}

utility::string_t SubmitToolOutputsRunRequest_tool_outputs_inner::getToolCallId() const
{
    return m_Tool_call_id;
}

void SubmitToolOutputsRunRequest_tool_outputs_inner::setToolCallId(const utility::string_t& value)
{
    m_Tool_call_id = value;
    m_Tool_call_idIsSet = true;
}

bool SubmitToolOutputsRunRequest_tool_outputs_inner::toolCallIdIsSet() const
{
    return m_Tool_call_idIsSet;
}

void SubmitToolOutputsRunRequest_tool_outputs_inner::unsetTool_call_id()
{
    m_Tool_call_idIsSet = false;
}
utility::string_t SubmitToolOutputsRunRequest_tool_outputs_inner::getOutput() const
{
    return m_Output;
}

void SubmitToolOutputsRunRequest_tool_outputs_inner::setOutput(const utility::string_t& value)
{
    m_Output = value;
    m_OutputIsSet = true;
}

bool SubmitToolOutputsRunRequest_tool_outputs_inner::outputIsSet() const
{
    return m_OutputIsSet;
}

void SubmitToolOutputsRunRequest_tool_outputs_inner::unsetOutput()
{
    m_OutputIsSet = false;
}
}
}
}
}


