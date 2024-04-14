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


#include "ChatCompletionToolChoiceOption.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ChatCompletionToolChoiceOption::ChatCompletionToolChoiceOption()
{
    m_Type = "";
    
}

void ChatCompletionToolChoiceOption::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ChatCompletionToolChoiceOption::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ChatCompletionToolChoiceOption::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ChatCompletionToolChoiceOption" : pathPrefix;

            
    if (!m_Function.validate()) {
        msg << _pathPrefix << ": Function is invalid;";
        success = false;
    }
    return success;
}

bool ChatCompletionToolChoiceOption::operator==(const ChatCompletionToolChoiceOption& rhs) const
{
    return
    
    
    (getType() == rhs.getType())
     &&
    
    (getFunction() == rhs.getFunction())
    
    
    ;
}

bool ChatCompletionToolChoiceOption::operator!=(const ChatCompletionToolChoiceOption& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ChatCompletionToolChoiceOption& o)
{
    j = nlohmann::json::object();
    j["type"] = o.m_Type;
    j["function"] = o.m_Function;
    
}

void from_json(const nlohmann::json& j, ChatCompletionToolChoiceOption& o)
{
    j.at("type").get_to(o.m_Type);
    j.at("function").get_to(o.m_Function);
    
}

std::string ChatCompletionToolChoiceOption::getType() const
{
    return m_Type;
}
void ChatCompletionToolChoiceOption::setType(std::string const& value)
{
    m_Type = value;
}
org::openapitools::server::model::ChatCompletionNamedToolChoice_function ChatCompletionToolChoiceOption::getFunction() const
{
    return m_Function;
}
void ChatCompletionToolChoiceOption::setFunction(org::openapitools::server::model::ChatCompletionNamedToolChoice_function const& value)
{
    m_Function = value;
}


} // namespace org::openapitools::server::model

