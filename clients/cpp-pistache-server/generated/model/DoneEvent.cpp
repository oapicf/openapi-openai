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


#include "DoneEvent.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

DoneEvent::DoneEvent()
{
    m_Event = "";
    m_Data = "";
    
}

void DoneEvent::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool DoneEvent::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool DoneEvent::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "DoneEvent" : pathPrefix;

            
    return success;
}

bool DoneEvent::operator==(const DoneEvent& rhs) const
{
    return
    
    
    (getEvent() == rhs.getEvent())
     &&
    
    (getData() == rhs.getData())
    
    
    ;
}

bool DoneEvent::operator!=(const DoneEvent& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const DoneEvent& o)
{
    j = nlohmann::json::object();
    j["event"] = o.m_Event;
    j["data"] = o.m_Data;
    
}

void from_json(const nlohmann::json& j, DoneEvent& o)
{
    j.at("event").get_to(o.m_Event);
    j.at("data").get_to(o.m_Data);
    
}

std::string DoneEvent::getEvent() const
{
    return m_Event;
}
void DoneEvent::setEvent(std::string const& value)
{
    m_Event = value;
}
std::string DoneEvent::getData() const
{
    return m_Data;
}
void DoneEvent::setData(std::string const& value)
{
    m_Data = value;
}


} // namespace org::openapitools::server::model

