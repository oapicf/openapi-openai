

#include "RealtimeResponse_usage.h"

using namespace Tiny;

RealtimeResponse_usage::RealtimeResponse_usage()
{
	total_tokens = int(0);
	input_tokens = int(0);
	output_tokens = int(0);
	input_token_details = RealtimeResponse_usage_input_token_details();
	output_token_details = RealtimeResponse_usage_output_token_details();
}

RealtimeResponse_usage::RealtimeResponse_usage(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeResponse_usage::~RealtimeResponse_usage()
{

}

void
RealtimeResponse_usage::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *total_tokensKey = "total_tokens";

    if(object.has_key(total_tokensKey))
    {
        bourne::json value = object[total_tokensKey];



        jsonToValue(&total_tokens, value, "int");


    }

    const char *input_tokensKey = "input_tokens";

    if(object.has_key(input_tokensKey))
    {
        bourne::json value = object[input_tokensKey];



        jsonToValue(&input_tokens, value, "int");


    }

    const char *output_tokensKey = "output_tokens";

    if(object.has_key(output_tokensKey))
    {
        bourne::json value = object[output_tokensKey];



        jsonToValue(&output_tokens, value, "int");


    }

    const char *input_token_detailsKey = "input_token_details";

    if(object.has_key(input_token_detailsKey))
    {
        bourne::json value = object[input_token_detailsKey];




        RealtimeResponse_usage_input_token_details* obj = &input_token_details;
		obj->fromJson(value.dump());

    }

    const char *output_token_detailsKey = "output_token_details";

    if(object.has_key(output_token_detailsKey))
    {
        bourne::json value = object[output_token_detailsKey];




        RealtimeResponse_usage_output_token_details* obj = &output_token_details;
		obj->fromJson(value.dump());

    }


}

bourne::json
RealtimeResponse_usage::toJson()
{
    bourne::json object = bourne::json::object();





    object["total_tokens"] = getTotalTokens();






    object["input_tokens"] = getInputTokens();






    object["output_tokens"] = getOutputTokens();







	object["input_token_details"] = getInputTokenDetails().toJson();






	object["output_token_details"] = getOutputTokenDetails().toJson();


    return object;

}

int
RealtimeResponse_usage::getTotalTokens()
{
	return total_tokens;
}

void
RealtimeResponse_usage::setTotalTokens(int  total_tokens)
{
	this->total_tokens = total_tokens;
}

int
RealtimeResponse_usage::getInputTokens()
{
	return input_tokens;
}

void
RealtimeResponse_usage::setInputTokens(int  input_tokens)
{
	this->input_tokens = input_tokens;
}

int
RealtimeResponse_usage::getOutputTokens()
{
	return output_tokens;
}

void
RealtimeResponse_usage::setOutputTokens(int  output_tokens)
{
	this->output_tokens = output_tokens;
}

RealtimeResponse_usage_input_token_details
RealtimeResponse_usage::getInputTokenDetails()
{
	return input_token_details;
}

void
RealtimeResponse_usage::setInputTokenDetails(RealtimeResponse_usage_input_token_details  input_token_details)
{
	this->input_token_details = input_token_details;
}

RealtimeResponse_usage_output_token_details
RealtimeResponse_usage::getOutputTokenDetails()
{
	return output_token_details;
}

void
RealtimeResponse_usage::setOutputTokenDetails(RealtimeResponse_usage_output_token_details  output_token_details)
{
	this->output_token_details = output_token_details;
}



