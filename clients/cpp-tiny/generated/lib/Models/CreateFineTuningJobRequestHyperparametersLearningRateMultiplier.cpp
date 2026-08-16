

#include "CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier.h"

using namespace Tiny;

CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier::CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier()
{
}

CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier::CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier::~CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier()
{

}

void
CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



