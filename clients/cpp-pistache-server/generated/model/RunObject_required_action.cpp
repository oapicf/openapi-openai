/**
* OpenAI API
* The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "RunObject_required_action.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

RunObject_required_action::RunObject_required_action()
{
    m_Type = "";
    
}

void RunObject_required_action::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool RunObject_required_action::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool RunObject_required_action::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "RunObject_required_action" : pathPrefix;

            
    if (!m_Submit_tool_outputs.validate(msg, _pathPrefix + ".submitToolOutputs")) {
        msg << _pathPrefix << ": Submit_tool_outputs is invalid;";
        success = false;
    }
    return success;
}

bool RunObject_required_action::operator==(const RunObject_required_action& rhs) const
{
    return
    
    
    (getType() == rhs.getType())
     &&
    
    (getSubmitToolOutputs() == rhs.getSubmitToolOutputs())
    
    
    ;
}

bool RunObject_required_action::operator!=(const RunObject_required_action& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const RunObject_required_action& o)
{
    j = nlohmann::json::object();
    j["type"] = o.m_Type;
    j["submit_tool_outputs"] = o.m_Submit_tool_outputs;
    
}

void from_json(const nlohmann::json& j, RunObject_required_action& o)
{
    j.at("type").get_to(o.m_Type);
    j.at("submit_tool_outputs").get_to(o.m_Submit_tool_outputs);
    
}

std::string RunObject_required_action::getType() const
{
    return m_Type;
}
void RunObject_required_action::setType(std::string const& value)
{
    m_Type = value;
}
org::openapitools::server::model::RunObject_required_action_submit_tool_outputs RunObject_required_action::getSubmitToolOutputs() const
{
    return m_Submit_tool_outputs;
}
void RunObject_required_action::setSubmitToolOutputs(org::openapitools::server::model::RunObject_required_action_submit_tool_outputs const& value)
{
    m_Submit_tool_outputs = value;
}


} // namespace org::openapitools::server::model

