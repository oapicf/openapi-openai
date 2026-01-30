/*
 * RealtimeResponseCreateParams.h
 *
 * Create a new Realtime response with these parameters
 */

#ifndef _RealtimeResponseCreateParams_H_
#define _RealtimeResponseCreateParams_H_


#include <string>
#include "RealtimeConversationItem.h"
#include "RealtimeResponseCreateParams_conversation.h"
#include "RealtimeResponseCreateParams_max_response_output_tokens.h"
#include "RealtimeResponseCreateParams_tools_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Create a new Realtime response with these parameters
 *
 *  \ingroup Models
 *
 */

class RealtimeResponseCreateParams : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeResponseCreateParams();
	RealtimeResponseCreateParams(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeResponseCreateParams();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	/*! \brief Get The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
	 */
	std::string getOutputAudioFormat();

	/*! \brief Set The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
	 */
	void setOutputAudioFormat(std::string  output_audio_format);
	/*! \brief Get Tools (functions) available to the model.
	 */
	std::list<RealtimeResponseCreateParams_tools_inner> getTools();

	/*! \brief Set Tools (functions) available to the model.
	 */
	void setTools(std::list <RealtimeResponseCreateParams_tools_inner> tools);
	/*! \brief Get How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`. 
	 */
	std::string getToolChoice();

	/*! \brief Set How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`. 
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
	/*! \brief Get 
	 */
	RealtimeResponseCreateParams_conversation getConversation();

	/*! \brief Set 
	 */
	void setConversation(RealtimeResponseCreateParams_conversation  conversation);
	/*! \brief Get Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	std::string getMetadata();

	/*! \brief Set Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	void setMetadata(std::string  metadata);
	/*! \brief Get Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. 
	 */
	std::list<RealtimeConversationItem> getInput();

	/*! \brief Set Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. 
	 */
	void setInput(std::list <RealtimeConversationItem> input);

private:
	std::list <std::string>modalities;
	std::string instructions;
	std::string voice;
	std::string output_audio_format;
	std::list <RealtimeResponseCreateParams_tools_inner>tools;
	std::string tool_choice;
	long long temperature;
	RealtimeResponseCreateParams_max_response_output_tokens max_response_output_tokens;
	RealtimeResponseCreateParams_conversation conversation;
	std::string metadata;
	std::list <RealtimeConversationItem>input;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeResponseCreateParams_H_ */
