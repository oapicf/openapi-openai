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


#include "AssistantsApiResponseFormat.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

AssistantsApiResponseFormat::AssistantsApiResponseFormat()
{
    m_Type = "text";
    m_TypeIsSet = false;
    
}

void AssistantsApiResponseFormat::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool AssistantsApiResponseFormat::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool AssistantsApiResponseFormat::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "AssistantsApiResponseFormat" : pathPrefix;

        
    return success;
}

bool AssistantsApiResponseFormat::operator==(const AssistantsApiResponseFormat& rhs) const
{
    return
    
    
    
    ((!typeIsSet() && !rhs.typeIsSet()) || (typeIsSet() && rhs.typeIsSet() && getType() == rhs.getType()))
    
    ;
}

bool AssistantsApiResponseFormat::operator!=(const AssistantsApiResponseFormat& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const AssistantsApiResponseFormat& o)
{
    j = nlohmann::json::object();
    if(o.typeIsSet())
        j["type"] = o.m_Type;
    
}

void from_json(const nlohmann::json& j, AssistantsApiResponseFormat& o)
{
    if(j.find("type") != j.end())
    {
        j.at("type").get_to(o.m_Type);
        o.m_TypeIsSet = true;
    } 
    
}

std::string AssistantsApiResponseFormat::getType() const
{
    return m_Type;
}
void AssistantsApiResponseFormat::setType(std::string const& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}
bool AssistantsApiResponseFormat::typeIsSet() const
{
    return m_TypeIsSet;
}
void AssistantsApiResponseFormat::unsetType()
{
    m_TypeIsSet = false;
}


} // namespace org::openapitools::server::model
