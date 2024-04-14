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


#include "CreateCompletionResponse_usage.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CreateCompletionResponse_usage::CreateCompletionResponse_usage()
{
    m_Prompt_tokens = 0;
    m_Completion_tokens = 0;
    m_Total_tokens = 0;
    
}

void CreateCompletionResponse_usage::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CreateCompletionResponse_usage::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CreateCompletionResponse_usage::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CreateCompletionResponse_usage" : pathPrefix;

                
    return success;
}

bool CreateCompletionResponse_usage::operator==(const CreateCompletionResponse_usage& rhs) const
{
    return
    
    
    (getPromptTokens() == rhs.getPromptTokens())
     &&
    
    (getCompletionTokens() == rhs.getCompletionTokens())
     &&
    
    (getTotalTokens() == rhs.getTotalTokens())
    
    
    ;
}

bool CreateCompletionResponse_usage::operator!=(const CreateCompletionResponse_usage& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CreateCompletionResponse_usage& o)
{
    j = nlohmann::json::object();
    j["prompt_tokens"] = o.m_Prompt_tokens;
    j["completion_tokens"] = o.m_Completion_tokens;
    j["total_tokens"] = o.m_Total_tokens;
    
}

void from_json(const nlohmann::json& j, CreateCompletionResponse_usage& o)
{
    j.at("prompt_tokens").get_to(o.m_Prompt_tokens);
    j.at("completion_tokens").get_to(o.m_Completion_tokens);
    j.at("total_tokens").get_to(o.m_Total_tokens);
    
}

int32_t CreateCompletionResponse_usage::getPromptTokens() const
{
    return m_Prompt_tokens;
}
void CreateCompletionResponse_usage::setPromptTokens(int32_t const value)
{
    m_Prompt_tokens = value;
}
int32_t CreateCompletionResponse_usage::getCompletionTokens() const
{
    return m_Completion_tokens;
}
void CreateCompletionResponse_usage::setCompletionTokens(int32_t const value)
{
    m_Completion_tokens = value;
}
int32_t CreateCompletionResponse_usage::getTotalTokens() const
{
    return m_Total_tokens;
}
void CreateCompletionResponse_usage::setTotalTokens(int32_t const value)
{
    m_Total_tokens = value;
}


} // namespace org::openapitools::server::model
