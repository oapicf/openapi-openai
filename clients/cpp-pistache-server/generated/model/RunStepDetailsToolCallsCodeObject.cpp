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


#include "RunStepDetailsToolCallsCodeObject.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

RunStepDetailsToolCallsCodeObject::RunStepDetailsToolCallsCodeObject()
{
    m_Id = "";
    m_Type = "";
    
}

void RunStepDetailsToolCallsCodeObject::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool RunStepDetailsToolCallsCodeObject::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool RunStepDetailsToolCallsCodeObject::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "RunStepDetailsToolCallsCodeObject" : pathPrefix;

                
    if (!m_Code_interpreter.validate()) {
        msg << _pathPrefix << ": Code_interpreter is invalid;";
        success = false;
    }
    return success;
}

bool RunStepDetailsToolCallsCodeObject::operator==(const RunStepDetailsToolCallsCodeObject& rhs) const
{
    return
    
    
    (getId() == rhs.getId())
     &&
    
    (getType() == rhs.getType())
     &&
    
    (getCodeInterpreter() == rhs.getCodeInterpreter())
    
    
    ;
}

bool RunStepDetailsToolCallsCodeObject::operator!=(const RunStepDetailsToolCallsCodeObject& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const RunStepDetailsToolCallsCodeObject& o)
{
    j = nlohmann::json::object();
    j["id"] = o.m_Id;
    j["type"] = o.m_Type;
    j["code_interpreter"] = o.m_Code_interpreter;
    
}

void from_json(const nlohmann::json& j, RunStepDetailsToolCallsCodeObject& o)
{
    j.at("id").get_to(o.m_Id);
    j.at("type").get_to(o.m_Type);
    j.at("code_interpreter").get_to(o.m_Code_interpreter);
    
}

std::string RunStepDetailsToolCallsCodeObject::getId() const
{
    return m_Id;
}
void RunStepDetailsToolCallsCodeObject::setId(std::string const& value)
{
    m_Id = value;
}
std::string RunStepDetailsToolCallsCodeObject::getType() const
{
    return m_Type;
}
void RunStepDetailsToolCallsCodeObject::setType(std::string const& value)
{
    m_Type = value;
}
org::openapitools::server::model::RunStepDetailsToolCallsCodeObject_code_interpreter RunStepDetailsToolCallsCodeObject::getCodeInterpreter() const
{
    return m_Code_interpreter;
}
void RunStepDetailsToolCallsCodeObject::setCodeInterpreter(org::openapitools::server::model::RunStepDetailsToolCallsCodeObject_code_interpreter const& value)
{
    m_Code_interpreter = value;
}


} // namespace org::openapitools::server::model

