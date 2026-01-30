/*
 * RealtimeServerEventResponseContentPartAdded_part.h
 *
 * The content part that was added.
 */

#ifndef _RealtimeServerEventResponseContentPartAdded_part_H_
#define _RealtimeServerEventResponseContentPartAdded_part_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The content part that was added.
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventResponseContentPartAdded_part : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeServerEventResponseContentPartAdded_part();
	RealtimeServerEventResponseContentPartAdded_part(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeServerEventResponseContentPartAdded_part();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The content type (\"text\", \"audio\").
	 */
	std::string getType();

	/*! \brief Set The content type (\"text\", \"audio\").
	 */
	void setType(std::string  type);
	/*! \brief Get The text content (if type is \"text\").
	 */
	std::string getText();

	/*! \brief Set The text content (if type is \"text\").
	 */
	void setText(std::string  text);
	/*! \brief Get Base64-encoded audio data (if type is \"audio\").
	 */
	std::string getAudio();

	/*! \brief Set Base64-encoded audio data (if type is \"audio\").
	 */
	void setAudio(std::string  audio);
	/*! \brief Get The transcript of the audio (if type is \"audio\").
	 */
	std::string getTranscript();

	/*! \brief Set The transcript of the audio (if type is \"audio\").
	 */
	void setTranscript(std::string  transcript);

private:
	std::string type;
	std::string text;
	std::string audio;
	std::string transcript;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeServerEventResponseContentPartAdded_part_H_ */
