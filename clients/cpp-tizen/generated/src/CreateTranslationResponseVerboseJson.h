/*
 * CreateTranslationResponseVerboseJson.h
 *
 * 
 */

#ifndef _CreateTranslationResponseVerboseJson_H_
#define _CreateTranslationResponseVerboseJson_H_


#include <string>
#include "TranscriptionSegment.h"
#include <list>
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

class CreateTranslationResponseVerboseJson : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateTranslationResponseVerboseJson();
	CreateTranslationResponseVerboseJson(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateTranslationResponseVerboseJson();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The language of the output translation (always `english`).
	 */
	std::string getLanguage();

	/*! \brief Set The language of the output translation (always `english`).
	 */
	void setLanguage(std::string  language);
	/*! \brief Get The duration of the input audio.
	 */
	std::string getDuration();

	/*! \brief Set The duration of the input audio.
	 */
	void setDuration(std::string  duration);
	/*! \brief Get The translated text.
	 */
	std::string getText();

	/*! \brief Set The translated text.
	 */
	void setText(std::string  text);
	/*! \brief Get Segments of the translated text and their corresponding details.
	 */
	std::list<TranscriptionSegment> getSegments();

	/*! \brief Set Segments of the translated text and their corresponding details.
	 */
	void setSegments(std::list <TranscriptionSegment> segments);

private:
	std::string language;
	std::string duration;
	std::string text;
	std::list <TranscriptionSegment>segments;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateTranslationResponseVerboseJson_H_ */
