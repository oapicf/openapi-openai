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


#include "RunStepDeltaStepDetailsToolCallsRetrievalObject.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

RunStepDeltaStepDetailsToolCallsRetrievalObject::RunStepDeltaStepDetailsToolCallsRetrievalObject()
{
    m_Index = 0;
    m_Id = "";
    m_IdIsSet = false;
    m_Type = "";
    m_RetrievalIsSet = false;
    
}

void RunStepDeltaStepDetailsToolCallsRetrievalObject::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool RunStepDeltaStepDetailsToolCallsRetrievalObject::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool RunStepDeltaStepDetailsToolCallsRetrievalObject::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "RunStepDeltaStepDetailsToolCallsRetrievalObject" : pathPrefix;

                    
    return success;
}

bool RunStepDeltaStepDetailsToolCallsRetrievalObject::operator==(const RunStepDeltaStepDetailsToolCallsRetrievalObject& rhs) const
{
    return
    
    
    (getIndex() == rhs.getIndex())
     &&
    
    
    ((!idIsSet() && !rhs.idIsSet()) || (idIsSet() && rhs.idIsSet() && getId() == rhs.getId())) &&
    
    (getType() == rhs.getType())
     &&
    
    
    ((!retrievalIsSet() && !rhs.retrievalIsSet()) || (retrievalIsSet() && rhs.retrievalIsSet() && getRetrieval() == rhs.getRetrieval()))
    
    ;
}

bool RunStepDeltaStepDetailsToolCallsRetrievalObject::operator!=(const RunStepDeltaStepDetailsToolCallsRetrievalObject& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const RunStepDeltaStepDetailsToolCallsRetrievalObject& o)
{
    j = nlohmann::json::object();
    j["index"] = o.m_Index;
    if(o.idIsSet())
        j["id"] = o.m_Id;
    j["type"] = o.m_Type;
    if(o.retrievalIsSet())
        j["retrieval"] = o.m_Retrieval;
    
}

void from_json(const nlohmann::json& j, RunStepDeltaStepDetailsToolCallsRetrievalObject& o)
{
    j.at("index").get_to(o.m_Index);
    if(j.find("id") != j.end())
    {
        j.at("id").get_to(o.m_Id);
        o.m_IdIsSet = true;
    } 
    j.at("type").get_to(o.m_Type);
    if(j.find("retrieval") != j.end())
    {
        j.at("retrieval").get_to(o.m_Retrieval);
        o.m_RetrievalIsSet = true;
    } 
    
}

int32_t RunStepDeltaStepDetailsToolCallsRetrievalObject::getIndex() const
{
    return m_Index;
}
void RunStepDeltaStepDetailsToolCallsRetrievalObject::setIndex(int32_t const value)
{
    m_Index = value;
}
std::string RunStepDeltaStepDetailsToolCallsRetrievalObject::getId() const
{
    return m_Id;
}
void RunStepDeltaStepDetailsToolCallsRetrievalObject::setId(std::string const& value)
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
std::string RunStepDeltaStepDetailsToolCallsRetrievalObject::getType() const
{
    return m_Type;
}
void RunStepDeltaStepDetailsToolCallsRetrievalObject::setType(std::string const& value)
{
    m_Type = value;
}
nlohmann::json RunStepDeltaStepDetailsToolCallsRetrievalObject::getRetrieval() const
{
    return m_Retrieval;
}
void RunStepDeltaStepDetailsToolCallsRetrievalObject::setRetrieval(nlohmann::json const& value)
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


} // namespace org::openapitools::server::model

