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


#include "Error.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

Error::Error()
{
    m_Code = "";
    m_Message = "";
    m_Param = "";
    m_Type = "";
    
}

void Error::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool Error::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool Error::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "Error" : pathPrefix;

                    
    return success;
}

bool Error::operator==(const Error& rhs) const
{
    return
    
    
    (getCode() == rhs.getCode())
     &&
    
    (getMessage() == rhs.getMessage())
     &&
    
    (getParam() == rhs.getParam())
     &&
    
    (getType() == rhs.getType())
    
    
    ;
}

bool Error::operator!=(const Error& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const Error& o)
{
    j = nlohmann::json::object();
    j["code"] = o.m_Code;
    j["message"] = o.m_Message;
    j["param"] = o.m_Param;
    j["type"] = o.m_Type;
    
}

void from_json(const nlohmann::json& j, Error& o)
{
    j.at("code").get_to(o.m_Code);
    j.at("message").get_to(o.m_Message);
    j.at("param").get_to(o.m_Param);
    j.at("type").get_to(o.m_Type);
    
}

std::string Error::getCode() const
{
    return m_Code;
}
void Error::setCode(std::string const& value)
{
    m_Code = value;
}
std::string Error::getMessage() const
{
    return m_Message;
}
void Error::setMessage(std::string const& value)
{
    m_Message = value;
}
std::string Error::getParam() const
{
    return m_Param;
}
void Error::setParam(std::string const& value)
{
    m_Param = value;
}
std::string Error::getType() const
{
    return m_Type;
}
void Error::setType(std::string const& value)
{
    m_Type = value;
}


} // namespace org::openapitools::server::model

