/*
 * ChatCompletionRequestMessageContentPartAudio.h
 *
 * Learn about [audio inputs](/docs/guides/audio). 
 */

#ifndef _ChatCompletionRequestMessageContentPartAudio_H_
#define _ChatCompletionRequestMessageContentPartAudio_H_


#include <string>
#include "ChatCompletionRequestMessageContentPartAudio_input_audio.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Learn about [audio inputs](/docs/guides/audio). 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestMessageContentPartAudio : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionRequestMessageContentPartAudio();
	ChatCompletionRequestMessageContentPartAudio(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionRequestMessageContentPartAudio();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The type of the content part. Always `input_audio`.
	 */
	std::string getType();

	/*! \brief Set The type of the content part. Always `input_audio`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	ChatCompletionRequestMessageContentPartAudio_input_audio getInputAudio();

	/*! \brief Set 
	 */
	void setInputAudio(ChatCompletionRequestMessageContentPartAudio_input_audio  input_audio);

private:
	std::string type;
	ChatCompletionRequestMessageContentPartAudio_input_audio input_audio;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionRequestMessageContentPartAudio_H_ */
