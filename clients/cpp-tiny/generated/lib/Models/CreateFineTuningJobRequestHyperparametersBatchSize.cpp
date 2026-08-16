

#include "CreateFineTuningJobRequest_hyperparameters_batch_size.h"

using namespace Tiny;

CreateFineTuningJobRequest_hyperparameters_batch_size::CreateFineTuningJobRequest_hyperparameters_batch_size()
{
}

CreateFineTuningJobRequest_hyperparameters_batch_size::CreateFineTuningJobRequest_hyperparameters_batch_size(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateFineTuningJobRequest_hyperparameters_batch_size::~CreateFineTuningJobRequest_hyperparameters_batch_size()
{

}

void
CreateFineTuningJobRequest_hyperparameters_batch_size::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CreateFineTuningJobRequest_hyperparameters_batch_size::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



