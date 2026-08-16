

#include "CreateCompletionRequest_prompt.h"

using namespace Tiny;

CreateCompletionRequest_prompt::CreateCompletionRequest_prompt()
{
}

CreateCompletionRequest_prompt::CreateCompletionRequest_prompt(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateCompletionRequest_prompt::~CreateCompletionRequest_prompt()
{

}

void
CreateCompletionRequest_prompt::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CreateCompletionRequest_prompt::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



