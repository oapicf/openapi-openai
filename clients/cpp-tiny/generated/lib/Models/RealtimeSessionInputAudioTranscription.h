
/*
 * RealtimeSession_input_audio_transcription.h
 *
 * Configuration for input audio transcription, defaults to off and can be  set to &#x60;null&#x60; to turn off once on. Input audio transcription is not native  to the model, since the model consumes audio directly. Transcription runs  asynchronously through Whisper and should be treated as rough guidance  rather than the representation understood by the model. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeSession_input_audio_transcription_H_
#define TINY_CPP_CLIENT_RealtimeSession_input_audio_transcription_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Configuration for input audio transcription, defaults to off and can be  set to `null` to turn off once on. Input audio transcription is not native  to the model, since the model consumes audio directly. Transcription runs  asynchronously through Whisper and should be treated as rough guidance  rather than the representation understood by the model. 
 *
 *  \ingroup Models
 *
 */

class RealtimeSession_input_audio_transcription{
public:

    /*! \brief Constructor.
	 */
    RealtimeSession_input_audio_transcription();
    RealtimeSession_input_audio_transcription(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeSession_input_audio_transcription();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The model to use for transcription, `whisper-1` is the only currently  supported model. 
	 */
	std::string getModel();

	/*! \brief Set The model to use for transcription, `whisper-1` is the only currently  supported model. 
	 */
	void setModel(std::string  model);


    private:
    std::string model{};
};
}

#endif /* TINY_CPP_CLIENT_RealtimeSession_input_audio_transcription_H_ */
