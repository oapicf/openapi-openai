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


#include "TranscriptionWord.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

TranscriptionWord::TranscriptionWord()
{
    m_Word = "";
    m_Start = 0.0f;
    m_End = 0.0f;
    
}

void TranscriptionWord::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool TranscriptionWord::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool TranscriptionWord::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "TranscriptionWord" : pathPrefix;

                
    return success;
}

bool TranscriptionWord::operator==(const TranscriptionWord& rhs) const
{
    return
    
    
    (getWord() == rhs.getWord())
     &&
    
    (getStart() == rhs.getStart())
     &&
    
    (getEnd() == rhs.getEnd())
    
    
    ;
}

bool TranscriptionWord::operator!=(const TranscriptionWord& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const TranscriptionWord& o)
{
    j = nlohmann::json::object();
    j["word"] = o.m_Word;
    j["start"] = o.m_Start;
    j["end"] = o.m_End;
    
}

void from_json(const nlohmann::json& j, TranscriptionWord& o)
{
    j.at("word").get_to(o.m_Word);
    j.at("start").get_to(o.m_Start);
    j.at("end").get_to(o.m_End);
    
}

std::string TranscriptionWord::getWord() const
{
    return m_Word;
}
void TranscriptionWord::setWord(std::string const& value)
{
    m_Word = value;
}
float TranscriptionWord::getStart() const
{
    return m_Start;
}
void TranscriptionWord::setStart(float const value)
{
    m_Start = value;
}
float TranscriptionWord::getEnd() const
{
    return m_End;
}
void TranscriptionWord::setEnd(float const value)
{
    m_End = value;
}


} // namespace org::openapitools::server::model
