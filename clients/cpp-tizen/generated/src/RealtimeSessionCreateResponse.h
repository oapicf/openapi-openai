/*
 * RealtimeSessionCreateResponse.h
 *
 * A new Realtime session configuration, with an ephermeral key. Default TTL for keys is one minute. 
 */

#ifndef _RealtimeSessionCreateResponse_H_
#define _RealtimeSessionCreateResponse_H_


#include <string>
#include "RealtimeResponseCreateParams_max_response_output_tokens.h"
#include "RealtimeResponseCreateParams_tools_inner.h"
#include "RealtimeSessionCreateResponse_client_secret.h"
#include "RealtimeSessionCreateResponse_turn_detection.h"
#include "RealtimeSession_input_audio_transcription.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A new Realtime session configuration, with an ephermeral key. Default TTL for keys is one minute. 
 *
 *  \ingroup Models
 *
 */

class RealtimeSessionCreateResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeSessionCreateResponse();
	RealtimeSessionCreateResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeSessionCreateResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	RealtimeSessionCreateResponse_client_secret getClientSecret();

	/*! \brief Set 
	 */
	void setClientSecret(RealtimeSessionCreateResponse_client_secret  client_secret);
	/*! \brief Get The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
	 */
	std::list<std::string> getModalities();

	/*! \brief Set The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
	 */
	void setModalities(std::list <std::string> modalities);
	/*! \brief Get The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
	 */
	std::string getInstructions();

	/*! \brief Set The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
	 */
	void setInstructions(std::string  instructions);
	/*! \brief Get The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
	 */
	std::string getVoice();

	/*! \brief Set The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
	 */
	void setVoice(std::string  voice);
	/*! \brief Get The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
	 */
	std::string getInputAudioFormat();

	/*! \brief Set The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
	 */
	void setInputAudioFormat(std::string  input_audio_format);
	/*! \brief Get The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
	 */
	std::string getOutputAudioFormat();

	/*! \brief Set The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
	 */
	void setOutputAudioFormat(std::string  output_audio_format);
	/*! \brief Get 
	 */
	RealtimeSession_input_audio_transcription getInputAudioTranscription();

	/*! \brief Set 
	 */
	void setInputAudioTranscription(RealtimeSession_input_audio_transcription  input_audio_transcription);
	/*! \brief Get 
	 */
	RealtimeSessionCreateResponse_turn_detection getTurnDetection();

	/*! \brief Set 
	 */
	void setTurnDetection(RealtimeSessionCreateResponse_turn_detection  turn_detection);
	/*! \brief Get Tools (functions) available to the model.
	 */
	std::list<RealtimeResponseCreateParams_tools_inner> getTools();

	/*! \brief Set Tools (functions) available to the model.
	 */
	void setTools(std::list <RealtimeResponseCreateParams_tools_inner> tools);
	/*! \brief Get How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
	 */
	std::string getToolChoice();

	/*! \brief Set How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
	 */
	void setToolChoice(std::string  tool_choice);
	/*! \brief Get Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
	 */
	long long getTemperature();

	/*! \brief Set Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
	 */
	void setTemperature(long long  temperature);
	/*! \brief Get 
	 */
	RealtimeResponseCreateParams_max_response_output_tokens getMaxResponseOutputTokens();

	/*! \brief Set 
	 */
	void setMaxResponseOutputTokens(RealtimeResponseCreateParams_max_response_output_tokens  max_response_output_tokens);

private:
	RealtimeSessionCreateResponse_client_secret client_secret;
	std::list <std::string>modalities;
	std::string instructions;
	std::string voice;
	std::string input_audio_format;
	std::string output_audio_format;
	RealtimeSession_input_audio_transcription input_audio_transcription;
	RealtimeSessionCreateResponse_turn_detection turn_detection;
	std::list <RealtimeResponseCreateParams_tools_inner>tools;
	std::string tool_choice;
	long long temperature;
	RealtimeResponseCreateParams_max_response_output_tokens max_response_output_tokens;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeSessionCreateResponse_H_ */
