/**
* OpenAI API
* APIs for sampling from and fine-tuning language models
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "ChatCompletionRequestMessage_function_call.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ChatCompletionRequestMessage_function_call::ChatCompletionRequestMessage_function_call()
{
    m_Name = "";
    m_NameIsSet = false;
    m_Arguments = "";
    m_ArgumentsIsSet = false;
    
}

void ChatCompletionRequestMessage_function_call::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ChatCompletionRequestMessage_function_call::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ChatCompletionRequestMessage_function_call::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ChatCompletionRequestMessage_function_call" : pathPrefix;

            
    return success;
}

bool ChatCompletionRequestMessage_function_call::operator==(const ChatCompletionRequestMessage_function_call& rhs) const
{
    return
    
    
    
    ((!nameIsSet() && !rhs.nameIsSet()) || (nameIsSet() && rhs.nameIsSet() && getName() == rhs.getName())) &&
    
    
    ((!argumentsIsSet() && !rhs.argumentsIsSet()) || (argumentsIsSet() && rhs.argumentsIsSet() && getArguments() == rhs.getArguments()))
    
    ;
}

bool ChatCompletionRequestMessage_function_call::operator!=(const ChatCompletionRequestMessage_function_call& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ChatCompletionRequestMessage_function_call& o)
{
    j = nlohmann::json::object();
    if(o.nameIsSet())
        j["name"] = o.m_Name;
    if(o.argumentsIsSet())
        j["arguments"] = o.m_Arguments;
    
}

void from_json(const nlohmann::json& j, ChatCompletionRequestMessage_function_call& o)
{
    if(j.find("name") != j.end())
    {
        j.at("name").get_to(o.m_Name);
        o.m_NameIsSet = true;
    } 
    if(j.find("arguments") != j.end())
    {
        j.at("arguments").get_to(o.m_Arguments);
        o.m_ArgumentsIsSet = true;
    } 
    
}

std::string ChatCompletionRequestMessage_function_call::getName() const
{
    return m_Name;
}
void ChatCompletionRequestMessage_function_call::setName(std::string const& value)
{
    m_Name = value;
    m_NameIsSet = true;
}
bool ChatCompletionRequestMessage_function_call::nameIsSet() const
{
    return m_NameIsSet;
}
void ChatCompletionRequestMessage_function_call::unsetName()
{
    m_NameIsSet = false;
}
std::string ChatCompletionRequestMessage_function_call::getArguments() const
{
    return m_Arguments;
}
void ChatCompletionRequestMessage_function_call::setArguments(std::string const& value)
{
    m_Arguments = value;
    m_ArgumentsIsSet = true;
}
bool ChatCompletionRequestMessage_function_call::argumentsIsSet() const
{
    return m_ArgumentsIsSet;
}
void ChatCompletionRequestMessage_function_call::unsetArguments()
{
    m_ArgumentsIsSet = false;
}


} // namespace org::openapitools::server::model

