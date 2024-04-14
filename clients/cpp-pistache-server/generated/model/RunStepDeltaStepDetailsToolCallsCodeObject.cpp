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


#include "RunStepDeltaStepDetailsToolCallsCodeObject.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

RunStepDeltaStepDetailsToolCallsCodeObject::RunStepDeltaStepDetailsToolCallsCodeObject()
{
    m_Index = 0;
    m_Id = "";
    m_IdIsSet = false;
    m_Type = "";
    m_Code_interpreterIsSet = false;
    
}

void RunStepDeltaStepDetailsToolCallsCodeObject::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool RunStepDeltaStepDetailsToolCallsCodeObject::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool RunStepDeltaStepDetailsToolCallsCodeObject::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "RunStepDeltaStepDetailsToolCallsCodeObject" : pathPrefix;

                    
    return success;
}

bool RunStepDeltaStepDetailsToolCallsCodeObject::operator==(const RunStepDeltaStepDetailsToolCallsCodeObject& rhs) const
{
    return
    
    
    (getIndex() == rhs.getIndex())
     &&
    
    
    ((!idIsSet() && !rhs.idIsSet()) || (idIsSet() && rhs.idIsSet() && getId() == rhs.getId())) &&
    
    (getType() == rhs.getType())
     &&
    
    
    ((!codeInterpreterIsSet() && !rhs.codeInterpreterIsSet()) || (codeInterpreterIsSet() && rhs.codeInterpreterIsSet() && getCodeInterpreter() == rhs.getCodeInterpreter()))
    
    ;
}

bool RunStepDeltaStepDetailsToolCallsCodeObject::operator!=(const RunStepDeltaStepDetailsToolCallsCodeObject& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const RunStepDeltaStepDetailsToolCallsCodeObject& o)
{
    j = nlohmann::json::object();
    j["index"] = o.m_Index;
    if(o.idIsSet())
        j["id"] = o.m_Id;
    j["type"] = o.m_Type;
    if(o.codeInterpreterIsSet())
        j["code_interpreter"] = o.m_Code_interpreter;
    
}

void from_json(const nlohmann::json& j, RunStepDeltaStepDetailsToolCallsCodeObject& o)
{
    j.at("index").get_to(o.m_Index);
    if(j.find("id") != j.end())
    {
        j.at("id").get_to(o.m_Id);
        o.m_IdIsSet = true;
    } 
    j.at("type").get_to(o.m_Type);
    if(j.find("code_interpreter") != j.end())
    {
        j.at("code_interpreter").get_to(o.m_Code_interpreter);
        o.m_Code_interpreterIsSet = true;
    } 
    
}

int32_t RunStepDeltaStepDetailsToolCallsCodeObject::getIndex() const
{
    return m_Index;
}
void RunStepDeltaStepDetailsToolCallsCodeObject::setIndex(int32_t const value)
{
    m_Index = value;
}
std::string RunStepDeltaStepDetailsToolCallsCodeObject::getId() const
{
    return m_Id;
}
void RunStepDeltaStepDetailsToolCallsCodeObject::setId(std::string const& value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool RunStepDeltaStepDetailsToolCallsCodeObject::idIsSet() const
{
    return m_IdIsSet;
}
void RunStepDeltaStepDetailsToolCallsCodeObject::unsetId()
{
    m_IdIsSet = false;
}
std::string RunStepDeltaStepDetailsToolCallsCodeObject::getType() const
{
    return m_Type;
}
void RunStepDeltaStepDetailsToolCallsCodeObject::setType(std::string const& value)
{
    m_Type = value;
}
org::openapitools::server::model::RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter RunStepDeltaStepDetailsToolCallsCodeObject::getCodeInterpreter() const
{
    return m_Code_interpreter;
}
void RunStepDeltaStepDetailsToolCallsCodeObject::setCodeInterpreter(org::openapitools::server::model::RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter const& value)
{
    m_Code_interpreter = value;
    m_Code_interpreterIsSet = true;
}
bool RunStepDeltaStepDetailsToolCallsCodeObject::codeInterpreterIsSet() const
{
    return m_Code_interpreterIsSet;
}
void RunStepDeltaStepDetailsToolCallsCodeObject::unsetCode_interpreter()
{
    m_Code_interpreterIsSet = false;
}


} // namespace org::openapitools::server::model

