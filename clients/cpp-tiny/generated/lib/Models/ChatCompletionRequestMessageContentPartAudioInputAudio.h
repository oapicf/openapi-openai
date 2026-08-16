
/*
 * ChatCompletionRequestMessageContentPartAudio_input_audio.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionRequestMessageContentPartAudio_input_audio_H_
#define TINY_CPP_CLIENT_ChatCompletionRequestMessageContentPartAudio_input_audio_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestMessageContentPartAudio_input_audio{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionRequestMessageContentPartAudio_input_audio();
    ChatCompletionRequestMessageContentPartAudio_input_audio(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionRequestMessageContentPartAudio_input_audio();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Base64 encoded audio data.
	 */
	std::string getData();

	/*! \brief Set Base64 encoded audio data.
	 */
	void setData(std::string  data);
	/*! \brief Get The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". 
	 */
	std::string getFormat();

	/*! \brief Set The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". 
	 */
	void setFormat(std::string  format);


    private:
    std::string data{};
    std::string format{};
};
}

#endif /* TINY_CPP_CLIENT_ChatCompletionRequestMessageContentPartAudio_input_audio_H_ */
