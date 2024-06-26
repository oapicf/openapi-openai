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


#include "ChatCompletionTokenLogprob_top_logprobs_inner.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ChatCompletionTokenLogprob_top_logprobs_inner::ChatCompletionTokenLogprob_top_logprobs_inner()
{
    m_Token = "";
    m_Logprob = 0.0;
    
}

void ChatCompletionTokenLogprob_top_logprobs_inner::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ChatCompletionTokenLogprob_top_logprobs_inner::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ChatCompletionTokenLogprob_top_logprobs_inner::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ChatCompletionTokenLogprob_top_logprobs_inner" : pathPrefix;

                 
    
    /* Bytes */ {
        const std::vector<int32_t>& value = m_Bytes;
        const std::string currentValuePath = _pathPrefix + ".bytes";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const int32_t& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
    
    return success;
}

bool ChatCompletionTokenLogprob_top_logprobs_inner::operator==(const ChatCompletionTokenLogprob_top_logprobs_inner& rhs) const
{
    return
    
    
    (getToken() == rhs.getToken())
     &&
    
    (getLogprob() == rhs.getLogprob())
     &&
    
    (getBytes() == rhs.getBytes())
    
    
    ;
}

bool ChatCompletionTokenLogprob_top_logprobs_inner::operator!=(const ChatCompletionTokenLogprob_top_logprobs_inner& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ChatCompletionTokenLogprob_top_logprobs_inner& o)
{
    j = nlohmann::json::object();
    j["token"] = o.m_Token;
    j["logprob"] = o.m_Logprob;
    j["bytes"] = o.m_Bytes;
    
}

void from_json(const nlohmann::json& j, ChatCompletionTokenLogprob_top_logprobs_inner& o)
{
    j.at("token").get_to(o.m_Token);
    j.at("logprob").get_to(o.m_Logprob);
    j.at("bytes").get_to(o.m_Bytes);
    
}

std::string ChatCompletionTokenLogprob_top_logprobs_inner::getToken() const
{
    return m_Token;
}
void ChatCompletionTokenLogprob_top_logprobs_inner::setToken(std::string const& value)
{
    m_Token = value;
}
double ChatCompletionTokenLogprob_top_logprobs_inner::getLogprob() const
{
    return m_Logprob;
}
void ChatCompletionTokenLogprob_top_logprobs_inner::setLogprob(double const value)
{
    m_Logprob = value;
}
std::vector<int32_t> ChatCompletionTokenLogprob_top_logprobs_inner::getBytes() const
{
    return m_Bytes;
}
void ChatCompletionTokenLogprob_top_logprobs_inner::setBytes(std::vector<int32_t> const value)
{
    m_Bytes = value;
}


} // namespace org::openapitools::server::model

