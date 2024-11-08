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


#include "RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner()
{
    m_Index = 0;
    m_Id = "";
    m_IdIsSet = false;
    m_Type = "";
    m_Code_interpreterIsSet = false;
    m_RetrievalIsSet = false;
    m_FunctionIsSet = false;
    
}

void RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner" : pathPrefix;

                            
    return success;
}

bool RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::operator==(const RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner& rhs) const
{
    return
    
    
    (getIndex() == rhs.getIndex())
     &&
    
    
    ((!idIsSet() && !rhs.idIsSet()) || (idIsSet() && rhs.idIsSet() && getId() == rhs.getId())) &&
    
    (getType() == rhs.getType())
     &&
    
    
    ((!codeInterpreterIsSet() && !rhs.codeInterpreterIsSet()) || (codeInterpreterIsSet() && rhs.codeInterpreterIsSet() && getCodeInterpreter() == rhs.getCodeInterpreter())) &&
    
    
    ((!retrievalIsSet() && !rhs.retrievalIsSet()) || (retrievalIsSet() && rhs.retrievalIsSet() && getRetrieval() == rhs.getRetrieval())) &&
    
    
    ((!functionIsSet() && !rhs.functionIsSet()) || (functionIsSet() && rhs.functionIsSet() && getFunction() == rhs.getFunction()))
    
    ;
}

bool RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::operator!=(const RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner& o)
{
    j = nlohmann::json::object();
    j["index"] = o.m_Index;
    if(o.idIsSet())
        j["id"] = o.m_Id;
    j["type"] = o.m_Type;
    if(o.codeInterpreterIsSet())
        j["code_interpreter"] = o.m_Code_interpreter;
    if(o.retrievalIsSet())
        j["retrieval"] = o.m_Retrieval;
    if(o.functionIsSet())
        j["function"] = o.m_Function;
    
}

void from_json(const nlohmann::json& j, RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner& o)
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
    if(j.find("retrieval") != j.end())
    {
        j.at("retrieval").get_to(o.m_Retrieval);
        o.m_RetrievalIsSet = true;
    } 
    if(j.find("function") != j.end())
    {
        j.at("function").get_to(o.m_Function);
        o.m_FunctionIsSet = true;
    } 
    
}

int32_t RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::getIndex() const
{
    return m_Index;
}
void RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::setIndex(int32_t const value)
{
    m_Index = value;
}
std::string RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::getId() const
{
    return m_Id;
}
void RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::setId(std::string const& value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::idIsSet() const
{
    return m_IdIsSet;
}
void RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::unsetId()
{
    m_IdIsSet = false;
}
std::string RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::getType() const
{
    return m_Type;
}
void RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::setType(std::string const& value)
{
    m_Type = value;
}
org::openapitools::server::model::RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::getCodeInterpreter() const
{
    return m_Code_interpreter;
}
void RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::setCodeInterpreter(org::openapitools::server::model::RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter const& value)
{
    m_Code_interpreter = value;
    m_Code_interpreterIsSet = true;
}
bool RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::codeInterpreterIsSet() const
{
    return m_Code_interpreterIsSet;
}
void RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::unsetCode_interpreter()
{
    m_Code_interpreterIsSet = false;
}
nlohmann::json RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::getRetrieval() const
{
    return m_Retrieval;
}
void RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::setRetrieval(nlohmann::json const& value)
{
    m_Retrieval = value;
    m_RetrievalIsSet = true;
}
bool RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::retrievalIsSet() const
{
    return m_RetrievalIsSet;
}
void RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::unsetRetrieval()
{
    m_RetrievalIsSet = false;
}
org::openapitools::server::model::RunStepDeltaStepDetailsToolCallsFunctionObject_function RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::getFunction() const
{
    return m_Function;
}
void RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::setFunction(org::openapitools::server::model::RunStepDeltaStepDetailsToolCallsFunctionObject_function const& value)
{
    m_Function = value;
    m_FunctionIsSet = true;
}
bool RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::functionIsSet() const
{
    return m_FunctionIsSet;
}
void RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::unsetFunction()
{
    m_FunctionIsSet = false;
}


} // namespace org::openapitools::server::model

