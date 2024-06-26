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


#include "CreateEmbeddingResponse_usage.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CreateEmbeddingResponse_usage::CreateEmbeddingResponse_usage()
{
    m_Prompt_tokens = 0;
    m_Total_tokens = 0;
    
}

void CreateEmbeddingResponse_usage::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CreateEmbeddingResponse_usage::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CreateEmbeddingResponse_usage::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CreateEmbeddingResponse_usage" : pathPrefix;

            
    return success;
}

bool CreateEmbeddingResponse_usage::operator==(const CreateEmbeddingResponse_usage& rhs) const
{
    return
    
    
    (getPromptTokens() == rhs.getPromptTokens())
     &&
    
    (getTotalTokens() == rhs.getTotalTokens())
    
    
    ;
}

bool CreateEmbeddingResponse_usage::operator!=(const CreateEmbeddingResponse_usage& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CreateEmbeddingResponse_usage& o)
{
    j = nlohmann::json::object();
    j["prompt_tokens"] = o.m_Prompt_tokens;
    j["total_tokens"] = o.m_Total_tokens;
    
}

void from_json(const nlohmann::json& j, CreateEmbeddingResponse_usage& o)
{
    j.at("prompt_tokens").get_to(o.m_Prompt_tokens);
    j.at("total_tokens").get_to(o.m_Total_tokens);
    
}

int32_t CreateEmbeddingResponse_usage::getPromptTokens() const
{
    return m_Prompt_tokens;
}
void CreateEmbeddingResponse_usage::setPromptTokens(int32_t const value)
{
    m_Prompt_tokens = value;
}
int32_t CreateEmbeddingResponse_usage::getTotalTokens() const
{
    return m_Total_tokens;
}
void CreateEmbeddingResponse_usage::setTotalTokens(int32_t const value)
{
    m_Total_tokens = value;
}


} // namespace org::openapitools::server::model

