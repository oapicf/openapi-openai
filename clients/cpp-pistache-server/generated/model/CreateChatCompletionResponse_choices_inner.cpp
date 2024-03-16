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


#include "CreateChatCompletionResponse_choices_inner.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CreateChatCompletionResponse_choices_inner::CreateChatCompletionResponse_choices_inner()
{
    m_Index = 0;
    m_IndexIsSet = false;
    m_MessageIsSet = false;
    m_Finish_reason = "";
    m_Finish_reasonIsSet = false;
    
}

void CreateChatCompletionResponse_choices_inner::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CreateChatCompletionResponse_choices_inner::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CreateChatCompletionResponse_choices_inner::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CreateChatCompletionResponse_choices_inner" : pathPrefix;

                
    return success;
}

bool CreateChatCompletionResponse_choices_inner::operator==(const CreateChatCompletionResponse_choices_inner& rhs) const
{
    return
    
    
    
    ((!indexIsSet() && !rhs.indexIsSet()) || (indexIsSet() && rhs.indexIsSet() && getIndex() == rhs.getIndex())) &&
    
    
    ((!messageIsSet() && !rhs.messageIsSet()) || (messageIsSet() && rhs.messageIsSet() && getMessage() == rhs.getMessage())) &&
    
    
    ((!finishReasonIsSet() && !rhs.finishReasonIsSet()) || (finishReasonIsSet() && rhs.finishReasonIsSet() && getFinishReason() == rhs.getFinishReason()))
    
    ;
}

bool CreateChatCompletionResponse_choices_inner::operator!=(const CreateChatCompletionResponse_choices_inner& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CreateChatCompletionResponse_choices_inner& o)
{
    j = nlohmann::json::object();
    if(o.indexIsSet())
        j["index"] = o.m_Index;
    if(o.messageIsSet())
        j["message"] = o.m_Message;
    if(o.finishReasonIsSet())
        j["finish_reason"] = o.m_Finish_reason;
    
}

void from_json(const nlohmann::json& j, CreateChatCompletionResponse_choices_inner& o)
{
    if(j.find("index") != j.end())
    {
        j.at("index").get_to(o.m_Index);
        o.m_IndexIsSet = true;
    } 
    if(j.find("message") != j.end())
    {
        j.at("message").get_to(o.m_Message);
        o.m_MessageIsSet = true;
    } 
    if(j.find("finish_reason") != j.end())
    {
        j.at("finish_reason").get_to(o.m_Finish_reason);
        o.m_Finish_reasonIsSet = true;
    } 
    
}

int32_t CreateChatCompletionResponse_choices_inner::getIndex() const
{
    return m_Index;
}
void CreateChatCompletionResponse_choices_inner::setIndex(int32_t const value)
{
    m_Index = value;
    m_IndexIsSet = true;
}
bool CreateChatCompletionResponse_choices_inner::indexIsSet() const
{
    return m_IndexIsSet;
}
void CreateChatCompletionResponse_choices_inner::unsetIndex()
{
    m_IndexIsSet = false;
}
org::openapitools::server::model::ChatCompletionResponseMessage CreateChatCompletionResponse_choices_inner::getMessage() const
{
    return m_Message;
}
void CreateChatCompletionResponse_choices_inner::setMessage(org::openapitools::server::model::ChatCompletionResponseMessage const& value)
{
    m_Message = value;
    m_MessageIsSet = true;
}
bool CreateChatCompletionResponse_choices_inner::messageIsSet() const
{
    return m_MessageIsSet;
}
void CreateChatCompletionResponse_choices_inner::unsetMessage()
{
    m_MessageIsSet = false;
}
std::string CreateChatCompletionResponse_choices_inner::getFinishReason() const
{
    return m_Finish_reason;
}
void CreateChatCompletionResponse_choices_inner::setFinishReason(std::string const& value)
{
    m_Finish_reason = value;
    m_Finish_reasonIsSet = true;
}
bool CreateChatCompletionResponse_choices_inner::finishReasonIsSet() const
{
    return m_Finish_reasonIsSet;
}
void CreateChatCompletionResponse_choices_inner::unsetFinish_reason()
{
    m_Finish_reasonIsSet = false;
}


} // namespace org::openapitools::server::model

