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


#include "CreateCompletionRequest_prompt.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CreateCompletionRequest_prompt::CreateCompletionRequest_prompt()
{
    
}

void CreateCompletionRequest_prompt::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CreateCompletionRequest_prompt::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CreateCompletionRequest_prompt::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CreateCompletionRequest_prompt" : pathPrefix;

    
    return success;
}

bool CreateCompletionRequest_prompt::operator==(const CreateCompletionRequest_prompt& rhs) const
{
    return
    
    
    ;
}

bool CreateCompletionRequest_prompt::operator!=(const CreateCompletionRequest_prompt& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CreateCompletionRequest_prompt& o)
{
    j = nlohmann::json::object();
    
}

void from_json(const nlohmann::json& j, CreateCompletionRequest_prompt& o)
{
    
}



} // namespace org::openapitools::server::model

