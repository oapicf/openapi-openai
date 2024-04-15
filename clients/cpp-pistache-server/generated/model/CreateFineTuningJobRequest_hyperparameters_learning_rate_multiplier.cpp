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


#include "CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier::CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier()
{
    
}

void CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier" : pathPrefix;

    
    return success;
}

bool CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier::operator==(const CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier& rhs) const
{
    return
    
    
    ;
}

bool CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier::operator!=(const CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier& o)
{
    j = nlohmann::json::object();
    
}

void from_json(const nlohmann::json& j, CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier& o)
{
    
}



} // namespace org::openapitools::server::model
