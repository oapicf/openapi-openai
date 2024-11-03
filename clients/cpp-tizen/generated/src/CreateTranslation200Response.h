/*
 * CreateTranslation_200_response.h
 *
 * 
 */

#ifndef _CreateTranslation_200_response_H_
#define _CreateTranslation_200_response_H_


#include <string>
#include "CreateTranslationResponseJson.h"
#include "CreateTranslationResponseVerboseJson.h"
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

class CreateTranslation_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateTranslation_200_response();
	CreateTranslation_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateTranslation_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The translated text.
	 */
	std::string getText();

	/*! \brief Set The translated text.
	 */
	void setText(std::string  text);
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
	/*! \brief Get Segments of the translated text and their corresponding details.
	 */
	std::list<TranscriptionSegment> getSegments();

	/*! \brief Set Segments of the translated text and their corresponding details.
	 */
	void setSegments(std::list <TranscriptionSegment> segments);

private:
	std::string text;
	std::string language;
	std::string duration;
	std::list <TranscriptionSegment>segments;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateTranslation_200_response_H_ */
