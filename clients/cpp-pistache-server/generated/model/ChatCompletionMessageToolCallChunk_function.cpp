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


#include "ChatCompletionMessageToolCallChunk_function.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ChatCompletionMessageToolCallChunk_function::ChatCompletionMessageToolCallChunk_function()
{
    m_Name = "";
    m_NameIsSet = false;
    m_Arguments = "";
    m_ArgumentsIsSet = false;
    
}

void ChatCompletionMessageToolCallChunk_function::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ChatCompletionMessageToolCallChunk_function::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ChatCompletionMessageToolCallChunk_function::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ChatCompletionMessageToolCallChunk_function" : pathPrefix;

            
    return success;
}

bool ChatCompletionMessageToolCallChunk_function::operator==(const ChatCompletionMessageToolCallChunk_function& rhs) const
{
    return
    
    
    
    ((!nameIsSet() && !rhs.nameIsSet()) || (nameIsSet() && rhs.nameIsSet() && getName() == rhs.getName())) &&
    
    
    ((!argumentsIsSet() && !rhs.argumentsIsSet()) || (argumentsIsSet() && rhs.argumentsIsSet() && getArguments() == rhs.getArguments()))
    
    ;
}

bool ChatCompletionMessageToolCallChunk_function::operator!=(const ChatCompletionMessageToolCallChunk_function& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ChatCompletionMessageToolCallChunk_function& o)
{
    j = nlohmann::json::object();
    if(o.nameIsSet())
        j["name"] = o.m_Name;
    if(o.argumentsIsSet())
        j["arguments"] = o.m_Arguments;
    
}

void from_json(const nlohmann::json& j, ChatCompletionMessageToolCallChunk_function& o)
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

std::string ChatCompletionMessageToolCallChunk_function::getName() const
{
    return m_Name;
}
void ChatCompletionMessageToolCallChunk_function::setName(std::string const& value)
{
    m_Name = value;
    m_NameIsSet = true;
}
bool ChatCompletionMessageToolCallChunk_function::nameIsSet() const
{
    return m_NameIsSet;
}
void ChatCompletionMessageToolCallChunk_function::unsetName()
{
    m_NameIsSet = false;
}
std::string ChatCompletionMessageToolCallChunk_function::getArguments() const
{
    return m_Arguments;
}
void ChatCompletionMessageToolCallChunk_function::setArguments(std::string const& value)
{
    m_Arguments = value;
    m_ArgumentsIsSet = true;
}
bool ChatCompletionMessageToolCallChunk_function::argumentsIsSet() const
{
    return m_ArgumentsIsSet;
}
void ChatCompletionMessageToolCallChunk_function::unsetArguments()
{
    m_ArgumentsIsSet = false;
}


} // namespace org::openapitools::server::model

