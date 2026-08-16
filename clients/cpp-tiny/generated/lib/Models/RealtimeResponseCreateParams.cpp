

#include "RealtimeResponseCreateParams.h"

using namespace Tiny;

RealtimeResponseCreateParams::RealtimeResponseCreateParams()
{
	modalities = std::list<std::string>();
	instructions = std::string();
	voice = std::string();
	output_audio_format = std::string();
	tools = std::list<RealtimeResponseCreateParams_tools_inner>();
	tool_choice = std::string();
	temperature = float(0);
	max_response_output_tokens = RealtimeResponseCreateParams_max_response_output_tokens();
	conversation = RealtimeResponseCreateParams_conversation();
	metadata = null;
	input = std::list<RealtimeConversationItem>();
}

RealtimeResponseCreateParams::RealtimeResponseCreateParams(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeResponseCreateParams::~RealtimeResponseCreateParams()
{

}

void
RealtimeResponseCreateParams::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *modalitiesKey = "modalities";

    if(object.has_key(modalitiesKey))
    {
        bourne::json value = object[modalitiesKey];


        std::list<std::string> modalities_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            modalities_list.push_back(element);
        }
        modalities = modalities_list;


    }

    const char *instructionsKey = "instructions";

    if(object.has_key(instructionsKey))
    {
        bourne::json value = object[instructionsKey];



        jsonToValue(&instructions, value, "std::string");


    }

    const char *voiceKey = "voice";

    if(object.has_key(voiceKey))
    {
        bourne::json value = object[voiceKey];



        jsonToValue(&voice, value, "std::string");


    }

    const char *output_audio_formatKey = "output_audio_format";

    if(object.has_key(output_audio_formatKey))
    {
        bourne::json value = object[output_audio_formatKey];



        jsonToValue(&output_audio_format, value, "std::string");


    }

    const char *toolsKey = "tools";

    if(object.has_key(toolsKey))
    {
        bourne::json value = object[toolsKey];


        std::list<RealtimeResponseCreateParams_tools_inner> tools_list;
        RealtimeResponseCreateParams_tools_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            tools_list.push_back(element);
        }
        tools = tools_list;


    }

    const char *tool_choiceKey = "tool_choice";

    if(object.has_key(tool_choiceKey))
    {
        bourne::json value = object[tool_choiceKey];



        jsonToValue(&tool_choice, value, "std::string");


    }

    const char *temperatureKey = "temperature";

    if(object.has_key(temperatureKey))
    {
        bourne::json value = object[temperatureKey];



        jsonToValue(&temperature, value, "long");


    }

    const char *max_response_output_tokensKey = "max_response_output_tokens";

    if(object.has_key(max_response_output_tokensKey))
    {
        bourne::json value = object[max_response_output_tokensKey];




        RealtimeResponseCreateParams_max_response_output_tokens* obj = &max_response_output_tokens;
		obj->fromJson(value.dump());

    }

    const char *conversationKey = "conversation";

    if(object.has_key(conversationKey))
    {
        bourne::json value = object[conversationKey];




        RealtimeResponseCreateParams_conversation* obj = &conversation;
		obj->fromJson(value.dump());

    }

    const char *metadataKey = "metadata";

    if(object.has_key(metadataKey))
    {
        bourne::json value = object[metadataKey];




        Object* obj = &metadata;
		obj->fromJson(value.dump());

    }

    const char *inputKey = "input";

    if(object.has_key(inputKey))
    {
        bourne::json value = object[inputKey];


        std::list<RealtimeConversationItem> input_list;
        RealtimeConversationItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            input_list.push_back(element);
        }
        input = input_list;


    }


}

bourne::json
RealtimeResponseCreateParams::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> modalities_list = getModalities();
    bourne::json modalities_arr = bourne::json::array();

    for(auto& var : modalities_list)
    {
        modalities_arr.append(var);
    }
    object["modalities"] = modalities_arr;









    object["instructions"] = getInstructions();






    object["voice"] = getVoice();






    object["output_audio_format"] = getOutputAudioFormat();





    std::list<RealtimeResponseCreateParams_tools_inner> tools_list = getTools();
    bourne::json tools_arr = bourne::json::array();

    for(auto& var : tools_list)
    {
        RealtimeResponseCreateParams_tools_inner obj = var;
        tools_arr.append(obj.toJson());
    }
    object["tools"] = tools_arr;







    object["tool_choice"] = getToolChoice();






    object["temperature"] = getTemperature();







	object["max_response_output_tokens"] = getMaxResponseOutputTokens().toJson();






	object["conversation"] = getConversation().toJson();






	object["metadata"] = getMetadata().toJson();




    std::list<RealtimeConversationItem> input_list = getInput();
    bourne::json input_arr = bourne::json::array();

    for(auto& var : input_list)
    {
        RealtimeConversationItem obj = var;
        input_arr.append(obj.toJson());
    }
    object["input"] = input_arr;




    return object;

}

std::list<std::string>
RealtimeResponseCreateParams::getModalities()
{
	return modalities;
}

void
RealtimeResponseCreateParams::setModalities(std::list <std::string> modalities)
{
	this->modalities = modalities;
}

std::string
RealtimeResponseCreateParams::getInstructions()
{
	return instructions;
}

void
RealtimeResponseCreateParams::setInstructions(std::string  instructions)
{
	this->instructions = instructions;
}

std::string
RealtimeResponseCreateParams::getVoice()
{
	return voice;
}

void
RealtimeResponseCreateParams::setVoice(std::string  voice)
{
	this->voice = voice;
}

std::string
RealtimeResponseCreateParams::getOutputAudioFormat()
{
	return output_audio_format;
}

void
RealtimeResponseCreateParams::setOutputAudioFormat(std::string  output_audio_format)
{
	this->output_audio_format = output_audio_format;
}

std::list<RealtimeResponseCreateParams_tools_inner>
RealtimeResponseCreateParams::getTools()
{
	return tools;
}

void
RealtimeResponseCreateParams::setTools(std::list <RealtimeResponseCreateParams_tools_inner> tools)
{
	this->tools = tools;
}

std::string
RealtimeResponseCreateParams::getToolChoice()
{
	return tool_choice;
}

void
RealtimeResponseCreateParams::setToolChoice(std::string  tool_choice)
{
	this->tool_choice = tool_choice;
}

long
RealtimeResponseCreateParams::getTemperature()
{
	return temperature;
}

void
RealtimeResponseCreateParams::setTemperature(long  temperature)
{
	this->temperature = temperature;
}

RealtimeResponseCreateParams_max_response_output_tokens
RealtimeResponseCreateParams::getMaxResponseOutputTokens()
{
	return max_response_output_tokens;
}

void
RealtimeResponseCreateParams::setMaxResponseOutputTokens(RealtimeResponseCreateParams_max_response_output_tokens  max_response_output_tokens)
{
	this->max_response_output_tokens = max_response_output_tokens;
}

RealtimeResponseCreateParams_conversation
RealtimeResponseCreateParams::getConversation()
{
	return conversation;
}

void
RealtimeResponseCreateParams::setConversation(RealtimeResponseCreateParams_conversation  conversation)
{
	this->conversation = conversation;
}

Object
RealtimeResponseCreateParams::getMetadata()
{
	return metadata;
}

void
RealtimeResponseCreateParams::setMetadata(Object  metadata)
{
	this->metadata = metadata;
}

std::list<RealtimeConversationItem>
RealtimeResponseCreateParams::getInput()
{
	return input;
}

void
RealtimeResponseCreateParams::setInput(std::list <RealtimeConversationItem> input)
{
	this->input = input;
}



