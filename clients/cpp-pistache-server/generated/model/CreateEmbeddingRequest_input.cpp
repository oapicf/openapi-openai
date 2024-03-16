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


#include "CreateEmbeddingRequest_input.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CreateEmbeddingRequest_input::CreateEmbeddingRequest_input()
{
    
}

void CreateEmbeddingRequest_input::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CreateEmbeddingRequest_input::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CreateEmbeddingRequest_input::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CreateEmbeddingRequest_input" : pathPrefix;

    
    return success;
}

bool CreateEmbeddingRequest_input::operator==(const CreateEmbeddingRequest_input& rhs) const
{
    return
    
    
    ;
}

bool CreateEmbeddingRequest_input::operator!=(const CreateEmbeddingRequest_input& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CreateEmbeddingRequest_input& o)
{
    j = nlohmann::json::object();
    
}

void from_json(const nlohmann::json& j, CreateEmbeddingRequest_input& o)
{
    
}



} // namespace org::openapitools::server::model

