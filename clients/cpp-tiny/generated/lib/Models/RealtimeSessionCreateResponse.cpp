

#include "RealtimeSessionCreateResponse.h"

using namespace Tiny;

RealtimeSessionCreateResponse::RealtimeSessionCreateResponse()
{
	client_secret = RealtimeSessionCreateResponse_client_secret();
	modalities = std::list<std::string>();
	instructions = std::string();
	voice = std::string();
	input_audio_format = std::string();
	output_audio_format = std::string();
	input_audio_transcription = RealtimeSession_input_audio_transcription();
	turn_detection = RealtimeSessionCreateResponse_turn_detection();
	tools = std::list<RealtimeResponseCreateParams_tools_inner>();
	tool_choice = std::string();
	temperature = float(0);
	max_response_output_tokens = RealtimeResponseCreateParams_max_response_output_tokens();
}

RealtimeSessionCreateResponse::RealtimeSessionCreateResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeSessionCreateResponse::~RealtimeSessionCreateResponse()
{

}

void
RealtimeSessionCreateResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *client_secretKey = "client_secret";

    if(object.has_key(client_secretKey))
    {
        bourne::json value = object[client_secretKey];




        RealtimeSessionCreateResponse_client_secret* obj = &client_secret;
		obj->fromJson(value.dump());

    }

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

    const char *input_audio_formatKey = "input_audio_format";

    if(object.has_key(input_audio_formatKey))
    {
        bourne::json value = object[input_audio_formatKey];



        jsonToValue(&input_audio_format, value, "std::string");


    }

    const char *output_audio_formatKey = "output_audio_format";

    if(object.has_key(output_audio_formatKey))
    {
        bourne::json value = object[output_audio_formatKey];



        jsonToValue(&output_audio_format, value, "std::string");


    }

    const char *input_audio_transcriptionKey = "input_audio_transcription";

    if(object.has_key(input_audio_transcriptionKey))
    {
        bourne::json value = object[input_audio_transcriptionKey];




        RealtimeSession_input_audio_transcription* obj = &input_audio_transcription;
		obj->fromJson(value.dump());

    }

    const char *turn_detectionKey = "turn_detection";

    if(object.has_key(turn_detectionKey))
    {
        bourne::json value = object[turn_detectionKey];




        RealtimeSessionCreateResponse_turn_detection* obj = &turn_detection;
		obj->fromJson(value.dump());

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


}

bourne::json
RealtimeSessionCreateResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["client_secret"] = getClientSecret().toJson();




    std::list<std::string> modalities_list = getModalities();
    bourne::json modalities_arr = bourne::json::array();

    for(auto& var : modalities_list)
    {
        modalities_arr.append(var);
    }
    object["modalities"] = modalities_arr;









    object["instructions"] = getInstructions();






    object["voice"] = getVoice();






    object["input_audio_format"] = getInputAudioFormat();






    object["output_audio_format"] = getOutputAudioFormat();







	object["input_audio_transcription"] = getInputAudioTranscription().toJson();






	object["turn_detection"] = getTurnDetection().toJson();




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


    return object;

}

RealtimeSessionCreateResponse_client_secret
RealtimeSessionCreateResponse::getClientSecret()
{
	return client_secret;
}

void
RealtimeSessionCreateResponse::setClientSecret(RealtimeSessionCreateResponse_client_secret  client_secret)
{
	this->client_secret = client_secret;
}

std::list<std::string>
RealtimeSessionCreateResponse::getModalities()
{
	return modalities;
}

void
RealtimeSessionCreateResponse::setModalities(std::list <std::string> modalities)
{
	this->modalities = modalities;
}

std::string
RealtimeSessionCreateResponse::getInstructions()
{
	return instructions;
}

void
RealtimeSessionCreateResponse::setInstructions(std::string  instructions)
{
	this->instructions = instructions;
}

std::string
RealtimeSessionCreateResponse::getVoice()
{
	return voice;
}

void
RealtimeSessionCreateResponse::setVoice(std::string  voice)
{
	this->voice = voice;
}

std::string
RealtimeSessionCreateResponse::getInputAudioFormat()
{
	return input_audio_format;
}

void
RealtimeSessionCreateResponse::setInputAudioFormat(std::string  input_audio_format)
{
	this->input_audio_format = input_audio_format;
}

std::string
RealtimeSessionCreateResponse::getOutputAudioFormat()
{
	return output_audio_format;
}

void
RealtimeSessionCreateResponse::setOutputAudioFormat(std::string  output_audio_format)
{
	this->output_audio_format = output_audio_format;
}

RealtimeSession_input_audio_transcription
RealtimeSessionCreateResponse::getInputAudioTranscription()
{
	return input_audio_transcription;
}

void
RealtimeSessionCreateResponse::setInputAudioTranscription(RealtimeSession_input_audio_transcription  input_audio_transcription)
{
	this->input_audio_transcription = input_audio_transcription;
}

RealtimeSessionCreateResponse_turn_detection
RealtimeSessionCreateResponse::getTurnDetection()
{
	return turn_detection;
}

void
RealtimeSessionCreateResponse::setTurnDetection(RealtimeSessionCreateResponse_turn_detection  turn_detection)
{
	this->turn_detection = turn_detection;
}

std::list<RealtimeResponseCreateParams_tools_inner>
RealtimeSessionCreateResponse::getTools()
{
	return tools;
}

void
RealtimeSessionCreateResponse::setTools(std::list <RealtimeResponseCreateParams_tools_inner> tools)
{
	this->tools = tools;
}

std::string
RealtimeSessionCreateResponse::getToolChoice()
{
	return tool_choice;
}

void
RealtimeSessionCreateResponse::setToolChoice(std::string  tool_choice)
{
	this->tool_choice = tool_choice;
}

long
RealtimeSessionCreateResponse::getTemperature()
{
	return temperature;
}

void
RealtimeSessionCreateResponse::setTemperature(long  temperature)
{
	this->temperature = temperature;
}

RealtimeResponseCreateParams_max_response_output_tokens
RealtimeSessionCreateResponse::getMaxResponseOutputTokens()
{
	return max_response_output_tokens;
}

void
RealtimeSessionCreateResponse::setMaxResponseOutputTokens(RealtimeResponseCreateParams_max_response_output_tokens  max_response_output_tokens)
{
	this->max_response_output_tokens = max_response_output_tokens;
}



