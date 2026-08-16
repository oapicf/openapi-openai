

#include "FineTuneDPOMethod_hyperparameters_batch_size.h"

using namespace Tiny;

FineTuneDPOMethod_hyperparameters_batch_size::FineTuneDPOMethod_hyperparameters_batch_size()
{
}

FineTuneDPOMethod_hyperparameters_batch_size::FineTuneDPOMethod_hyperparameters_batch_size(std::string jsonString)
{
	this->fromJson(jsonString);
}

FineTuneDPOMethod_hyperparameters_batch_size::~FineTuneDPOMethod_hyperparameters_batch_size()
{

}

void
FineTuneDPOMethod_hyperparameters_batch_size::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
FineTuneDPOMethod_hyperparameters_batch_size::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



