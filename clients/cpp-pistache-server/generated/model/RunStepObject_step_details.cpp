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


#include "RunStepObject_step_details.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

RunStepObject_step_details::RunStepObject_step_details()
{
    m_Type = "";
    
}

void RunStepObject_step_details::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool RunStepObject_step_details::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool RunStepObject_step_details::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "RunStepObject_step_details" : pathPrefix;

            
    if (!m_Message_creation.validate()) {
        msg << _pathPrefix << ": Message_creation is invalid;";
        success = false;
    }     
    
    /* Tool_calls */ {
        const std::vector<org::openapitools::server::model::RunStepDetailsToolCallsObject_tool_calls_inner>& value = m_Tool_calls;
        const std::string currentValuePath = _pathPrefix + ".toolCalls";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::RunStepDetailsToolCallsObject_tool_calls_inner& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".toolCalls") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool RunStepObject_step_details::operator==(const RunStepObject_step_details& rhs) const
{
    return
    
    
    (getType() == rhs.getType())
     &&
    
    (getMessageCreation() == rhs.getMessageCreation())
     &&
    
    (getToolCalls() == rhs.getToolCalls())
    
    
    ;
}

bool RunStepObject_step_details::operator!=(const RunStepObject_step_details& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const RunStepObject_step_details& o)
{
    j = nlohmann::json::object();
    j["type"] = o.m_Type;
    j["message_creation"] = o.m_Message_creation;
    j["tool_calls"] = o.m_Tool_calls;
    
}

void from_json(const nlohmann::json& j, RunStepObject_step_details& o)
{
    j.at("type").get_to(o.m_Type);
    j.at("message_creation").get_to(o.m_Message_creation);
    j.at("tool_calls").get_to(o.m_Tool_calls);
    
}

std::string RunStepObject_step_details::getType() const
{
    return m_Type;
}
void RunStepObject_step_details::setType(std::string const& value)
{
    m_Type = value;
}
org::openapitools::server::model::RunStepDetailsMessageCreationObject_message_creation RunStepObject_step_details::getMessageCreation() const
{
    return m_Message_creation;
}
void RunStepObject_step_details::setMessageCreation(org::openapitools::server::model::RunStepDetailsMessageCreationObject_message_creation const& value)
{
    m_Message_creation = value;
}
std::vector<org::openapitools::server::model::RunStepDetailsToolCallsObject_tool_calls_inner> RunStepObject_step_details::getToolCalls() const
{
    return m_Tool_calls;
}
void RunStepObject_step_details::setToolCalls(std::vector<org::openapitools::server::model::RunStepDetailsToolCallsObject_tool_calls_inner> const& value)
{
    m_Tool_calls = value;
}


} // namespace org::openapitools::server::model

