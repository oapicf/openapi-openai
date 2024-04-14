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


#include "RunStepStreamEvent_oneOf_1.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

RunStepStreamEvent_oneOf_1::RunStepStreamEvent_oneOf_1()
{
    m_Event = "";
    
}

void RunStepStreamEvent_oneOf_1::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool RunStepStreamEvent_oneOf_1::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool RunStepStreamEvent_oneOf_1::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "RunStepStreamEvent_oneOf_1" : pathPrefix;

            
    if (!m_Data.validate()) {
        msg << _pathPrefix << ": Data is invalid;";
        success = false;
    }
    return success;
}

bool RunStepStreamEvent_oneOf_1::operator==(const RunStepStreamEvent_oneOf_1& rhs) const
{
    return
    
    
    (getEvent() == rhs.getEvent())
     &&
    
    (getData() == rhs.getData())
    
    
    ;
}

bool RunStepStreamEvent_oneOf_1::operator!=(const RunStepStreamEvent_oneOf_1& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const RunStepStreamEvent_oneOf_1& o)
{
    j = nlohmann::json::object();
    j["event"] = o.m_Event;
    j["data"] = o.m_Data;
    
}

void from_json(const nlohmann::json& j, RunStepStreamEvent_oneOf_1& o)
{
    j.at("event").get_to(o.m_Event);
    j.at("data").get_to(o.m_Data);
    
}

std::string RunStepStreamEvent_oneOf_1::getEvent() const
{
    return m_Event;
}
void RunStepStreamEvent_oneOf_1::setEvent(std::string const& value)
{
    m_Event = value;
}
org::openapitools::server::model::RunStepObject RunStepStreamEvent_oneOf_1::getData() const
{
    return m_Data;
}
void RunStepStreamEvent_oneOf_1::setData(org::openapitools::server::model::RunStepObject const& value)
{
    m_Data = value;
}


} // namespace org::openapitools::server::model

