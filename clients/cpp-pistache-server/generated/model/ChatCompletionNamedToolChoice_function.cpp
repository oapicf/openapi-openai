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


#include "ChatCompletionNamedToolChoice_function.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ChatCompletionNamedToolChoice_function::ChatCompletionNamedToolChoice_function()
{
    m_Name = "";
    
}

void ChatCompletionNamedToolChoice_function::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ChatCompletionNamedToolChoice_function::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ChatCompletionNamedToolChoice_function::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ChatCompletionNamedToolChoice_function" : pathPrefix;

        
    return success;
}

bool ChatCompletionNamedToolChoice_function::operator==(const ChatCompletionNamedToolChoice_function& rhs) const
{
    return
    
    
    (getName() == rhs.getName())
    
    
    ;
}

bool ChatCompletionNamedToolChoice_function::operator!=(const ChatCompletionNamedToolChoice_function& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ChatCompletionNamedToolChoice_function& o)
{
    j = nlohmann::json::object();
    j["name"] = o.m_Name;
    
}

void from_json(const nlohmann::json& j, ChatCompletionNamedToolChoice_function& o)
{
    j.at("name").get_to(o.m_Name);
    
}

std::string ChatCompletionNamedToolChoice_function::getName() const
{
    return m_Name;
}
void ChatCompletionNamedToolChoice_function::setName(std::string const& value)
{
    m_Name = value;
}


} // namespace org::openapitools::server::model
