/*
 * TranscriptionWord.h
 *
 * 
 */

#ifndef _TranscriptionWord_H_
#define _TranscriptionWord_H_


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

class TranscriptionWord : public Object {
public:
	/*! \brief Constructor.
	 */
	TranscriptionWord();
	TranscriptionWord(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TranscriptionWord();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The text content of the word.
	 */
	std::string getWord();

	/*! \brief Set The text content of the word.
	 */
	void setWord(std::string  word);
	/*! \brief Get Start time of the word in seconds.
	 */
	float getStart();

	/*! \brief Set Start time of the word in seconds.
	 */
	void setStart(float  start);
	/*! \brief Get End time of the word in seconds.
	 */
	float getEnd();

	/*! \brief Set End time of the word in seconds.
	 */
	void setEnd(float  end);

private:
	std::string word;
	float start;
	float end;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TranscriptionWord_H_ */
