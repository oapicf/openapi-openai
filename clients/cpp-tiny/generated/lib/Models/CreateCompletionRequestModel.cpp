

#include "CreateCompletionRequest_model.h"

using namespace Tiny;

CreateCompletionRequest_model::CreateCompletionRequest_model()
{
}

CreateCompletionRequest_model::CreateCompletionRequest_model(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateCompletionRequest_model::~CreateCompletionRequest_model()
{

}

void
CreateCompletionRequest_model::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CreateCompletionRequest_model::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



