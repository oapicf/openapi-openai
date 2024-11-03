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


#include "RunStreamEvent_oneOf_3.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

RunStreamEvent_oneOf_3::RunStreamEvent_oneOf_3()
{
    m_Event = "";
    
}

void RunStreamEvent_oneOf_3::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool RunStreamEvent_oneOf_3::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool RunStreamEvent_oneOf_3::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "RunStreamEvent_oneOf_3" : pathPrefix;

            
    if (!m_Data.validate(msg, _pathPrefix + ".data")) {
        msg << _pathPrefix << ": Data is invalid;";
        success = false;
    }
    return success;
}

bool RunStreamEvent_oneOf_3::operator==(const RunStreamEvent_oneOf_3& rhs) const
{
    return
    
    
    (getEvent() == rhs.getEvent())
     &&
    
    (getData() == rhs.getData())
    
    
    ;
}

bool RunStreamEvent_oneOf_3::operator!=(const RunStreamEvent_oneOf_3& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const RunStreamEvent_oneOf_3& o)
{
    j = nlohmann::json::object();
    j["event"] = o.m_Event;
    j["data"] = o.m_Data;
    
}

void from_json(const nlohmann::json& j, RunStreamEvent_oneOf_3& o)
{
    j.at("event").get_to(o.m_Event);
    j.at("data").get_to(o.m_Data);
    
}

std::string RunStreamEvent_oneOf_3::getEvent() const
{
    return m_Event;
}
void RunStreamEvent_oneOf_3::setEvent(std::string const& value)
{
    m_Event = value;
}
org::openapitools::server::model::RunObject RunStreamEvent_oneOf_3::getData() const
{
    return m_Data;
}
void RunStreamEvent_oneOf_3::setData(org::openapitools::server::model::RunObject const& value)
{
    m_Data = value;
}


} // namespace org::openapitools::server::model

