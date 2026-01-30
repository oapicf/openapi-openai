/*
 * RealtimeSession_input_audio_transcription.h
 *
 * Configuration for input audio transcription, defaults to off and can be  set to &#x60;null&#x60; to turn off once on. Input audio transcription is not native  to the model, since the model consumes audio directly. Transcription runs  asynchronously through Whisper and should be treated as rough guidance  rather than the representation understood by the model. 
 */

#ifndef _RealtimeSession_input_audio_transcription_H_
#define _RealtimeSession_input_audio_transcription_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Configuration for input audio transcription, defaults to off and can be  set to `null` to turn off once on. Input audio transcription is not native  to the model, since the model consumes audio directly. Transcription runs  asynchronously through Whisper and should be treated as rough guidance  rather than the representation understood by the model. 
 *
 *  \ingroup Models
 *
 */

class RealtimeSession_input_audio_transcription : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeSession_input_audio_transcription();
	RealtimeSession_input_audio_transcription(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeSession_input_audio_transcription();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The model to use for transcription, `whisper-1` is the only currently  supported model. 
	 */
	std::string getModel();

	/*! \brief Set The model to use for transcription, `whisper-1` is the only currently  supported model. 
	 */
	void setModel(std::string  model);

private:
	std::string model;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeSession_input_audio_transcription_H_ */
