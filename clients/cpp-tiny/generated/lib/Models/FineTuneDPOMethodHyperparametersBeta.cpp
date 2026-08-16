

#include "FineTuneDPOMethod_hyperparameters_beta.h"

using namespace Tiny;

FineTuneDPOMethod_hyperparameters_beta::FineTuneDPOMethod_hyperparameters_beta()
{
}

FineTuneDPOMethod_hyperparameters_beta::FineTuneDPOMethod_hyperparameters_beta(std::string jsonString)
{
	this->fromJson(jsonString);
}

FineTuneDPOMethod_hyperparameters_beta::~FineTuneDPOMethod_hyperparameters_beta()
{

}

void
FineTuneDPOMethod_hyperparameters_beta::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
FineTuneDPOMethod_hyperparameters_beta::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



