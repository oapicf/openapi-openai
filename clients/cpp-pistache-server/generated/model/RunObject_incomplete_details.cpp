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


#include "RunObject_incomplete_details.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

RunObject_incomplete_details::RunObject_incomplete_details()
{
    m_Reason = "";
    m_ReasonIsSet = false;
    
}

void RunObject_incomplete_details::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool RunObject_incomplete_details::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool RunObject_incomplete_details::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "RunObject_incomplete_details" : pathPrefix;

        
    return success;
}

bool RunObject_incomplete_details::operator==(const RunObject_incomplete_details& rhs) const
{
    return
    
    
    
    ((!reasonIsSet() && !rhs.reasonIsSet()) || (reasonIsSet() && rhs.reasonIsSet() && getReason() == rhs.getReason()))
    
    ;
}

bool RunObject_incomplete_details::operator!=(const RunObject_incomplete_details& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const RunObject_incomplete_details& o)
{
    j = nlohmann::json::object();
    if(o.reasonIsSet())
        j["reason"] = o.m_Reason;
    
}

void from_json(const nlohmann::json& j, RunObject_incomplete_details& o)
{
    if(j.find("reason") != j.end())
    {
        j.at("reason").get_to(o.m_Reason);
        o.m_ReasonIsSet = true;
    } 
    
}

std::string RunObject_incomplete_details::getReason() const
{
    return m_Reason;
}
void RunObject_incomplete_details::setReason(std::string const& value)
{
    m_Reason = value;
    m_ReasonIsSet = true;
}
bool RunObject_incomplete_details::reasonIsSet() const
{
    return m_ReasonIsSet;
}
void RunObject_incomplete_details::unsetReason()
{
    m_ReasonIsSet = false;
}


} // namespace org::openapitools::server::model

