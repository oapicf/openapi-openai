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


#include "CreateCompletionResponse_choices_inner.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CreateCompletionResponse_choices_inner::CreateCompletionResponse_choices_inner()
{
    m_Text = "";
    m_Index = 0;
    m_Finish_reason = "";
    
}

void CreateCompletionResponse_choices_inner::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CreateCompletionResponse_choices_inner::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CreateCompletionResponse_choices_inner::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CreateCompletionResponse_choices_inner" : pathPrefix;

                
    if (!m_Logprobs.validate()) {
        msg << _pathPrefix << ": Logprobs is invalid;";
        success = false;
    }    
    return success;
}

bool CreateCompletionResponse_choices_inner::operator==(const CreateCompletionResponse_choices_inner& rhs) const
{
    return
    
    
    (getText() == rhs.getText())
     &&
    
    (getIndex() == rhs.getIndex())
     &&
    
    (getLogprobs() == rhs.getLogprobs())
     &&
    
    (getFinishReason() == rhs.getFinishReason())
    
    
    ;
}

bool CreateCompletionResponse_choices_inner::operator!=(const CreateCompletionResponse_choices_inner& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CreateCompletionResponse_choices_inner& o)
{
    j = nlohmann::json::object();
    j["text"] = o.m_Text;
    j["index"] = o.m_Index;
    j["logprobs"] = o.m_Logprobs;
    j["finish_reason"] = o.m_Finish_reason;
    
}

void from_json(const nlohmann::json& j, CreateCompletionResponse_choices_inner& o)
{
    j.at("text").get_to(o.m_Text);
    j.at("index").get_to(o.m_Index);
    j.at("logprobs").get_to(o.m_Logprobs);
    j.at("finish_reason").get_to(o.m_Finish_reason);
    
}

std::string CreateCompletionResponse_choices_inner::getText() const
{
    return m_Text;
}
void CreateCompletionResponse_choices_inner::setText(std::string const& value)
{
    m_Text = value;
}
int32_t CreateCompletionResponse_choices_inner::getIndex() const
{
    return m_Index;
}
void CreateCompletionResponse_choices_inner::setIndex(int32_t const value)
{
    m_Index = value;
}
org::openapitools::server::model::CreateCompletionResponse_choices_inner_logprobs CreateCompletionResponse_choices_inner::getLogprobs() const
{
    return m_Logprobs;
}
void CreateCompletionResponse_choices_inner::setLogprobs(org::openapitools::server::model::CreateCompletionResponse_choices_inner_logprobs const& value)
{
    m_Logprobs = value;
}
std::string CreateCompletionResponse_choices_inner::getFinishReason() const
{
    return m_Finish_reason;
}
void CreateCompletionResponse_choices_inner::setFinishReason(std::string const& value)
{
    m_Finish_reason = value;
}


} // namespace org::openapitools::server::model

