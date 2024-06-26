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


#include "RunObject_last_error.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

RunObject_last_error::RunObject_last_error()
{
    m_Code = "";
    m_Message = "";
    
}

void RunObject_last_error::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool RunObject_last_error::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool RunObject_last_error::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "RunObject_last_error" : pathPrefix;

            
    return success;
}

bool RunObject_last_error::operator==(const RunObject_last_error& rhs) const
{
    return
    
    
    (getCode() == rhs.getCode())
     &&
    
    (getMessage() == rhs.getMessage())
    
    
    ;
}

bool RunObject_last_error::operator!=(const RunObject_last_error& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const RunObject_last_error& o)
{
    j = nlohmann::json::object();
    j["code"] = o.m_Code;
    j["message"] = o.m_Message;
    
}

void from_json(const nlohmann::json& j, RunObject_last_error& o)
{
    j.at("code").get_to(o.m_Code);
    j.at("message").get_to(o.m_Message);
    
}

std::string RunObject_last_error::getCode() const
{
    return m_Code;
}
void RunObject_last_error::setCode(std::string const& value)
{
    m_Code = value;
}
std::string RunObject_last_error::getMessage() const
{
    return m_Message;
}
void RunObject_last_error::setMessage(std::string const& value)
{
    m_Message = value;
}


} // namespace org::openapitools::server::model

