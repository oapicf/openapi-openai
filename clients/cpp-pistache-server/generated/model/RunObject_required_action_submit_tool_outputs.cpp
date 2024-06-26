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


#include "RunObject_required_action_submit_tool_outputs.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

RunObject_required_action_submit_tool_outputs::RunObject_required_action_submit_tool_outputs()
{
    
}

void RunObject_required_action_submit_tool_outputs::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool RunObject_required_action_submit_tool_outputs::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool RunObject_required_action_submit_tool_outputs::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "RunObject_required_action_submit_tool_outputs" : pathPrefix;

         
    
    /* Tool_calls */ {
        const std::vector<org::openapitools::server::model::RunToolCallObject>& value = m_Tool_calls;
        const std::string currentValuePath = _pathPrefix + ".toolCalls";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::RunToolCallObject& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".toolCalls") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool RunObject_required_action_submit_tool_outputs::operator==(const RunObject_required_action_submit_tool_outputs& rhs) const
{
    return
    
    
    (getToolCalls() == rhs.getToolCalls())
    
    
    ;
}

bool RunObject_required_action_submit_tool_outputs::operator!=(const RunObject_required_action_submit_tool_outputs& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const RunObject_required_action_submit_tool_outputs& o)
{
    j = nlohmann::json::object();
    j["tool_calls"] = o.m_Tool_calls;
    
}

void from_json(const nlohmann::json& j, RunObject_required_action_submit_tool_outputs& o)
{
    j.at("tool_calls").get_to(o.m_Tool_calls);
    
}

std::vector<org::openapitools::server::model::RunToolCallObject> RunObject_required_action_submit_tool_outputs::getToolCalls() const
{
    return m_Tool_calls;
}
void RunObject_required_action_submit_tool_outputs::setToolCalls(std::vector<org::openapitools::server::model::RunToolCallObject> const& value)
{
    m_Tool_calls = value;
}


} // namespace org::openapitools::server::model

