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


#include "ErrorEvent.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ErrorEvent::ErrorEvent()
{
    m_Event = "";
    
}

void ErrorEvent::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ErrorEvent::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ErrorEvent::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ErrorEvent" : pathPrefix;

            
    if (!m_Data.validate(msg, _pathPrefix + ".data")) {
        msg << _pathPrefix << ": Data is invalid;";
        success = false;
    }
    return success;
}

bool ErrorEvent::operator==(const ErrorEvent& rhs) const
{
    return
    
    
    (getEvent() == rhs.getEvent())
     &&
    
    (getData() == rhs.getData())
    
    
    ;
}

bool ErrorEvent::operator!=(const ErrorEvent& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ErrorEvent& o)
{
    j = nlohmann::json::object();
    j["event"] = o.m_Event;
    j["data"] = o.m_Data;
    
}

void from_json(const nlohmann::json& j, ErrorEvent& o)
{
    j.at("event").get_to(o.m_Event);
    j.at("data").get_to(o.m_Data);
    
}

std::string ErrorEvent::getEvent() const
{
    return m_Event;
}
void ErrorEvent::setEvent(std::string const& value)
{
    m_Event = value;
}
org::openapitools::server::model::Error ErrorEvent::getData() const
{
    return m_Data;
}
void ErrorEvent::setData(org::openapitools::server::model::Error const& value)
{
    m_Data = value;
}


} // namespace org::openapitools::server::model

