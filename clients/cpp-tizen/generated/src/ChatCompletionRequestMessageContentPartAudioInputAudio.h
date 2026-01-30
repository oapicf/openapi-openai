/*
 * ChatCompletionRequestMessageContentPartAudio_input_audio.h
 *
 * 
 */

#ifndef _ChatCompletionRequestMessageContentPartAudio_input_audio_H_
#define _ChatCompletionRequestMessageContentPartAudio_input_audio_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestMessageContentPartAudio_input_audio : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionRequestMessageContentPartAudio_input_audio();
	ChatCompletionRequestMessageContentPartAudio_input_audio(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionRequestMessageContentPartAudio_input_audio();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string data;
	std::string format;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionRequestMessageContentPartAudio_input_audio_H_ */
