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


#include "CreateTranscriptionRequest_model.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CreateTranscriptionRequest_model::CreateTranscriptionRequest_model()
{
    
}

void CreateTranscriptionRequest_model::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CreateTranscriptionRequest_model::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CreateTranscriptionRequest_model::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CreateTranscriptionRequest_model" : pathPrefix;

    
    return success;
}

bool CreateTranscriptionRequest_model::operator==(const CreateTranscriptionRequest_model& rhs) const
{
    return
    
    
    ;
}

bool CreateTranscriptionRequest_model::operator!=(const CreateTranscriptionRequest_model& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CreateTranscriptionRequest_model& o)
{
    j = nlohmann::json::object();
    
}

void from_json(const nlohmann::json& j, CreateTranscriptionRequest_model& o)
{
    
}



} // namespace org::openapitools::server::model

