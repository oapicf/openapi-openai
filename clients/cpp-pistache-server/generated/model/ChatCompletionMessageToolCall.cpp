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


#include "ChatCompletionMessageToolCall.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ChatCompletionMessageToolCall::ChatCompletionMessageToolCall()
{
    m_Id = "";
    m_Type = "";
    
}

void ChatCompletionMessageToolCall::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ChatCompletionMessageToolCall::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ChatCompletionMessageToolCall::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ChatCompletionMessageToolCall" : pathPrefix;

                
    if (!m_Function.validate(msg, _pathPrefix + ".function")) {
        msg << _pathPrefix << ": Function is invalid;";
        success = false;
    }
    return success;
}

bool ChatCompletionMessageToolCall::operator==(const ChatCompletionMessageToolCall& rhs) const
{
    return
    
    
    (getId() == rhs.getId())
     &&
    
    (getType() == rhs.getType())
     &&
    
    (getFunction() == rhs.getFunction())
    
    
    ;
}

bool ChatCompletionMessageToolCall::operator!=(const ChatCompletionMessageToolCall& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ChatCompletionMessageToolCall& o)
{
    j = nlohmann::json::object();
    j["id"] = o.m_Id;
    j["type"] = o.m_Type;
    j["function"] = o.m_Function;
    
}

void from_json(const nlohmann::json& j, ChatCompletionMessageToolCall& o)
{
    j.at("id").get_to(o.m_Id);
    j.at("type").get_to(o.m_Type);
    j.at("function").get_to(o.m_Function);
    
}

std::string ChatCompletionMessageToolCall::getId() const
{
    return m_Id;
}
void ChatCompletionMessageToolCall::setId(std::string const& value)
{
    m_Id = value;
}
std::string ChatCompletionMessageToolCall::getType() const
{
    return m_Type;
}
void ChatCompletionMessageToolCall::setType(std::string const& value)
{
    m_Type = value;
}
org::openapitools::server::model::ChatCompletionMessageToolCall_function ChatCompletionMessageToolCall::getFunction() const
{
    return m_Function;
}
void ChatCompletionMessageToolCall::setFunction(org::openapitools::server::model::ChatCompletionMessageToolCall_function const& value)
{
    m_Function = value;
}


} // namespace org::openapitools::server::model

