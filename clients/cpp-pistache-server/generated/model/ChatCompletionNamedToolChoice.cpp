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


#include "ChatCompletionNamedToolChoice.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ChatCompletionNamedToolChoice::ChatCompletionNamedToolChoice()
{
    m_Type = "";
    
}

void ChatCompletionNamedToolChoice::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ChatCompletionNamedToolChoice::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ChatCompletionNamedToolChoice::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ChatCompletionNamedToolChoice" : pathPrefix;

            
    if (!m_Function.validate()) {
        msg << _pathPrefix << ": Function is invalid;";
        success = false;
    }
    return success;
}

bool ChatCompletionNamedToolChoice::operator==(const ChatCompletionNamedToolChoice& rhs) const
{
    return
    
    
    (getType() == rhs.getType())
     &&
    
    (getFunction() == rhs.getFunction())
    
    
    ;
}

bool ChatCompletionNamedToolChoice::operator!=(const ChatCompletionNamedToolChoice& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ChatCompletionNamedToolChoice& o)
{
    j = nlohmann::json::object();
    j["type"] = o.m_Type;
    j["function"] = o.m_Function;
    
}

void from_json(const nlohmann::json& j, ChatCompletionNamedToolChoice& o)
{
    j.at("type").get_to(o.m_Type);
    j.at("function").get_to(o.m_Function);
    
}

std::string ChatCompletionNamedToolChoice::getType() const
{
    return m_Type;
}
void ChatCompletionNamedToolChoice::setType(std::string const& value)
{
    m_Type = value;
}
org::openapitools::server::model::ChatCompletionNamedToolChoice_function ChatCompletionNamedToolChoice::getFunction() const
{
    return m_Function;
}
void ChatCompletionNamedToolChoice::setFunction(org::openapitools::server::model::ChatCompletionNamedToolChoice_function const& value)
{
    m_Function = value;
}


} // namespace org::openapitools::server::model

