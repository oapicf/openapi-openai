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


#include "Embedding.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

Embedding::Embedding()
{
    m_Index = 0;
    m_object = "";
    
}

void Embedding::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool Embedding::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool Embedding::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "Embedding" : pathPrefix;

             
    
    /* Embedding */ {
        const std::vector<double>& value = m_Embedding;
        const std::string currentValuePath = _pathPrefix + ".embedding";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const double& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
        
    return success;
}

bool Embedding::operator==(const Embedding& rhs) const
{
    return
    
    
    (getIndex() == rhs.getIndex())
     &&
    
    (getEmbedding() == rhs.getEmbedding())
     &&
    
    (getObject() == rhs.getObject())
    
    
    ;
}

bool Embedding::operator!=(const Embedding& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const Embedding& o)
{
    j = nlohmann::json::object();
    j["index"] = o.m_Index;
    j["embedding"] = o.m_Embedding;
    j["object"] = o.m_object;
    
}

void from_json(const nlohmann::json& j, Embedding& o)
{
    j.at("index").get_to(o.m_Index);
    j.at("embedding").get_to(o.m_Embedding);
    j.at("object").get_to(o.m_object);
    
}

int32_t Embedding::getIndex() const
{
    return m_Index;
}
void Embedding::setIndex(int32_t const value)
{
    m_Index = value;
}
std::vector<double> Embedding::getEmbedding() const
{
    return m_Embedding;
}
void Embedding::setEmbedding(std::vector<double> const value)
{
    m_Embedding = value;
}
std::string Embedding::getObject() const
{
    return m_object;
}
void Embedding::setObject(std::string const& value)
{
    m_object = value;
}


} // namespace org::openapitools::server::model

