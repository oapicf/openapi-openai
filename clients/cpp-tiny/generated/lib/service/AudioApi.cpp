#include "AudioApi.h"

using namespace Tiny;



        Response<
            std::string
        >
        AudioApi::
        createSpeech(
            
            CreateSpeechRequest createSpeechRequest
            
        )
        {
            std::string url = basepath + "/audio/speech"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | createSpeechRequest



            payload = createSpeechRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            bourne::json jsonPayload(output_string);
            std::string obj;
            jsonToValue(&obj, jsonPayload, "std::string");



            Response<std::string> response(obj, httpCode);
            return response;
        }

        Response<
            CreateTranscription_200_response
        >
        AudioApi::
        createTranscription(
            
            std::string file
            , 
            
            CreateTranscriptionRequest_model model
            , 
            
            std::string language
            , 
            
            std::string prompt
            , 
            
            AudioResponseFormat responseFormat
            , 
            
            long temperature
            , 
            std::list<std::string> timestampGranularitiesLeft_Square_BracketRight_Square_Bracket
            
            
        )
        {
            std::string url = basepath + "/audio/transcriptions"; //


            // Headers  | 

            // Query    | 

            // Form     | file model language prompt responseFormat temperature timestampGranularitiesLeft_Square_BracketRight_Square_Bracket 
            addHeader("Content-Type", "application/x-www-form-urlencoded");

            addFormParam("file",file);
            addFormParam("model",model);
            addFormParam("language",language);
            addFormParam("prompt",prompt);
            addFormParam("response_format",responseFormat);
            addFormParam("temperature",temperature);
            for (auto &x : timestampGranularitiesLeft_Square_BracketRight_Square_Bracket){
                addFormParam("timestamp_granularities[]", std::string(x));
            }




            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CreateTranscription_200_response obj(output_string);


            Response<CreateTranscription_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            CreateTranslation_200_response
        >
        AudioApi::
        createTranslation(
            
            std::string file
            , 
            
            CreateTranscriptionRequest_model model
            , 
            
            std::string prompt
            , 
            
            AudioResponseFormat responseFormat
            , 
            
            long temperature
            
        )
        {
            std::string url = basepath + "/audio/translations"; //


            // Headers  | 

            // Query    | 

            // Form     | file model prompt responseFormat temperature 
            addHeader("Content-Type", "application/x-www-form-urlencoded");

            addFormParam("file",file);
            addFormParam("model",model);
            addFormParam("prompt",prompt);
            addFormParam("response_format",responseFormat);
            addFormParam("temperature",temperature);




            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CreateTranslation_200_response obj(output_string);


            Response<CreateTranslation_200_response> response(obj, httpCode);
            return response;
        }



