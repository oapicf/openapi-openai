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


#include "TranscriptionSegment.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

TranscriptionSegment::TranscriptionSegment()
{
    m_Id = 0;
    m_Seek = 0;
    m_Start = 0.0f;
    m_End = 0.0f;
    m_Text = "";
    m_Temperature = 0.0f;
    m_Avg_logprob = 0.0f;
    m_Compression_ratio = 0.0f;
    m_No_speech_prob = 0.0f;
    
}

void TranscriptionSegment::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool TranscriptionSegment::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool TranscriptionSegment::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "TranscriptionSegment" : pathPrefix;

                             
    
    /* Tokens */ {
        const std::vector<int32_t>& value = m_Tokens;
        const std::string currentValuePath = _pathPrefix + ".tokens";
                
        
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

bool TranscriptionSegment::operator==(const TranscriptionSegment& rhs) const
{
    return
    
    
    (getId() == rhs.getId())
     &&
    
    (getSeek() == rhs.getSeek())
     &&
    
    (getStart() == rhs.getStart())
     &&
    
    (getEnd() == rhs.getEnd())
     &&
    
    (getText() == rhs.getText())
     &&
    
    (getTokens() == rhs.getTokens())
     &&
    
    (getTemperature() == rhs.getTemperature())
     &&
    
    (getAvgLogprob() == rhs.getAvgLogprob())
     &&
    
    (getCompressionRatio() == rhs.getCompressionRatio())
     &&
    
    (getNoSpeechProb() == rhs.getNoSpeechProb())
    
    
    ;
}

bool TranscriptionSegment::operator!=(const TranscriptionSegment& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const TranscriptionSegment& o)
{
    j = nlohmann::json::object();
    j["id"] = o.m_Id;
    j["seek"] = o.m_Seek;
    j["start"] = o.m_Start;
    j["end"] = o.m_End;
    j["text"] = o.m_Text;
    j["tokens"] = o.m_Tokens;
    j["temperature"] = o.m_Temperature;
    j["avg_logprob"] = o.m_Avg_logprob;
    j["compression_ratio"] = o.m_Compression_ratio;
    j["no_speech_prob"] = o.m_No_speech_prob;
    
}

void from_json(const nlohmann::json& j, TranscriptionSegment& o)
{
    j.at("id").get_to(o.m_Id);
    j.at("seek").get_to(o.m_Seek);
    j.at("start").get_to(o.m_Start);
    j.at("end").get_to(o.m_End);
    j.at("text").get_to(o.m_Text);
    j.at("tokens").get_to(o.m_Tokens);
    j.at("temperature").get_to(o.m_Temperature);
    j.at("avg_logprob").get_to(o.m_Avg_logprob);
    j.at("compression_ratio").get_to(o.m_Compression_ratio);
    j.at("no_speech_prob").get_to(o.m_No_speech_prob);
    
}

int32_t TranscriptionSegment::getId() const
{
    return m_Id;
}
void TranscriptionSegment::setId(int32_t const value)
{
    m_Id = value;
}
int32_t TranscriptionSegment::getSeek() const
{
    return m_Seek;
}
void TranscriptionSegment::setSeek(int32_t const value)
{
    m_Seek = value;
}
float TranscriptionSegment::getStart() const
{
    return m_Start;
}
void TranscriptionSegment::setStart(float const value)
{
    m_Start = value;
}
float TranscriptionSegment::getEnd() const
{
    return m_End;
}
void TranscriptionSegment::setEnd(float const value)
{
    m_End = value;
}
std::string TranscriptionSegment::getText() const
{
    return m_Text;
}
void TranscriptionSegment::setText(std::string const& value)
{
    m_Text = value;
}
std::vector<int32_t> TranscriptionSegment::getTokens() const
{
    return m_Tokens;
}
void TranscriptionSegment::setTokens(std::vector<int32_t> const value)
{
    m_Tokens = value;
}
float TranscriptionSegment::getTemperature() const
{
    return m_Temperature;
}
void TranscriptionSegment::setTemperature(float const value)
{
    m_Temperature = value;
}
float TranscriptionSegment::getAvgLogprob() const
{
    return m_Avg_logprob;
}
void TranscriptionSegment::setAvgLogprob(float const value)
{
    m_Avg_logprob = value;
}
float TranscriptionSegment::getCompressionRatio() const
{
    return m_Compression_ratio;
}
void TranscriptionSegment::setCompressionRatio(float const value)
{
    m_Compression_ratio = value;
}
float TranscriptionSegment::getNoSpeechProb() const
{
    return m_No_speech_prob;
}
void TranscriptionSegment::setNoSpeechProb(float const value)
{
    m_No_speech_prob = value;
}


} // namespace org::openapitools::server::model

