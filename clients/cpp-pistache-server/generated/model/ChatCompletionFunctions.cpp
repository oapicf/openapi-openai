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


#include "ChatCompletionFunctions.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ChatCompletionFunctions::ChatCompletionFunctions()
{
    m_Description = "";
    m_DescriptionIsSet = false;
    m_Name = "";
    m_ParametersIsSet = false;
    
}

void ChatCompletionFunctions::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ChatCompletionFunctions::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ChatCompletionFunctions::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ChatCompletionFunctions" : pathPrefix;

                
    return success;
}

bool ChatCompletionFunctions::operator==(const ChatCompletionFunctions& rhs) const
{
    return
    
    
    
    ((!descriptionIsSet() && !rhs.descriptionIsSet()) || (descriptionIsSet() && rhs.descriptionIsSet() && getDescription() == rhs.getDescription())) &&
    
    (getName() == rhs.getName())
     &&
    
    
    ((!parametersIsSet() && !rhs.parametersIsSet()) || (parametersIsSet() && rhs.parametersIsSet() && getParameters() == rhs.getParameters()))
    
    ;
}

bool ChatCompletionFunctions::operator!=(const ChatCompletionFunctions& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ChatCompletionFunctions& o)
{
    j = nlohmann::json::object();
    if(o.descriptionIsSet())
        j["description"] = o.m_Description;
    j["name"] = o.m_Name;
    if(o.parametersIsSet() || !o.m_Parameters.empty())
        j["parameters"] = o.m_Parameters;
    
}

void from_json(const nlohmann::json& j, ChatCompletionFunctions& o)
{
    if(j.find("description") != j.end())
    {
        j.at("description").get_to(o.m_Description);
        o.m_DescriptionIsSet = true;
    } 
    j.at("name").get_to(o.m_Name);
    if(j.find("parameters") != j.end())
    {
        j.at("parameters").get_to(o.m_Parameters);
        o.m_ParametersIsSet = true;
    } 
    
}

std::string ChatCompletionFunctions::getDescription() const
{
    return m_Description;
}
void ChatCompletionFunctions::setDescription(std::string const& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}
bool ChatCompletionFunctions::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}
void ChatCompletionFunctions::unsetDescription()
{
    m_DescriptionIsSet = false;
}
std::string ChatCompletionFunctions::getName() const
{
    return m_Name;
}
void ChatCompletionFunctions::setName(std::string const& value)
{
    m_Name = value;
}
std::map<std::string, nlohmann::json> ChatCompletionFunctions::getParameters() const
{
    return m_Parameters;
}
void ChatCompletionFunctions::setParameters(std::map<std::string, nlohmann::json> const& value)
{
    m_Parameters = value;
    m_ParametersIsSet = true;
}
bool ChatCompletionFunctions::parametersIsSet() const
{
    return m_ParametersIsSet;
}
void ChatCompletionFunctions::unsetParameters()
{
    m_ParametersIsSet = false;
}


} // namespace org::openapitools::server::model

