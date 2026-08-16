

#include "CreateCompletionRequest_stop.h"

using namespace Tiny;

CreateCompletionRequest_stop::CreateCompletionRequest_stop()
{
}

CreateCompletionRequest_stop::CreateCompletionRequest_stop(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateCompletionRequest_stop::~CreateCompletionRequest_stop()
{

}

void
CreateCompletionRequest_stop::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CreateCompletionRequest_stop::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



