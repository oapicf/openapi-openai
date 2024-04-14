/*
 * CreateTranscriptionResponseVerboseJson.h
 *
 * Represents a verbose json transcription response returned by model, based on the provided input.
 */

#ifndef _CreateTranscriptionResponseVerboseJson_H_
#define _CreateTranscriptionResponseVerboseJson_H_


#include <string>
#include "TranscriptionSegment.h"
#include "TranscriptionWord.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Represents a verbose json transcription response returned by model, based on the provided input.
 *
 *  \ingroup Models
 *
 */

class CreateTranscriptionResponseVerboseJson : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateTranscriptionResponseVerboseJson();
	CreateTranscriptionResponseVerboseJson(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateTranscriptionResponseVerboseJson();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The language of the input audio.
	 */
	std::string getLanguage();

	/*! \brief Set The language of the input audio.
	 */
	void setLanguage(std::string  language);
	/*! \brief Get The duration of the input audio.
	 */
	std::string getDuration();

	/*! \brief Set The duration of the input audio.
	 */
	void setDuration(std::string  duration);
	/*! \brief Get The transcribed text.
	 */
	std::string getText();

	/*! \brief Set The transcribed text.
	 */
	void setText(std::string  text);
	/*! \brief Get Extracted words and their corresponding timestamps.
	 */
	std::list<TranscriptionWord> getWords();

	/*! \brief Set Extracted words and their corresponding timestamps.
	 */
	void setWords(std::list <TranscriptionWord> words);
	/*! \brief Get Segments of the transcribed text and their corresponding details.
	 */
	std::list<TranscriptionSegment> getSegments();

	/*! \brief Set Segments of the transcribed text and their corresponding details.
	 */
	void setSegments(std::list <TranscriptionSegment> segments);

private:
	std::string language;
	std::string duration;
	std::string text;
	std::list <TranscriptionWord>words;
	std::list <TranscriptionSegment>segments;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateTranscriptionResponseVerboseJson_H_ */
