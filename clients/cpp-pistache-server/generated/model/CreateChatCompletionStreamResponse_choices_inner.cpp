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


#include "CreateChatCompletionStreamResponse_choices_inner.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CreateChatCompletionStreamResponse_choices_inner::CreateChatCompletionStreamResponse_choices_inner()
{
    m_Index = 0;
    m_IndexIsSet = false;
    m_DeltaIsSet = false;
    m_Finish_reason = "";
    m_Finish_reasonIsSet = false;
    
}

void CreateChatCompletionStreamResponse_choices_inner::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CreateChatCompletionStreamResponse_choices_inner::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CreateChatCompletionStreamResponse_choices_inner::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CreateChatCompletionStreamResponse_choices_inner" : pathPrefix;

                
    return success;
}

bool CreateChatCompletionStreamResponse_choices_inner::operator==(const CreateChatCompletionStreamResponse_choices_inner& rhs) const
{
    return
    
    
    
    ((!indexIsSet() && !rhs.indexIsSet()) || (indexIsSet() && rhs.indexIsSet() && getIndex() == rhs.getIndex())) &&
    
    
    ((!deltaIsSet() && !rhs.deltaIsSet()) || (deltaIsSet() && rhs.deltaIsSet() && getDelta() == rhs.getDelta())) &&
    
    
    ((!finishReasonIsSet() && !rhs.finishReasonIsSet()) || (finishReasonIsSet() && rhs.finishReasonIsSet() && getFinishReason() == rhs.getFinishReason()))
    
    ;
}

bool CreateChatCompletionStreamResponse_choices_inner::operator!=(const CreateChatCompletionStreamResponse_choices_inner& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CreateChatCompletionStreamResponse_choices_inner& o)
{
    j = nlohmann::json::object();
    if(o.indexIsSet())
        j["index"] = o.m_Index;
    if(o.deltaIsSet())
        j["delta"] = o.m_Delta;
    if(o.finishReasonIsSet())
        j["finish_reason"] = o.m_Finish_reason;
    
}

void from_json(const nlohmann::json& j, CreateChatCompletionStreamResponse_choices_inner& o)
{
    if(j.find("index") != j.end())
    {
        j.at("index").get_to(o.m_Index);
        o.m_IndexIsSet = true;
    } 
    if(j.find("delta") != j.end())
    {
        j.at("delta").get_to(o.m_Delta);
        o.m_DeltaIsSet = true;
    } 
    if(j.find("finish_reason") != j.end())
    {
        j.at("finish_reason").get_to(o.m_Finish_reason);
        o.m_Finish_reasonIsSet = true;
    } 
    
}

int32_t CreateChatCompletionStreamResponse_choices_inner::getIndex() const
{
    return m_Index;
}
void CreateChatCompletionStreamResponse_choices_inner::setIndex(int32_t const value)
{
    m_Index = value;
    m_IndexIsSet = true;
}
bool CreateChatCompletionStreamResponse_choices_inner::indexIsSet() const
{
    return m_IndexIsSet;
}
void CreateChatCompletionStreamResponse_choices_inner::unsetIndex()
{
    m_IndexIsSet = false;
}
org::openapitools::server::model::ChatCompletionStreamResponseDelta CreateChatCompletionStreamResponse_choices_inner::getDelta() const
{
    return m_Delta;
}
void CreateChatCompletionStreamResponse_choices_inner::setDelta(org::openapitools::server::model::ChatCompletionStreamResponseDelta const& value)
{
    m_Delta = value;
    m_DeltaIsSet = true;
}
bool CreateChatCompletionStreamResponse_choices_inner::deltaIsSet() const
{
    return m_DeltaIsSet;
}
void CreateChatCompletionStreamResponse_choices_inner::unsetDelta()
{
    m_DeltaIsSet = false;
}
std::string CreateChatCompletionStreamResponse_choices_inner::getFinishReason() const
{
    return m_Finish_reason;
}
void CreateChatCompletionStreamResponse_choices_inner::setFinishReason(std::string const& value)
{
    m_Finish_reason = value;
    m_Finish_reasonIsSet = true;
}
bool CreateChatCompletionStreamResponse_choices_inner::finishReasonIsSet() const
{
    return m_Finish_reasonIsSet;
}
void CreateChatCompletionStreamResponse_choices_inner::unsetFinish_reason()
{
    m_Finish_reasonIsSet = false;
}


} // namespace org::openapitools::server::model
